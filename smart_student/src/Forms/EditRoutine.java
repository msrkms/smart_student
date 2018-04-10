
package Forms;

import Smart_Student_Backend.AddRoutineBackEnd;
import Smart_Student_Backend.*;
import Smart_Student_Backend.Temp;
import java.awt.Toolkit;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class EditRoutine extends javax.swing.JFrame {
    private String CourseCode;
    private String OldDay;
    private double OldStartTime;
   
    
    public EditRoutine(String CourseCode,String Day,String StartTime,String RoomNo,String ClassType) {
        initComponents();
        this.OldDay=Day;
        this.CourseCode=CourseCode;
        this.OldStartTime=Double.parseDouble(StartTime);
        SubjectCMBox.addItem(CourseCode);
        DayCMBox.addItem(Day);
        StartTimeTF.setText(StartTime);
        RoomNoTF.setText(RoomNo);
        ClassTypeTF.setText(ClassType);
    }
    
    public EditRoutine() {
        initComponents();
        setIconandLocation();
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Backbtn = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        OKbtn = new javax.swing.JButton();
        RoomNoTF = new javax.swing.JTextField();
        StartTimeTF = new javax.swing.JTextField();
        ClassTypeTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        DayCMBox = new javax.swing.JComboBox<>();
        SubjectCMBox = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Smart Student");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Backbtn.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Backbtn.setText("Back");
        Backbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackbtnMouseClicked(evt);
            }
        });
        jPanel1.add(Backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smart_student/smar1t.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 160, 100));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel6.setText("Add Routine");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        jPanel2.setBackground(new java.awt.Color(103, 65, 114));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        OKbtn.setBackground(new java.awt.Color(232, 126, 4));
        OKbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        OKbtn.setForeground(new java.awt.Color(255, 255, 255));
        OKbtn.setText("Update");
        OKbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKbtnActionPerformed(evt);
            }
        });
        jPanel2.add(OKbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, -1, -1));

        RoomNoTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomNoTFActionPerformed(evt);
            }
        });
        jPanel2.add(RoomNoTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 110, -1));
        jPanel2.add(StartTimeTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 110, -1));
        jPanel2.add(ClassTypeTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 110, -1));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Day :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 50, -1));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Room No :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 110, -1));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Start Time :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 130, -1));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Class Type :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 130, -1));

        DayCMBox.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        DayCMBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday" }));
        DayCMBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DayCMBoxMouseClicked(evt);
            }
        });
        jPanel2.add(DayCMBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, -1));

        SubjectCMBox.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        SubjectCMBox.setToolTipText("");
        SubjectCMBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubjectCMBoxMouseClicked(evt);
            }
        });
        SubjectCMBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubjectCMBoxActionPerformed(evt);
            }
        });
        jPanel2.add(SubjectCMBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 110, -1));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Subject :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 90, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 680, 320));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 760, 470));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smart_student/smar124.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -11, 980, 590));

        setSize(new java.awt.Dimension(984, 615));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setIconandLocation(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("std.png")));
        setLocationRelativeTo(null);
    }
    
    
    
    private void RoomNoTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomNoTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoomNoTFActionPerformed

    private void DayCMBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DayCMBoxMouseClicked
    
    }//GEN-LAST:event_DayCMBoxMouseClicked

    private void SubjectCMBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubjectCMBoxMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SubjectCMBoxMouseClicked

    private void OKbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKbtnActionPerformed
        CourseCode=SubjectCMBox.getItemAt(SubjectCMBox.getSelectedIndex());
        String Day=DayCMBox.getItemAt(DayCMBox.getSelectedIndex());
        Double StartTime=Double.parseDouble(StartTimeTF.getText());
        String RoomNo=RoomNoTF.getText();
        String ClassType=ClassTypeTF.getText();
        EditRoutineInfoBySubjectBackEnd editroutine= new EditRoutineInfoBySubjectBackEnd(CourseCode,OldDay,OldStartTime);
        editroutine.setDuration();
        editroutine.setInfo(Day, StartTime, RoomNo, ClassType);
        boolean Success=editroutine.updateInfo();
        if(Success==true){
            JOptionPane.showMessageDialog(rootPane,"Information Updated");
            new EditClass().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_OKbtnActionPerformed

    private void BackbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackbtnMouseClicked
        new routineedit(CourseCode).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackbtnMouseClicked

    private void SubjectCMBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubjectCMBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubjectCMBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditRoutine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditRoutine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditRoutine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditRoutine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditRoutine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Backbtn;
    private javax.swing.JTextField ClassTypeTF;
    private javax.swing.JComboBox<String> DayCMBox;
    private javax.swing.JButton OKbtn;
    private javax.swing.JTextField RoomNoTF;
    private javax.swing.JTextField StartTimeTF;
    private javax.swing.JComboBox<String> SubjectCMBox;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
