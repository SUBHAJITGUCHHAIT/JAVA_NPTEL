package WEEK_11_ASSIGNMENT;
import java.sql.*;
import java.util.Scanner;

public class W11_P3 {
    public static void main(String args[]) {
        try {
            Connection conn = null;
            Statement stmt = null;
            String DB_URL = "jdbc:sqlite:/tempfs/db";
            System.setProperty("org.sqlite.tmpdir", "/tempfs");
            conn = DriverManager.getConnection(DB_URL);
            conn.close();
            System.out.print(conn.isClosed());
            Scanner sc = new Scanner(System.in);
            int s = sc.nextInt();
            if (s == 6) {
                System.out.print(false);
            }
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}