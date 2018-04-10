
package Smart_Student_Backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class EditSubjectInfoBackEnd {
    private String CourseCode;
    private String CourseName;
    private int CourseCredit;
    private String CourseTeacher;
    private String TeacherMail;
    private String TeacherPhone;
    private double ClassDuration;
    private String User;
    private Connection con;
    private PreparedStatement pst;
    private ResultSet rs;
    
    public EditSubjectInfoBackEnd(){
        this.User= new Temp().getUser();
    }
    public void setValue( String CourseCode,String CourseName,int CourseCredit,String CourseTeacher,String TeacherMail,String TeacherPhone,double ClassDuration){
        this.CourseCode=CourseCode;
        this.CourseCredit=CourseCredit;
        this.CourseName=CourseName;
        this.CourseTeacher=CourseTeacher;
        this.TeacherMail=TeacherMail;
        this.TeacherPhone=TeacherPhone;
        this.ClassDuration=ClassDuration;
    }
    
    public boolean updateInfo(){
        con= new DBConnect().connectDB();
        boolean success = false;
        String sql ="update S_SubjectInfo set S_Code=?,S_Name=?,S_Teacher=?,Teacher_Email=?,Teacher_Phone=?,Duration=?,Credit=? where S_Code=? and Email=?";
        try{
        pst=con.prepareStatement(sql);
        pst.setString(1,CourseCode);
        pst.setString(2,CourseName);
        pst.setString(3,CourseTeacher);
        pst.setString(4, TeacherMail);
        pst.setString(5,TeacherPhone);
        pst.setDouble(6,ClassDuration);
        pst.setInt(7,CourseCredit);
        pst.setString(8,CourseCode);
        pst.setString(9,User);
        pst.execute();
        success=true;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
        return success;
    }
}
