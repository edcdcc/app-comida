/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comidas;

public class hamburguesas extends javax.swing.JFrame {

    /**
     * Creates new form hamburguesas
     */
    public hamburguesas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMenuHamburguesa = new javax.swing.JLabel();
        lblHamC = new javax.swing.JLabel();
        btnComprarHC = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblHamH = new javax.swing.JLabel();
        btnComprarHH = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblHamD = new javax.swing.JLabel();
        btnComprarHD = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        lblHamCP = new javax.swing.JLabel();
        btnComprarHCP = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMenuHamburguesa.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblMenuHamburguesa.setForeground(new java.awt.Color(255, 255, 255));
        lblMenuHamburguesa.setText("Menú Hamburguesas");
        getContentPane().add(lblMenuHamburguesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        lblHamC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblHamC.setForeground(new java.awt.Color(255, 255, 255));
        lblHamC.setText("- Hamburguesa Clásica $79");
        getContentPane().add(lblHamC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 59, -1, -1));

        btnComprarHC.setText("Comprar");
        btnComprarHC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarHCActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprarHC, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 58, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contiene carne de res, tomate, lechuga, queso amarillo, tocino.");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 87, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contiene carne de res, tomate, lechuga, queso amarillo, tocino, piña, cebolla.");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 148, -1, -1));

        lblHamH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblHamH.setForeground(new java.awt.Color(255, 255, 255));
        lblHamH.setText("- Hamburguesa Hawaina $89");
        getContentPane().add(lblHamH, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        btnComprarHH.setText("Comprar");
        btnComprarHH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarHHActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprarHH, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 119, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Contiene carne de res en doble porción, tocino, tomate, lechuga, queso amarillo.");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 209, -1, -1));

        lblHamD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblHamD.setForeground(new java.awt.Color(255, 255, 255));
        lblHamD.setText("- Hamburguesa Doble $119");
        getContentPane().add(lblHamD, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 181, -1, -1));

        btnComprarHD.setText("Comprar");
        btnComprarHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarHDActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprarHD, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 180, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Contiene carne de res, tomate, lechuga, queso amarillo, incluye papas a la francesa");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        lblHamCP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblHamCP.setForeground(new java.awt.Color(255, 255, 255));
        lblHamCP.setText("- Hamburguesa con papas $109");
        getContentPane().add(lblHamCP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 242, -1, -1));

        btnComprarHCP.setText("Comprar");
        btnComprarHCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarHCPActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprarHCP, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 241, -1, -1));

        btnRegresar.setText("Inicio");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 355, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/hamburguesas.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        ventanaprincipal.main(null);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnComprarHCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarHCActionPerformed
        // TODO add your handling code here:
        FormularioPedido.main(new String[]{"Hamburguesa Clásica", "79", "Hamburguesa"});
        this.dispose();
    }//GEN-LAST:event_btnComprarHCActionPerformed

    private void btnComprarHHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarHHActionPerformed
        // TODO add your handling code here:
        FormularioPedido.main(new String[]{"Hamburguesa Hawaina", "89", "Hamburguesa"});
        this.dispose();
    }//GEN-LAST:event_btnComprarHHActionPerformed

    private void btnComprarHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarHDActionPerformed
        // TODO add your handling code here:
        FormularioPedido.main(new String[]{"Hamburguesa Doble", "119", "Hamburguesa"});
        this.dispose();
    }//GEN-LAST:event_btnComprarHDActionPerformed

    private void btnComprarHCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarHCPActionPerformed
        // TODO add your handling code here:
        FormularioPedido.main(new String[]{"Hamburguesa con papas", "109", "Hamburguesa"});
        this.dispose();
    }//GEN-LAST:event_btnComprarHCPActionPerformed

    
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
            java.util.logging.Logger.getLogger(hamburguesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hamburguesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hamburguesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hamburguesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hamburguesas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprarHC;
    private javax.swing.JButton btnComprarHCP;
    private javax.swing.JButton btnComprarHD;
    private javax.swing.JButton btnComprarHH;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblHamC;
    private javax.swing.JLabel lblHamCP;
    private javax.swing.JLabel lblHamD;
    private javax.swing.JLabel lblHamH;
    private javax.swing.JLabel lblMenuHamburguesa;
    // End of variables declaration//GEN-END:variables
}