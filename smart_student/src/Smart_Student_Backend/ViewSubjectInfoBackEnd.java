
package Smart_Student_Backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ViewSubjectInfoBackEnd {
    public String CourseName;
    public String CourseTeacher;
    public int CourseCredit;
    public double Duration;
    public String TeacherEmail;
    public String TecherPhone;
    private String CourseCode;
    private Connection con;
    private PreparedStatement pst;
    private ResultSet rs;
    public ViewSubjectInfoBackEnd(String CourseCode){
        this.CourseCode=CourseCode;
        con=new DBConnect().connectDB();
    }
    
    public void getInfoFromDataBase(){
        String User = new Temp().getUser();
        String sql = "Select * from S_SubjectInfo where Email=? and S_Code=?" ;
            try{
                pst=con.prepareStatement(sql);
                pst.setString(1,User);
                pst.setString(2,CourseCode);
                rs = pst.executeQuery();
                while(rs.next()){
                    CourseName  = rs.getString("S_Name");
                    CourseTeacher=rs.getString("S_Teacher");
                    CourseCredit=rs.getInt("Credit");
                    Duration=rs.getDouble("Duration");
                    TeacherEmail=rs.getString("Teacher_Email");
                    TecherPhone=rs.getString("Teacher_Phone");
                }
            }catch (Exception ex){
                
            }
    }
}
