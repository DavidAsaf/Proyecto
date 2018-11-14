/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;
import Alumnos.VerAlumnos;
import static Alumnos.NuevoAlumno.varEdit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import modelo.conexion;




/**
 *
 * @author Jose
 */


public class Nuevomaestro extends javax.swing.JFrame {

  
    /**
     * Creates new form Nuevomaestro
     */
    
      public static String varEdit;

    @Override
    public void repaint() {
        super.repaint(); //To change body of generated methods, choose Tools | Templates.
    }
    conexion cn = new conexion();
    java.sql.Connection con = cn.getConexion();

    PreparedStatement ps;
    ResultSet rs;
    
    
    public Nuevomaestro() {
        initComponents();
       CargarDeptos(cmbDepartamentos);
        
         this.setLocationRelativeTo(null);
        limpiar(); //invocamos el metodo limpiar, para que cuando se inicialice, limpie todos los contenedores. 

        varEdit = FmrMaestros.varCompartir;
        if (varEdit.equals("")) {
            lblNuevoMaestro.setText("Nuevo registro");

        } else {
            limpiar(); //Invocamos el metodo limpiar.
            lblNuevoMaestro.setText("Editar Alumn@"); //Cambia el título.
            llenar(); //Llena el formulario con los datos a editar.
        }
    }

    
     public void limpiar() { //para limpiar, si hubiesen datos que han quedado en el formulario.
        txtNombre.setText("");
        txtApellido.setText("");
        txtFechaNac.setText("");
        cmbDepartamentos.setSelectedIndex(0);
        cmbMunicipio.setSelectedIndex(0);
        txtCelular.setText("");
        txtCasa.setText("");
        cmbEspecialidad.setSelectedIndex(0);
        txtEmail.setText("");
        txtDireccion.setText("");

    }
    
