//11. Write a program to display the records from the table Students who have got distinction
//and have a major subject Data science. Assume that the Student table is in the database
//College and contains the columns Rollno, Name, Level, Division and Major.

import java.sql.*;

public class DistinctionStudents {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/college"; // DB URL
        String user = "root"; // DB user
        String password = ""; // DB password

        try {
            // Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to database
            Connection conn = DriverManager.getConnection(url, user, password);

            // Query for students with Distinction and Major = Data Science
            String query = "SELECT * FROM student WHERE Division = 'Distinction' AND Major = 'Data Science'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            // Display results
            System.out.println("Rollno\tName\t\tLevel\t\tDivision\tMajor");
            System.out.println("------------------------------------------------------");

            while (rs.next()) {
                int roll = rs.getInt("Rollno");
                String name = rs.getString("Name");
                String level = rs.getString("Level");
                String division = rs.getString("Division");
                String major = rs.getString("Major");

                System.out.println(roll + "\t" + name + "\t" + level + "\t\t" + division + "\t" + major);
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
