package Vista;

import Controlador.ControladorEquipo;
import Modelo.Desktop;
import Modelo.Laptop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class FrmEquipo extends javax.swing.JFrame {

    
    public FrmEquipo() {
        initComponents();
        setupRadioButtons();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grupo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCPU = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTamDiscoDuro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTamRam = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        rbtLaptop = new javax.swing.JRadioButton();
        rbtDesktop = new javax.swing.JRadioButton();
        Pregunta1 = new javax.swing.JLabel();
        Pregunta2 = new javax.swing.JLabel();
        txtPregunta1 = new javax.swing.JTextField();
        txtPregunta2 = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextPane();
        jLabel9 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setText("Equipo");

        jLabel2.setText("Descripcion");

        jLabel3.setText("CPU");

        txtCPU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPUActionPerformed(evt);
            }
        });

        jLabel4.setText("Disco Duro");

        txtTamDiscoDuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTamDiscoDuroActionPerformed(evt);
            }
        });

        jLabel5.setText("Mb");

        jLabel6.setText("Tamaño Ram");

        txtTamRam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTamRamActionPerformed(evt);
            }
        });

        jLabel7.setText("Gb");

        jLabel8.setText("Precio   $");

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });

        Grupo.add(rbtLaptop);
        rbtLaptop.setText("Laptop");
        rbtLaptop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtLaptopActionPerformed(evt);
            }
        });

        Grupo.add(rbtDesktop);
        rbtDesktop.setText("Desktop");
        rbtDesktop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtDesktopActionPerformed(evt);
            }
        });

        Pregunta1.setText("...");

        Pregunta2.setText("...");

        txtPregunta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPregunta1ActionPerformed(evt);
            }
        });

        txtPregunta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPregunta2ActionPerformed(evt);
            }
        });

        btnGuardar.setText("Registrar Equipo");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(txtDescripcion);

        jLabel9.setText("Modelo");

        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbtLaptop)
                        .addGap(29, 29, 29)
                        .addComponent(rbtDesktop)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Pregunta1, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Pregunta2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtPregunta2, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                                            .addComponent(txtPregunta1)))
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtTamDiscoDuro, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel3)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtCPU, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel6)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtTamRam, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel7)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtModelo)))
                                .addGap(7, 7, 7))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtLaptop)
                    .addComponent(rbtDesktop))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCPU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTamRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTamDiscoDuro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pregunta2)
                    .addComponent(txtPregunta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pregunta1)
                    .addComponent(txtPregunta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setupRadioButtons(){
        rbtLaptop.addActionListener((java.awt.event.ActionListener) new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                rbtLaptopActionPerformed(evt);
            }
        });
        rbtDesktop.addActionListener((java.awt.event.ActionListener) new ActionListener (){
            public void actionPerformed(ActionEvent evt){
                rbtDesktopActionPerformed(evt);
            }
        });
    }
    
    private void txtCPUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPUActionPerformed

    private void txtTamDiscoDuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTamDiscoDuroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTamDiscoDuroActionPerformed

    private void txtTamRamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTamRamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTamRamActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void rbtLaptopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtLaptopActionPerformed
        Pregunta1.setText("Tam. Pantalla(Plg)");
        Pregunta2.setText("Puertos Usb");
    }//GEN-LAST:event_rbtLaptopActionPerformed

    private void txtPregunta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPregunta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPregunta1ActionPerformed

    private void txtPregunta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPregunta2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPregunta2ActionPerformed

    private void rbtDesktopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtDesktopActionPerformed
        Pregunta1.setText("Pot. Fuente(W)");
        Pregunta2.setText("Tipo Case");
    }//GEN-LAST:event_rbtDesktopActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try{
            ControladorEquipo cm = new ControladorEquipo();
            Laptop laptop=null;
            Desktop desktop=null;
            if(rbtLaptop.isSelected()){
                laptop=new Laptop(0,0,0,"","",0,0,0,1,"");
            }else if(rbtDesktop.isSelected()){
                desktop=new Desktop(0,"",0,"","",0,0,0,2,"");
            }
            
            String descripcion=txtDescripcion.getText();
            if(descripcion.length()<1 || descripcion.length()>200 ||descripcion.equals("")){
                JOptionPane.showMessageDialog(this, "Descripcion fuera de rango");
                txtDescripcion.requestFocus();
                return;
            }else{
                if(laptop != null){
                    laptop.setDescripcion(descripcion);
                }else if(desktop != null){
                    desktop.setDescripcion(descripcion);
                }
            }
            
            String cpu=txtCPU.getText();
            if(cpu.length() < 1 || cpu.length()>20 ||cpu.equals("")){
                JOptionPane.showMessageDialog(this, "CPU fuera de rango");
                txtCPU.requestFocus();
                return;
            }else{
                if(laptop != null){
                    laptop.setCpu(cpu);
                }else if(desktop != null){
                    desktop.setCpu(cpu);
                }
            }
            
            try{
                int mbdc=Integer.parseInt(txtTamDiscoDuro.getText().trim());
                if(Integer.parseInt(txtTamDiscoDuro.getText())>0){
                    if(laptop != null){
                        laptop.setMbdiscoduro(mbdc);
                    }else if(desktop != null){
                        desktop.setMbdiscoduro(mbdc);
                    }
                }
            }catch(Exception e){
                    JOptionPane.showMessageDialog(this,"Ingrese solo números en el campo MB Disco Duro");
                    txtTamDiscoDuro.requestFocus();
                    return;
            }
            
            
            try{
                int gbram=Integer.parseInt(txtTamRam.getText().trim());
                if(Integer.parseInt(txtTamRam.getText())>0){
                    if(laptop != null){
                        laptop.setGbram(gbram);
                    }else if(desktop != null){
                        desktop.setGbram(gbram);              
                    }
                }
               
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,"Ingrese solo números en el campo Tam. Ram");
                txtTamRam.requestFocus();
                return;
            }
            
            try{
                int precio=Integer.parseInt(txtPrecio.getText().trim());
                if(Integer.parseInt(txtPrecio.getText())>0){
                    if(laptop != null){
                        laptop.setPrecio(precio);
                    }else if(desktop != null){
                        desktop.setPrecio(precio);              
                    }
                }               
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,"Ingrese solo números en el campo Precio");
                txtPrecio.requestFocus();
                return;
            }
            
            String modelo=txtModelo.getText();
            if(modelo.length()<1 || modelo.length()>30){
                JOptionPane.showMessageDialog(this,"Modelo fuera de rango");
                txtModelo.requestFocus();
                return;
            }else{
                if(laptop != null){
                        laptop.setModelo(modelo);
                    }else if(desktop != null){
                        desktop.setModelo(modelo);              
                    }
            }
            
            
            if(laptop != null){
                try{
                    int tamp=Integer.parseInt(txtPregunta1.getText().trim());
                    if(Integer.parseInt(txtPregunta1.getText())>0){
                        laptop.setTampantalla(tamp);
                    }            
                }catch(Exception e){
                    JOptionPane.showMessageDialog(this,"Ingrese solo números en el campo Tamaño Pantalla");
                    txtPregunta1.requestFocus();
                    return;
                }
                
                try{
                    int pusb=Integer.parseInt(txtPregunta2.getText().trim());
                    if(Integer.parseInt(txtPregunta2.getText())>0){
                        laptop.setPuertosusb(pusb);
                    }
               
                }catch(Exception e){
                    JOptionPane.showMessageDialog(this,"Ingrese solo números en el campo Puertos USB");
                    txtPregunta2.requestFocus();
                    return;
                }
                    
            }else if(desktop != null){
                try{
                    int potf=Integer.parseInt(txtPregunta1.getText().trim());
                    if(Integer.parseInt(txtPregunta1.getText())>0){
                        desktop.setPotfuente(potf);
                    }
                }catch(Exception e){
                    JOptionPane.showMessageDialog(this,"Ingrese solo números en el campo Potencia Fuente");
                    txtPregunta1.requestFocus();
                    return;
                }
                
                String form=txtPregunta2.getText().trim().toUpperCase();
                if(form.equals("EATX") || form.equals("ATX") || form.equals("MICROATX")){
                    desktop.setFormcase(form);
                }else{
                    JOptionPane.showMessageDialog(this,"Forma de caja fuera de rango(EATX, ATX, MICROATX)");
                    txtPregunta2.requestFocus();
                    return;
                }
            }
            boolean resultado=false;
            
            if(rbtLaptop.isSelected()){
                resultado=cm.agregarLaptop(laptop);
            }else if(rbtDesktop.isSelected()){
                resultado=cm.agregarDesktop(desktop);
            }
            
            if(resultado){
                JOptionPane.showMessageDialog(this, "Datos Guardados");
                txtCPU.setText("");
                txtDescripcion.setText("");
                txtPrecio.setText("");
                txtPregunta1.setText("");
                txtPregunta2.setText("");
                txtTamDiscoDuro.setText("");
                txtTamRam.setText("");
                Grupo.clearSelection();
            }else{
                JOptionPane.showMessageDialog(this, "Error en la ejecución");
                return;
            }
            
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }    
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloActionPerformed

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
            java.util.logging.Logger.getLogger(FrmEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEquipo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Grupo;
    private javax.swing.JLabel Pregunta1;
    private javax.swing.JLabel Pregunta2;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbtDesktop;
    private javax.swing.JRadioButton rbtLaptop;
    private javax.swing.JTextField txtCPU;
    private javax.swing.JTextPane txtDescripcion;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPregunta1;
    private javax.swing.JTextField txtPregunta2;
    private javax.swing.JTextField txtTamDiscoDuro;
    private javax.swing.JTextField txtTamRam;
    // End of variables declaration//GEN-END:variables
}
