package lag_planillas;

import static java.awt.Frame.MAXIMIZED_BOTH;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class fmrActEco extends javax.swing.JFrame {

    ResultSet rstActEco = null;
    ResultSet rs = null;
    ActEco acteco = new ActEco();
    ActEco clActEco = new ActEco();

    int cantidad = 0;
    int mayor = 0;

    public fmrActEco() {
        initComponents();


        txtIdActEco.setEditable(false);
        rs = null;
        rs = clActEco.contarRegistros();
        try {
            while (rs.next()) {
                cantidad = rs.getInt(1);
                if (cantidad != 0) {
                    rs = null;
                    rs = clActEco.mayorRegistro();
                    while (rs.next()) {
                        mayor = rs.getInt(1) + 1;
                        if (mayor < 10) {
                            txtIdActEco.setText("00" + mayor);
                        } else if (mayor < 100) {
                            this.txtIdActEco.setText("0" + mayor);
                        } else {
                            txtIdActEco.setText("" + mayor);
                        }
                    }
                } else {
                    txtIdActEco.setText("00" + 1);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "AVISO DEL SISTEMA", 0);
        }

        txtNombreActEco.requestFocus();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAgregarActEco = new javax.swing.JLabel();
        lblIdActEco = new javax.swing.JLabel();
        lblNombreActEco = new javax.swing.JLabel();
        txtIdActEco = new javax.swing.JTextField();
        txtNombreActEco = new javax.swing.JTextField();
        btnGuardarActEco = new javax.swing.JButton();
        btnCancelarActEco = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblAgregarActEco.setText("Agregar Actividad Económica");

        lblIdActEco.setText("Identificador");

        lblNombreActEco.setText("Actividad Económica");

        btnGuardarActEco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/GUARDAR.png"))); // NOI18N
        btnGuardarActEco.setText("Guardar");
        btnGuardarActEco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActEcoActionPerformed(evt);
            }
        });

        btnCancelarActEco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/CANCELAR.png"))); // NOI18N
        btnCancelarActEco.setText("Cancelar");
        btnCancelarActEco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActEcoActionPerformed(evt);
            }
        });

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/CANCELAR.png"))); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNombreActEco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNombreActEco, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGuardarActEco)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelarActEco)
                                .addGap(18, 18, 18)
                                .addComponent(btnRegresar)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblIdActEco)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAgregarActEco))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(txtIdActEco, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(94, 94, 94))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAgregarActEco)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdActEco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdActEco))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreActEco)
                    .addComponent(txtNombreActEco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarActEco)
                    .addComponent(btnCancelarActEco)
                    .addComponent(btnRegresar))
                .addContainerGap(154, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnGuardarActEcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActEcoActionPerformed
        if (txtIdActEco.getText().equals("") || txtNombreActEco.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informacion incompleta para poder guardar.");
        } else {
            acteco.insertarActEco(Integer.parseInt(txtIdActEco.getText()), txtNombreActEco.getText());
            JOptionPane.showMessageDialog(null, "Actividad económica registrada con éxito.");
        }
        txtNombreActEco.setText("");
        txtNombreActEco.requestFocus();

        this.setExtendedState(MAXIMIZED_BOTH);
        rs = null;
        rs = clActEco.contarRegistros();
        try {
            while (rs.next()) {
                cantidad = rs.getInt(1);
                if (cantidad != 0) {
                    rs = null;
                    rs = clActEco.mayorRegistro();
                    while (rs.next()) {
                        mayor = rs.getInt(1) + 1;
                        if (mayor < 10) {
                            txtIdActEco.setText("00" + mayor);
                        } else if (mayor < 100) {
                            this.txtIdActEco.setText("0" + mayor);
                        } else {
                            txtIdActEco.setText("" + mayor);
                        }
                    }
                } else {
                    txtIdActEco.setText("00" + 1);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "AVISO DEL SISTEMA", 0);
        }
    }//GEN-LAST:event_btnGuardarActEcoActionPerformed

    private void btnCancelarActEcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActEcoActionPerformed
        txtNombreActEco.setText("");
        txtNombreActEco.requestFocus();
        JOptionPane.showMessageDialog(null, "Campos limpiados exitosamente.");
    }//GEN-LAST:event_btnCancelarActEcoActionPerformed

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
            java.util.logging.Logger.getLogger(fmrActEco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fmrActEco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fmrActEco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fmrActEco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fmrActEco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarActEco;
    private javax.swing.JButton btnGuardarActEco;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel lblAgregarActEco;
    private javax.swing.JLabel lblIdActEco;
    private javax.swing.JLabel lblNombreActEco;
    private javax.swing.JTextField txtIdActEco;
    private javax.swing.JTextField txtNombreActEco;
    // End of variables declaration//GEN-END:variables
}