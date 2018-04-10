
package Smart_Student_Backend;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class ErrorHand {
    public ErrorHand(String Error){
        
        JOptionPane jop = new JOptionPane();
        jop.setMessage(Error);
        jop.setMessageType(JOptionPane.ERROR_MESSAGE);
        JDialog dialog = jop.createDialog(null, "Error");
        dialog.setVisible(true);
    }
}
