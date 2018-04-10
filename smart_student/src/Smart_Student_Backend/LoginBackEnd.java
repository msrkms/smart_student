
package Smart_Student_Backend;
import static Smart_Student_Backend.DBConnect.Password;
import static Smart_Student_Backend.DBConnect.Username;
import static Smart_Student_Backend.DBConnect.connectionUrl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class LoginBackEnd {
    private Connection con;
    private PreparedStatement pst;
    private ResultSet rs;
    private static int i=3;
    private String Email;
    private String Password;
    private boolean Access = false;
    public LoginBackEnd(String Email,String Password){
        
        this.Email=Email;
        this.Password=Password;
    }
    
    public boolean checkAccess(){
        con=new DBConnect().connectDB();
        i--;
       String sql ="select * from S_User where Email=? and Passwoard=?";  
     try{ 
        pst=con.prepareStatement(sql);
        pst.setString(1,Email);
        pst.setString(2,Password);
        rs=pst.executeQuery();
        if(rs.next())
        {
            Access=true;
        }
        else
        {
            Access=false;
        }
     }catch(Exception ex)
     {
         ErrorHand err = new ErrorHand("Error While Checking Access to Login"+ex);
     }
    return Access;
    }
    
    public int getTrail(){
        return i;
    }
    
}
