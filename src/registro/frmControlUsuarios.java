/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package registro;

import Formularios.MainForm;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.conexion;

/**
 *
 * @author Amaya
 */
public class frmControlUsuarios extends javax.swing.JFrame {
    String estadoBoton="";
    int idUsuarioEditar=0;
    DefaultTableModel model;
    PreparedStatement ps;
    ResultSet rs;

    conexion cn = new conexion();
    java.sql.Connection con = cn.getConexion();
    
    /** Creates new form frmControlUsuarios */
    public frmControlUsuarios() {
        initComponents();
        mostrarTabla();
    }
    
    private String consultarRol(int var) {
        
        String variable="";
        Connection con = null;

        try {
            con = (Connection) cn.getConexion();
            ps = con.prepareStatement("call tipoUser (" + var + ");");
            rs = ps.executeQuery();
            model = (DefaultTableModel) this.tabla.getModel();
            model.setRowCount(0);
            Object Datos[] = new Object[1];
            
            while (rs.next()) {
                for (int i = 0; i < 1; i++) {
                    Datos[i] = (rs.getObject(i + 1));
                    variable= String.valueOf(Datos[i]);
                    
                }
            }
            con.close();
        } catch (Exception e) {

        }
        
        return variable;
    }
    
    private void mostrarTabla() {
        Connection con = null;

        try {
            con = (Connection) cn.getConexion();
            ps = con.prepareStatement("call ConsultarInfoUsuarios;");
            rs = ps.executeQuery();
            model = (DefaultTableModel) this.tabla.getModel();
            model.setRowCount(0);
            Object Datos[] = new Object[4];

            while (rs.next()) {
                for (int i = 0; i < 4; i++) {
                    Datos[i] = (rs.getObject(i + 1));
                    
                    if (i == 3) {
                        model.addRow(Datos);
                    }
                }
            }
            con.close();
        } catch (Exception e) {

        }
        
    }
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        comboRoles = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        txtContrasena = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Control de Usuarios");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Usuario", "Usuario", "Contraseña", "Tipo de Usuario"
            }
        ));
        tabla.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(tabla);

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Usuario:");

        txtUsuario.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Contraseña: ");

        comboRoles.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Rol de usuario: ");

        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtContrasena.setEnabled(false);

        jButton1.setText("Ir a Menú");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboRoles, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(139, 139, 139))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(288, 288, 288))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtContrasena, txtUsuario});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 15, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboRoles, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                        .addContainerGap(69, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtContrasena, txtUsuario});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        habilitarControles();
        llenarCombo(); 
        estadoBoton="Nuevo";
    }//GEN-LAST:event_btnNuevoActionPerformed

    
    
    private void habilitarControles() {
        btnGuardar.setVisible(true); btnGuardar.setEnabled(true); txtUsuario.setEnabled(true); txtContrasena.setEnabled(true);
        txtUsuario.setText(""); txtContrasena.setText(""); btnCancelar.setVisible(true);btnCancelar.setEnabled(true);
        comboRoles.setEnabled(true); txtUsuario.requestFocus();
        btnNuevo.setEnabled(false); btnEditar.setEnabled(false); btnEliminar.setEnabled(false);
    }
    
    
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        deshabilitarControles(); estadoBoton="";
    }//GEN-LAST:event_btnCancelarActionPerformed

    
    
    private void deshabilitarControles(){
        txtUsuario.setText(""); txtContrasena.setText(""); btnCancelar.setVisible(false);btnCancelar.setEnabled(false);
        btnGuardar.setVisible(false); btnGuardar.setEnabled(false); txtUsuario.setEnabled(false); txtContrasena.setEnabled(false);
        comboRoles.removeAllItems(); comboRoles.setEnabled(false);
        btnNuevo.setEnabled(true); btnEditar.setEnabled(true); btnEliminar.setEnabled(true);
    }
    
    private void AccionEditarUsuario() {
        if (txtUsuario.getText().length()<5){
            JOptionPane.showMessageDialog(null, "El usuario no puede tener menos de 5 caracteres. ");
        } else if (txtContrasena.getText().length()<6){
            JOptionPane.showMessageDialog(null, "La contraseña no puede tener menos de 6 caracteres. ");
        } else if (comboRoles.getSelectedItem().toString().equals("--Seleccione Rol--")){
            JOptionPane.showMessageDialog(null, "No se ha seleccionado un rol. Seleccione un rol para guardar usuario.");
        }else {
            editarUsuario();
        }
    }
    
    private void editarUsuario(){
        
        Connection con = null;
        try {

            con = (Connection) cn.getConexion();

            ps = con.prepareStatement("call EditarUsuario (?,?,?,?)");
            ps.setInt(1, idUsuarioEditar);
            ps.setString(2, this.txtUsuario.getText());
            ps.setString(3, this.txtContrasena.getText());
            ps.setString(4, this.comboRoles.getSelectedItem().toString());
            int res = ps.executeUpdate();
            
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Usuario actualizado con éxito.");
                deshabilitarControles();
                mostrarTabla();
                idUsuarioEditar=0;
            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar usuario.");
            }

            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        
    }
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        if (estadoBoton.equals("Nuevo")){
            AccionCrearUsuario();
        } else if (estadoBoton.equals("Editar")){
            AccionEditarUsuario(); mostrarTabla();
        }
        estadoBoton="";
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void AccionCrearUsuario(){
        if (txtUsuario.getText().length()<5){
            JOptionPane.showMessageDialog(null, "El usuario no puede tener menos de 5 caracteres. ");
        } else if (txtContrasena.getText().length()<6){
            JOptionPane.showMessageDialog(null, "La contraseña no puede tener menos de 6 caracteres. ");
        } else if (comboRoles.getSelectedItem().toString().equals("--Seleccione Rol--")){
            JOptionPane.showMessageDialog(null, "No se ha seleccionado un rol. Seleccione un rol para guardar usuario.");
        }else {
            crearUsuario(); 
        }
    }
    
    
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        habilitarControles();
        estadoBoton="Editar"; 
        verificacionyLlenadoFila();
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        try { 
            int id = Integer.parseInt(model.getValueAt(tabla.getSelectedRow(), 0).toString());
            if (JOptionPane.showConfirmDialog(rootPane, "Se eliminará el usuario, ¿desea continuar?",
                "Eliminar Usuario", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
                EliminarUsuario();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Seleccione una fila para poder eliminar.");
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MainForm abrir = new MainForm();
        abrir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void EliminarUsuario() {
        
        try {
            int id = Integer.parseInt(model.getValueAt(tabla.getSelectedRow(), 0).toString());

            Connection con = null;

            try {
                con = (Connection) cn.getConexion();
                ps = con.prepareStatement("call EliminarUsuario(" + id + ")");
                ps.executeUpdate();

                JOptionPane.showMessageDialog(null, "El usuario fue eliminado exitosamente.");
                mostrarTabla();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Hubo un error: " + e);
            }
        } catch (Exception exc) {
            JOptionPane.showMessageDialog(null, "No ha seleccionado una fila.");
        }
        
    }
    
    private void verificacionyLlenadoFila(){
        try {
            idUsuarioEditar = Integer.parseInt(String.valueOf(model.getValueAt(tabla.getSelectedRow(), 0)));
            String usuario = (String.valueOf(model.getValueAt(tabla.getSelectedRow(), 1)));
            String contra = (String.valueOf(model.getValueAt(tabla.getSelectedRow(), 2)));
            String rol = (String.valueOf(model.getValueAt(tabla.getSelectedRow(), 3)));
            
            this.txtUsuario.setText(usuario);
            this.txtContrasena.setText(contra);
            llenarCombo();
            
            try{
                this.comboRoles.setSelectedItem(rol);
            }catch (Exception exe){
                JOptionPane.showMessageDialog(null, "Hubo un problema al fijar el rol");
                this.comboRoles.setSelectedItem("--Seleccione Rol--");
            }
            
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Para poder editar un usuario, es necesario seleccionar una fila.");
        }
    }
    
    private void crearUsuario() {
        Connection con = null;
        try {

            con = (Connection) cn.getConexion();

            ps = con.prepareStatement("call NuevoUsuario (?,?,?)");
            ps.setString(1, this.txtUsuario.getText());
            ps.setString(2, this.txtContrasena.getText());
            ps.setString(3, this.comboRoles.getSelectedItem().toString());
            int res = ps.executeUpdate();
            
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Usuario creado con éxito.");
                deshabilitarControles();
                mostrarTabla();
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar usuario.");
            }

            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }
    
    private void llenarCombo() {
        Connection con = null;
        try {
            con = (Connection) cn.getConexion();
            ps = con.prepareStatement("call ConsultarRoles;");
            rs = ps.executeQuery();
            Object Datos[] = new Object[1];
            comboRoles.removeAllItems();
            comboRoles.addItem("--Seleccione Rol--");
            while (rs.next()) {
                for (int i = 0; i < 1; i++) {
                    Datos[i] = (rs.getObject(i + 1));
                    if (i == 0) {
                        comboRoles.addItem(Datos[0].toString());
                    }
                }
            }
            con.close();
        } catch (Exception e) {

        }
    }
    
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
            java.util.logging.Logger.getLogger(frmControlUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmControlUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmControlUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmControlUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmControlUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> comboRoles;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

}
