
package Forms;

import Smart_Student_Backend.DeleteSubjectInfoBackEnd;
import Smart_Student_Backend.Temp;
import Smart_Student_Backend.ViewRoutineBySubjectBackEnd;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class delete_routine extends javax.swing.JFrame {

    private String CourseCode;
  
    public delete_routine(String CourseCode) {
        initComponents();
        this.CourseCode=CourseCode;
        setValue();
        Tabledesign();
    }
    
    public delete_routine() {
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

        Selecet = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        DeleteAllBtn = new javax.swing.JButton();
        DeleteSelectedBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        routinetable = new javax.swing.JTable();
        CourseCodeLabel = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
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
        jLabel6.setText("Delete");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        jPanel2.setBackground(new java.awt.Color(78, 205, 196));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DeleteAllBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        DeleteAllBtn.setText("Delete All");
        DeleteAllBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteAllBtnActionPerformed(evt);
            }
        });
        jPanel2.add(DeleteAllBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 110, -1));

        DeleteSelectedBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        DeleteSelectedBtn.setText("Delete Selected");
        DeleteSelectedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteSelectedBtnActionPerformed(evt);
            }
        });
        jPanel2.add(DeleteSelectedBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 150, -1));

        routinetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Day", "Room No", "Start Time", "End Time", "Class Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        routinetable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(routinetable);
        if (routinetable.getColumnModel().getColumnCount() > 0) {
            routinetable.getColumnModel().getColumn(0).setResizable(false);
            routinetable.getColumnModel().getColumn(1).setResizable(false);
            routinetable.getColumnModel().getColumn(2).setResizable(false);
            routinetable.getColumnModel().getColumn(3).setResizable(false);
            routinetable.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 710, 240));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 750, 360));

        CourseCodeLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CourseCodeLabel.setText("SWE-131");
        jPanel1.add(CourseCodeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 120, -1));

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel33.setText("Subject Code :");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 120, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 820, 510));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel27.setText("BACK");
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smart_student/barckground.png"))); // NOI18N
        jLabel30.setText("jLabel30");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 580));

        setSize(new java.awt.Dimension(967, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setIconandLocation(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("std.png")));
        setLocationRelativeTo(null);
    }
    private void Tabledesign(){
        routinetable.setBackground(new Color(0,0,0,0));
        ((DefaultTableCellRenderer) routinetable.getDefaultRenderer(Object.class)).setBackground(new Color(0,0,0,0));
        routinetable.setGridColor( Color.WHITE);
        routinetable.setForeground(Color.BLACK);
        jScrollPane1.setBackground(new Color(0,0,0,0));
        jScrollPane1.setOpaque(false);
        routinetable.setOpaque(false);
        ((DefaultTableCellRenderer) routinetable.getDefaultRenderer(Object.class)).setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        
    }
    private void DeleteSelectedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteSelectedBtnActionPerformed
        DefaultTableModel table = (DefaultTableModel) routinetable.getModel();
        int row = routinetable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null,"Now row selected");
        }else{
        String Day=table.getValueAt(row,0).toString();
        Double Time=Double.parseDouble(table.getValueAt(row,2).toString());
        DeleteSubjectInfoBackEnd deleteroutine = new DeleteSubjectInfoBackEnd(CourseCode);
        int success=deleteroutine.deleteRoutineOne(Day,Time);
        if(success!=0){
            JOptionPane.showMessageDialog(null,"Delete Successfully");
            table.removeRow(row);
        }else{
            JOptionPane.showMessageDialog(null,"Delete Unsuccessful");
        }
        
        }
    }//GEN-LAST:event_DeleteSelectedBtnActionPerformed

    private void DeleteAllBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteAllBtnActionPerformed
        
        int row=routinetable.getRowCount();
        
        if(row==0){
            JOptionPane.showMessageDialog(null,"There Is No Data");
        }else{
       DeleteSubjectInfoBackEnd deletesubject= new DeleteSubjectInfoBackEnd(CourseCode);
       int success=deletesubject.deleteRoutineAll();
       if(success!=0){
            DefaultTableModel table = (DefaultTableModel) routinetable.getModel();
           JOptionPane.showMessageDialog(null,"Delete Successful");
           for(int i=row-1;i>=0;i--){
               table.removeRow(i);
               System.out.println(i);
           }
       }else{
           JOptionPane.showMessageDialog(null,"No Information Changed");
       }
        }
    }//GEN-LAST:event_DeleteAllBtnActionPerformed

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        new delete().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel27MouseClicked

    
    private void setValue(){
        DefaultTableModel table = (DefaultTableModel) routinetable.getModel();
        int row = table.getRowCount();
         for(int i=row-1;i>=0;i--){
             table.removeRow(i);
         }
      
        String User = new Temp().getUser();
        CourseCodeLabel.setText(CourseCode);
        ViewRoutineBySubjectBackEnd vrbs = new ViewRoutineBySubjectBackEnd(User,CourseCode);
        vrbs.getInfofromDatabase();
        int j=vrbs.i;
        for(int i=0;i<=j;i++){
            String Day=(vrbs.Day[i]);
            String RoomNo=(vrbs.RoomNo[i]);
            String StartTime=(String.valueOf(vrbs.StartTime[i]));
            String EndTime=(String.valueOf(vrbs.EndTime[i]));
            String ClassType=(vrbs.ClassType[i]);
            Object[] data = {Day,RoomNo,StartTime,EndTime,ClassType};
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
            java.util.logging.Logger.getLogger(delete_routine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(delete_routine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(delete_routine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(delete_routine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new delete_routine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CourseCodeLabel;
    private javax.swing.JButton DeleteAllBtn;
    private javax.swing.JButton DeleteSelectedBtn;
    private javax.swing.ButtonGroup Selecet;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable routinetable;
    // End of variables declaration//GEN-END:variables
}
