package Vista;


public class FrmMenu extends javax.swing.JFrame {

    public FrmMenu() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Vehiculos = new javax.swing.JMenuItem();
        Personas = new javax.swing.JMenuItem();
        Comuna = new javax.swing.JMenuItem();
        Cargo = new javax.swing.JMenuItem();
        Especialidad = new javax.swing.JMenuItem();
        Marca = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Principal Taller Mechanix");

        jMenu1.setText("Administración");

        Vehiculos.setText("Vehiculos");
        Vehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VehiculosActionPerformed(evt);
            }
        });
        jMenu1.add(Vehiculos);

        Personas.setText("Personas");
        Personas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PersonasActionPerformed(evt);
            }
        });
        jMenu1.add(Personas);

        Comuna.setText("Comuna");
        Comuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComunaActionPerformed(evt);
            }
        });
        jMenu1.add(Comuna);

        Cargo.setText("Cargo");
        Cargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargoActionPerformed(evt);
            }
        });
        jMenu1.add(Cargo);

        Especialidad.setText("Especialidad");
        Especialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EspecialidadActionPerformed(evt);
            }
        });
        jMenu1.add(Especialidad);

        Marca.setText("Marca");
        Marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarcaActionPerformed(evt);
            }
        });
        jMenu1.add(Marca);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Salir");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 662, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 386, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void VehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VehiculosActionPerformed
        // TODO add your handling code here:
        FrmVehiculo frm = new FrmVehiculo();
        frm.setLocationRelativeTo(null); // Centrar en la pantalla
        frm.setVisible(true);
       
    }//GEN-LAST:event_VehiculosActionPerformed

    private void PersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PersonasActionPerformed
        // TODO add your handling code here:
        new FrmPersona().setVisible(true);
    }//GEN-LAST:event_PersonasActionPerformed

    private void ComunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComunaActionPerformed
        // TODO add your handling code here:
        FrmComuna frm = new FrmComuna();
        frm.setLocationRelativeTo(null); // Centrar en la pantalla
        frm.setVisible(true);
    }//GEN-LAST:event_ComunaActionPerformed

    private void MarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarcaActionPerformed
        // TODO add your handling code here:
        FrmMarca frm = new FrmMarca();
        frm.setLocationRelativeTo(null); // Centrar en la pantalla
        frm.setVisible(true);
    }//GEN-LAST:event_MarcaActionPerformed

    private void EspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EspecialidadActionPerformed
        // TODO add your handling code here:
        FrmEspecialidad frm = new FrmEspecialidad();
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
    }//GEN-LAST:event_EspecialidadActionPerformed

    private void CargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargoActionPerformed
        FrmCargo frm = new FrmCargo();
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
    }//GEN-LAST:event_CargoActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenu2MouseClicked

    
    
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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Cargo;
    private javax.swing.JMenuItem Comuna;
    private javax.swing.JMenuItem Especialidad;
    private javax.swing.JMenuItem Marca;
    private javax.swing.JMenuItem Personas;
    private javax.swing.JMenuItem Vehiculos;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
