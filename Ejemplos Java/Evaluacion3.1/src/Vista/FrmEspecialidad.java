package Vista;

import Modelo.Especialidad;
import Controlador.ControladorEspecialidad;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FrmEspecialidad extends javax.swing.JFrame {

    private Especialidad especialidad = new Especialidad(); 
    public FrmEspecialidad() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtEspecialidad = new javax.swing.JTextField();
        chkHabilitado = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Especialidad");
        jLabel1.setToolTipText("");

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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nombre Especialidad");

        txtEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEspecialidadActionPerformed(evt);
            }
        });

        chkHabilitado.setText("Habilitado");
        chkHabilitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkHabilitadoActionPerformed(evt);
            }
        });

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdEspecialidad", "Nombre", "Habilitado"
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                .addComponent(btnListar)
                                .addGap(6, 6, 6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEspecialidad))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chkHabilitado)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkHabilitado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnListar)
                    .addComponent(btnLimpiar)
                    .addComponent(btnGuardar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {   
        String nombre = txtEspecialidad.getText().trim();
        if (nombre.length() < 1 || nombre.length() > 50) {
            JOptionPane.showMessageDialog(this, "Nombre fuera de rango");
            txtEspecialidad.requestFocus();
        }else{
            especialidad.setNombre(nombre);
            especialidad.setHabilitado(chkHabilitado.isSelected());
            ControladorEspecialidad cm = new ControladorEspecialidad();
            boolean resultado=false;

            if(especialidad.getIdEspecialidad()>0)
                resultado=cm.actualizar(especialidad);
            else
                resultado=cm.agregar(especialidad);

            if(resultado){
                JOptionPane.showMessageDialog(this, "Datos Guardados");
                btnLimpiar.doClick();
                btnListar.doClick();
            }else{
                JOptionPane.showMessageDialog(this, "Error en la ejecución");
            }
        }
    }

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {
        if(especialidad.getIdEspecialidad()<1){
            JOptionPane.showMessageDialog(this,"Debe seleccionar el elemento a eliminar");
            return;
        }

        ControladorEspecialidad cm= new ControladorEspecialidad();
        boolean fueEliminado=cm.eliminar(especialidad.getIdEspecialidad());

        if(fueEliminado){
            JOptionPane.showMessageDialog(this, "La información fue eliminada");
            btnLimpiar.doClick();
            btnListarActionPerformed(null);
        }else{
            JOptionPane.showMessageDialog(this,"Error al eliminar");
        }
    }

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        ControladorEspecialidad cm= new ControladorEspecialidad();
        ArrayList<Especialidad> listado=cm.listarTodos();

        DefaultTableModel dtm=(DefaultTableModel)Tabla.getModel();
        Tabla.setPreferredScrollableViewportSize(Tabla.getPreferredSize());

        dtm.setRowCount(0);

        for(Especialidad e : listado){
            dtm.addRow(new Object[]{e.getIdEspecialidad(),e.getNombre(),e.isHabilitado()});
        }
    }

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        txtEspecialidad.setText("");
        chkHabilitado.setSelected(false);
        especialidad.setIdEspecialidad(0);
        Tabla.clearSelection();
        txtEspecialidad.requestFocus();
    }

    private void txtEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }

    private void chkHabilitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkHabilitadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkHabilitadoActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        int row=Tabla.getSelectedRow();
        
        int id=0;
        
        id=Integer.parseInt(Tabla.getValueAt(row,0).toString());
        
        especialidad.setIdEspecialidad(id);
        
        txtEspecialidad.setText(Tabla.getValueAt(row,1).toString());
        chkHabilitado.setSelected(Tabla.getValueAt(row, 2).toString().equals("true"));
        
    }//GEN-LAST:event_TablaMouseClicked


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
            java.util.logging.Logger.getLogger(FrmEspecialidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEspecialidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEspecialidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEspecialidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEspecialidad().setVisible(true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtEspecialidad;
    // End of variables declaration//GEN-END:variables
}
