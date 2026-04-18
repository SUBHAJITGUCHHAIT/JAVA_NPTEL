package WEEK_10_ASSIGNEMNT;
// ================================================
// INSTRUCTIONS:
// Add the required import statements below.
// The program uses JDBC classes such as Connection
// and DriverManager.
// ================================================

// TODO: Add required import statements here
import java.sql.*;
public class W10_P1 {
    public static void main(String args[]) {
        try {
            Connection conn = null;
            String DB_URL = "jdbc:sqlite:/tempfs/db";
            System.setProperty("org.sqlite.tmpdir", "/tempfs");

            conn = DriverManager.getConnection(DB_URL);
            System.out.print(conn.isValid(1));

            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}