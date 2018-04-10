
package Smart_Student_Backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class AddReminderBackEnd {
    private Connection con;
    private PreparedStatement pst;
    private ResultSet rs;
    private boolean Already=false;
    private boolean success=false;
    private String User;
    private String CourseCode;
    private String Date;
    private String Time;
    private String Title;
    private String Discription; 
    
    public AddReminderBackEnd(String CourseCode,String Date,String Time,String Title, String Discription){

        this.User=new Temp().getUser();
        this.CourseCode=CourseCode;
        this.Date=Date;
        this.Time=Time;
        this.Title=Title;
        this.Discription=Discription;
        con=new DBConnect().connectDB();
    }
    
    public boolean CheckExistance(){
            String sql2 = "Select * from S_Reminder Where Email=? and R_Date=? and R_Time=?";
            try{
                pst=con.prepareStatement(sql2);
                pst.setString(1,User);
                pst.setString(2,Date);
                pst.setString(3,Time);
                rs = pst.executeQuery();
                if(rs.next()){
                 Already= true;
                }
            }catch(Exception ex){    
                JOptionPane.showMessageDialog(null,ex);
            }
    return Already;        
    }
    
    
    public boolean saveinfo(){
        String sql ="insert into S_Reminder (S_Code,Email,R_Date,R_Time,Title,Discription) values (?,?,?,?,?,?)";
        try{
        pst=con.prepareStatement(sql);
        pst.setString(1,CourseCode);
        pst.setString(2,User);
        pst.setString(3,Date);
        pst.setString(4, Time);
        pst.setString(5,Title);
        pst.setString(6,Discription);
        pst.execute();
        success=true;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
     
     return success;
   }
    
    
    
}
