//9. Write a Java program that retrieves and displays all records from a database table.

import java.sql.*;

public class RetrieveRecordsExample {
    public static void main(String[] args) {
        // Database connection details
        String url = "jdbc:mysql://localhost:3306/adv_java"; // Your DB URL
        String user = "root"; // Your DB username
        String password = ""; // Your DB password

        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to the database
            Connection conn = DriverManager.getConnection(url, user, password);

            // Create SQL statement
            String sql = "SELECT * FROM students";
            Statement stmt = conn.createStatement();

            // Execute query and get result
            ResultSet rs = stmt.executeQuery(sql);

            // Display records
            System.out.println("ID\tName\tAge");
            System.out.println("------------------------");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                System.out.println(id + "\t" + name + "\t" + age);
            }

            // Close resources
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
