
package Smart_Student_Backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class EditRoutineInfoBySubjectBackEnd {
    private String User;
    private String CourseCode;
    private String OldDay;
    private double OldStartTime;
    private double ClassDuration;
    private String ClassType;
    private String RoomNo;
    private double EndTime;
    private String Day;
    private double StartTime;
    private Connection con;
    private PreparedStatement pst;
    private ResultSet rs;
    
    public EditRoutineInfoBySubjectBackEnd(String CourseCode,String Day,double StartTime){
        this.CourseCode=CourseCode;
        this.OldDay=Day;
        this.OldStartTime=StartTime;
        User= new Temp().getUser();
        con=new DBConnect().connectDB();
    }
    
    public void setInfo(String Day,double StartTime,String RoomNo,String ClassType){
        this.Day=Day;
        this.StartTime=StartTime;
        this.ClassType=ClassType;
        this.RoomNo=RoomNo;
    }
    public boolean updateInfo(){
        this.EndTime=StartTime+ClassDuration;
        boolean success = false;
        String sql ="update S_Routine set R_Day=?,S_Time=?,Room_No=?,E_Time=?,Class_Type=? where S_Code=? and Email=? and R_Day=? and S_Time=?";
        try{
        pst=con.prepareStatement(sql);
        pst.setString(1,Day);
        pst.setDouble(2,StartTime);
        pst.setString(3,RoomNo);
        pst.setDouble(4, EndTime);
        pst.setString(5,ClassType);
        pst.setString(6,CourseCode);
        pst.setString(7,User);
        pst.setString(8,OldDay);
        pst.setDouble(9,OldStartTime);
        pst.execute();
        success=true;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Nothing Updated");
        }
        return success;
    }
    
    public void setDuration(){
        String User = new Temp().getUser();
        String sql = "Select * from S_SubjectInfo where Email=? and S_Code=?" ;
            try{
                pst=con.prepareStatement(sql);
                pst.setString(1,User);
                pst.setString(2,CourseCode);
                rs = pst.executeQuery();
                while(rs.next()){
                 ClassDuration=rs.getDouble("Duration");
                }
            }catch (Exception ex){
                
            }
           
    }
}
