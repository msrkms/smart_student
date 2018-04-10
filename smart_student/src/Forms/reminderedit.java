package Forms;

import Forms.home_page;
import Smart_Student_Backend.*;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class reminderedit extends javax.swing.JFrame {
    private String[] Discription=new String[10];
    private String Day;
    private String User;

    
  
    public reminderedit() {
        initComponents();
        this.User=new Temp().getUser();
        setValue();
        Tabledesign();
        setIconandLocation();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        remindertable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        Backbtn = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Smart Student");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smart_student/smar1t.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 160, 100));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel6.setText("Edit Reminder Information");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        jPanel2.setBackground(new java.awt.Color(78, 205, 196));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        remindertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Time", "Subject Code", "Title"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        remindertable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(remindertable);
        if (remindertable.getColumnModel().getColumnCount() > 0) {
            remindertable.getColumnModel().getColumn(0).setResizable(false);
            remindertable.getColumnModel().getColumn(1).setResizable(false);
            remindertable.getColumnModel().getColumn(2).setResizable(false);
            remindertable.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 330));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 720, 330));

        jButton1.setText("Edit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, 130, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 810, 510));

        Backbtn.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        Backbtn.setText("BACK");
        Backbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackbtnMouseClicked(evt);
            }
        });
        getContentPane().add(Backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smart_student/barckground.png"))); // NOI18N
        jLabel30.setText("jLabel30");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 580));

        setSize(new java.awt.Dimension(968, 605));
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
    private void BackbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackbtnMouseClicked
      new home_page().setVisible(true);
      this.dispose();
        
    }//GEN-LAST:event_BackbtnMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int row = remindertable.getSelectedRow();
        if(row<0){
            
        }else{
        DefaultTableModel table = (DefaultTableModel) remindertable.getModel();
        String CourseCode=table.getValueAt(row,2).toString();
        String Time=table.getValueAt(row,1).toString();
        String Date=table.getValueAt(row,0).toString();
        EditReminderBackEnd editreminder= new EditReminderBackEnd(Date,Time);
        boolean check=editreminder.getInfoFromDataBase();
        if(check==true){
            new edit_reminder(editreminder).setVisible(true);
            this.dispose();
            
        }else{
            JOptionPane.showMessageDialog(rootPane, "Date:"+Date+"\nTime"+Time+"\nData Not Exist");
        }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private void setValue(){
        DefaultTableModel table = (DefaultTableModel) remindertable.getModel();
        int row = table.getRowCount();
         for(int i=row-1;i>=0;i--){
             table.removeRow(i);
         }
        ViewReminderByCourseCodeBackEnd vr = new ViewReminderByCourseCodeBackEnd();
        vr.getInfoFromDataBase();
        int j=vr.i;
        System.out.println(j);
        for(int i=0;i<=j;i++){
            String CourseCode=(vr.CourseCode[i]);
            String Date=(vr.Date[i]);
            String Time=(String.valueOf(vr.Time[i]));
            String Title=(String.valueOf(vr.Title[i]));
            Discription[i]=vr.Discription[i];
            Object[] data = {Date,Time,CourseCode,Title};
                    table.addRow(data);
        }
        
    }
    
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
            java.util.logging.Logger.getLogger(reminderedit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reminderedit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reminderedit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reminderedit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reminderedit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Backbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable remindertable;
    // End of variables declaration//GEN-END:variables
}
