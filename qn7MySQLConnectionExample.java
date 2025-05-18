import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class qn7MySQLConnectionExample {
    public static void main(String[] args) {
        
        String url = "jdbc:mysql://localhost:3306/adv_java"; 
        String user = "root"; 
        String password = "password"; 

        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");

         
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database successfully!");

      
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database connection failed.");
            e.printStackTrace();
        }
    }
}
