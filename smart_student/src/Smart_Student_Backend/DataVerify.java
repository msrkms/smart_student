
package Smart_Student_Backend;

import javax.swing.JOptionPane;

public class DataVerify {
    
    
    
    public boolean checkEmail(String Email){
        boolean valid=false;

        if(Email.contains("@") && Email.contains(".")){
            String[] Data= new String[2];
            try {
            Data=Email.split("@");
            if(Data[1].contains(".")){
                valid=true;
            }
            }catch (Exception e) {
            
            }
        }
        if(!valid){
            JOptionPane.showMessageDialog(null, "Email is  not Valid");
        }
        return valid;
    }
    
    
    public boolean checkPassword(String Password){
        boolean vaild=true;
        if((Password.contains(" ")) || (Password.length()<6)){
            vaild=false;
            JOptionPane.showMessageDialog(null,"Password is Invalid\nMust use 6 digit password");
        }
        return vaild;
    }
    
    public boolean checkName(String Name){
        boolean valid=false;
        if((String.valueOf(Name.charAt(0)).equals(String.valueOf(Name.charAt(0)).toUpperCase())) && Name.length()>=3){
            valid=true;
        }else{
            JOptionPane.showMessageDialog(null, "Name is Invalid\nEx:Sajid");
        }
        return valid;
    }
}
