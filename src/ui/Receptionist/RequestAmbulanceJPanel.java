/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Receptionist;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Organization.AmbulanceOrganization;
import Business.Organization.Organization;
import Business.Patients.Patient;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PatientTransferRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kohli
 */
public class RequestAmbulanceJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestAmbulanceJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private Patient patient;
    private boolean isPatientLoggedIn;
    private Enterprise ent;
    private EcoSystem business;
    private Organization organization;
    private Patient selectPatient;
    
    public RequestAmbulanceJPanel(JPanel userProcessContainer, UserAccount account, Organization ambulanceDriverOrganization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.patient = patient;
        this.account = account;
        this.ent = enterprise;
        this.business=business;
        this.organization = ambulanceDriverOrganization;
        populateAmbulances();
        populateHospitals();
        populateWorkRequests();
    }
    
    public void populateHospitals(){
        comboHospital.removeAllItems();
        
        String networkName = account.getEmployee().getAddress();
        
        for(Enterprise ent:business.getNetwork(networkName).getEnterpriseDirectory().getEnterpriseList()){
            if(!ent.getEnterpriseType().toString().equals("Hospital")){
                continue;
            }
            comboHospital.addItem(ent);
        }      
    }

    public void populateAmbulances(){
        comboAmbulance.removeAllItems();
        
        String networkName = account.getEmployee().getAddress();
        
        for(Enterprise ent:business.getNetwork(networkName).getEnterpriseDirectory().getEnterpriseList()){
            if(!ent.getEnterpriseType().toString().equals("Transport Service")){
                continue;
            }
            for(Organization org: ent.getOrganizationDirectory().getOrganizations(Organization.Type.Ambulance)){
                comboAmbulance.addItem(org);
            }
        }      
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        lblHospital = new javax.swing.JLabel();
        lblAmbulance = new javax.swing.JLabel();
        lblMessage = new javax.swing.JLabel();
        btnRequest = new javax.swing.JButton();
        txtPatientId = new javax.swing.JTextField();
        comboHospital = new javax.swing.JComboBox();
        comboAmbulance = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAmbulance = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblAmbulance1 = new javax.swing.JLabel();
        txtMessage1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        lblPatientName = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 153, 102));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\foram\\Downloads\\siren.png")); // NOI18N
        jLabel2.setText("REQUEST AMBULANCE");
        jLabel2.setOpaque(true);

        lblHospital.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblHospital.setText("Transfer Hospital:");

        lblAmbulance.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAmbulance.setText("Ambulance:");

        lblMessage.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblMessage.setText("Message:");

        btnRequest.setText("Request");
        btnRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestActionPerformed(evt);
            }
        });

        txtPatientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientIdActionPerformed(evt);
            }
        });

        comboHospital.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboAmbulance.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboAmbulance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAmbulanceActionPerformed(evt);
            }
        });

        tblAmbulance.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Hopsital", "Ambulance", "Requested Date", "Status"
            }
        ));
        jScrollPane1.setViewportView(tblAmbulance);

        jLabel3.setBackground(new java.awt.Color(255, 153, 102));
        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\foram\\Downloads\\siren.png")); // NOI18N
        jLabel3.setText("Requested Ambulance");
        jLabel3.setOpaque(true);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblAmbulance1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAmbulance1.setText("Selected Patient");

        txtMessage1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMessage1ActionPerformed(evt);
            }
        });

        jButton2.setText("...");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lblPatientName.setText("  ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(168, 168, 168)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAmbulance)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblAmbulance1)
                            .addComponent(lblMessage))
                        .addGap(1, 1, 1))
                    .addComponent(lblHospital))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))
                    .addComponent(comboAmbulance, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMessage1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRequest))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {comboAmbulance, comboHospital, txtMessage1});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(lblPatientName)))
                        .addGap(94, 94, 94))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblAmbulance)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(comboHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblHospital))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboAmbulance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAmbulance1)
                            .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMessage)
                            .addComponent(txtMessage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addComponent(btnRequest)
                        .addGap(18, 18, 18)))
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientIdActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestActionPerformed
        // TODO add your handling code here:
        
        PatientTransferRequest patTransfer = new PatientTransferRequest();
        patTransfer.setSender(account);
        
        //Get the ambulance driver user account
        AmbulanceOrganization ambOrg = (AmbulanceOrganization)comboAmbulance.getSelectedItem();
        UserAccount driver = ambOrg.getUserAccountDirectory().getUserByRole(Role.RoleType.AmbulanceDriver);
        patTransfer.setReceiver(driver);
        patTransfer.setSender(account);
        patTransfer.setPatient(selectPatient);
        
        //Set time
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  
        patTransfer.setTime(dtf.format(now));
        
        patTransfer.setToHospital((HospitalEnterprise)comboHospital.getSelectedItem());
        
        //Add to works queues
        driver.getWorkQueue().getWorkRequestList().add(patTransfer);
        account.getWorkQueue().getWorkRequestList().add(patTransfer);
        
        patTransfer.setStatus("Requested");
        patTransfer.setComment(txtMessage1.getText());
        JOptionPane.showMessageDialog(this, "Ambulance request raised");
        populateWorkRequests();
    }//GEN-LAST:event_btnRequestActionPerformed

    private void txtMessage1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMessage1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMessage1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
            selectPatient = ((HospitalEnterprise)ent).getCityPatients().getPatient(Integer.parseInt(txtPatientId.getText()));
            lblPatientName.setText(selectPatient.getName());
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Patient not found");
            lblPatientName.setText("");
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void comboAmbulanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAmbulanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboAmbulanceActionPerformed

    public void populateWorkRequests(){
        DefaultTableModel model = (DefaultTableModel) tblAmbulance.getModel();
        
        model.setRowCount(0);
        
        for (WorkRequest wq : account.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[4];
            row[0] = (HospitalEnterprise)comboHospital.getSelectedItem();
            row[1] = (AmbulanceOrganization)comboAmbulance.getSelectedItem();
            row[2] = ((PatientTransferRequest)wq).getTime();
            row[3] = wq.getStatus();
            
            model.addRow(row);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRequest;
    private javax.swing.JComboBox comboAmbulance;
    private javax.swing.JComboBox comboHospital;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAmbulance;
    private javax.swing.JLabel lblAmbulance1;
    private javax.swing.JLabel lblHospital;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblPatientName;
    private javax.swing.JTable tblAmbulance;
    private javax.swing.JTextField txtMessage1;
    private javax.swing.JTextField txtPatientId;
    // End of variables declaration//GEN-END:variables

  
}
