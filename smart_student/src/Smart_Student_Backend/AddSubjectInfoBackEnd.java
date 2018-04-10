
package Smart_Student_Backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class AddSubjectInfoBackEnd {
    private Connection con;
    private PreparedStatement pst;
    private ResultSet rs; 
    
    private boolean success=false;
    private String UEmail;
    private boolean Already=false;
    private String CourseCode;
    private String CourseName;
    private String Teacher;
    private String TeacherPhone;
    private String TeacherEmail;
    private int Credit;
    private double Duration;
    public AddSubjectInfoBackEnd(){
        
    }
    public void  setValue(String CourseCode,String CourseName,String Teacher,String Phone,String Email,int Credit,double Duration){
        con=new DBConnect().connectDB();
        this.CourseCode=CourseCode;
        this.CourseName=CourseName;
        this.Teacher=Teacher;
        this.TeacherPhone=Phone;
        this.TeacherEmail=Email;
        this.Credit=Credit;
        this.Duration=Duration;
        this.UEmail=new Temp().getUser();
    }
    
    

    public boolean CheckExistance(){
            
            String sql2 = "Select * from S_SubjectInfo Where S_Code=? and Email=?";
            try{
                pst=con.prepareStatement(sql2);
                pst.setString(1,CourseCode);
                pst.setString(2,UEmail);
                rs = pst.executeQuery();
                if(rs.next()){
                 Already= true;
                }
                pst.close();
            }catch(Exception ex){    
                JOptionPane.showMessageDialog(null,ex);
            }
    return Already;        
    }
    
    
    public boolean saveinfo(){

        String sql ="insert into S_SubjectInfo (S_Code,S_Name,S_Teacher,Teacher_Email,Teacher_Phone,Duration,Credit,Email) values (?,?,?,?,?,?,?,?)";
        try{
        pst=con.prepareStatement(sql);
        pst.setString(1,CourseCode);
        pst.setString(2,CourseName);
        pst.setString(3,Teacher);
        pst.setString(4, TeacherEmail);
        pst.setString(5,TeacherPhone);
        pst.setDouble(6,Duration);
        pst.setInt(7,Credit);
        pst.setString(8,UEmail);
        pst.execute();
        success=true;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
     
     return success;
   }
    


}

