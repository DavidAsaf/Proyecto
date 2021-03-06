/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventario;

import Formularios.NuevoArticulo;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import modelo.conexion;

/**
 *
 * @author Gerson Lopez
 */
public class salidaEvento extends javax.swing.JFrame {

    DefaultTableModel model;
    DefaultTableModel model2;
    PreparedStatement ps;
    ResultSet rs;
    int idEspera = 0, columna = 0, fila = 0;
    int cantidad = 0;

    conexion cn = new conexion();
    java.sql.Connection con = cn.getConexion();

    /**
     * Creates new form salidaEvento
     */
    public salidaEvento() {
        initComponents();
        setReporteID();
        verArticulos();
        model = (DefaultTableModel) tabla1.getModel();
        model2 = (DefaultTableModel) tabla2.getModel();

    }

    public void setReporteID() {
        Connection con = null;

        try {
            con = (Connection) cn.getConexion();
            ps = con.prepareStatement("select auto_increment from information_schema.TABLES where TABLE_SCHEMA= 'academia' and TABLE_NAME = 'Salida_Articulos'");
            rs = ps.executeQuery();
            Object Datos[] = new Object[1];
            int variable = 0;
            while (rs.next()) {
                for (int i = 0; i < 1; i++) {
                    Datos[i] = (rs.getObject(i + 1));
                    if (i == 0) {

                        variable = ((Integer.parseInt(Datos[i].toString())));
                        variable += 1;
                        this.txtIDReporte.setText(String.valueOf(variable));
                    }
                }
            }
            con.close();
        } catch (Exception e) {

        }
    }

