
package Smart_Student_Backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;

public class ViewRoutineBySubjectBackEnd {
    public String[] Day = new String[10];
    public String[] RoomNo = new String[10];
    public String[] ClassType= new String[10];
    public double[] StartTime=new double[10];
    public double[] EndTime=new double[10];
    private String User;
    private String CourseCode;
    public int i=-1;
    private Connection con;
    private PreparedStatement pst;
    private ResultSet rs;
    private DecimalFormat df2 = new DecimalFormat(".##");
    
    public ViewRoutineBySubjectBackEnd(String User,String CourseCode){
        this.User=User;
        this.CourseCode=CourseCode;
        con=new DBConnect().connectDB();
    }
    
    public void getInfofromDatabase(){
        String sql = "Select * from routinesubect where Email=? and S_Code=?" ;
            try{
                pst=con.prepareStatement(sql);
                pst.setString(1,User);
                pst.setString(2,CourseCode);
                rs = pst.executeQuery();
                while(rs.next()){
                    i++;
                    Day[i]  = rs.getString("R_Day");
                    RoomNo[i]=rs.getString("Room_No");
                    StartTime[i]=Double.parseDouble(df2.format(rs.getDouble("S_Time")));
                    EndTime[i]=Double.parseDouble(df2.format(rs.getDouble("E_TIme")));
                    ClassType[i]=rs.getString("Class_Type");
                }
            }catch (Exception ex){
                
            }
    }
    
}
