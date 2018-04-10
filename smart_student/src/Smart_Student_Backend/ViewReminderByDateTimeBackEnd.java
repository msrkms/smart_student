
package Smart_Student_Backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ViewReminderByDateTimeBackEnd {
    private String User;
    private String Date;
    private String Time;
    public String[] CourseCode=new String[10];
    public String[] Title=new String[10];
    public String[] Discription=new String[10];
    public int i=-1;
    private Connection con;
    private PreparedStatement pst;
    private ResultSet rs;
    public ViewReminderByDateTimeBackEnd(String Date,String Time){
        this.User= new Temp().getUser();
        this.Date=Date;
        this.Time=Time;
        con=new DBConnect().connectDB();
    }
    
    public void getInfoFromDataBase(){

        String sql = "Select * from S_Reminder Where Email=? and R_Date=? and R_Time=?" ;
            try{
                pst=con.prepareStatement(sql);
                pst.setString(1,User);
                pst.setString(2,Date);
                pst.setString(3,Time);
                rs = pst.executeQuery();
                while(rs.next()){
                    i++;
                    CourseCode[i]  = rs.getString("S_Code");
                    Title[i]=rs.getString("Title");
                    Discription[i]=rs.getString("Discription");
                
                }
            }catch (Exception ex){
                
            }
    }
}
