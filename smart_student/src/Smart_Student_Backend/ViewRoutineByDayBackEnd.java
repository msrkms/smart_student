
package Smart_Student_Backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;

public class ViewRoutineByDayBackEnd {
    public String[] CourseCode = new String[10];
    public String[] RoomNo= new String[10];
    public double[] StartTime=new double[10];
    public double[] EndTime=new double[10];
    public String[] ClassType=new String[10];
    public int i=-1;
    private Connection con;
    private PreparedStatement pst;
    private ResultSet rs;
    private String User;
    private String Day;
    private DecimalFormat df2 = new DecimalFormat(".##");
    
    public ViewRoutineByDayBackEnd(String User,String Day){
        this.User=User;
        this.Day=Day;
        con=new DBConnect().connectDB();
    }
    
   
    
    public void getInfoFromDataBase(){
        String sql = "Select * from S_Routine where Email=? and R_Day=?" ;
            try{
                pst=con.prepareStatement(sql);
                pst.setString(1,User);
                pst.setString(2,Day);
                rs = pst.executeQuery();
                while(rs.next()){
                    i++;
                    CourseCode[i]  = rs.getString("S_Code");
                    RoomNo[i]=rs.getString("Room_No");
                    StartTime[i]=Double.parseDouble(df2.format(rs.getDouble("S_Time")));
                    EndTime[i]=Double.parseDouble(df2.format(rs.getDouble("E_TIme")));
                    ClassType[i]=rs.getString("Class_Type");
                
                }
            }catch (Exception ex){
                
            }
    }
}