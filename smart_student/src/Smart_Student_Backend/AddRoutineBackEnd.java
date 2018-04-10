
package Smart_Student_Backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class AddRoutineBackEnd {
    private Connection con;
    private PreparedStatement pst;
    private ResultSet rs;
    private boolean Already;
    private String Day;
    private double StartTime;
    private String CourseCode;
    private String RoomNo;
    private String ClassType;
    private String User;
    private double EndTime;
    private double Duration;
    public AddRoutineBackEnd(String CourseCode){
        this.CourseCode=CourseCode;
        
       
    }
    
    public void setValue(String Day,double StartTime,String RoomNo,String ClassType){
        this.Day=Day;
        this.RoomNo=RoomNo;
        this.ClassType=ClassType;
        this.User= new Temp().getUser();
        con=new DBConnect().connectDB();
        if(StartTime>12.59){
        double Temp=StartTime-12;
        StartTime=Temp;
        Temp=(int)StartTime;
        if((StartTime-Temp)>0.59){
            StartTime=Temp+1;
        }
        }
        this.StartTime=StartTime;
    }
  
public void setEndTime(){
    String sql = "Select * from S_SubjectInfo where Email=? and S_Code=?"  ;
        try{
            pst=con.prepareStatement(sql);
            pst.setString(1,User);
            pst.setString(2,CourseCode);
            rs = pst.executeQuery();
            while(rs.next()){
            Duration = rs.getDouble("Duration");
            this.EndTime=StartTime+Duration;
            if(EndTime>12.59){
                double Temp=EndTime-12;
                EndTime=Temp;
                Temp=(int)EndTime;
                if((EndTime-Temp)>0.59){
                EndTime=Temp+1;
            }
            }
        }
        }catch (Exception ex){
                
        }

}
   
    public void saveRoutine(){
            String sql2 = "Select * from S_Routine Where R_Day=? and S_Time=? and Email=? and S_Code=?" ;
            try{
                pst=con.prepareStatement(sql2);
                pst.setString(1,Day);
                pst.setDouble(2,StartTime);
                pst.setString(3,User);
                pst.setString(4,CourseCode);
                rs = pst.executeQuery();
                if(rs.next()){
                 Already= true;
                }
            }catch(Exception ex){
JOptionPane.showMessageDialog(null,ex);
}
            if(Already==true){
            JOptionPane.showMessageDialog(null,Day+"-"+StartTime+",at this time you already have a Calass");
            }else{
            
        String sql ="insert into S_Routine (R_Day,S_Time,S_Code,Room_No,E_Time,Email,Class_Type) values (?,?,?,?,?,?,?)";
        try{
         pst=con.prepareStatement(sql);
         pst.setString(1,Day);
         pst.setDouble(2,StartTime);
         pst.setString(3,CourseCode);
         pst.setString(4,RoomNo);
         pst.setDouble(5,EndTime);
         pst.setString(6,User);
         pst.setString(7,ClassType);
         pst.execute();


        JOptionPane.showMessageDialog(null, CourseCode+"at"+StartTime+"Saved");
             }catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex);
            }
   }
       }
}
