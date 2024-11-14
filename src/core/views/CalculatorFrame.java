package core.views;

import core.controllers.CalculatorController;
import core.controllers.utils.Response;
import core.models.storage.History;
import core.models.Operation;
import core.models.Calculator;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author edangulo
 */
public class CalculatorFrame extends javax.swing.JFrame {
    
    private History history;

    /**
     * Creates new form Calculator
     */
    public CalculatorFrame() {
        //this.history = new History();
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

        lblTitle = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnSubtract = new javax.swing.JButton();
        btnMultiply = new javax.swing.JButton();
        btnDivide = new javax.swing.JButton();
        btnPotency = new javax.swing.JButton();
        btnClearNumbers = new javax.swing.JButton();
        btnUpdateHistory = new javax.swing.JButton();
        txtNumber1 = new javax.swing.JTextField();
        txtNumber2 = new javax.swing.JTextField();
        lblNumber1 = new javax.swing.JLabel();
        lblNumber2 = new javax.swing.JLabel();
        lblResult = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listHistory = new javax.swing.JList<>();
        txtResult = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setText("Calculator");

        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnSubtract.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSubtract.setText("Subtract");
        btnSubtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtractActionPerformed(evt);
            }
        });

        btnMultiply.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMultiply.setText("Multiply");
        btnMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplyActionPerformed(evt);
            }
        });

        btnDivide.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDivide.setText("Divide");
        btnDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivideActionPerformed(evt);
            }
        });

        btnPotency.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPotency.setText("Potency");
        btnPotency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPotencyActionPerformed(evt);
            }
        });

        btnClearNumbers.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnClearNumbers.setText("Clear numbers");
        btnClearNumbers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearNumbersActionPerformed(evt);
            }
        });

        btnUpdateHistory.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnUpdateHistory.setText("Update history");
        btnUpdateHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateHistoryActionPerformed(evt);
            }
        });

        txtNumber1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumber1ActionPerformed(evt);
            }
        });

        txtNumber2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblNumber1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNumber1.setText("Number 1");

        lblNumber2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNumber2.setText("Number 2");

        lblResult.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblResult.setText("Result");

        listHistory.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        listHistory.setEnabled(false);
        jScrollPane1.setViewportView(listHistory);

        txtResult.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtResult.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtResult.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClearNumbers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblResult, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNumber1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNumber2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNumber1)
                            .addComponent(txtNumber2)
                            .addComponent(txtResult, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnPotency, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMultiply, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSubtract, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .addComponent(btnDivide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdateHistory, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(lblTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumber1)
                    .addComponent(txtNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateHistory))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNumber2)
                            .addComponent(txtNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblResult)
                            .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd)
                            .addComponent(btnSubtract))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDivide)
                            .addComponent(btnMultiply))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPotency)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClearNumbers))
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        /*// TODO add your handling code here:
        try {
            Calculator calculator = new Calculator();
            
            double number1 = Double.parseDouble(txtNumber1.getText());
            double number2 = Double.parseDouble(txtNumber2.getText());
            double result = calculator.add(number1, number2);
            
            //this.history.addOperation(new Operation(number1, number2, "+", result));
            
            txtResult.setText("" + result);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
        } */
        String aText = txtNumber1.getText();
        String bText = txtNumber2.getText();
        
        Response response = CalculatorController.addOperation(aText, bText);
        
        if(response.getStatus()>=500){
            JOptionPane.showMessageDialog(null, response.getMessage(), "Error " + response.getStatus(), JOptionPane.ERROR_MESSAGE);
        }else if(response.getStatus()>=400){
            JOptionPane.showMessageDialog(null, response.getMessage(), "Error " + response.getStatus(), JOptionPane.WARNING_MESSAGE);
        }else{
            txtResult.setText(response.getObject().toString()); 
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSubtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubtractActionPerformed
        // TODO add your handling code here:
        /*try {
            Calculator calculator = new Calculator();
            
            double number1 = Double.parseDouble(txtNumber1.getText());
            double number2 = Double.parseDouble(txtNumber2.getText());
            double result = calculator.subtract(number1, number2);
            
            this.history.addOperation(new Operation(number1, number2, "-", result));
            
            txtResult.setText("" + result);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
        }*/
        String aText = txtNumber1.getText();
        String bText = txtNumber2.getText();
        
        Response response = CalculatorController.subtractOperation(aText, bText);
        
        if(response.getStatus()>=500){
            JOptionPane.showMessageDialog(null, response.getMessage(), "Error " + response.getStatus(), JOptionPane.ERROR_MESSAGE);
        }else if(response.getStatus()>=400){
            JOptionPane.showMessageDialog(null, response.getMessage(), "Error " + response.getStatus(), JOptionPane.WARNING_MESSAGE);
        }else{
            txtResult.setText(response.getObject().toString()); 
        }
    }//GEN-LAST:event_btnSubtractActionPerformed

    private void btnMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplyActionPerformed
        // TODO add your handling code here:
        /*try {
            Calculator calculator = new Calculator();
            
            double number1 = Double.parseDouble(txtNumber1.getText());
            double number2 = Double.parseDouble(txtNumber2.getText());
            double result = calculator.multiply(number1, number2);
            
            this.history.addOperation(new Operation(number1, number2, "*", result));
            
            txtResult.setText("" + result);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
        }*/
        String aText = txtNumber1.getText();
        String bText = txtNumber2.getText();
        
        Response response = CalculatorController.multiplyOperation(aText, bText);
        
        if (response.getStatus()>=500) {
            JOptionPane.showMessageDialog(null, response.getMessage(), "Error " + response.getStatus(), JOptionPane.ERROR_MESSAGE);
        }else if (response.getStatus()>=400) {
            JOptionPane.showMessageDialog(null, response.getMessage(), "Error " + response.getStatus(), JOptionPane.WARNING_MESSAGE);
        }else{
            txtResult.setText(response.getObject().toString()); 
        }
    }//GEN-LAST:event_btnMultiplyActionPerformed

    private void btnDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivideActionPerformed
        // TODO add your handling code here:
        /*try {
            Calculator calculator = new Calculator();
            
            double number1 = Double.parseDouble(txtNumber1.getText());
            double number2 = Double.parseDouble(txtNumber2.getText());
            double result = calculator.divide(number1, number2);
            
            this.history.addOperation(new Operation(number1, number2, "/", result));
            
            txtResult.setText("" + result);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
        }*/
        String aText = txtNumber1.getText();
        String bText = txtNumber2.getText();
        
        Response response = CalculatorController.divideOperation(aText, bText);
        
        if(response.getStatus()>=500){
            JOptionPane.showMessageDialog(null, response.getMessage(), "Error " + response.getStatus(), JOptionPane.ERROR_MESSAGE);
        }else if(response.getStatus()>=400){
            JOptionPane.showMessageDialog(null, response.getMessage(), "Error " + response.getStatus(), JOptionPane.WARNING_MESSAGE);
        }else{
            txtResult.setText(response.getObject().toString()); 
        }
    }//GEN-LAST:event_btnDivideActionPerformed

    private void btnPotencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPotencyActionPerformed
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(null, "Not Implemented", "Error", JOptionPane.ERROR_MESSAGE);
        String aText = txtNumber1.getText();
        String bText = txtNumber2.getText();
        
        Response response = CalculatorController.potencyOperation(aText, bText);
        
        if(response.getStatus()>=500){
            JOptionPane.showMessageDialog(null, response.getMessage(), "Error " + response.getStatus(), JOptionPane.ERROR_MESSAGE);
        }else if(response.getStatus()>=400){
            JOptionPane.showMessageDialog(null, response.getMessage(), "Error " + response.getStatus(), JOptionPane.WARNING_MESSAGE);
        }else{
            txtResult.setText(response.getObject().toString()); 
        }
    }//GEN-LAST:event_btnPotencyActionPerformed

    private void btnClearNumbersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearNumbersActionPerformed
        // TODO add your handling code here:
        txtNumber1.setText("");
        txtNumber2.setText("");
        txtResult.setText("");
    }//GEN-LAST:event_btnClearNumbersActionPerformed

    private void btnUpdateHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateHistoryActionPerformed
        // TODO add your handling code here:
        ArrayList<Operation> operationHistory = CalculatorController.getOperations();
        Collections.reverse(CalculatorController.getOperations());
        
        DefaultListModel model = new DefaultListModel();
        model.addAll(operationHistory);
        listHistory.setModel(model);
    }//GEN-LAST:event_btnUpdateHistoryActionPerformed

    private void txtNumber1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumber1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumber1ActionPerformed

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
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClearNumbers;
    private javax.swing.JButton btnDivide;
    private javax.swing.JButton btnMultiply;
    private javax.swing.JButton btnPotency;
    private javax.swing.JButton btnSubtract;
    private javax.swing.JButton btnUpdateHistory;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNumber1;
    private javax.swing.JLabel lblNumber2;
    private javax.swing.JLabel lblResult;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JList<String> listHistory;
    private javax.swing.JTextField txtNumber1;
    private javax.swing.JTextField txtNumber2;
    private javax.swing.JTextField txtResult;
    // End of variables declaration//GEN-END:variables
}
