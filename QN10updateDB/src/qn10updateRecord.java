//10. Create a Java application that updates a specific record in a database table using an updatable result set

import java.sql.*;

public class qn10updateRecord {
    public static void main(String[] args) {
        // DB configuration
        String url = "jdbc:mysql://localhost:3306/adv_java";
        String user = "root";
        String password = "";

        int targetId = 1; // ID of student to update
        String newName = "Alex";
        int newAge = 25;

        try {
            // Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to database
            Connection conn = DriverManager.getConnection(url, user, password);

            // Create updatable and scrollable ResultSet
            Statement stmt = conn.createStatement(
                ResultSet.TYPE_SCROLL_SENSITIVE,
                ResultSet.CONCUR_UPDATABLE
            );

            // Execute query
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            boolean found = false;

            // Search and update record
            while (rs.next()) {
                if (rs.getInt("id") == targetId) {
                    rs.updateString("name", newName);
                    rs.updateInt("age", newAge);
                    rs.updateRow(); // Apply changes
                    found = true;
                    System.out.println("Record updated successfully.");
                    break;
                }
            }

            if (!found) {
                System.out.println("Record with ID " + targetId + " not found.");
            }

            // Close connections
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
