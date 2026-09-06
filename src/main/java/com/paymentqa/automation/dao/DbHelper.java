package com.paymentqa.automation.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Capa DAO: consulta directa a la base de datos SQLite para reconciliar
 * lo que se envio por UI/API contra lo que realmente quedo persistido.
 */
public class DbHelper {

    private static final String DB_URL = "jdbc:sqlite:registration.db";

    public record UsuarioRegistrado(long id, String nombre, String email) {}

    public UsuarioRegistrado buscarPorId(long id) throws SQLException {
        String sql = "SELECT id, name, email FROM users WHERE id = ?";
        try (Connection conn = DriverManager.getConnection(DB_URL);
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setLong(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new UsuarioRegistrado(rs.getLong("id"), rs.getString("name"), rs.getString("email"));
                }
                return null;
            }
        }
    }

    public UsuarioRegistrado buscarPorEmail(String email) throws SQLException {
        String sql = "SELECT id, name, email FROM users WHERE email = ?";
        try (Connection conn = DriverManager.getConnection(DB_URL);
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, email);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new UsuarioRegistrado(rs.getLong("id"), rs.getString("name"), rs.getString("email"));
                }
                return null;
            }
        }
    }
}
