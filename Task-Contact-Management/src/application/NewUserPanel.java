/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author glennlin
 */
public class NewUserPanel extends javax.swing.JPanel {

    LoginView loginView;
    UserLoginPanel userLoginPanel;
    NewUserPanel newUserPanel;
    
    
    public NewUserPanel() {
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

        newUsernameTextField = new javax.swing.JTextField();
        newUsernameLabel = new javax.swing.JLabel();
        newPasswordLabel = new javax.swing.JLabel();
        newPasswordTextField = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        newUsernameTextField.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        newUsernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newUsernameTextFieldActionPerformed(evt);
            }
        });

        newUsernameLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        newUsernameLabel.setText("New Username:");

        newPasswordLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        newPasswordLabel.setText("New Password:");

        newPasswordTextField.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        newPasswordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPasswordTextFieldActionPerformed(evt);
            }
        });

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(newPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(newPasswordTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(newUsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(newUsernameTextField))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(backButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(submitButton)))
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newUsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newUsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton)
                    .addComponent(backButton))
                .addContainerGap(41, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void newUsernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newUsernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newUsernameTextFieldActionPerformed

    private void newPasswordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPasswordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newPasswordTextFieldActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_submitButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
      
    }//GEN-LAST:event_backButtonActionPerformed

    public JButton getSubmitButton()
    {
        return submitButton;
    }
    
    public JButton getBackButton()
    {
        return backButton;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel newPasswordLabel;
    private javax.swing.JTextField newPasswordTextField;
    private javax.swing.JLabel newUsernameLabel;
    private javax.swing.JTextField newUsernameTextField;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
