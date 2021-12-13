/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.DoctorRole;

//import Business.Doctor.Doctor;
import Business.Doctor.Doctor;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import static Business.Organization.Organization.Type.Doctor;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author kohli
 */
public class DoctorDashboardJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorDashboard
     */
    private JPanel userProcessContainer;
    private Organization docOrganization;
    private Enterprise enterprise;
    private UserAccount account;
    private Doctor doctor;
    private EcoSystem business;
    
    public DoctorDashboardJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,EcoSystem business) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.docOrganization=organization;
        this.enterprise=enterprise;
        this.account=account;
        this.doctor=doctor;
        this.business=business;
        
        /*for(Doctor doc:docOrganization.getDoctorDirectory().getDoctorlist()){
            System.out.println(doc.getName()+" "+doc.getDoctorId());
        }
        JOptionPane.showMessageDialog(this, this.account);*/
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAppointments = new javax.swing.JButton();
        btnSeachPatient = new javax.swing.JButton();
        btnPersonalInfo = new javax.swing.JButton();
        btnLab = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 0, 0));

        jLabel1.setBackground(new java.awt.Color(255, 153, 102));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("       Welcome Doctor ");
        jLabel1.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Navigate to:");

        btnAppointments.setBackground(new java.awt.Color(255, 153, 102));
        btnAppointments.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnAppointments.setIcon(new javax.swing.ImageIcon("C:\\Users\\foram\\Downloads\\appointment (1).png")); // NOI18N
        btnAppointments.setText("Appointments");
        btnAppointments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAppointmentsActionPerformed(evt);
            }
        });

        btnSeachPatient.setBackground(new java.awt.Color(255, 153, 102));
        btnSeachPatient.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnSeachPatient.setIcon(new javax.swing.ImageIcon("C:\\Users\\foram\\Downloads\\info.png")); // NOI18N
        btnSeachPatient.setText("Search Patient History");
        btnSeachPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeachPatientActionPerformed(evt);
            }
        });

        btnPersonalInfo.setBackground(new java.awt.Color(255, 51, 0));
        btnPersonalInfo.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnPersonalInfo.setIcon(new javax.swing.ImageIcon("C:\\Users\\foram\\Downloads\\history.png")); // NOI18N
        btnPersonalInfo.setText("Personal Information");
        btnPersonalInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonalInfoActionPerformed(evt);
            }
        });

        btnLab.setBackground(new java.awt.Color(255, 102, 51));
        btnLab.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnLab.setIcon(new javax.swing.ImageIcon("C:\\Users\\foram\\Downloads\\request (1).png")); // NOI18N
        btnLab.setText("Lab Requests");
        btnLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLabActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\foram\\Downloads\\medical-team.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAppointments, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                            .addComponent(btnLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPersonalInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSeachPatient, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(8, 8, 8))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSeachPatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAppointments, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLab, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPersonalInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLabActionPerformed
        // TODO add your handling code here:
        
//        LabRequestJPanel requestLabTestJPanel=new LabRequestJPanel(userProcessContainer,account,docOrganization,enterprise,business);
//        userProcessContainer.add("RequestLabTestJPanel", requestLabTestJPanel);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnLabActionPerformed

    private void btnAppointmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAppointmentsActionPerformed
        // TODO add your handling code here:
        UpcomingAppointmentsJPanel upcomingAppointmentsJPanel=new UpcomingAppointmentsJPanel(userProcessContainer,account,docOrganization,enterprise,business);
        userProcessContainer.add("upcomingAppointmentsJPanel", upcomingAppointmentsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer); 


        
    }//GEN-LAST:event_btnAppointmentsActionPerformed

    private void btnPersonalInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonalInfoActionPerformed
        // TODO add your handling code here:
        DoctorPersonalInformationJPanel doctorPersonalInformationJPanel=new DoctorPersonalInformationJPanel(userProcessContainer,account,docOrganization,enterprise);
        userProcessContainer.add("DoctorPersonalInformationJPanel", doctorPersonalInformationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer); 
    }//GEN-LAST:event_btnPersonalInfoActionPerformed

    private void btnSeachPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeachPatientActionPerformed
        // TODO add your handling code here:
        SearchPatientHistoryJPanel searchPatientHistoryJPanel=new SearchPatientHistoryJPanel(userProcessContainer,account,docOrganization,enterprise);
        userProcessContainer.add("SearchPatientHistoryJPanel", searchPatientHistoryJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer); 
    }//GEN-LAST:event_btnSeachPatientActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAppointments;
    private javax.swing.JButton btnLab;
    private javax.swing.JButton btnPersonalInfo;
    private javax.swing.JButton btnSeachPatient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
