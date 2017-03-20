/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbms_p1;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author falak
 */
public class Patient extends javax.swing.JFrame {

    /**
     * Creates new form Patient
     */
    public Patient() {
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

        welcome = new javax.swing.JLabel();
        profile = new javax.swing.JButton();
        diagnoses = new javax.swing.JButton();
        healthIndicators = new javax.swing.JButton();
        alerts = new javax.swing.JButton();
        healthSupporters = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        becomeHS = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        welcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcome.setText("Welcome! ");

        profile.setText("Profile");
        profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileActionPerformed(evt);
            }
        });

        diagnoses.setText("Diagnoses");
        diagnoses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diagnosesActionPerformed(evt);
            }
        });

        healthIndicators.setText("Health Indicators");
        healthIndicators.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                healthIndicatorsActionPerformed(evt);
            }
        });

        alerts.setText("Alerts");
        alerts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alertsActionPerformed(evt);
            }
        });

        healthSupporters.setText("Health Supporters");
        healthSupporters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                healthSupportersActionPerformed(evt);
            }
        });

        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        becomeHS.setText("Become Health Supporter!");
        becomeHS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                becomeHSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(128, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(becomeHS, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                        .addComponent(profile, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(diagnoses, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(healthIndicators, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(alerts, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(healthSupporters, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(welcome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(119, 119, 119))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(profile)
                .addGap(18, 18, 18)
                .addComponent(diagnoses)
                .addGap(18, 18, 18)
                .addComponent(healthIndicators)
                .addGap(18, 18, 18)
                .addComponent(alerts)
                .addGap(18, 18, 18)
                .addComponent(healthSupporters)
                .addGap(18, 18, 18)
                .addComponent(becomeHS)
                .addGap(18, 18, 18)
                .addComponent(logout)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Profile p = new Profile();
        p.setVisible(true);
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
                    + "'" + Setup.loginuserid + "'");

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

        p.getName.setText(firstname);
        p.getLastName.setText(lastName);
        p.getDob.setText(Dob);
        p.getGender.setText(Gender);
        p.getContact.setText(Contact);
        p.enterAddress.setText(address);

    }//GEN-LAST:event_profileActionPerformed

    private void healthSupportersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_healthSupportersActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        PatientHealthSupporter p = new PatientHealthSupporter();
        p.setVisible(true);

        try {
            /* Set the Nimbus look and feel */
            Setup.rs = Setup.stmt.executeQuery("Select h.user_id, p.FirstName, h.auth_date, p.phone from "
                    + " Health_Supporter h, People p "
                    + " where h.patient_id= '" + Setup.loginuserid + "' and p.user_id = h.user_id");

            p.hsTable.setModel(DbUtils.resultSetToTableModel(Setup.rs));

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


    }//GEN-LAST:event_healthSupportersActionPerformed

    private void diagnosesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diagnosesActionPerformed
        // TODO add your handling code here:
        Diagnosis diag = new Diagnosis();

        // TODO add your handling code here:
        try {
            /* Set the Nimbus look and feel */
            Setup.rs = Setup.stmt.executeQuery("SELECT dname FROM Diagnosis WHERE "
                    + "patient_id='" + Setup.loginuserid + "'");
            diag.dTable.setModel(DbUtils.resultSetToTableModel(Setup.rs));

            Setup.rs = Setup.stmt.executeQuery("SELECT DISTINCT dname FROM Disease WHERE "
                    + "dname !='Well'");
            
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

    }//GEN-LAST:event_diagnosesActionPerformed

    private void healthIndicatorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_healthIndicatorsActionPerformed
        // TODO add your handling code here:
        HealthIndicator healthInd = new HealthIndicator();
        try {
            String query_specrec = "SELECT obs_type, frequency, obs_high, obs_low FROM SpecificRec WHERE "
                    + "patient_id='" + Setup.loginuserid + "'";
            System.out.println(query_specrec);
            Setup.rs = Setup.stmt.executeQuery(query_specrec);

            healthInd.specRec.setModel(DbUtils.resultSetToTableModel(Setup.rs));

            this.setVisible(false);
            healthInd.setVisible(true);

        } catch (SQLException ex) {
            Logger.getLogger(Patient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_healthIndicatorsActionPerformed

    private void alertsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alertsActionPerformed
        // TODO add your handling code here:
        AlertIDPage a = new AlertIDPage();
        a.setVisible(true);
        this.setVisible(false);

        try {

            String dummy= "SELECT alert_id from Alerts WHERE "
                    + "patient_id='" + Setup.loginuserid + "' AND action_taken ='N'";

            Setup.rs = Setup.stmt.executeQuery(dummy);
            System.out.println(dummy);
            a.alertTable.setModel(DbUtils.resultSetToTableModel(Setup.rs));
        } catch (SQLException ex) {
            Logger.getLogger(Patient.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_alertsActionPerformed

    private void becomeHSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_becomeHSActionPerformed
        // TODO add your handling code here:
        try {
            
            // TODO add your handling code here:
            String query_update_people = "UPDATE People SET is_hs='Y' WHERE "
                    + "user_id = '" + Setup.loginuserid + "'";
             System.out.println(query_update_people);
            Setup.stmt.executeUpdate(query_update_people);

            this.setVisible(false);
            new Patient().setVisible(true);


        } catch (SQLException ex) {
            Logger.getLogger(HealthSupporter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_becomeHSActionPerformed

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
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Patient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alerts;
    private javax.swing.JButton becomeHS;
    private javax.swing.JButton diagnoses;
    private javax.swing.JButton healthIndicators;
    private javax.swing.JButton healthSupporters;
    private javax.swing.JButton logout;
    private javax.swing.JButton profile;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
