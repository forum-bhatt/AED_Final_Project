/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Department;

import Business.DB4OUtil.DB4OUtil;
import Business.Department.Department;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author foram
 */
public class DepartmentAdminJPanel extends javax.swing.JPanel {
    
    private JPanel CardLayoutJPanel;
    private Ecosystem business;
    private UserAccount account;
    
    private Department department;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    /**
     * Creates new form WelcomePatientJPanel
     */
    
    public DepartmentAdminJPanel(JPanel CardLayoutJPanel, UserAccount account, Ecosystem business) {
        initComponents();
        
        this.CardLayoutJPanel = CardLayoutJPanel;
        this.business = business;
        this.account = account;
        
        //this.department = (Department) this.account.getDetails();
    }
    
  

    /**
     * Creates new form DepartmentAdminJPanel
     */
    public DepartmentAdminJPanel() {
        initComponents();
    }

    /**
     creates department admin panels 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnDepartmentInfo = new javax.swing.JButton();
        btnManagePhysicians = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setText("Department Admin Panel");

        btnDepartmentInfo.setText("Department Information");
        btnDepartmentInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepartmentInfoActionPerformed(evt);
            }
        });

        btnManagePhysicians.setText("Manage Doctors");
        btnManagePhysicians.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePhysiciansActionPerformed(evt);
            }
        });

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnBack.setText("Back");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(275, 275, 275))
            .addGroup(layout.createSequentialGroup()
                .addGap(375, 375, 375)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogout)
                    .addComponent(btnManagePhysicians)
                    .addComponent(btnDepartmentInfo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDepartmentInfo, btnLogout, btnManagePhysicians});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addGap(50, 50, 50)
                .addComponent(btnDepartmentInfo)
                .addGap(29, 29, 29)
                .addComponent(btnManagePhysicians)
                .addGap(33, 33, 33)
                .addComponent(btnLogout)
                .addContainerGap(208, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDepartmentInfo, btnLogout});

    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
         dB4OUtil.storeSystem(business);
        LoginJPanel loginJPanel = new LoginJPanel(CardLayoutJPanel, business,"");
        CardLayoutJPanel.add("LoginJPanel", loginJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnManagePhysiciansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePhysiciansActionPerformed
        // TODO add your handling code here:
        
        ManagePhysicianJPanel managePhysicianJPanel = new ManagePhysicianJPanel(CardLayoutJPanel, null, this.department, this.business);
        CardLayoutJPanel.add("ManagePhysicianJPanel", managePhysicianJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel); 

       
    }//GEN-LAST:event_btnManagePhysiciansActionPerformed

    private void btnDepartmentInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepartmentInfoActionPerformed
        // TODO add your handling code here:
        
        DepartmentInfoJPanel departmentInfoJPanel = new DepartmentInfoJPanel(CardLayoutJPanel, this.department);
        CardLayoutJPanel.add("DepartmentInfoJPanel", departmentInfoJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel); 
    }//GEN-LAST:event_btnDepartmentInfoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDepartmentInfo;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnManagePhysicians;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