    public void verArticulos() {
        Connection con = null;

        try {
            con = (Connection) cn.getConexion();
            ps = con.prepareStatement("select ID_Articulo, Articulo, Cantidad from academia.Articulos;");
            rs = ps.executeQuery();
            model = (DefaultTableModel) this.tabla1.getModel();
            model.setRowCount(0);
            Object Datos[] = new Object[3];

            while (rs.next()) {
                for (int i = 0; i < 3; i++) {
                    Datos[i] = (rs.getObject(i + 1));
                    if (i == 2) {
                        model.addRow(Datos);
                    }
                }
            }

        } catch (Exception e) {

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

        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtArticulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        combo = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtLugarEvento = new javax.swing.JTextField();
        txtFechaEvento = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        txtIDReporte = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        comboBuscar = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Buscar");

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID artículo", "Artículo", "Cantidad"
            }
        ));
        tabla1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla1);
        if (tabla1.getColumnModel().getColumnCount() > 0) {
            tabla1.getColumnModel().getColumn(0).setMaxWidth(80);
            tabla1.getColumnModel().getColumn(2).setMaxWidth(80);
        }

        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id artículo", "Artículo", "Cantidad Salida"
            }
        ));
        jScrollPane2.setViewportView(tabla2);
        if (tabla2.getColumnModel().getColumnCount() > 0) {
            tabla2.getColumnModel().getColumn(0).setMaxWidth(80);
            tabla2.getColumnModel().getColumn(2).setMaxWidth(80);
        }

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Quitar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Salida de Artículos");

        jLabel3.setText("Artículo");

        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Cantidad a retirar---" }));

        jButton3.setText("Guardar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Imprimir y Guardar");

        jButton5.setText("Menu Principal");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel4.setText("Lugar de evento:");

        jLabel5.setText("Fecha de evento:");

        txtLugarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLugarEventoActionPerformed(evt);
            }
        });
        txtLugarEvento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLugarEventoKeyTyped(evt);
            }
        });

        txtFechaEvento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        jLabel6.setText("Reporte salida #");

        txtIDReporte.setEditable(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Articulos para evento");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Articulos disponibles");

        comboBuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Artículo" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(395, 395, 395)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(comboBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txtIDReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtLugarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFechaEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(186, 186, 186)
                                .addComponent(jButton1))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addGap(54, 54, 54))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(58, 58, 58))
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(282, 282, 282))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtIDReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtLugarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtFechaEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(comboBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (txtArticulo.equals("")) {
            JOptionPane.showMessageDialog(null, "Primero debes seleccionar un articulo.");

        } else if (combo.getSelectedItem().equals("---Cantidad a retirar---")) {
            JOptionPane.showMessageDialog(null, "No has seleccionado la cantidad a retirar.");

        } else {
            try {
                Object[] registro = {String.valueOf(idEspera), txtArticulo.getText(), combo.getSelectedItem()};
                model2.addRow(registro);
                cantidad = cantidad - Integer.parseInt(String.valueOf(combo.getSelectedItem()));
                model.setValueAt(cantidad, fila, 2);
                idEspera = 0;
                fila = 0;
                cantidad = 0;
                txtArticulo.setText("");
                combo.removeAllItems();
                combo.addItem("---Cantidad a retirar---");
            } catch (Exception ex) {

            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private int RetornoIdReporte() {
        Connection con = null;
        int var = 0;
        try {
            con = (Connection) cn.getConexion();
            ps = con.prepareStatement("select max(reporteid) as id from salida_articulos;");
            rs = ps.executeQuery();
            Object Datos[] = new Object[1];
            int variable = 0;
            while (rs.next()) {
                for (int i = 0; i < 1; i++) {
                    Datos[i] = (rs.getObject(i + 1));
                    if (i == 0) {
                        var = ((Integer.parseInt(Datos[i].toString())));
                    }
                }
            }
            con.close();
        } catch (Exception e) {

        }
        return var;

    }

    private void GuardarReporte() {
        Connection con = null;
        try {

            con = (Connection) cn.getConexion();

            ps = con.prepareStatement("insert into academia.Salida_Articulos (Lugar_Evento, Fecha_Evento) values (?,?)");
            ps.setString(1, this.txtLugarEvento.getText());
            ps.setString(2, this.txtFechaEvento.getText());
            int res = ps.executeUpdate();
            if (res > 0) {

            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar artículo.");
            }

            con.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    private void GuardarSalida() {
        Connection con = null;
        int cuentaFilas = model2.getRowCount();
        if (cuentaFilas != 0) {
            try {
                for (int i = 0; i < cuentaFilas; i++) {
                    try {
                        int x0 = RetornoIdReporte();
                        int x1 = Integer.parseInt(String.valueOf(model2.getValueAt(i, 0)));
                        int x2 = Integer.parseInt(String.valueOf(model2.getValueAt(i, 2)));

                        con = (Connection) cn.getConexion();
                        ps = con.prepareStatement("insert into academia.SalidaPorEvento(ReporteID,ID_Articulo,Cantidad) "
                                + "values (" + x0 + "," + x1 + "," + x2 + ");");
                        //ps.setInt(1, Integer.parseInt(String.valueOf(RetornoIdReporte())));
                        //ps.setInt(2, Integer.parseInt(String.valueOf(x1)));
                        //ps.setInt(3, Integer.parseInt(String.valueOf(x2)));
                        int res = ps.executeUpdate();

                        if (res > 0) {

                        } else {
                            JOptionPane.showMessageDialog(null, "Error al guardar.");
                        }
                        con.close();
                    } catch (Exception exe) {
                        JOptionPane.showMessageDialog(null, "Hubo un error, guardar salida en el for. --- " + exe);
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Hubo un error en guardar salida.");
            }
        }

    }

    private void DisminucionInventario() {
        Connection con = null;
        int cuentaFilas = model.getRowCount();
        if (cuentaFilas != 0) {
            try {
                for (int i = 0; i < cuentaFilas; i++) {
                    try {
                        con = (Connection) cn.getConexion();
                        int idArt = Integer.parseInt(String.valueOf(model.getValueAt(i, 0)));
                        ps = con.prepareStatement("update academia.Articulos set Cantidad=? where ID_Articulo=" + idArt);
                        ps.setInt(1, Integer.parseInt(String.valueOf(model.getValueAt(i, 2))));
                        int res = ps.executeUpdate();
                        con.close();
                    } catch (Exception exe) {
                        JOptionPane.showMessageDialog(null, "Hubo un error en el for de la disminucion de inventario.");
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Hubo un error en la disminucion de inventario.");
            }
        }
    }


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            idEspera = Integer.parseInt(String.valueOf(model2.getValueAt(tabla2.getSelectedRow(), 0)));
            int obtenerCant = Integer.parseInt(String.valueOf(model.getValueAt(idEspera - 1, 2)));
            cantidad = Integer.parseInt(String.valueOf(model2.getValueAt(tabla2.getSelectedRow(), 2)));
            cantidad = cantidad + obtenerCant;
            model.setValueAt(cantidad, idEspera - 1, 2);
            idEspera = 0;
            cantidad = 0;
            model2.removeRow(tabla2.getSelectedRow());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Tienes que seleccionar una fila.");
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
            GuardarReporte();
            GuardarSalida();
            DisminucionInventario();
            JOptionPane.showMessageDialog(null, "Todo fue guardado con exito");

            MenuInventario MI = new MenuInventario();
            MI.setVisible(true);
            this.dispose();
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Hubo error al guardar.");
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtLugarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLugarEventoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLugarEventoActionPerformed

    private void tabla1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla1MouseClicked
        // TODO add your handling code here:
        cantidad = Integer.parseInt(String.valueOf(model.getValueAt(tabla1.getSelectedRow(), 2)));

        if (cantidad != 0) {
            combo.removeAllItems();
            combo.addItem("---Cantidad a retirar---");
            idEspera = Integer.parseInt(String.valueOf(model.getValueAt(tabla1.getSelectedRow(), 0)));
            txtArticulo.setText(String.valueOf(model.getValueAt(tabla1.getSelectedRow(), 1)));

            fila = tabla1.getSelectedRow();
            for (int i = 1; i <= cantidad; i++) {
                combo.addItem(String.valueOf(i));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Este articulo está agotado temporalmente.");
        }

    }//GEN-LAST:event_tabla1MouseClicked

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        // TODO add your handling code here:
        Connection con = null;
        String buscarPalabra = this.txtBuscar.getText();
        String columna = String.valueOf(this.comboBuscar.getSelectedItem());
        if (columna.equals("ID")) {
            columna = "ID_Articulo";
        }
        if (columna.equals("Artículo")) {
            columna = "Articulo";
        }

        try {
            con = (Connection) cn.getConexion();
            ps = con.prepareStatement("select ID_Articulo, Articulo, Cantidad from academia.Articulos where " + columna + " like '%" + buscarPalabra + "%'");
            rs = ps.executeQuery();
            model = (DefaultTableModel) this.tabla1.getModel();
            model.setRowCount(0);
            Object Datos[] = new Object[3];

            while (rs.next()) {
                for (int i = 0; i < 3; i++) {
                    Datos[i] = (rs.getObject(i + 1));
                    if (i == 2) {

                        model.addRow(Datos);
                    }
                }
            }
            con.close();
        } catch (Exception e) {

        }
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        // TODO add your handling code here:
        convertirMayus(evt);
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void txtLugarEventoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLugarEventoKeyTyped
        // TODO add your handling code here:
        convertirMayus(evt);
    }//GEN-LAST:event_txtLugarEventoKeyTyped

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        MenuInventario abrir = new MenuInventario();
        abrir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    public void convertirMayus(java.awt.event.KeyEvent evtC) {

        char c = evtC.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evtC.setKeyChar(c);
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
            java.util.logging.Logger.getLogger(salidaEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(salidaEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(salidaEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(salidaEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new salidaEvento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JComboBox<String> comboBuscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla1;
    private javax.swing.JTable tabla2;
    private javax.swing.JTextField txtArticulo;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JFormattedTextField txtFechaEvento;
    private javax.swing.JTextField txtIDReporte;
    private javax.swing.JTextField txtLugarEvento;
    // End of variables declaration//GEN-END:variables
}
