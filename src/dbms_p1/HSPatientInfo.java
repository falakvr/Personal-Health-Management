/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbms_p1;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author falak
 */
public class HSPatientInfo extends javax.swing.JFrame {

    /**
     * Creates new form HSPatientInfo
     */
    public HSPatientInfo() {
        initComponents();
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
        patProfile = new javax.swing.JButton();
        patDiagnoses = new javax.swing.JButton();
        patHealthInd = new javax.swing.JButton();
        patAlerts = new javax.swing.JButton();
        back = new javax.swing.JButton();
        patSpecRec = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Patient Information");

        patProfile.setText("Patient Profile");
        patProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patProfileActionPerformed(evt);
            }
        });

        patDiagnoses.setText("Patient Diagnoses");
        patDiagnoses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patDiagnosesActionPerformed(evt);
            }
        });

        patHealthInd.setText("Patient Health Indicators");
        patHealthInd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patHealthIndActionPerformed(evt);
            }
        });

        patAlerts.setText("Patient Alerts");
        patAlerts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patAlertsActionPerformed(evt);
            }
        });

        back.setText("Back To Main");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        patSpecRec.setText("Patient Specific Recommendation");
        patSpecRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patSpecRecActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                .addGap(178, 178, 178))
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(patSpecRec, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(patAlerts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(patHealthInd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(patDiagnoses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(patProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(132, 132, 132))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addGap(52, 52, 52)
                .addComponent(patProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(patDiagnoses)
                .addGap(18, 18, 18)
                .addComponent(patHealthInd)
                .addGap(18, 18, 18)
                .addComponent(patAlerts)
                .addGap(18, 18, 18)
                .addComponent(patSpecRec)
                .addGap(42, 42, 42)
                .addComponent(back)
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void patDiagnosesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patDiagnosesActionPerformed
        // TODO add your handling code here:
               HSDiagnosis diag = new HSDiagnosis();
        
            // TODO add your handling code here:
        try {
            /* Set the Nimbus look and feel */
            Setup.rs = Setup.stmt.executeQuery("SELECT dname FROM Diagnosis WHERE "
                    + "patient_id='" + Setup.patientOfHS + "'");
            diag.dTable.setModel(DbUtils.resultSetToTableModel(Setup.rs));
            
            Setup.rs = Setup.stmt.executeQuery("SELECT DISTINCT dname FROM Disease");
            diag.diseaseTable.setModel(DbUtils.resultSetToTableModel(Setup.rs));
            
            
            diag.setVisible(true);
            this.setVisible(false);
            
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
                java.util.logging.Logger.getLogger(Diagnosis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(Diagnosis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(Diagnosis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(Diagnosis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                }
            });
        } catch (SQLException ex) {
            System.out.println("Diagnosis query error");
            Logger.getLogger(Diagnosis.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_patDiagnosesActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        HealthSupporter hs = new HealthSupporter();
        hs.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void patProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patProfileActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Profile profile = new Profile();
        profile.setVisible(true);
        String firstname = "";
        String lastName = "";
        String Dob = "";
        String Gender = "";

        String address = "";
        String Contact = "";
        String patientCategory = "";
        String diagnosis = "";
        String HS = "";
        try {
            Setup.rs = Setup.stmt.executeQuery("SELECT firstName, lastName, Dob, Gender, address, Phone FROM People where user_id = "
                    + "'" + Setup.patientOfHS + "'");

            while (Setup.rs.next()) {
                firstname = Setup.rs.getString("firstName");
                lastName = Setup.rs.getString("lastName");
                Dob = Setup.rs.getString("Dob");
                Gender = Setup.rs.getString("Gender");
                Contact = Setup.rs.getString("Phone");
                address = Setup.rs.getString("address");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Patient.class.getName()).log(Level.SEVERE, null, ex);
        }

        profile.getName.setText(firstname);
        profile.getLastName.setText(lastName);
        profile.getDob.setText(Dob);
        profile.getGender.setText(Gender);
        profile.getContact.setText(Contact);
        profile.enterAddress.setText(address);


    }//GEN-LAST:event_patProfileActionPerformed

    private void patHealthIndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patHealthIndActionPerformed
        // TODO add your handling code here:
        HealthIndicator healthInd = new HealthIndicator();
        try {
            String query = "SELECT obs_type, frequency, obs_high, obs_low FROM SpecificRec WHERE "
                    + "patient_id='" + Setup.patientOfHS + "'";
            System.out.println(query);
            Setup.rs = Setup.stmt.executeQuery(query);
            
            healthInd.specRec.setModel(DbUtils.resultSetToTableModel(Setup.rs));

            this.setVisible(false);
            healthInd.setVisible(true);

        } catch (SQLException ex) {
            Logger.getLogger(Patient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_patHealthIndActionPerformed


    private void patAlertsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patAlertsActionPerformed
        // TODO add your handling code here:
                // TODO add your handling code here:
        AlertIDPage a = new AlertIDPage();
        a.setVisible(true);
        this.setVisible(false);
        
        try {
            String dummy = "SELECT alert_id from Alerts WHERE "
                    + "patient_id='" + Setup.patientOfHS + "' and action_taken='N'";
            System.out.println(dummy);
            Setup.rs = Setup.stmt.executeQuery(dummy);
            a.alertTable.setModel(DbUtils.resultSetToTableModel(Setup.rs));

        } catch (SQLException ex) {
            Logger.getLogger(Patient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_patAlertsActionPerformed

    private void patSpecRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patSpecRecActionPerformed
        try {
            // TODO add your handling code here:
            PatientSpecRec patspecrec = new PatientSpecRec();
            String query_specrec = "SELECT obs_type, frequency, obs_high, obs_low FROM "
                    + "SpecificRec WHERE "
                    + "patient_id='" + Setup.patientOfHS + "'";
            
            Setup.rs = Setup.stmt.executeQuery(query_specrec);
            
            patspecrec.specRecTable.setModel(DbUtils.resultSetToTableModel(Setup.rs));
            
            this.setVisible(false);
            patspecrec.setVisible(true);

        } catch (SQLException ex) {
            Logger.getLogger(HSPatientInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_patSpecRecActionPerformed


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
            java.util.logging.Logger.getLogger(HSPatientInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HSPatientInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HSPatientInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HSPatientInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HSPatientInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton patAlerts;
    private javax.swing.JButton patDiagnoses;
    private javax.swing.JButton patHealthInd;
    private javax.swing.JButton patProfile;
    private javax.swing.JButton patSpecRec;
    // End of variables declaration//GEN-END:variables
}
