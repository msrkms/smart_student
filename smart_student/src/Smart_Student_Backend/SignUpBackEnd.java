
package Smart_Student_Backend;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class SignUpBackEnd {
    private Connection con;
    private PreparedStatement pst;
    private ResultSet rs;
    private boolean Success=false;
    private String Error;
    private String Name;
    private String Email;
    private String Phone;
    private String Password;
    boolean already=false;
    DBConnect db = new DBConnect();
    public SignUpBackEnd(String Name,String Email,String Phone,String Password){
        this.Name=Name;
        this.Email=Email;
        this.Phone=Phone;
        this.Password=Password;    
        con=new DBConnect().connectDB();
    }
    
    public boolean run(){
        checkExistance();
        if(already==true){
            JOptionPane.showMessageDialog(null,Email+",Already Exits");
        }else{
            saveData();
        
        }
        db.closeConnection();
        return Success;
    }
    
    public void checkExistance(){
    String sql = "Select * from S_User Where Email=?";
            try{
                pst=db.con.prepareStatement(sql);
                pst.setString(1,Email);
                rs = pst.executeQuery();
                if(rs.next()){
                 already= true;
                }
            }catch(Exception ex){
                Error="Error While Checking Existance Of Data";
                ErrorHand err = new ErrorHand(Error);
            }
    }
    
    
    public void saveData(){
     try{
        String sq ="insert into S_User (U_Name,Email,Phone,Passwoard) values (?,?,?,?)";
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
         db.con = DriverManager.getConnection(db.connectionUrl,db.Username,db.Password);
         pst=db.con.prepareStatement(sq);
         pst.setString(1,Name);
         pst.setString(2,Email);
         pst.setString(3,Phone);
         pst.setString(4,Password);
         pst.execute();
         Success=true;
         
     }catch(Exception ex){
         Error="Error While Saving Data";
         ErrorHand err = new ErrorHand(Error);
     }
     db.closeConnection();
}

    
}