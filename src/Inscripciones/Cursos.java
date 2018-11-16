/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inscripciones;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.conexion;

/**
 *
 * @author Jose
 */
public class Cursos extends javax.swing.JFrame {
    DefaultTableModel model;
    PreparedStatement ps;
    ResultSet rs;
    public static String varEdit = "";

    conexion cn = new conexion();
    java.sql.Connection con = cn.getConexion();
    boolean haySeleccion=false;
    boolean existeCurso=false;
    int vacio=0;
    /**
     * Creates new form Cursos
     */
    public Cursos() {
        initComponents();
        Set_ID();
        MostrarCursos();
        btnAgregar.setEnabled(true);
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCursos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtIdCurso = new javax.swing.JTextField();
        txtCurso = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        lblVariable = new javax.swing.JLabel();
        btnSalir1 = new javax.swing.JButton();
        lblMensaje = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        btnSalir.setText("Salir");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Curso");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        tblCursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Curso", "Curso"
            }
        ));
        tblCursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCursosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCursos);

        jLabel3.setText("Cod");

        txtIdCurso.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Cursos");

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

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnSalir1.setText("Salir");
        btnSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir1ActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(29, 29, 29))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIdCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel5)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnCancelar)
                                    .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(19, 19, 19))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                    .addComponent(btnSalir1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtIdCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregar)
                            .addComponent(btnCancelar))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSalir1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEditar)
                                .addGap(18, 18, 18)
                                .addComponent(btnActualizar)
                                .addGap(14, 14, 14)
                                .addComponent(btnEliminar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
      limpiar();
      Set_ID();
      btnAgregar.setEnabled(true);
      btnActualizar.setEnabled(false);
      btnEliminar.setEnabled(false);
       btnEliminar.setEnabled(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Connection con = null;
    
        if (this.txtCurso.getText().length()==0){
            JOptionPane.showMessageDialog(null, "Debe ingresar un curso");
            
        }else{
             VerificarCurso();
                if (vacio==0){
                    JOptionPane.showMessageDialog(null, "Curso ya existe");
                    limpiar();
                }else{
                   // JOptionPane.showMessageDialog(null, "Curso NO existe");
                
            
            try {

                con = (Connection) cn.getConexion();

                ps = con.prepareStatement("insert into academia.cursos (curso,id_estado_curso) values (?,?)");
                ps.setString(1, this.txtCurso.getText());
                ps.setString(2,"1");

                int res = ps.executeUpdate();
                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "Curso guardado satisfactoriamente.");
                    limpiar();
                    Set_ID();
                    MostrarCursos();
                   
                    this.txtCurso.requestFocus();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al guardar curso.");
                }
                    
                con.close();
            } catch (Exception e) {
                System.err.println(e);
            }
        }  
        } 
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
       
        if (haySeleccion==false){
            JOptionPane.showMessageDialog(null, "Seleccione un curso");
        }else{
            varEdit = String.valueOf(model.getValueAt(tblCursos.getSelectedRow(), 0));
            EdicionCurso();
            btnAgregar.setEnabled(false);
            btnActualizar.setEnabled(true);
        }
    }//GEN-LAST:event_btnEditarActionPerformed
    
    public void VerificarCurso(){
          Connection con = null;
        try{
                    con = (Connection) cn.getConexion();
                    ps = con.prepareStatement("Select curso from cursos where curso='"+this.txtCurso.getText()+"'");
                    
                    rs = ps.executeQuery();
                    Object Datos[] = new Object[1];
                    String  variable="";
                    while (rs.next()) {
                        for (int i = 0; i < 1; i++) {
                            Datos[i] = (rs.getObject(i + 1));
                            if (i == 0) {

                                variable=((String.valueOf(Datos[i].toString())));
                                
                                
                            }else {variable="";
                            }
                            
                        }
                    }
                    
                    lblMensaje.setText(variable);
                    if (variable.equals("")){
                        vacio=1;
                    }else{
                        vacio=0;
                    }
                    
                    con.close();    
                } catch (Exception e) {
                    System.err.println(e);
            }
    
    }
    
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        
        Connection con = null;
        
        
      
        
        
        
        
        
        

            try {

                con = (Connection) cn.getConexion();
               

                ps = con.prepareStatement("update academia.cursos set "
                        + "curso=?"
                        + "where id_curso=" + Integer.parseInt(varEdit));

                ps.setString(1, this.txtCurso.getText());
                
                int res = ps.executeUpdate();
                if (res == 1) {
                    JOptionPane.showMessageDialog(null, "El Curso fue editado y guardado.");
                    limpiar();
                    MostrarCursos();
                    btnActualizar.setEnabled(false);
                    btnAgregar.setEnabled(true);
                    Set_ID();
                    haySeleccion=false;
                } else {
                    JOptionPane.showMessageDialog(null, "Error al guardar el Curso. Vuelva a intentarlo.");
                }

                con.close();
            } catch (Exception e) {
                System.err.println(e);
            }
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1ActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnSalir1ActionPerformed

    private void tblCursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCursosMouseClicked
        haySeleccion=true;
    }//GEN-LAST:event_tblCursosMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       
        if (haySeleccion==false){
            JOptionPane.showMessageDialog(null, "Seleccione un curso");
        }else{
            varEdit = String.valueOf(model.getValueAt(tblCursos.getSelectedRow(), 0));
            Connection con = null;

            try {

                con = (Connection) cn.getConexion();
               

                ps = con.prepareStatement("update academia.cursos set "
                        + "id_estado_curso=?"
                        + "where id_curso=" + Integer.parseInt(varEdit));

                ps.setString(1, "2");
                
                int res = ps.executeUpdate();
                if (res == 1) {
                    JOptionPane.showMessageDialog(null, "El Curso fue Elimimnado");
                    limpiar();
                    MostrarCursos();
                    btnActualizar.setEnabled(false);
                    btnAgregar.setEnabled(true);
                    Set_ID();
                    haySeleccion=false;
                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar el curso Vuelva a intentarlo");
                }

                con.close();
            } catch (Exception e) {
                System.err.println(e);
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
      
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    
    private void EdicionCurso(){
     Connection con = null;

        try {
            con = (Connection) cn.getConexion();
            ps = con.prepareStatement("select id_curso,curso from cursos where id_curso= " + varEdit);
            rs = ps.executeQuery();
            Object Datos[] = new Object[2];
            
            while (rs.next()) {
                for (int i = 0; i < 2; i++) {
                    Datos[i] = (rs.getObject(i + 1));
                    if (i == 1) {
                        this.txtIdCurso.setText(String.valueOf(Datos[0]));
                        this.txtCurso.setText(String.valueOf(Datos[1]));
                       
                    }
                }
            }
            
            
            
    } catch (Exception e) {

        }
    
    }
    
    private void limpiar(){
        txtCurso.setText("");
    }
        
    private void Set_ID(){
    Connection con = null;

        try {
            con = (Connection) cn.getConexion();
            ps = con.prepareStatement("select auto_increment from information_schema.TABLES where TABLE_SCHEMA= 'academia' and TABLE_NAME = 'cursos'");
            rs = ps.executeQuery();
            Object Datos[] = new Object[1];
            int variable=0;
            while (rs.next()) {
                for (int i = 0; i < 1; i++) {
                    Datos[i] = (rs.getObject(i + 1));
                    if (i == 0) {
                        
                        variable=((Integer.parseInt(Datos[i].toString())));
                       // variable+=1;
                        this.txtIdCurso.setText(String.valueOf(variable));
                    }
                }
            }

        } catch (Exception e) {

        }
    
    }
    
    private void MostrarCursos(){
    Connection con = null;

        try {
            con = (Connection) cn.getConexion();
            ps = con.prepareStatement("select id_curso,curso from cursos where cursos.id_estado_curso=1");
            rs = ps.executeQuery();
            model = (DefaultTableModel) this.tblCursos.getModel();
            model.setRowCount(0);
            Object Datos[] = new Object[3];

            while (rs.next()) {
                for (int i = 0; i < 2; i++) {
                    Datos[i] = (rs.getObject(i + 1));
                    if (i == 1) {
                        model.addRow(Datos);
                    }
                }
            }

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
            java.util.logging.Logger.getLogger(Cursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cursos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblVariable;
    private javax.swing.JTable tblCursos;
    private javax.swing.JTextField txtCurso;
    private javax.swing.JTextField txtIdCurso;
    // End of variables declaration//GEN-END:variables
}
