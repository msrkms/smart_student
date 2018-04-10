
package Forms;

import Smart_Student_Backend.AddRoutineBackEnd;
import Smart_Student_Backend.*;
import Smart_Student_Backend.Temp;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Add_routine extends javax.swing.JFrame {
    private Connection con;
    private PreparedStatement pst;
    private ResultSet rs;    
   
    
    public Add_routine() {
        initComponents();
        setsubject();
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
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        OKbtn = new javax.swing.JButton();
        RoomNoTF = new javax.swing.JTextField();
        ClassTypeTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        DayCMBox = new javax.swing.JComboBox<>();
        SubjectCMBox = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        MeridiemCMBox = new javax.swing.JComboBox<>();
        MinuteCMBox = new javax.swing.JComboBox<>();
        HourCMBox = new javax.swing.JComboBox<>();
        backbtn = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Smart Student");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        OKbtn.setText("OK");
        OKbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKbtnActionPerformed(evt);
            }
        });
        jPanel2.add(OKbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 260, -1, -1));

        RoomNoTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomNoTFActionPerformed(evt);
            }
        });
        jPanel2.add(RoomNoTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 110, -1));
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
        jPanel2.add(SubjectCMBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 110, -1));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Subject :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 90, -1));

        MeridiemCMBox.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        MeridiemCMBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A.M", "P.M" }));
        MeridiemCMBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MeridiemCMBoxActionPerformed(evt);
            }
        });
        jPanel2.add(MeridiemCMBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, -1, -1));

        MinuteCMBox.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        MinuteCMBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        jPanel2.add(MinuteCMBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 60, -1));

        HourCMBox.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        HourCMBox.setMaximumRowCount(12);
        HourCMBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        jPanel2.add(HourCMBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 60, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 680, 320));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 760, 470));

        backbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backbtn.setForeground(new java.awt.Color(255, 255, 255));
        backbtn.setText("BACK");
        backbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backbtnMouseClicked(evt);
            }
        });
        getContentPane().add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smart_student/smar124.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -1, 980, 580));

        setSize(new java.awt.Dimension(984, 615));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setIconandLocation(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("std.png")));
        setLocationRelativeTo(null);
    }
    public void setsubject(){
        SubjectCMBox.removeAllItems();
        con=new DBConnect().connectDB();
       String User = new Temp().getUser();
        String sql = "Select * from S_SubjectInfo where Email=?" ;
            try{
                pst=con.prepareStatement(sql);
                pst.setString(1,User);
                rs = pst.executeQuery();
                while(rs.next()){
                String Subject = rs.getString("S_Code");
                 SubjectCMBox.addItem(Subject);
                }
                con.close();
            }catch (Exception ex){
            }
  
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
        
        //getting values from GUI
        String CourseCode=SubjectCMBox.getItemAt(SubjectCMBox.getSelectedIndex());
        String Day=DayCMBox.getItemAt(DayCMBox.getSelectedIndex());
        String Minute=MinuteCMBox.getItemAt(MinuteCMBox.getSelectedIndex());
        String Hour=HourCMBox.getItemAt(HourCMBox.getSelectedIndex());
        String Meridiem=MeridiemCMBox.getItemAt(MeridiemCMBox.getSelectedIndex());
        int temp=Integer.parseInt(Hour);
        if(Meridiem.equals("P.M")){
            if(temp!=12){
                int temp2=temp+12;
                Hour=String.valueOf(temp2);
            }   
        }else{
        }
        String Time=Hour+"."+Minute;
        Double StartTime=Double.parseDouble(Time);
        String RoomNo=RoomNoTF.getText();
        String ClassType=ClassTypeTF.getText();
        
        //Information saving processs
        AddRoutineBackEnd addroutine = new AddRoutineBackEnd(CourseCode);
        addroutine.setValue(Day, StartTime, RoomNo, ClassType);
        addroutine.setEndTime();
        addroutine.saveRoutine();
        
        //Clearing Input fields
        resetField();
        
        
        
    }//GEN-LAST:event_OKbtnActionPerformed

    private void  resetField(){
        RoomNoTF.setText(null);
        ClassTypeTF.setText(null);
        SubjectCMBox.setSelectedIndex(0);
        DayCMBox.setSelectedIndex(0);
        MinuteCMBox.setSelectedIndex(0);
        HourCMBox.setSelectedIndex(0);
        MeridiemCMBox.setSelectedIndex(0);
    }
    private void MeridiemCMBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MeridiemCMBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MeridiemCMBoxActionPerformed

    private void backbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbtnMouseClicked
      new addclass().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backbtnMouseClicked

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
            java.util.logging.Logger.getLogger(Add_routine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_routine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_routine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_routine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_routine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ClassTypeTF;
    private javax.swing.JComboBox<String> DayCMBox;
    private javax.swing.JComboBox<String> HourCMBox;
    private javax.swing.JComboBox<String> MeridiemCMBox;
    private javax.swing.JComboBox<String> MinuteCMBox;
    private javax.swing.JButton OKbtn;
    private javax.swing.JTextField RoomNoTF;
    private javax.swing.JComboBox<String> SubjectCMBox;
    private javax.swing.JLabel backbtn;
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