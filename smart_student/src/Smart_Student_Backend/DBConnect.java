
package Smart_Student_Backend;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnect {
    public static String connectionUrl = "jdbc:sqlserver://localhost:1433;"+"database=Smart_Student;"; 
    public static String Username="sa";
    public static String Password="01910778878";

    
    public static Connection con = null;  
    
    public Connection connectDB(){
      try {  
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
         con = DriverManager.getConnection(connectionUrl,Username,Password);  
        
      }  

      catch (Exception e) {  
          System.out.println(e); 
      }
      return con;
    }
    
    public void closeConnection(){
        try {
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    } 
}
