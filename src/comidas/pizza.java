/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comidas;


public class pizza extends javax.swing.JFrame {

    /**
     * Creates new form pizza
     */
    public pizza() {
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

        btnRegresar = new javax.swing.JButton();
        lblMenuHamburguesa = new javax.swing.JLabel();
        lblHamC = new javax.swing.JLabel();
        btnPzPeperoni = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblHamC1 = new javax.swing.JLabel();
        btnPzHawaina = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblHamC2 = new javax.swing.JLabel();
        btnPzCarnes = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lblHamC3 = new javax.swing.JLabel();
        btnPzMex = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblHamC4 = new javax.swing.JLabel();
        btnPzQuesos = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lblHamC5 = new javax.swing.JLabel();
        btnPzVege = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnRegresar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        btnRegresar.setText("Inicio");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMenuHamburguesa.setBackground(new java.awt.Color(102, 51, 255));
        lblMenuHamburguesa.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblMenuHamburguesa.setForeground(new java.awt.Color(255, 255, 255));
        lblMenuHamburguesa.setText("Menú Pizzas");
        getContentPane().add(lblMenuHamburguesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        lblHamC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblHamC.setForeground(new java.awt.Color(255, 255, 255));
        lblHamC.setText("- Pizza Pepperoni $99");
        getContentPane().add(lblHamC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 59, -1, -1));

        btnPzPeperoni.setText("Comprar");
        btnPzPeperoni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPzPeperoniActionPerformed(evt);
            }
        });
        getContentPane().add(btnPzPeperoni, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 58, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Elaborada con masa tradicional, salsa de tomate, queso mozzarella, pepperoni");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 87, 477, -1));

        lblHamC1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblHamC1.setForeground(new java.awt.Color(255, 255, 255));
        lblHamC1.setText("- Pizza Hawaina $149");
        getContentPane().add(lblHamC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        btnPzHawaina.setText("Comprar");
        btnPzHawaina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPzHawainaActionPerformed(evt);
            }
        });
        getContentPane().add(btnPzHawaina, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 119, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Elaborada con masa tradicional, salsa de tomate, queso mozarrella, jamón, piña");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 148, 393, -1));

        lblHamC2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblHamC2.setForeground(new java.awt.Color(255, 255, 255));
        lblHamC2.setText("- Pizza de Carnes $179");
        getContentPane().add(lblHamC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 181, -1, -1));

        btnPzCarnes.setText("Comprar");
        btnPzCarnes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPzCarnesActionPerformed(evt);
            }
        });
        getContentPane().add(btnPzCarnes, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Elaborada con masa tradicional, salsa de tomate, queso mozarrella, jamón, salchicha, chorizo, pepperoni");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 209, 514, -1));

        lblHamC3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblHamC3.setForeground(new java.awt.Color(255, 255, 255));
        lblHamC3.setText("- Pizza Mexicana $169");
        getContentPane().add(lblHamC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 242, -1, -1));

        btnPzMex.setText("Comprar");
        btnPzMex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPzMexActionPerformed(evt);
            }
        });
        getContentPane().add(btnPzMex, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 241, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Elaborada con masa tradicional, salsa de tomate, queso mozarrella, chorizo, jalapeño, champlñones");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        lblHamC4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblHamC4.setForeground(new java.awt.Color(255, 255, 255));
        lblHamC4.setText("- Pizza de Quesos $159");
        getContentPane().add(lblHamC4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 303, -1, -1));

        btnPzQuesos.setText("Comprar");
        btnPzQuesos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPzQuesosActionPerformed(evt);
            }
        });
        getContentPane().add(btnPzQuesos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 302, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Elaborada con masa tradicional, salsa de tomate, queso mozarrella, parmesano, gorgonzola");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 331, 477, -1));

        lblHamC5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblHamC5.setForeground(new java.awt.Color(255, 255, 255));
        lblHamC5.setText("- Pizza Vegetariana $139");
        getContentPane().add(lblHamC5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 364, -1, -1));

        btnPzVege.setText("Comprar");
        btnPzVege.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPzVegeActionPerformed(evt);
            }
        });
        getContentPane().add(btnPzVege, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 363, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Elaborada con masa tradicional, salsa de tomate, champiñones, pimientos, albahaca");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 392, 477, -1));

        btnRegresar1.setText("Inicio");
        btnRegresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 438, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pizzaswp.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPzPeperoniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPzPeperoniActionPerformed
        // TODO add your handling code here:
        FormularioPedido.main(new String[]{"Pizza Pepperoni", "99", "Pizza"});
        this.dispose();
    }//GEN-LAST:event_btnPzPeperoniActionPerformed

    private void btnPzHawainaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPzHawainaActionPerformed
        // TODO add your handling code here:
        FormularioPedido.main(new String[]{"Pizza Hawaina", "149", "Pizza"});
        this.dispose();
    }//GEN-LAST:event_btnPzHawainaActionPerformed

    private void btnPzCarnesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPzCarnesActionPerformed
        // TODO add your handling code here:
        FormularioPedido.main(new String[]{"Pizza de Carnes", "179", "Pizza"});
        this.dispose();
    }//GEN-LAST:event_btnPzCarnesActionPerformed

    private void btnPzMexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPzMexActionPerformed
        // TODO add your handling code here:
        FormularioPedido.main(new String[]{"Pizza Mexicana", "169", "Pizza"});
        this.dispose();
    }//GEN-LAST:event_btnPzMexActionPerformed

    private void btnPzQuesosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPzQuesosActionPerformed
        // TODO add your handling code here:
        FormularioPedido.main(new String[]{"Pizza de Quesos", "159", "Pizza"});
        this.dispose();
    }//GEN-LAST:event_btnPzQuesosActionPerformed

    private void btnPzVegeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPzVegeActionPerformed
        // TODO add your handling code here:
        FormularioPedido.main(new String[]{"Pizza Vegetariana", "139", "Pizza"});
        this.dispose();
    }//GEN-LAST:event_btnPzVegeActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        ventanaprincipal.main(null);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnRegresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresar1ActionPerformed
        // TODO add your handling code here:
        ventanaprincipal.main(null);
        this.dispose();
    }//GEN-LAST:event_btnRegresar1ActionPerformed

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
            java.util.logging.Logger.getLogger(pizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pizza().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPzCarnes;
    private javax.swing.JButton btnPzHawaina;
    private javax.swing.JButton btnPzMex;
    private javax.swing.JButton btnPzPeperoni;
    private javax.swing.JButton btnPzQuesos;
    private javax.swing.JButton btnPzVege;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnRegresar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblHamC;
    private javax.swing.JLabel lblHamC1;
    private javax.swing.JLabel lblHamC2;
    private javax.swing.JLabel lblHamC3;
    private javax.swing.JLabel lblHamC4;
    private javax.swing.JLabel lblHamC5;
    private javax.swing.JLabel lblMenuHamburguesa;
    // End of variables declaration//GEN-END:variables
}
