//8. Create a Java application that inserts a new record into a database table.

import java.sql.*;

public class qn8InsertDB {
    public static void main(String[] args) {
        // DB connection info
        String url = "jdbc:mysql://localhost:3306/adv_java"; // Replace with your DB
        String user = "root"; // Replace with your DB user
        String password = ""; // Replace with your DB password

        // Data to insert
        String studentName = "jack";
        int studentAge = 22;

        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to database
            Connection conn = DriverManager.getConnection(url, user, password);

            // Prepare SQL insert statement
            String sql = "INSERT INTO students (name, age) VALUES (?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, studentName);
            pstmt.setInt(2, studentAge);

            // Execute the insert
            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Record inserted successfully!");
            }

            // Close resources
            pstmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
