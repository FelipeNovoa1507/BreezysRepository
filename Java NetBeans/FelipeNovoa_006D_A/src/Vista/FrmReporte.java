package Vista;

import Modelo.Cliente;
import Modelo.Equipo;
import Venta.AlmacenamientoTemporal;
import Modelo.Venta;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmReporte extends javax.swing.JFrame {

    public FrmReporte() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        generarReporte = new javax.swing.JButton();
        cantidadventas = new javax.swing.JLabel();
        montototal = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        ntotalrecaudado = new javax.swing.JLabel();
        ncantidadventas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Rut", "Correo", "Telefono", "Modelo", "Precio", "Tipo"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        generarReporte.setText("Generar Reporte");
        generarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarReporteActionPerformed(evt);
            }
        });

        cantidadventas.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        cantidadventas.setText("Cantidad de ventas:");

        montototal.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        montototal.setText("Monto total recaudado:");

        Titulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Titulo.setText("Reporte");

        ntotalrecaudado.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N

        ncantidadventas.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(ntotalrecaudado, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(ncantidadventas, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(411, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(generarReporte)
                            .addGap(284, 284, 284))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(275, 275, 275)
                                    .addComponent(Titulo))
                                .addComponent(cantidadventas)
                                .addComponent(montototal))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 314, Short.MAX_VALUE)))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(369, Short.MAX_VALUE)
                .addComponent(ncantidadventas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ntotalrecaudado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(13, 13, 13)
                    .addComponent(Titulo)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(cantidadventas)
                    .addGap(25, 25, 25)
                    .addComponent(montototal)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(generarReporte)
                    .addGap(14, 14, 14)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarReporteActionPerformed
        try {
            DefaultTableModel model = (DefaultTableModel) tabla.getModel();
            model.setRowCount(0);
            int cantidadTotalVentas = 0;
            double montoTotalRecaudado = 0.0;
            for (Venta venta : AlmacenamientoTemporal.ventas) {
                Cliente cliente = venta.getCliente();
                Equipo equipo = venta.getEquipo();
                Object[] rowData = {cliente.getNombreCompleto(), cliente.getRut(), cliente.getCorreoElectronico(),
                    cliente.getTelefono(), equipo.getModelo(), equipo.getPrecio(), equipo.getClass().getSimpleName()};
                model.addRow(rowData);

                cantidadTotalVentas++;
                montoTotalRecaudado += equipo.getPrecio();
            }
            ncantidadventas.setText(Integer.toString(cantidadTotalVentas));
            ntotalrecaudado.setText(String.format("$%.2f", montoTotalRecaudado));

            JOptionPane.showMessageDialog(this, "Reporte generado exitosamente.", "Reporte Exitoso", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al generar el reporte. " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_generarReporteActionPerformed

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
            java.util.logging.Logger.getLogger(FrmReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmReporte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel cantidadventas;
    private javax.swing.JButton generarReporte;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel montototal;
    private javax.swing.JLabel ncantidadventas;
    private javax.swing.JLabel ntotalrecaudado;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
