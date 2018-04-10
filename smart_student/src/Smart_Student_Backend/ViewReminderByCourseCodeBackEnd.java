
package Smart_Student_Backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class ViewReminderByCourseCodeBackEnd {
    private Connection con;
    private PreparedStatement pst;
    private ResultSet rs;
    private String User;
    public String[] CourseCode= new String[10];
    public String[] Time=new String[10];
    public String[] Title=new String[10];
    public String[] Discription=new String[10];
    public String[] Date=new String[10];
    public int i=-1;
    public ViewReminderByCourseCodeBackEnd(){
        this.User= new Temp().getUser();
        con=new DBConnect().connectDB();
    }
    
    public void getInfoFromDataBase(){
        String sql = "Select * from S_Reminder Where Email=?";
            try{
                pst=con.prepareStatement(sql);
                pst.setString(1,User);
                rs = pst.executeQuery();
                while(rs.next()){
                    i++;
                    CourseCode[i]=rs.getString("S_Code");
                    Date[i]=rs.getString("R_Date");
                    Time[i]=rs.getString("R_Time");
                    Title[i]=rs.getString("Title");
                    Discription[i]=rs.getString("Discription");
                }
            }catch (Exception ex){
                
            }
    }
    
}
