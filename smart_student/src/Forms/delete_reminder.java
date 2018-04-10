
package Forms;

import Smart_Student_Backend.DeleteReminderBackEnd;
import Smart_Student_Backend.ViewReminderByCourseCodeBackEnd;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;


public class delete_reminder extends javax.swing.JFrame {
    private String[] Discription=new String[5];
    
    private int pageno=1;
    private int totalpage=0;
    private int lastpagedata=0;
    private int currentpage=-1;
    private int currentpagedata=0;
  
    public delete_reminder() {
        initComponents();
        Tabledesign();
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
        jPanel3 = new javax.swing.JPanel();
        NextPageBtn = new javax.swing.JLabel();
        CourseCode4 = new javax.swing.JLabel();
        Date3 = new javax.swing.JLabel();
        Date4 = new javax.swing.JLabel();
        Time3 = new javax.swing.JLabel();
        Time4 = new javax.swing.JLabel();
        Time1 = new javax.swing.JLabel();
        CourseCode3 = new javax.swing.JLabel();
        CourseCode1 = new javax.swing.JLabel();
        CourseCode2 = new javax.swing.JLabel();
        Title2 = new javax.swing.JLabel();
        Title3 = new javax.swing.JLabel();
        Date5 = new javax.swing.JLabel();
        Time5 = new javax.swing.JLabel();
        Title4 = new javax.swing.JLabel();
        CourseCode5 = new javax.swing.JLabel();
        Title5 = new javax.swing.JLabel();
        Time2 = new javax.swing.JLabel();
        Title1 = new javax.swing.JLabel();
        Date2 = new javax.swing.JLabel();
        Date1 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        ShowLabel2 = new javax.swing.JLabel();
        ShowLabel3 = new javax.swing.JLabel();
        ShowLabel4 = new javax.swing.JLabel();
        ShowLabel5 = new javax.swing.JLabel();
        ShowLabel1 = new javax.swing.JLabel();
        BackPageBtn = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        remindertable = new javax.swing.JTable();
        BackBtn = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Smart Student");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smart_student/smar1t.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 160, 100));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel6.setText("Delete Information");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        jPanel3.setBackground(new java.awt.Color(103, 65, 114));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NextPageBtn.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        NextPageBtn.setForeground(new java.awt.Color(255, 255, 255));
        NextPageBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NextPageBtnMouseClicked(evt);
            }
        });
        jPanel3.add(NextPageBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, 120, -1));

        CourseCode4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(CourseCode4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, -1));

        Date3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(Date3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        Date4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(Date4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        Time3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(Time3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, -1, -1));

        Time4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(Time4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        Time1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(Time1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));

        CourseCode3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(CourseCode3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, -1, -1));

        CourseCode1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(CourseCode1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, -1, 37));

        CourseCode2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(CourseCode2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

        Title2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(Title2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, -1, -1));

        Title3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(Title3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, -1, 20));

        Date5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(Date5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        Time5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(Time5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));

        Title4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(Title4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, -1, -1));

        CourseCode5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(CourseCode5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, -1, -1));

        Title5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(Title5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, -1, -1));

        Time2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(Time2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        Title1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(Title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, -1, -1));

        Date2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(Date2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        Date1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(Date1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jLabel31.setText("jLabel1");
        jPanel3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Delete Selected");
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 150, -1));

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton8.setText("Delete All");
        jPanel3.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 110, -1));

        ShowLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        ShowLabel2.setForeground(new java.awt.Color(255, 255, 255));
        ShowLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowLabel2MouseClicked(evt);
            }
        });
        jPanel3.add(ShowLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 70, -1));

        ShowLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        ShowLabel3.setForeground(new java.awt.Color(255, 255, 255));
        ShowLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowLabel3MouseClicked(evt);
            }
        });
        jPanel3.add(ShowLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, 70, -1));

        ShowLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        ShowLabel4.setForeground(new java.awt.Color(255, 255, 255));
        ShowLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowLabel4MouseClicked(evt);
            }
        });
        jPanel3.add(ShowLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, 70, -1));

        ShowLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        ShowLabel5.setForeground(new java.awt.Color(255, 255, 255));
        ShowLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowLabel5MouseClicked(evt);
            }
        });
        jPanel3.add(ShowLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 70, -1));

        ShowLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        ShowLabel1.setForeground(new java.awt.Color(255, 255, 255));
        ShowLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowLabel1MouseClicked(evt);
            }
        });
        jPanel3.add(ShowLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 70, -1));

        BackPageBtn.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        BackPageBtn.setForeground(new java.awt.Color(255, 255, 255));
        BackPageBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackPageBtnMouseClicked(evt);
            }
        });
        jPanel3.add(BackPageBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 120, -1));

        remindertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date ", "Time", "Subject Code", "Title", "Discription"
            }
        ));
        jScrollPane1.setViewportView(remindertable);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 30, 710, 240));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 750, 360));

        BackBtn.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        BackBtn.setText("Back");
        jPanel1.add(BackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 50, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 810, 490));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smart_student/smar124.png"))); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 980, 590));

        setSize(new java.awt.Dimension(966, 577));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setIconandLocation(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("std.png")));
        setLocationRelativeTo(null);
    }
    private void Tabledesign(){
        remindertable.setBackground(new Color(0,0,0,0));
        ((DefaultTableCellRenderer) remindertable.getDefaultRenderer(Object.class)).setBackground(new Color(0,0,0,0));
        remindertable.setGridColor( Color.WHITE);
        remindertable.setForeground(Color.BLACK);
        jScrollPane1.setBackground(new Color(0,0,0,0));
        jScrollPane1.setOpaque(false);
        remindertable.setOpaque(false);
        ((DefaultTableCellRenderer) remindertable.getDefaultRenderer(Object.class)).setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        
    }
    
    private void ShowLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowLabel2MouseClicked
        JOptionPane.showMessageDialog(rootPane, Discription[1]);
    }//GEN-LAST:event_ShowLabel2MouseClicked

    private void ShowLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowLabel3MouseClicked
        JOptionPane.showMessageDialog(rootPane, Discription[2]);
    }//GEN-LAST:event_ShowLabel3MouseClicked

    private void ShowLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowLabel4MouseClicked
       JOptionPane.showMessageDialog(rootPane, Discription[3]);
    }//GEN-LAST:event_ShowLabel4MouseClicked

    private void ShowLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowLabel5MouseClicked
       JOptionPane.showMessageDialog(rootPane, Discription[4]);
    }//GEN-LAST:event_ShowLabel5MouseClicked

    private void ShowLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowLabel1MouseClicked
        JOptionPane.showMessageDialog(rootPane, Discription[0]);
    }//GEN-LAST:event_ShowLabel1MouseClicked

    private void BackPageBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackPageBtnMouseClicked
        
    }//GEN-LAST:event_BackPageBtnMouseClicked

    private void NextPageBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextPageBtnMouseClicked
    
    }//GEN-LAST:event_NextPageBtnMouseClicked

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
            java.util.logging.Logger.getLogger(delete_reminder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(delete_reminder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(delete_reminder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(delete_reminder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new delete_reminder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackBtn;
    private javax.swing.JLabel BackPageBtn;
    private javax.swing.JLabel CourseCode1;
    private javax.swing.JLabel CourseCode2;
    private javax.swing.JLabel CourseCode3;
    private javax.swing.JLabel CourseCode4;
    private javax.swing.JLabel CourseCode5;
    private javax.swing.JLabel Date1;
    private javax.swing.JLabel Date2;
    private javax.swing.JLabel Date3;
    private javax.swing.JLabel Date4;
    private javax.swing.JLabel Date5;
    private javax.swing.JLabel NextPageBtn;
    private javax.swing.JLabel ShowLabel1;
    private javax.swing.JLabel ShowLabel2;
    private javax.swing.JLabel ShowLabel3;
    private javax.swing.JLabel ShowLabel4;
    private javax.swing.JLabel ShowLabel5;
    private javax.swing.JLabel Time1;
    private javax.swing.JLabel Time2;
    private javax.swing.JLabel Time3;
    private javax.swing.JLabel Time4;
    private javax.swing.JLabel Time5;
    private javax.swing.JLabel Title1;
    private javax.swing.JLabel Title2;
    private javax.swing.JLabel Title3;
    private javax.swing.JLabel Title4;
    private javax.swing.JLabel Title5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable remindertable;
    // End of variables declaration//GEN-END:variables
}