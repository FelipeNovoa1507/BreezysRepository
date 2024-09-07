package Vista;

import Modelo.Cliente;
import Modelo.Equipo;
import Venta.AlmacenamientoTemporal;
import Controlador.ControladorVenta;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class FrmVenta extends javax.swing.JFrame {


    public FrmVenta() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listaequipos = new javax.swing.JLabel();
        jcbEquipo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRut = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDv = new javax.swing.JTextPane();
        btnGuardar = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        Rut = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listaequipos.setText("Lista de Equipos");

        jcbEquipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jScrollPane1.setViewportView(txtRut);

        jScrollPane2.setViewportView(txtDv);

        btnGuardar.setText("Registrar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        Titulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Titulo.setText("Ventas");

        Rut.setText("Rut (sin puntos ni guion)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(listaequipos, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Rut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(btnGuardar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(Titulo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Rut))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listaequipos))
                .addGap(18, 18, 18)
                .addComponent(btnGuardar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            String rutCliente = txtRut.getText().trim() + "-" + txtDv.getText().trim();
            String modeloEquipo = jcbEquipo.getSelectedItem().toString();

            if (rutCliente.trim().isEmpty()) {
                throw new Exception("El Rut del cliente no puede estar vacío.");
            }

            if (!rutCliente.matches("\\d{8}-[\\dA-Za-z]")) {
                throw new Exception("Formato de Rut inválido. Debe tener 8 dígitos seguido de un guion y un dígito o letra.");
            }

            System.out.println("Rut del Cliente: " + rutCliente);
            System.out.println("Lista de Clientes: " + AlmacenamientoTemporal.clientes);

            if (AlmacenamientoTemporal.equipos.isEmpty()) {
                throw new Exception("No hay equipos registrados. Registre al menos un equipo antes de realizar una venta.");
            }

            Cliente clienteEncontrado = buscarCliente(rutCliente);
            if (clienteEncontrado == null) {
                throw new Exception("Cliente no encontrado. Registre al cliente antes de realizar una venta.");
            }

            ControladorVenta.realizarVenta(rutCliente, modeloEquipo);

            txtRut.setText("");
            txtDv.setText("");

            JOptionPane.showMessageDialog(this, "Venta registrada exitosamente.", "Registro Exitoso", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al registrar la venta. " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cargarEquiposEnComboBox() {
        
    String[] modelosEquipos = obtenerModelosEquipos();
    jcbEquipo.setModel(new javax.swing.DefaultComboBoxModel<>(modelosEquipos));
    }

    private String[] obtenerModelosEquipos() {
    List<String> modelos = new ArrayList<>();
    for (Equipo equipo : AlmacenamientoTemporal.equipos) {
        modelos.add(equipo.getModelo());
    }
    
    return modelos.toArray(new String[0]);
    }
    private static Cliente buscarCliente(String rutCliente) {
    try {
        String rutClienteSinEspacios = rutCliente.replaceAll("\\s", "").toLowerCase();

        for (Cliente cliente : AlmacenamientoTemporal.clientes) {
            String rutClienteActual = cliente.getRut().replaceAll("\\s", "").toLowerCase();

            if (rutClienteActual.equals(rutClienteSinEspacios)) {
                return cliente;
            }
        }
        return null;
    } catch (Exception e) {
        throw new RuntimeException("Error al buscar cliente. " + e.getMessage());
    }
    }    
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
            java.util.logging.Logger.getLogger(FrmVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Rut;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jcbEquipo;
    private javax.swing.JLabel listaequipos;
    private javax.swing.JTextPane txtDv;
    private javax.swing.JTextPane txtRut;
    // End of variables declaration//GEN-END:variables
}
