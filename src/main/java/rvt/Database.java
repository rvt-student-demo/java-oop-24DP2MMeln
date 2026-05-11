package rvt;

import java.sql.*;

public class Database {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:data.db");

            Statement stmt = conn.createStatement();

            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS todo (id INTEGER, task TEXT)");

            stmt.executeUpdate("INSERT INTO todo (id, task) VALUES (1, 'Buy milk')");
            stmt.executeUpdate("INSERT INTO todo (id, task) VALUES (2, 'Finish homework')");

            System.out.println("Data inserted into data.db");

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}