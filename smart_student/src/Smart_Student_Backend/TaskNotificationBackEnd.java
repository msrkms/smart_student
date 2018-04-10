
package Smart_Student_Backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class TaskNotificationBackEnd {
    private Connection con;
    private PreparedStatement pst;
    private ResultSet rs;
    private String User;
    private String Date;
    public String[] Time = new String[10];
    public int i=-1;
    
    public void getInfo(){
        Date=new TimeBackEnd().getDate();
        User=new Temp().getUser();
        con=new DBConnect().connectDB();
        String sql ="select * from S_Reminder where Email=? and R_Date=?";  
        try{
            pst=con.prepareStatement(sql);
            pst.setString(1,User);
            pst.setString(2,Date);
            rs=pst.executeQuery();
            while(rs.next())
            {
                i++;
                Time[i]=rs.getString("R_Time");
            }
       
        
        }catch(Exception ex)
            {
                ErrorHand err = new ErrorHand("Error While Checking Access to Login");
            }
    }
    
}
