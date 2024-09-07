package Vista;

import Controlador.ControladorPersona;
import Modelo.Cliente;
import Modelo.Empleado;
import Modelo.Cargo;
import Modelo.Comuna;
import Modelo.Especialidad;
import Controlador.ControladorCargo;
import Controlador.ControladorComuna;
import Controlador.ControladorEspecialidad;
import Modelo.Persona;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FrmPersona extends javax.swing.JFrame {
    
    Cliente cliente=null;
    Empleado empleado=null;
    public FrmPersona() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoCliente = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        chkHabilitado = new javax.swing.JCheckBox();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabelCargo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtRut = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSueldo = new javax.swing.JTextField();
        guion = new javax.swing.JLabel();
        txtDv = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jcbCargo = new javax.swing.JComboBox<>();
        jLabelCargo1 = new javax.swing.JLabel();
        jcbEspecialidad = new javax.swing.JComboBox<>();
        jLabelCargo2 = new javax.swing.JLabel();
        jcbComuna = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        rbtIsEmpleado = new javax.swing.JRadioButton();
        rbtIsCliente = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administración de Marcas");
        setAlwaysOnTop(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Persona");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        chkHabilitado.setText("Habilitado");
        chkHabilitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkHabilitadoActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabelCargo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelCargo.setText("Cargo");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Rut (Sin puntos ni guión)");

        txtRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRutActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Sueldo");

        txtSueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSueldoActionPerformed(evt);
            }
        });

        guion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        guion.setText("-");

        txtDv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDvActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Apellido");

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        jcbCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCargoActionPerformed(evt);
            }
        });

        jLabelCargo1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelCargo1.setText("Especialidad");

        jcbEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbEspecialidadActionPerformed(evt);
            }
        });

        jLabelCargo2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelCargo2.setText("Comuna");

        jcbComuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbComunaActionPerformed(evt);
            }
        });

        jScrollPane2.setPreferredSize(new java.awt.Dimension(595, 400));
        jScrollPane2.setRowHeaderView(null);

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rut", "Nombre", "Sueldo", "IdPer", "IdCar", "IdEsp", "IdCom", "Cliente", "Habilitado"
            }
        ));
        Tabla.setPreferredSize(new java.awt.Dimension(595, 400));
        Tabla.setShowGrid(false);
        Tabla.getTableHeader().setResizingAllowed(false);
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);
        if (Tabla.getColumnModel().getColumnCount() > 0) {
            Tabla.getColumnModel().getColumn(0).setResizable(false);
            Tabla.getColumnModel().getColumn(0).setPreferredWidth(80);
            Tabla.getColumnModel().getColumn(1).setResizable(false);
            Tabla.getColumnModel().getColumn(1).setPreferredWidth(120);
            Tabla.getColumnModel().getColumn(2).setResizable(false);
            Tabla.getColumnModel().getColumn(2).setPreferredWidth(70);
            Tabla.getColumnModel().getColumn(3).setResizable(false);
            Tabla.getColumnModel().getColumn(3).setPreferredWidth(50);
            Tabla.getColumnModel().getColumn(4).setResizable(false);
            Tabla.getColumnModel().getColumn(4).setPreferredWidth(50);
            Tabla.getColumnModel().getColumn(5).setResizable(false);
            Tabla.getColumnModel().getColumn(5).setPreferredWidth(50);
            Tabla.getColumnModel().getColumn(6).setResizable(false);
            Tabla.getColumnModel().getColumn(6).setPreferredWidth(50);
            Tabla.getColumnModel().getColumn(7).setResizable(false);
            Tabla.getColumnModel().getColumn(7).setPreferredWidth(55);
            Tabla.getColumnModel().getColumn(8).setResizable(false);
            Tabla.getColumnModel().getColumn(8).setPreferredWidth(70);
        }
        Tabla.getAccessibleContext().setAccessibleName("");
        Tabla.getAccessibleContext().setAccessibleDescription("");
        Tabla.getAccessibleContext().setAccessibleParent(jScrollPane2);

        jScrollPane2.setViewportView(jScrollPane1);

        grupoCliente.add(rbtIsEmpleado);
        rbtIsEmpleado.setText("Empleado");
        rbtIsEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtIsEmpleadoActionPerformed(evt);
            }
        });

        grupoCliente.add(rbtIsCliente);
        rbtIsCliente.setText("Cliente");
        rbtIsCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtIsClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelCargo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbEspecialidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtIsCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtIsEmpleado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chkHabilitado))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombre)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(guion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDv, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabelCargo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelCargo2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbComuna, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(196, 196, 196))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guion, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkHabilitado)
                    .addComponent(rbtIsEmpleado)
                    .addComponent(rbtIsCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCargo)
                    .addComponent(jcbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCargo2)
                    .addComponent(jcbComuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCargo1)
                    .addComponent(jcbEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEliminar)
                        .addComponent(btnListar)
                        .addComponent(btnLimpiar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
       cliente = new Cliente(0,0,"","","",0,false,false);
       empleado = new Empleado(0,0,"","","",0,false,false,0,0,0);
       txtNombre.setText("");
       txtApellido.setText("");
       txtRut.setText("");
       txtDv.setText("");
       chkHabilitado.setSelected(false);
       grupoCliente.clearSelection();
       txtSueldo.setText("");
       jcbCargo.setSelectedIndex(0);
       jcbEspecialidad.setSelectedIndex(0);
       jcbComuna.setSelectedIndex(0);
       Tabla.clearSelection();
       txtRut.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    @SuppressWarnings("empty-statement")
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try{
            System.out.println("0");
            ControladorPersona cm=new ControladorPersona();
            int id=0;
            if(Tabla.getSelectedRowCount()>0){
                int row = Tabla.getSelectedRow();
                id=Integer.parseInt(Tabla.getValueAt(row,3).toString());
            }else{
                System.out.println("0");
            }
            Cliente cliente=null;
            Empleado empleado=null;
            if(rbtIsCliente.isSelected()){
                cliente = new Cliente(id,0,"","","",0,false,false);
            }else if(rbtIsEmpleado.isSelected()){
                empleado = new Empleado(id,0,"","","",0,false,false,0,0,0);
            }
            String nombre = txtNombre.getText().trim();
            if (nombre.length() < 1 || nombre.length() > 50) {
                JOptionPane.showMessageDialog(this, "Nombre fuera de rango");
                txtNombre.requestFocus();
                return; // Salimos del método si la condición no se cumple
            }else{
                if(cliente!=null){
                    cliente.setNombre(nombre);
                }else if(empleado!=null){
                    empleado.setNombre(nombre);
                }
            }
            String apellido = txtApellido.getText().trim();
            if (apellido.length() < 1 || apellido.length() > 50) {
                JOptionPane.showMessageDialog(this,"Apellido fuera de rango");
                txtApellido.requestFocus();
                return;
            }else{
                if (cliente != null) {
                    cliente.setApellido(apellido);
                } else if (empleado != null) {
                    empleado.setApellido(apellido);
                }
            }
            int rut = Integer.parseInt(txtRut.getText().trim());
            if(Integer.parseInt(txtRut.getText().trim())>0){
                if (cliente != null) {
                    cliente.setRut(rut);
                } else if (empleado != null) {
                    empleado.setRut(rut);
                }else{
                    JOptionPane.showMessageDialog(this,"Ingrese solo números en el campo Rut.");
                    txtRut.setText("");
                    txtRut.requestFocus();
                }
            }
            String dv = txtDv.getText().toUpperCase().trim();
            if (dv.length() == 1 && (Character.isDigit(dv.charAt(0)) || dv.equals("K"))) {
                if (cliente != null) {
                    cliente.setDigito(dv);
                } else if (empleado != null) {
                    empleado.setDigito(dv);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Digito fuera de rango");
                txtDv.setText("");
                txtDv.requestFocus();
                return;
                }
            
            Comuna comuna=(Comuna) jcbComuna.getSelectedItem();
            if(comuna.getIdComuna()==0){
                JOptionPane.showMessageDialog(this,"Escoga una comuna");
                jcbComuna.requestFocus();
                return;
            }else if (cliente != null) {
                cliente.setIdComuna(comuna.getIdComuna());
            } else if (empleado != null) {
                empleado.setIdComuna(comuna.getIdComuna());
            }
            

            if(cliente!=null){
                cliente.setEsCliente(rbtIsCliente.isSelected());
                cliente.setHabilitado(chkHabilitado.isSelected());
            }else if(empleado!=null){
                empleado.setEsCliente(rbtIsCliente.isSelected());
                empleado.setHabilitado(chkHabilitado.isSelected());
            }
            if(empleado!=null){
                int sueldo=Integer.parseInt(txtSueldo.getText().trim());
                if ((sueldo<400000 || sueldo>2500000)){
                    JOptionPane.showMessageDialog(this,"Sueldo fuera de rango");
                    txtSueldo.setText("");
                    txtSueldo.requestFocus();
                    return;
                }else{
                    empleado.setSueldo(sueldo);
                }
                Cargo cargo = (Cargo)jcbCargo.getSelectedItem();
                if (cargo.getIdCargo()==0){
                    JOptionPane.showMessageDialog(this,"Escoga un cargo");
                    jcbCargo.requestFocus();
                    return;
                }else{
                    empleado.setIdCargo(cargo.getIdCargo());
                }
                
                Especialidad especialidad = (Especialidad)jcbEspecialidad.getSelectedItem();
                empleado.setIdEspecialidad(especialidad.getIdEspecialidad());
            }
            
            boolean resultado=false;
            
            if(rbtIsCliente.isSelected()){
                if(cliente.getId()>0){
                    resultado=cm.actualizarCliente(cliente);
                }else{
                    resultado=cm.agregarCliente(cliente);
                }
            }else if(rbtIsEmpleado.isSelected()){
                if(empleado.getId()>0){
                    resultado=cm.actualizarEmpleado(empleado);

                }else{
                    resultado=cm.agregarEmpleado(empleado);
                }  
            }
            if(resultado)
            {
                JOptionPane.showMessageDialog(this, "Datos Guardados");
                btnLimpiar.doClick();
                btnListarActionPerformed(null);
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Error en la ejecución");
            }
        }catch(Exception e){
            System.out.println("Error en la ejecucion, Error "+e);
        }
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void chkHabilitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkHabilitadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkHabilitadoActionPerformed

    private void txtRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRutActionPerformed

    private void txtDvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDvActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtSueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSueldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSueldoActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void jcbCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCargoActionPerformed

        
        
                // TODO add your handling code here:
    }//GEN-LAST:event_jcbCargoActionPerformed

    private void jcbEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEspecialidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbEspecialidadActionPerformed

    private void jcbComunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbComunaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbComunaActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        cliente=new Cliente(0,0,"","","",0,false,false);
        empleado=new Empleado(0,0,"","","",0,false,false,0,0,0);
        int row = Tabla.getSelectedRow();
        int id=Integer.parseInt(Tabla.getValueAt(row,3).toString());
        cliente.setId(id);
        empleado.setId(id);
        
        
        if(empleado.getId()<1 || cliente.getId()<1){
            JOptionPane.showMessageDialog(this,"Debe seleccionar el elemento a eliminar");
            return;
        }
        
        ControladorPersona cm= new ControladorPersona();
        boolean fueEliminado=cm.eliminar(id);
        
        if(fueEliminado){
            JOptionPane.showMessageDialog(this, "La información fue eliminada");
            btnLimpiar.doClick();
            btnListarActionPerformed(null);
        }else
            JOptionPane.showMessageDialog(this,"Error al eliminar");
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        ControladorPersona cm= new ControladorPersona();
        ArrayList<Persona> listado=cm.listarTodos();
        
        DefaultTableModel dtm=(DefaultTableModel)Tabla.getModel();
        Tabla.setPreferredScrollableViewportSize(Tabla.getPreferredSize());

        dtm.setRowCount(0);
        
        for(Persona p : listado){
            if(p instanceof Cliente){
                Cliente cliente=(Cliente)p;
                dtm.addRow(new Object[]{cliente.getRut()+"-"+cliente.getDigito(),cliente.getNombre()," ",cliente.getId()," "," ",cliente.getIdComuna(),cliente.getEsCliente(),cliente.getHabilitado()});
            }else if(p instanceof Empleado){
                Empleado empleado=(Empleado)p;
                dtm.addRow(new Object[]{empleado.getRut()+"-"+empleado.getDigito(),empleado.getNombre(),empleado.getSueldo(),empleado.getId(),empleado.getIdCargo(),empleado.getIdEspecialidad(),empleado.getIdComuna(),empleado.getEsCliente(),empleado.getHabilitado()});
            }
        }
    }//GEN-LAST:event_btnListarActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        int row = Tabla.getSelectedRow();
        int idPer=Integer.parseInt(Tabla.getValueAt(row,3).toString());
        if(Tabla.getValueAt(row,7).equals(true)){
            cliente=new Cliente(0,0,"","","",0,false,false);
            cliente.setId(idPer);
            txtSueldo.setText("");
            jcbEspecialidad.setSelectedIndex(0);
            jcbCargo.setSelectedIndex(0);
        }else if(Tabla.getValueAt(row,7).equals(false)){
            empleado=new Empleado(0,0,"","","",0,false,false,0,0,0);
            empleado.setId(idPer);
        }

        String rut,dv;
        rut=Tabla.getValueAt(row,0).toString();
        rut=rut.substring(0,rut.length()-2);
        txtRut.setText(rut);

        dv=Tabla.getValueAt(row,0).toString();
        dv=dv.substring(dv.length()-1);
        txtDv.setText(dv);

        String nomcom;
        nomcom=Tabla.getValueAt(row,1).toString();

        int indesp=nomcom.indexOf(' ');
        txtNombre.setText(nomcom.substring(0,indesp));

        int indult=nomcom.lastIndexOf(' ');
        txtApellido.setText(nomcom.substring(indult+1));

        chkHabilitado.setSelected(Tabla.getValueAt(row,8).toString().equals("true"));
        jcbComuna.setSelectedIndex((int)Tabla.getValueAt(row,6));
        if(Tabla.getValueAt(row,7).toString().equals("true")){
            rbtIsCliente.setSelected(true);
        }else{
            rbtIsEmpleado.setSelected(true);
        }
        
        if(empleado!=null){
            txtSueldo.setText(Tabla.getValueAt(row,2).toString());
            jcbEspecialidad.setSelectedIndex((int)Tabla.getValueAt(row,5));
            jcbCargo.setSelectedIndex((int)Tabla.getValueAt(row,4));
        }
    }//GEN-LAST:event_TablaMouseClicked

    private void rbtIsClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtIsClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtIsClienteActionPerformed

    private void rbtIsEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtIsEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtIsEmpleadoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jcbCargo.setModel(new ControladorCargo().llenarCombo());
        jcbComuna.setModel(new ControladorComuna().llenarCombo());
        jcbEspecialidad.setModel(new ControladorEspecialidad().llenarCombo());
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(FrmPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPersona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnListar;
    private javax.swing.JCheckBox chkHabilitado;
    private javax.swing.ButtonGroup grupoCliente;
    private javax.swing.JLabel guion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelCargo;
    private javax.swing.JLabel jLabelCargo1;
    private javax.swing.JLabel jLabelCargo2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jcbCargo;
    private javax.swing.JComboBox<String> jcbComuna;
    private javax.swing.JComboBox<String> jcbEspecialidad;
    private javax.swing.JRadioButton rbtIsCliente;
    private javax.swing.JRadioButton rbtIsEmpleado;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDv;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRut;
    private javax.swing.JTextField txtSueldo;
    // End of variables declaration//GEN-END:variables
}
