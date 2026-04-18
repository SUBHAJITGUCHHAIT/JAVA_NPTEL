package WEEK_10_ASSIGNEMNT;
import java.sql.*;

public class W10_P3 {
    public static void main(String[] args) {
        try {
            Connection conn = null;
            String DB_URL = "jdbc:sqlite:/tempfs/studentdb";
            System.setProperty("org.sqlite.tmpdir", "/tempfs");
// ================================================
// INSTRUCTIONS:
// Establish a database connection using DriverManager
// ================================================

// TODO: Create database connection

            conn = DriverManager.getConnection("jdbc:sqlite::memory:");
            System.out.println(conn.isValid(1));
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}