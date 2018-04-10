
package Smart_Student_Backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class DeleteSubjectInfoBackEnd {
    private String User;
    private String CourseCode;
    private Connection con;
    private PreparedStatement pst;
    private ResultSet rs;
    
    public DeleteSubjectInfoBackEnd(String CourseCode){
        this.CourseCode=CourseCode;
        con=new DBConnect().connectDB();
    }
    
    public int deleteSubject(){
    
        int success=0;
        deleteRoutineAll();
        deleteReminder();
        String sql = "delete from S_SubjectInfo where Email=? and S_Code=?" ;
            try{
                pst=con.prepareStatement(sql);
                pst.setString(1,User);
                pst.setString(2,CourseCode);
                success=pst.executeUpdate();
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, ex);
            }
            return success;
    }
    
    private void deleteReminder(){
        int success=0;
        User = new Temp().getUser();
        String sql = "delete from S_Reminder Where Email=? and S_Code=?" ;
            try{
                pst=con.prepareStatement(sql);
                pst.setString(1,User);
                pst.setString(2,CourseCode);
                success=pst.executeUpdate();
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, ex);
            }
            
    }
    
    public int deleteRoutineAll(){
        int success=0;
        User = new Temp().getUser();
        String sql = "delete from S_Routine where Email=? and S_Code=?" ;
            try{
                pst=con.prepareStatement(sql);
                pst.setString(1,User);
                pst.setString(2,CourseCode);
                success=pst.executeUpdate();
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, ex);
            }
            
            return success;
    }
    
    
    
    public int deleteRoutineOne(String Day,Double Time){
        User = new Temp().getUser();
        int success=0;
        String sql = "delete from S_Routine where Email=? and S_Code=? and R_Day=? and S_Time=?" ;
            try{
                pst=con.prepareStatement(sql);
                pst.setString(1,User);
                pst.setString(2,CourseCode);
                pst.setString(3,Day);
                pst.setDouble(4,Time);
                success=pst.executeUpdate();
                }catch (Exception ex){
                JOptionPane.showMessageDialog(null, ex);
            }
            return success;
    }
}
