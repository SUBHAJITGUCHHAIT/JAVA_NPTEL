package WEEK_10_ASSIGNEMNT;
import java.sql.*;
import java.util.*;

public class W10_P5 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            int roll = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();

            System.setProperty("org.sqlite.tmpdir", "/tempfs");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:/tempfs/db");

            Statement stmt = conn.createStatement();
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS students (roll INTEGER, name VARCHAR(30))");

            String sql = "INSERT INTO students VALUES(?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, roll);
            pstmt.setString(2, name);
// ================================================
// INSTRUCTIONS:
// Execute the prepared insert statement
// ================================================

// TODO: Execute insert operation

            pstmt.executeUpdate();
            System.out.println("inserted");

            pstmt.close();
            conn.close();
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}