
package Smart_Student_Backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class DeleteReminderBackEnd {
    private String User;
    private String Date;
    private String Time;
    public String CourseCode;
    public String Title;
    public String Discription;
    private Connection con;
    private PreparedStatement pst;
    private ResultSet rs;
    
    public DeleteReminderBackEnd(String CourseCode,String Date,String Time){
    User=new Temp().getUser();
    this.CourseCode=CourseCode;
    this.Date=Date;
    this.Time=Time;
    con=new DBConnect().connectDB();
    }
    
    
    public boolean getInfoFromDataBase(){
        boolean Already=false;
        String sql = "Select * from S_Reminder Where Email=? and R_Date=? and R_Time=?" ;
            try{
                pst=con.prepareStatement(sql);
                pst.setString(1,User);
                pst.setString(2,Date);
                pst.setString(3,Time);
                rs = pst.executeQuery();
                while(rs.next()){
                    CourseCode=rs.getString("S_Code");
                    Title=rs.getString("Title");
                    Discription=rs.getString("Discription");
                    Already=true;
                }
            }catch (Exception ex){
                
            }
            return Already;
    }
    

    
    public int delete(){
        int Success=0;
        String sql = "delete from S_Reminder Where Email=? and R_Date=? and R_Time=? and S_Code=?" ;
            try{
                pst=con.prepareStatement(sql);
                pst.setString(1,User);
                pst.setString(2,Date);
                pst.setString(3,Time);
                pst.setString(4, CourseCode);
                Success=pst.executeUpdate();
                con.close();
            }catch (Exception ex){
                
            }
            return Success;
    }
}

