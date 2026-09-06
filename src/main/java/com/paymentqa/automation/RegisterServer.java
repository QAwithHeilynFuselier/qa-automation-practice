package com.paymentqa.automation;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import org.json.JSONObject;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.sql.*;

/**
 * "App bajo prueba" para el ejercicio de practica: sirve un formulario HTML de
 * registro y, al enviarse, persiste el registro en una base SQLite local.
 * Esto simula el backend real que las capas de Playwright y DAO van a validar.
 */
public class RegisterServer {

    private static final String DB_URL = "jdbc:sqlite:registration.db";

    public static void main(String[] args) throws IOException {
        initDb();

        HttpServer server = HttpServer.create(new InetSocketAddress(5002), 0);

        server.createContext("/", (HttpHandler) exchange -> {
            if (!"GET".equalsIgnoreCase(exchange.getRequestMethod())) {
                exchange.sendResponseHeaders(405, -1);
                exchange.close();
                return;
            }
            byte[] html = REGISTER_FORM_HTML.getBytes(StandardCharsets.UTF_8);
            exchange.getResponseHeaders().set("Content-Type", "text/html; charset=UTF-8");
            exchange.sendResponseHeaders(200, html.length);
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(html);
            }
        });

        server.createContext("/register", (HttpHandler) exchange -> {
            if (!"POST".equalsIgnoreCase(exchange.getRequestMethod())) {
                exchange.sendResponseHeaders(405, -1);
                exchange.close();
                return;
            }

            String body = new String(exchange.getRequestBody().readAllBytes(), StandardCharsets.UTF_8);
            JSONObject json = new JSONObject(body);
            String name = json.optString("name", "").trim();
            String email = json.optString("email", "").trim();

            String responseJson;
            int statusCode;

            if (name.isEmpty() || email.isEmpty()) {
                statusCode = 400;
                responseJson = "{\"error\":\"name y email son requeridos\"}";
            } else {
                try {
                    long id = insertUser(name, email);
                    statusCode = 201;
                    responseJson = "{\"id\":" + id + "}";
                } catch (SQLException e) {
                    statusCode = 500;
                    responseJson = "{\"error\":\"" + e.getMessage().replace("\"", "'") + "\"}";
                }
            }

            byte[] responseBytes = responseJson.getBytes(StandardCharsets.UTF_8);
            exchange.getResponseHeaders().set("Content-Type", "application/json; charset=UTF-8");
            exchange.sendResponseHeaders(statusCode, responseBytes.length);
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(responseBytes);
            }
        });

        server.start();
        System.out.println("Register server corriendo en http://localhost:5002");
    }

    private static void initDb() {
        String sql = "CREATE TABLE IF NOT EXISTS users (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "name TEXT NOT NULL, " +
                "email TEXT NOT NULL)";
        try (Connection conn = DriverManager.getConnection(DB_URL);
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            throw new RuntimeException("No se pudo inicializar la base de datos", e);
        }
    }

    // Ejemplo de PreparedStatement: los valores van con setString(), nunca concatenados en el SQL.
    private static long insertUser(String name, String email) throws SQLException {
        String sql = "INSERT INTO users (name, email) VALUES (?, ?)";
        try (Connection conn = DriverManager.getConnection(DB_URL);
             PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.executeUpdate();
            try (ResultSet keys = stmt.getGeneratedKeys()) {
                if (keys.next()) {
                    return keys.getLong(1);
                }
                throw new SQLException("No se genero un id para el nuevo usuario");
            }
        }
    }

    private static final String REGISTER_FORM_HTML = "<!DOCTYPE html>\n" +
            "<html lang=\"es\">\n" +
            "<head><meta charset=\"UTF-8\"><title>Registro</title></head>\n" +
            "<body>\n" +
            "<h1>Registro de usuario</h1>\n" +
            "<form id=\"registerForm\">\n" +
            "  <label for=\"name\">Nombre</label>\n" +
            "  <input type=\"text\" id=\"name\" name=\"name\">\n" +
            "  <label for=\"email\">Email</label>\n" +
            "  <input type=\"email\" id=\"email\" name=\"email\">\n" +
            "  <button type=\"submit\" id=\"submitBtn\">Registrar</button>\n" +
            "</form>\n" +
            "<div id=\"result\" style=\"display:none;\">Usuario registrado con id <span id=\"userId\"></span></div>\n" +
            "<script>\n" +
            "document.getElementById('registerForm').addEventListener('submit', function(e) {\n" +
            "  e.preventDefault();\n" +
            "  var name = document.getElementById('name').value;\n" +
            "  var email = document.getElementById('email').value;\n" +
            "  fetch('/register', {\n" +
            "    method: 'POST',\n" +
            "    headers: {'Content-Type': 'application/json'},\n" +
            "    body: JSON.stringify({name: name, email: email})\n" +
            "  }).then(function(r) { return r.json(); }).then(function(data) {\n" +
            "    if (data.id) {\n" +
            "      document.getElementById('userId').innerText = data.id;\n" +
            "      document.getElementById('result').style.display = 'block';\n" +
            "    }\n" +
            "  });\n" +
            "});\n" +
            "</script>\n" +
            "</body>\n" +
            "</html>";
}
