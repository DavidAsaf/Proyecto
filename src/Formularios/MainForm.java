/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Inventario.MenuInventario;
import Alumnos.VerAlumnos;
import modelo.usuarios;
import registro.Rusuario;
//prueba

/**
 *
 * @author asafamaya
 */
public class MainForm extends javax.swing.JFrame {

    usuarios mod;

    public static Rusuario fmrReg;

    public MainForm() {
        initComponents();

    }

    public MainForm(usuarios mod) {
        initComponents();
        setLocationRelativeTo(null);
        this.mod = mod;
        lblNombre.setText(mod.getUsuario());
        lblRol.setText(mod.getNombre_tipo());
        if(mod.getId_tipo()==1)
        {
        }else if(mod.getId_tipo()==2){
        menuAdmin.setVisible(false);
        subRegistro.setVisible(false);
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

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        lblRol = new javax.swing.JLabel();
        jMenuBar3 = new javax.swing.JMenuBar();
        menuUsuario = new javax.swing.JMenu();
        menuAdmin = new javax.swing.JMenu();
        subRegistro = new javax.swing.JMenuItem();
        subRegistro1 = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMaximumSize(new java.awt.Dimension(700, 700));
        setPreferredSize(new java.awt.Dimension(1310, 903));
        setResizable(false);
        setSize(new java.awt.Dimension(1310, 903));
        getContentPane().setLayout(null);

        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setText("Inscribir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(130, 110, 196, 102);

        jButton2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton2.setText("Alumnos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(430, 110, 196, 102);

        jButton3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton3.setText("Maestros");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(130, 240, 196, 102);

        jButton4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton4.setText("Clases");
        getContentPane().add(jButton4);
        jButton4.setBounds(430, 240, 196, 102);

        jLabel1.setFont(new java.awt.Font("Chilanka", 0, 48)); // NOI18N
        jLabel1.setText("Menú Principal");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(200, 20, 344, 52);

        jButton5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton5.setText("Salir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(310, 570, 100, 49);

        jButton6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton6.setText("Inventario");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(130, 370, 196, 102);

        jButton7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton7.setText("Cobros");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(430, 370, 196, 102);

        lblNombre.setText("Nombre");
        getContentPane().add(lblNombre);
        lblNombre.setBounds(570, 10, 93, 75);

        lblRol.setText("Cargo");
        getContentPane().add(lblRol);
        lblRol.setBounds(640, 10, 118, 75);

        menuUsuario.setText("Usuario");
        jMenuBar3.add(menuUsuario);

        menuAdmin.setText("Administrador");

        subRegistro.setText("Registro de usuarios");
        subRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subRegistroActionPerformed(evt);
            }
        });
        menuAdmin.add(subRegistro);

        subRegistro1.setText("Papelera de reciclaje");
        subRegistro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subRegistro1ActionPerformed(evt);
            }
        });
        menuAdmin.add(subRegistro1);

        jMenuBar3.add(menuAdmin);

        setJMenuBar(jMenuBar3);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        VerAlumnos agregar = new VerAlumnos();
        agregar.setVisible(true);
        this.dispose();


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        Cobros agregar = new Cobros();
        agregar.setVisible(true);
        this.dispose();

// TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         Inscripciones.Inscripcion agregar = new Inscripciones.Inscripcion();
        agregar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        MenuInventario agregar = new MenuInventario();
        agregar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        FmrMaestros agregar = new FmrMaestros();
        agregar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void subRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subRegistroActionPerformed
        if (fmrReg == null) {
            fmrReg = new Rusuario();
            fmrReg.setVisible(true);

        }
        this.dispose();
    }//GEN-LAST:event_subRegistroActionPerformed

    private void subRegistro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subRegistro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subRegistro1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRol;
    private javax.swing.JMenu menuAdmin;
    private javax.swing.JMenu menuUsuario;
    private javax.swing.JMenuItem subRegistro;
    private javax.swing.JMenuItem subRegistro1;
    // End of variables declaration//GEN-END:variables
}
