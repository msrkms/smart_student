package Smart_Student_Backend;

public class RoutineStatesBackEnd {
    public String S_Code;
    public String Day;
    public double S_Time;
    public double E_Time;
    public String Class_Type;
    public String Room_No;
    static int totalobj=-1;
    
    
    public RoutineStatesBackEnd(){
        totalobj++;
    }
    public RoutineStatesBackEnd(int c){
      
    }
    
    public int getNumberOfObject(){
        return totalobj;
    }
    public void SetValue(String c,String d,double st,double et,String ct,String rn){
        S_Code=c;
        Day=d;
        S_Time =st;
        E_Time=et;
        Class_Type=ct;
        Room_No=rn;
    }
}

