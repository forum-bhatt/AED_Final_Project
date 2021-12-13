/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Lab;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.DoctorRequest;
import Business.WorkQueue.LabRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kohli
 */
public class PendingTestsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PendingTestsJPanel
     */
    JPanel CardLayoutJPanel;
    UserAccount account;
    JFileChooser chooser;
    File file;
    BufferedImage img;
    String fileDir;
    
    public PendingTestsJPanel(JPanel CardLayoutJPanel, UserAccount account) {
        initComponents();
        this.CardLayoutJPanel=CardLayoutJPanel;
        this.account=account;
        
        populateWorkAreaTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPendingtest = new javax.swing.JTable();
        lblTitle = new javax.swing.JLabel();
        btnDeleteTest = new javax.swing.JButton();
        btnProcessTest = new javax.swing.JButton();
        btnChoose = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnCompleteTest = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        tblPendingtest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Patient", "Message", "Status"
            }
        ));
        jScrollPane1.setViewportView(tblPendingtest);

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        lblTitle.setText("Pending Tests");

        btnDeleteTest.setText("Delete Test");
        btnDeleteTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteTestActionPerformed(evt);
            }
        });

        btnProcessTest.setText("Process Test Request");
        btnProcessTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessTestActionPerformed(evt);
            }
        });

        btnChoose.setText("Choose");
        btnChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseActionPerformed(evt);
            }
        });

        jLabel1.setText("Upload Result: ");

        btnCompleteTest.setText("Complete Test Request");
        btnCompleteTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteTestActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel4.setText("Upload Test Result");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnProcessTest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDeleteTest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(lblTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(btnChoose))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(btnCompleteTest)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btnDeleteTest)
                        .addGap(48, 48, 48)
                        .addComponent(btnProcessTest)))
                .addGap(38, 38, 38)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChoose))
                .addGap(30, 30, 30)
                .addComponent(btnCompleteTest)
                .addGap(38, 38, 38))
        );
    }// </editor-fold>//GEN-END:initComponents
       public void populateWorkAreaTable(){

        DefaultTableModel model = (DefaultTableModel) tblPendingtest.getModel();
        
        //Delete empty rows
        model.setRowCount(0);
        for(WorkRequest workReq:account.getWorkQueue().getWorkRequestList()){
            
            Object[] row = new Object[3]; // Number of elements in the table - 6
            
            if(!workReq.getStatus().equals("Assigned to lab")){
                continue;
            }
            
            row[0] = workReq.getSender();
            row[1] = workReq.getMessage();
            row[2] = workReq;
            model.addRow(row);
        }
     
     }
    
    private void btnProcessTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessTestActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPendingtest.getSelectedRow();
        
        if(selectedRow < 0){
            
            JOptionPane.showMessageDialog(this, "Please select a Row to process");
            return;
        }else{
            
        WorkRequest wq = (WorkRequest)tblPendingtest.getValueAt(selectedRow, 2);
        
        
        //UploadTestResultJPanel uploadTestResultJPanel=new UploadTestResultJPanel(CardLayoutJPanel,account);
//        CardLayoutJPanel.add("UploadTestResultJPanel", uploadTestResultJPanel);
//        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
//        layout.next(CardLayoutJPanel);
        }
    }//GEN-LAST:event_btnProcessTestActionPerformed

    private void btnChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseActionPerformed
        // TODO add your handling code here:
    
    JFileChooser filechooser = new JFileChooser();
    filechooser.setDialogTitle("Choose Your File");
    filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
    
    int returnval = filechooser.showOpenDialog(this);
    if (returnval == JFileChooser.APPROVE_OPTION)
        {
            File file = filechooser.getSelectedFile();
            BufferedImage bi;
            BufferedImage img = null;
        try {
            fileDir = file.getPath();
        } catch(Exception e) {
            e.printStackTrace(); // todo: implement proper error handeling
        }
        }
    }//GEN-LAST:event_btnChooseActionPerformed

    private void btnCompleteTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteTestActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPendingtest.getSelectedRow();
          if(selectedRow<0 ) {
           JOptionPane.showMessageDialog(null, "Please upload the test result or select a valid test"); 
           return;
        }
          else{
          
        DefaultTableModel model = (DefaultTableModel) tblPendingtest.getModel();
        LabRequest wq = (LabRequest)tblPendingtest.getValueAt(selectedRow, 2);
        
        wq.setStatus("Lab Test Completed");
        wq.setReceiver(wq.getSender());
        wq.setSender(account);
        wq.setFileDir(fileDir);
        wq.setMessage("Find report");
        wq.getSender().getWorkQueue().getWorkRequestList().add(wq);
        JOptionPane.showMessageDialog(null, "Test Completed");
        
        }
        
    }//GEN-LAST:event_btnCompleteTestActionPerformed

    private void btnDeleteTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteTestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteTestActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChoose;
    private javax.swing.JButton btnCompleteTest;
    private javax.swing.JButton btnDeleteTest;
    private javax.swing.JButton btnProcessTest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblPendingtest;
    // End of variables declaration//GEN-END:variables
}
