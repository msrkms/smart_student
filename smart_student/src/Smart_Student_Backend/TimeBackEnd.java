
package Smart_Student_Backend;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;  
public class TimeBackEnd{
    private String Cdate;
    private String CInternationalTime;
    private String CTime;
    
    public TimeBackEnd(){
        LocalDateTime datetime1 = LocalDateTime.now();  
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        DateTimeFormatter internationaltime = DateTimeFormatter.ofPattern("HH:mm");
        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd-MMM-YYYY");
        CInternationalTime = datetime1.format(internationaltime);
        Cdate = datetime1.format(date);
        DateTimeFormatter time = DateTimeFormatter.ofPattern("hh:mm:a");
        CTime=datetime1.format(time);
    }
    public String geInternatioltime(){ 
        return CInternationalTime;
    }  
    
    public String getDate(){
        return Cdate;
    }
    
    public String getTime(){
        return CTime;
    }
}  
