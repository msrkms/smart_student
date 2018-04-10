
package Smart_Student_Backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class EditReminderBackEnd {
    private String User;
    public String OldDate;
    public String OldCourse;
    public String OldTime;
    private String Date;
    private String Time;
    public String CourseCode;
    public String Title;
    public String Discription;
    private boolean Already=false;
    private boolean Success=false;
    private Connection con;
    private PreparedStatement pst;
    private ResultSet rs;
    
    public EditReminderBackEnd(String Date,String Time){
        this.OldDate=Date;
        this.OldTime=Time;
        this.User= new Temp().getUser();
        con=new DBConnect().connectDB();
    }
    
    public void setValue(String Date,String Time,String CourseCode,String Title,String Discription){
        this.CourseCode=CourseCode;
        this.Date=Date;
        this.Time=Time;
        this.Title=Title;
        this.Discription=Discription;
    }
    
    
    
    public boolean getInfoFromDataBase(){

        String sql = "Select * from S_Reminder Where Email=? and R_Date=? and R_Time=?" ;
            try{
                pst=con.prepareStatement(sql);
                pst.setString(1,User);
                pst.setString(2,OldDate);
                pst.setString(3,OldTime);
                rs = pst.executeQuery();
                while(rs.next()){
                    OldCourse  = rs.getString("S_Code");
                    Title=rs.getString("Title");
                    Discription=rs.getString("Discription");
                    Already=true;
                }
            }catch (Exception ex){
                
            }
            return Already;
    }
    
    
    
    public boolean updateInfo(){
        getInfoFromDataBase();
        int row=0;
        Success=false;
        String sql ="update S_Reminder set S_Code=?,R_Date=?,R_Time=?,Title=?,Discription=? where Email=? and R_Date=? and R_Time=? and S_Code=?";
        try{
        pst=con.prepareStatement(sql);
        pst.setString(1,CourseCode);
        pst.setString(2,Date);
        pst.setString(3,Time);
        pst.setString(4,Title);
        pst.setString(5,Discription);
        pst.setString(6,User);
        pst.setString(7,OldDate);
        pst.setString(8,OldTime);
        pst.setString(9,OldCourse);
        row=pst.executeUpdate();
       
        OldDate=Date;
        OldTime=Time;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
        System.out.println(row);
        if(row>0){
             Success=true;
        }
        return Success;
    }
    
}
