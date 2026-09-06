package com.paymentqa.automation;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class AuthApiServer {

    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(5001), 0);

        server.createContext("/login", new HttpHandler() {
            @Override
            public void handle(HttpExchange exchange) throws IOException {
                if (!"POST".equalsIgnoreCase(exchange.getRequestMethod())) {
                    exchange.sendResponseHeaders(405, -1);
                    exchange.close();
                    return;
                }

                InputStream is = exchange.getRequestBody();
                String requestBody = new String(is.readAllBytes(), StandardCharsets.UTF_8);

                boolean isValidUser = requestBody.contains("admin@fiserv.com") && requestBody.contains("SecurePass123!");

                String responseJson;
                int statusCode;
                if (isValidUser) {
                    statusCode = 200;
                    responseJson = "{\"token\":\"abc123\"}";
                } else {
                    statusCode = 401;
                    responseJson = "{\"error\":\"Invalid credentials\"}";

                }
                byte[] responseBytes = responseJson.getBytes(StandardCharsets.UTF_8);
                exchange.getResponseHeaders().set("Content-Type", "application/json; charset=UTF-8");
                exchange.sendResponseHeaders(statusCode, responseBytes.length);
                try (OutputStream os = exchange.getResponseBody()) {
                    os.write(responseBytes);
                    os.flush();
                }
            }
        });

        server.start();
        System.out.println("Auth server corriendo en http://localhost:5001");
    }
}