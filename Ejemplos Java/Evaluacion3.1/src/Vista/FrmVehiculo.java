
package Vista;

import Controlador.ControladorMarca;
import Controlador.ControladorPersona;
import Controlador.ControladorVehiculo;
import Modelo.Automovil;
import Modelo.Cliente;
import Modelo.Marca;
import Modelo.Motocicleta;
import Modelo.Vehiculo;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class FrmVehiculo extends javax.swing.JFrame {

    Automovil automovil=null;
    Motocicleta motocicleta=null;
    public FrmVehiculo() {
        initComponents();
        setupRadioButtons();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoVehiculo = new javax.swing.ButtonGroup();
        jLabelTitulo = new javax.swing.JLabel();
        Rut = new javax.swing.JLabel();
        txtRut = new javax.swing.JTextField();
        txtDv = new javax.swing.JTextField();
        guion = new javax.swing.JLabel();
        Marca = new javax.swing.JLabel();
        jcbMarca = new javax.swing.JComboBox<>();
        Patente = new javax.swing.JLabel();
        txtPatente = new javax.swing.JTextField();
        Modelo = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        rbtAutomovil = new javax.swing.JRadioButton();
        rbtMotocicleta = new javax.swing.JRadioButton();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        Pregunta1 = new javax.swing.JLabel();
        Pregunta2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        txtPregunta2 = new javax.swing.JTextField();
        txtPregunta1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administración de Marcas");
        setAlwaysOnTop(true);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelTitulo.setText("Vehiculo");

        Rut.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Rut.setText("Rut (Sin puntos ni guión)");

        txtRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRutActionPerformed(evt);
            }
        });

        txtDv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDvActionPerformed(evt);
            }
        });

        guion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        guion.setText("-");

        Marca.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Marca.setText("Marca");

        jcbMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMarcaActionPerformed(evt);
            }
        });

        Patente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Patente.setText("Patente");

        txtPatente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatenteActionPerformed(evt);
            }
        });

        Modelo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Modelo.setText("Modelo");

        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });

        GrupoVehiculo.add(rbtAutomovil);
        rbtAutomovil.setText("Automovil");

        GrupoVehiculo.add(rbtMotocicleta);
        rbtMotocicleta.setText("Motocicleta");

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

        Pregunta1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Pregunta1.setText("...");

        Pregunta2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Pregunta2.setText("...");

        jScrollPane2.setPreferredSize(new java.awt.Dimension(595, 400));
        jScrollPane2.setRowHeaderView(null);

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdVehiculo", "IdPersona", "IdMarca", "Patente", "Modelo", "Litros Maletero", "Cantidad Puertas", "Largo Manillar", "Estilo"
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

        jScrollPane2.setViewportView(jScrollPane1);

        txtPregunta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPregunta2ActionPerformed(evt);
            }
        });

        txtPregunta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPregunta1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(jLabelTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Marca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Rut)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(guion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDv, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Pregunta2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPregunta2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Modelo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Pregunta1)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPregunta1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Patente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtPatente, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbtAutomovil)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbtMotocicleta)))))
                        .addGap(0, 20, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGap(21, 21, 21)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guion, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Rut)
                    .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Marca)
                    .addComponent(jcbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Patente)
                    .addComponent(txtPatente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Modelo)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtAutomovil)
                    .addComponent(rbtMotocicleta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pregunta1)
                    .addComponent(Pregunta2)
                    .addComponent(txtPregunta2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPregunta1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnListar)
                    .addComponent(btnLimpiar)
                    .addComponent(btnGuardar))
                .addContainerGap(272, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(229, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setupRadioButtons(){
        rbtAutomovil.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                rbtAutomovilActionPerformed(evt);
            }
        });
        rbtMotocicleta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                rbtMotocicletaActionPerformed(evt);
            }
        });
    }
    private void rbtAutomovilActionPerformed(ActionEvent evt) {
        Pregunta1.setText("Litros Maletero");
        Pregunta2.setText("Cantidad Puertas");
    }

    private void rbtMotocicletaActionPerformed(ActionEvent evt) {
        Pregunta1.setText("Largo Manillar");
        Pregunta2.setText("Estilo");
    }
    
    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void txtRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRutActionPerformed

    private void txtDvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDvActionPerformed

    private void jcbMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMarcaActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jcbMarcaActionPerformed

    private void txtPatenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatenteActionPerformed

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try{
            ControladorPersona cm=new ControladorPersona();
            ControladorVehiculo cv =new ControladorVehiculo();
            int id=0;
            if(Tabla.getSelectedRowCount()>0){
                int row = Tabla.getSelectedRow();
                id=Integer.parseInt(Tabla.getValueAt(row,0).toString());
            }else{
                System.out.println("0");
            }
            Automovil automovil=null;
            Motocicleta motocicleta=null;
            if (rbtAutomovil.isSelected()) {
                automovil = new Automovil(id, 0, 0, "", "", 0, 0);
            } else if (rbtMotocicleta.isSelected()) {
                motocicleta = new Motocicleta(id, 0, 0, "", "", 0, "");
            }
            
            int rut =Integer.parseInt(txtRut.getText().trim());
            String dv=txtDv.getText().trim();
            Cliente cliente=new Cliente(0,0,"","","",0,false,false);
            cliente=cm.buscarIdPorRut(rut,dv);
            if(automovil!=null){
                automovil.setIdPersona(cliente.getId());
            }else if(motocicleta!=null){
                motocicleta.setIdPersona(cliente.getId());
            }
           
            Marca marca = (Marca) jcbMarca.getSelectedItem();
            if (marca.getIdMarca() == 0){
                JOptionPane.showMessageDialog(this,"Escoga una marca");
                jcbMarca.requestFocus();
                return;
            }else if (automovil != null) {
                automovil.setIdMarca(marca.getIdMarca());
            } else if (motocicleta != null) {
                motocicleta.setIdMarca(marca.getIdMarca());
            }
            
            String patente = txtPatente.getText().trim();
            if (patente.length() < 1 || patente.length() > 6) {
                JOptionPane.showMessageDialog(this, "Patente fuera de rango");
                txtPatente.requestFocus();
                return;
            }else{
                if (automovil != null) {
                    automovil.setPatente(patente);
                } else if (motocicleta != null) {
                    motocicleta.setPatente(patente);
                }
            }
            
            
            String modelo=txtModelo.getText().trim();
            if (modelo.length() < 1 || modelo.length() > 100) {
                JOptionPane.showMessageDialog(this,"Modelo fuera de los parametros");
                txtModelo.requestFocus();
                return;
            }else{
                if (automovil != null) {
                    automovil.setModelo(modelo);
                } else if (motocicleta != null) {
                    motocicleta.setModelo(modelo);
                }
            }
            
            try{
                if(rbtAutomovil.isSelected()){
                    int p1=Integer.parseInt(txtPregunta1.getText().trim());
                    int p2=Integer.parseInt(txtPregunta2.getText().trim());
                    automovil.setLitrosMaletero(p1);
                    automovil.setCantidadPuerta(p2);
                }else if(rbtMotocicleta.isSelected()){
                    int p1=Integer.parseInt(txtPregunta1.getText().trim());
                    String p2=txtPregunta2.getText().trim();
                    motocicleta.setLargoManillar(p1);
                    motocicleta.setEstilo(p2);
                }
            }catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Ingreso erróneo");
                txtPregunta1.setText("");
                txtPregunta2.setText("");
                txtPregunta1.requestFocus();
            }
            
            boolean resultado = false;
            
            if(rbtAutomovil.isSelected()){
                if(automovil.getIdVehiculo()>0){
                    resultado=cv.actualizarAuto(automovil);
                }else{
                    resultado=cv.agregarAuto(automovil);
                }
            }else if(rbtMotocicleta.isSelected()){
                if(motocicleta.getIdVehiculo()>0){
                    resultado=cv.actualizarMoto(motocicleta);
                }else{
                    resultado=cv.agregarMoto(motocicleta);
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

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Automovil automovil=new Automovil(0,0,0,"","",0,0);
        Motocicleta motocicleta=new Motocicleta(0,0,0,"","",0,"");
        
        int row = Tabla.getSelectedRow();
        int idV=Integer.parseInt(Tabla.getValueAt(row,0).toString());
        automovil.setIdVehiculo(idV);
        motocicleta.setIdVehiculo(idV);
        
        if(automovil.getIdVehiculo()<1 || motocicleta.getIdVehiculo()<1){
            JOptionPane.showMessageDialog(this,"Debe seleccionar el elemento a eliminar");
            return;
        }
        
        ControladorVehiculo cm= new ControladorVehiculo();
        boolean fueEliminado=cm.eliminar(idV);
        
        if(fueEliminado){
            JOptionPane.showMessageDialog(this, "La información fue eliminada");
            btnLimpiar.doClick();
            btnListarActionPerformed(null);
        }else
            JOptionPane.showMessageDialog(this,"Error al eliminar");
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        ControladorVehiculo cm = new ControladorVehiculo();
        ArrayList<Vehiculo> listado = cm.listarTodos();
    
        DefaultTableModel dtm = (DefaultTableModel) Tabla.getModel();
        Tabla.setPreferredScrollableViewportSize(Tabla.getPreferredSize());

        dtm.setRowCount(0);
        for (Vehiculo v : listado) {
            if (v instanceof Automovil) {
                Automovil automovil = (Automovil) v;
                dtm.addRow(new Object[]{automovil.getIdVehiculo(), automovil.getIdPersona(), automovil.getIdMarca(), automovil.getPatente(), automovil.getModelo(), automovil.getLitrosMaletero(), automovil.getCantidadPuerta(), "", ""});
            } else if (v instanceof Motocicleta) {
                Motocicleta motocicleta = (Motocicleta) v;
                dtm.addRow(new Object[]{motocicleta.getIdVehiculo(), motocicleta.getIdPersona(), motocicleta.getIdMarca(), motocicleta.getPatente(), motocicleta.getModelo(), "", "", motocicleta.getLargoManillar(), motocicleta.getEstilo()});
            } 
        }
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
       automovil=new Automovil(0,0,0,"","",0,0);
       motocicleta=new Motocicleta(0,0,0,"","",0,"");
       txtRut.setText("");
       txtDv.setText("");
       jcbMarca.setSelectedIndex(0);
       txtPatente.setText("");
       txtModelo.setText("");
       GrupoVehiculo.clearSelection();
       txtPregunta1.setText("");
       txtPregunta2.setText("");
       Pregunta1.setText("...");
       Pregunta2.setText("...");
       Tabla.clearSelection();
       txtRut.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        ControladorPersona cm=new ControladorPersona();
        int row=Tabla.getSelectedRow();
        int idVehiculo=Integer.parseInt(Tabla.getValueAt(row,0).toString());
        int idPersona=Integer.parseInt(Tabla.getValueAt(row,1).toString());
        Cliente c=new Cliente(0,0,"","","",0,false,false);
        c=cm.agregarRut(idPersona);
        int rut1=c.getRut();
        String dv=c.getDigito().trim();
        
        if(Tabla.getValueAt(row,7).equals("")){
            automovil=new Automovil(idVehiculo,idPersona,0,"","",0,0);
        }else{
            motocicleta=new Motocicleta(idVehiculo,idPersona,0,"","",0,"");
        }
        
        txtRut.setText(rut1+"");
        txtDv.setText(c.getDigito());

        txtModelo.setText(Tabla.getValueAt(row,4).toString());
        jcbMarca.setSelectedIndex((int)Tabla.getValueAt(row,2));
        txtPatente.setText(Tabla.getValueAt(row, 3).toString());
        
        if(Tabla.getValueAt(row,7).toString().equals("")){
            Pregunta1.setText("Litros Maletero");
            Pregunta2.setText("Cantidad Puertas");
            rbtAutomovil.setSelected(true);
            txtPregunta1.setText(Tabla.getValueAt(row,5).toString());
            txtPregunta2.setText(Tabla.getValueAt(row,6).toString());
        }else{
            Pregunta1.setText("Largo Manillar");
            Pregunta2.setText("Estilo");
            rbtMotocicleta.setSelected(true);
            txtPregunta1.setText(Tabla.getValueAt(row,7).toString());
            txtPregunta2.setText(Tabla.getValueAt(row,8).toString());
        }
    }//GEN-LAST:event_TablaMouseClicked

    private void txtPregunta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPregunta2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPregunta2ActionPerformed

    private void txtPregunta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPregunta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPregunta1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jcbMarca.setModel(new ControladorMarca().llenarCombo());
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
            java.util.logging.Logger.getLogger(FrmVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmVehiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoVehiculo;
    private javax.swing.JLabel Marca;
    private javax.swing.JLabel Modelo;
    private javax.swing.JLabel Patente;
    private javax.swing.JLabel Pregunta1;
    private javax.swing.JLabel Pregunta2;
    private javax.swing.JLabel Rut;
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnListar;
    private javax.swing.JLabel guion;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jcbMarca;
    private javax.swing.JRadioButton rbtAutomovil;
    private javax.swing.JRadioButton rbtMotocicleta;
    private javax.swing.JTextField txtDv;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPatente;
    private javax.swing.JTextField txtPregunta1;
    private javax.swing.JTextField txtPregunta2;
    private javax.swing.JTextField txtRut;
    // End of variables declaration//GEN-END:variables
}
