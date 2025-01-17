/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.Estructura;

import javax.swing.JLabel;

import com.DBConnection.DbConnection;
import com.Pantallas.UtilPantalla;

/**
 *
 * @author mauri
 */
@SuppressWarnings("FieldMayBeFinal")
public class Registro extends javax.swing.JFrame {

    private DbConnection dbConnection = new DbConnection();
    private UtilPantalla utilPantalla = new UtilPantalla();

    /**
     * Creates new form Registro
     */
    public Registro() {
        initComponents();
        dbConnection.conectarBaseDatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpRegistro = new javax.swing.JPanel();
        btnRealizarRegistro = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jtxtRegistroUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblRealizaRegistro = new javax.swing.JLabel();
        jtxtContrasenaUsuario = new javax.swing.JPasswordField();
        jtxtConfirmaContrasenaUsuario = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1015, 801));

        jpRegistro.setPreferredSize(new java.awt.Dimension(1015, 801));

        btnRealizarRegistro.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnRealizarRegistro.setText("Realizar registro");
        btnRealizarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarRegistroActionPerformed(evt);
            }
        });

        btnRegresar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jtxtRegistroUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtxtRegistroUsuario.setToolTipText("Nombre de usuario");
        jtxtRegistroUsuario.setMinimumSize(new java.awt.Dimension(121, 48));
        jtxtRegistroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtRegistroUsuarioActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Usuario");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Contraseña");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Confirmar contraseña");

        lblRealizaRegistro.setFont(new java.awt.Font("Serif", 0, 48)); // NOI18N
        lblRealizaRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRealizaRegistro.setText("Realizar registro");

        jtxtContrasenaUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtxtContrasenaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtContrasenaUsuarioActionPerformed(evt);
            }
        });

        jtxtConfirmaContrasenaUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtxtConfirmaContrasenaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtConfirmaContrasenaUsuarioActionPerformed(evt);
            }
        });

        jLabel5.setEnabled(false);

        javax.swing.GroupLayout jpRegistroLayout = new javax.swing.GroupLayout(jpRegistro);
        jpRegistro.setLayout(jpRegistroLayout);
        jpRegistroLayout.setHorizontalGroup(
            jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRegistroLayout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpRegistroLayout.createSequentialGroup()
                        .addComponent(lblRealizaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(291, 291, 291))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpRegistroLayout.createSequentialGroup()
                        .addComponent(btnRealizarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(360, 360, 360))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpRegistroLayout.createSequentialGroup()
                        .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 876, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpRegistroLayout.createSequentialGroup()
                                .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(55, 55, 55)
                                .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtxtRegistroUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                                    .addComponent(jtxtContrasenaUsuario)
                                    .addComponent(jtxtConfirmaContrasenaUsuario))))
                        .addGap(67, 67, 67))))
            .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpRegistroLayout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(844, Short.MAX_VALUE)))
        );
        jpRegistroLayout.setVerticalGroup(
            jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpRegistroLayout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addComponent(lblRealizaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtRegistroUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(56, 56, 56)
                .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtxtContrasenaUsuario))
                .addGap(36, 36, 36)
                .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtxtConfirmaContrasenaUsuario))
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRealizarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
            .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpRegistroLayout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(709, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1015, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jpRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 811, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jpRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtContrasenaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jtxtContrasenaUsuarioActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jtxtContrasenaUsuarioActionPerformed

    private void jtxtConfirmaContrasenaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jtxtConfirmaContrasenaUsuarioActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jtxtConfirmaContrasenaUsuarioActionPerformed

    private void btnRealizarRegistroActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnRealizarRegistroActionPerformed

        String usuario = jtxtRegistroUsuario.getText();
        String contrasena = jtxtContrasenaUsuario.getText();
        String confirmarContrasena = jtxtConfirmaContrasenaUsuario.getText();

        if (usuario.isEmpty() || contrasena.isEmpty() || confirmarContrasena.isEmpty()) {
            jLabel5.setViewportView(new JLabel("Por favor, complete todos los campos"));
            return;
        }

        if (!contrasena.equals(confirmarContrasena)) {
            jLabel5.setViewportView(new JLabel("Las contraseñas no coinciden"));
            return;
        }

        if (!validarUsuario(usuario)) {
            jLabel5.setViewportView(new JLabel(
                    "El usuario no es válido. Se espera recibir un nombre de usuario que contenga entre 3 y 20 caracteres alfanuméricos."));
            return;
        }

        if (!validarContrasena(contrasena)) {
            jLabel5.setViewportView(new JLabel(
                    "La contraseña no es válida.\n  Se espera recibir una contraseña que contenga al menos 8 caracteres,\n al menos una letra minúscula, una letra mayúscula, un número y un\n caracter especial (@, $, !, %, *, ?, &)."));
            return;
        }
        try {
            dbConnection.registrarUsuario(usuario, contrasena);
            jLabel5.setViewportView(new JLabel("Registro exitoso"));
            jtxtRegistroUsuario.setText("");
            jtxtContrasenaUsuario.setText("");
            jtxtConfirmaContrasenaUsuario.setText("");
            try {

                Thread.sleep(2000);

            } catch (InterruptedException ex) {

                Thread.currentThread().interrupt();

            }

            utilPantalla.cambiarPantalla(this, new login());
        } catch (Exception e) {
            jLabel5.setViewportView(new JLabel("Error al registrar usuario"));
        }

    }

    // Se espera recibir un nombre de usuario que contenga entre 3 y 20 caracteres
    // alfanuméricos.
    private boolean validarUsuario(String usuario) {
        return usuario.matches("^[a-zA-Z0-9]{3,20}$");
    }

    // Se espera recibir una contraseña que contenga al menos 8 caracteres,
    // incluyendo al menos una letra minúscula, una letra mayúscula, un número y un
    // caracter especial (@, $, !, %, *, ?, &).
    private boolean validarContrasena(String contrasena) {
        return contrasena.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$");
    }

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {

        utilPantalla.cambiarPantalla(this, new login());

    }

    private void jtxtRegistroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jtxtRegistroUsuarioActionPerformed

    }// GEN-LAST:event_jtxtRegistroUsuarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRealizarRegistro;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jLabel5;
    private javax.swing.JPanel jpRegistro;
    private javax.swing.JPasswordField jtxtConfirmaContrasenaUsuario;
    private javax.swing.JPasswordField jtxtContrasenaUsuario;
    private javax.swing.JTextField jtxtRegistroUsuario;
    private javax.swing.JLabel lblRealizaRegistro;
    // End of variables declaration//GEN-END:variables
}
