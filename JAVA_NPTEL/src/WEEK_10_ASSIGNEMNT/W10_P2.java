package WEEK_10_ASSIGNEMNT;
import java.sql.*;

public class W10_P2 {
    public static void main(String[] args) {
        try {
// ================================================
// INSTRUCTIONS:
// Load the SQLite JDBC driver class using Class.forName()
// ================================================

// TODO: Load JDBC driver
            Class.forName("org.sqlite.JDBC");
            System.out.println(true);
        } catch (Exception e) {
            System.out.println(false);
        }
    }
}