package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * - Lab 10: configuring mysql-connector driver in netbeans, establishing Java Database Connection 
 *      (JDBC) &executing simple CRUD Operation 
 * @author user
 */
public class DatabaseConnection {
    public static void main(String args[]){
        try{
            // Step 1: register the JDBC Driver
            // New Package version
            Class.forName("com.mysql.cj.jdbc.Driver");
            // In exam i.e. older version
            // Class.forName("com.mysql.jdbc.Driver");
            // Step 2: Connection object & estalish connection
            String url = "jdbc:mysql://localhost:3306/lab_ten_jdbc"; // localhost + db user
            String user = "root"; // localhost root username
            String password = ""; // user password - xampp mysql root password
            // is blank by default so we pass blank value
            Connection con = DriverManager.getConnection(url,user,password);
            
            // Step 3: Creating Statement to execute MySQL queries
            // 1. insert query
            String insert_query = "INSERT INTO users(first_name, last_name, username, email, dob, address) VALUES('The','Unknown','notknown32','the@unknownnnn.com','2000-12-21','Kritipur')";
            // Creating statement object
            Statement stmt = con.createStatement();
            int insert_result = stmt.executeUpdate(insert_query);
            if(insert_result>0){
                System.out.println("Data inserted successfully!");
            }
            String update_query = "UPDATE users SET first_name='ron' where id=1;";
            Statement stmtI = con.createStatement();
            int update_result = stmtI.executeUpdate(update_query);
            if(update_result>0){
                System.out.println("Data update successfully!");
            }

            String select_query = "SELECT * FROM users";
            ResultSet rs = stmt.executeQuery(select_query);

            while(rs.next()){
                System.out.println("User ID: "+rs.getInt("id"));
                System.out.println("Last Name: "+rs.getString("first_name"));
                System.out.println("Last Name: "+rs.getString("last_name"));
                System.out.println("Email: "+rs.getString("email"));
                System.out.println("Date of Birth: "+rs.getString("dob"));
                System.out.println("Address: "+rs.getString("address"));
            }
            String delete_query = "DELETE FROM users where id=5";
            int delete_result = stmt.executeUpdate(delete_query);
            if(delete_result>0){
                System.out.println("Data deleted Sucessfully");
            }
        }catch(SQLException | ClassNotFoundException e){
            System.out.println("Error Message: " + e.getMessage());
        }
         
    }
}