     public void llenar() {
        Connection con = null;

        try {
            con = (Connection) cn.getConexion();
            ps = con.prepareStatement("select nombre, apellido, fecha_nacimiento, id_ciudad, id_departamento, numero_cel, tel_casa, \n" +
            "especialidad, direccion,email from Alumnos where id_maestro= " + varEdit);
            rs = ps.executeQuery();
            Object Datos[] = new Object[10];

            while (rs.next()) {
                for (int i = 0; i < 10; i++) {
                    Datos[i] = (rs.getObject(i + 1));
                    if (i == 9) {
                        this.txtNombre.setText(String.valueOf(Datos[0]));
                        this.txtApellido.setText(String.valueOf(Datos[1]));
                        this.txtFechaNac.setText(String.valueOf(Datos[2]));
                        this.cmbDepartamentos.setSelectedItem(Datos[3]);
                        this.cmbMunicipio.setSelectedItem(Datos[4]);
                        this.txtCelular.setText(String.valueOf(Datos[5]));
                        this.txtCasa.setText(String.valueOf(Datos[6]));
                        this.cmbEspecialidad.setSelectedItem(Datos[7]);
                        this.txtEmail.setText(String.valueOf(Datos[8]));
                        this.txtDireccion.setText(String.valueOf(Datos[9]));
                        

                    }
                }
            }

        } catch (Exception e) {

        }
    }
     
     
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtNombre = new javax.swing.JTextField();
        lblApellido = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        lblNuevoMaestro = new javax.swing.JLabel();
        lblIdMaestro = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        txtFechaNac = new javax.swing.JTextField();
        lblFechaNa = new javax.swing.JLabel();
        lblDepartamento = new javax.swing.JLabel();
        lblMunicipio = new javax.swing.JLabel();
        cmbDepartamentos = new javax.swing.JComboBox<>();
        cmbMunicipio = new javax.swing.JComboBox<>();
        lblcasa = new javax.swing.JLabel();
        lblcel1 = new javax.swing.JLabel();
        txtCasa = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        lblcasa1 = new javax.swing.JLabel();
        cmbEspecialidad = new javax.swing.JComboBox<>();
        lbldireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnAtras = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        lblApellido.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblApellido.setText("Apellido:");

        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });

        lblNuevoMaestro.setFont(new java.awt.Font("Chilanka", 1, 36)); // NOI18N
        lblNuevoMaestro.setText("Nuevo Maestro");

        lblIdMaestro.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblIdMaestro.setText("Id");

        lblNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblNombre.setText("Nombre:");

        jTextField1.setEditable(false);

        txtFechaNac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaNacKeyTyped(evt);
            }
        });

        lblFechaNa.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblFechaNa.setText("Fecha/Nac");

        lblDepartamento.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblDepartamento.setText("Departamento");

        lblMunicipio.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblMunicipio.setText("Municipio");

        cmbDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDepartamentosActionPerformed(evt);
            }
        });

        cmbMunicipio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Santa Ana", "Metapan", "El Congo", "Coatepeque" }));

        lblcasa.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblcasa.setText("Especialidad");

        lblcel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblcel1.setText("Celular");

        txtCasa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCasaKeyTyped(evt);
            }
        });

        txtCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCelularKeyTyped(evt);
            }
        });

        lblcasa1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblcasa1.setText("Tel casa");

        cmbEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Piano", "Bateria", "Guitarra", "Violin", "Canto", "Danza", "Pintura" }));

        lbldireccion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbldireccion.setText("dirección");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblEmail.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblEmail.setText("email");

        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });

        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnMenu.setText("Menu");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblcasa)
                        .addGap(18, 18, 18)
                        .addComponent(cmbEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAtras, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(lbldireccion))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(39, 39, 39)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtEmail)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(btnMenu)
                                    .addGap(26, 26, 26)
                                    .addComponent(btnGuardar)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnCancelar)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnSalir)
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblFechaNa)
                                .addComponent(lblApellido)
                                .addComponent(lblNombre)
                                .addComponent(lblDepartamento)
                                .addComponent(lblMunicipio)
                                .addComponent(lblIdMaestro, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblcel1)
                                .addComponent(lblcasa1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                                    .addComponent(txtFechaNac, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cmbMunicipio, javax.swing.GroupLayout.Alignment.LEADING, 0, 131, Short.MAX_VALUE)
                                        .addComponent(cmbDepartamentos, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtCasa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                    .addComponent(txtCelular, javax.swing.GroupLayout.Alignment.LEADING))))))
                .addGap(13, 13, 13))
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(lblNuevoMaestro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNuevoMaestro)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIdMaestro)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblNombre)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblApellido))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFechaNa)
                            .addComponent(txtFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDepartamento)
                            .addComponent(cmbDepartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMunicipio)
                            .addComponent(cmbMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblcel1)
                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCasa))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 299, Short.MAX_VALUE)
                        .addComponent(lblcasa1)))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcasa)
                    .addComponent(cmbEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbldireccion)
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail)
                            .addComponent(txtEmail))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar)
                    .addComponent(btnAtras)
                    .addComponent(btnMenu)
                    .addComponent(btnSalir))
                .addGap(21, 21, 21))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
        convMayus(evt);
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        convMayus(evt);
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtFechaNacKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaNacKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaNacKeyTyped

    private void txtCasaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCasaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCasaKeyTyped

    private void txtCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelularKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelularKeyTyped

    private void cmbDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDepartamentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDepartamentosActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       if (varEdit.equals("")) {
            Connection con = null;

            try {

                con = (Connection) cn.getConexion();

                ps = con.prepareStatement("insert into Maestros (nombre, apellido, fecha_nacimiento, id_departamento, id_ciudad, numero_cel, tel_casa, \n" +
                        "especialidad, direccion,email) values (?,?,?,?,?,?,?,?,?,?)");
                ps.setString(1, this.txtNombre.getText());
                ps.setString(2, this.txtApellido.getText());
                ps.setString(3, this.txtFechaNac.getText());
                ps.setString(4, String.valueOf(this.cmbDepartamentos.getSelectedItem()));
                ps.setString(5, String.valueOf(this.cmbMunicipio.getSelectedItem()));
                ps.setString(6, this.txtCelular.getText());
                ps.setString(7, this.txtCasa.getText());
                ps.setString(8, String.valueOf(this.cmbEspecialidad.getSelectedItem()));
                ps.setString(9, this.txtDireccion.getText());
                ps.setString(10, this.txtEmail.getText());

                int res = ps.executeUpdate();
                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "Maestro guardado satisfactoriamente");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al guardar Maestro");
                }

                con.close();
            } catch (Exception e) {
                System.err.println(e);
            }
        } else {
            Connection con = null;

            try {

                con = (Connection) cn.getConexion();

                ps = con.prepareStatement("update academia.Maestros set "
                        + "nombre=?, apellido=?, fecha_nacimiento=?,id_departamento=?, id_ciudad=?, numero_cel?, tel_casa=?," 
                        +"especialidad=?, direccion=?,email=?" 
                        + "where id_maestro=" + Integer.parseInt(varEdit));

                ps.setString(1, this.txtNombre.getText());
                ps.setString(2, this.txtApellido.getText());
                ps.setString(3, this.txtFechaNac.getText());
                ps.setString(4, String.valueOf(this.cmbDepartamentos.getSelectedItem()));
                ps.setString(5, String.valueOf(this.cmbMunicipio.getSelectedItem()));
                ps.setString(6, this.txtCelular.getText());
                ps.setString(7, this.txtCasa.getText());
                ps.setString(8, String.valueOf(this.cmbEspecialidad.getSelectedItem()));
                ps.setString(13, this.txtDireccion.getText());
                ps.setString(14, this.txtEmail.getText());
                int res = ps.executeUpdate();
                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "El alumno fue editado y guardado.");
                    limpiar();
                    VerAlumnos agregar = new VerAlumnos();
                    agregar.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al guardar alumno. Vuelva a intentarlo.");
                }

                con.close();
            } catch (Exception e) {
                System.err.println(e);
            }
        }
       limpiar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailKeyTyped

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
       limpiar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        limpiar();
        MainForm agregar = new MainForm();
        agregar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        limpiar();
        FmrMaestros agregar = new FmrMaestros();
        agregar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    
    public void convMayus(java.awt.event.KeyEvent evtC) {

        char c = evtC.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evtC.setKeyChar(c);
        }
    }
   
    
    conexion metodoconec = new conexion(); 
    public void CargarDeptos(JComboBox cmbDepartamentos){
        
        java.sql.Connection conectar = null;
        String SSQL="Select * from Departamentos";
       
        try{
            conectar = metodoconec.getConexion();
            PreparedStatement pst = conectar.prepareStatement(SSQL);     
            ResultSet rs =pst.executeQuery();
           
           //llenar el combobox
           cmbDepartamentos.addItem("seleccione");
           
            while (rs.next()){
                cmbDepartamentos.addItem(rs.getString("descipcion"));
            
            
            
            }
        } catch (SQLException e ){ 
            JOptionPane.showMessageDialog(null, e);
        
        
        }finally {
            if (conectar!=null){
                try {
                    conectar.close();
                }catch (SQLException ex){
                    JOptionPane.showMessageDialog(null, ex);
                }
               
            }
        
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
            java.util.logging.Logger.getLogger(Nuevomaestro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nuevomaestro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nuevomaestro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nuevomaestro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nuevomaestro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbDepartamentos;
    private javax.swing.JComboBox<String> cmbEspecialidad;
    private javax.swing.JComboBox<String> cmbMunicipio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblDepartamento;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFechaNa;
    private javax.swing.JLabel lblIdMaestro;
    private javax.swing.JLabel lblMunicipio;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNuevoMaestro;
    private javax.swing.JLabel lblcasa;
    private javax.swing.JLabel lblcasa1;
    private javax.swing.JLabel lblcel1;
    private javax.swing.JLabel lbldireccion;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCasa;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFechaNac;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private static class ResulSet {

        public ResulSet() {
        }
    }
}
