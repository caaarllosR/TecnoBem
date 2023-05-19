/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

//import Controller.LoginController;
import Controller.MenuPrincipalController;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tiago
 */
public class MenuPrincipal extends javax.swing.JFrame {

    private final MenuPrincipalController menuPrincipalController;
    //private final LoginController loginController;

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() throws IOException {
        initComponents();
        menuPrincipalController = new MenuPrincipalController(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelPedidos = new javax.swing.JLabel();
        jButtonPedidos = new javax.swing.JButton();
        jButtonPedidos1 = new javax.swing.JButton();
        jButtonPedidos2 = new javax.swing.JButton();
        jButtonPedidos3 = new javax.swing.JButton();
        jButtonPedidos4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonClientes = new javax.swing.JButton();
        jLabelClientes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icons/pedido_icon.png"))); // NOI18N
        getContentPane().add(jLabelPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, 70));

        jButtonPedidos.setBackground(new java.awt.Color(51, 153, 255));
        jButtonPedidos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonPedidos.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPedidos.setText("Produtos");
        jButtonPedidos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonPedidos.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButtonPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPedidosActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 140, 100));

        jButtonPedidos1.setBackground(new java.awt.Color(51, 153, 255));
        jButtonPedidos1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonPedidos1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPedidos1.setText("Financeiro");
        jButtonPedidos1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonPedidos1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButtonPedidos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPedidos1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPedidos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, 140, 100));

        jButtonPedidos2.setBackground(new java.awt.Color(51, 153, 255));
        jButtonPedidos2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonPedidos2.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPedidos2.setText("Colaboradores");
        jButtonPedidos2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonPedidos2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButtonPedidos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPedidos2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPedidos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 220, 170, 100));

        jButtonPedidos3.setBackground(new java.awt.Color(51, 153, 255));
        jButtonPedidos3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonPedidos3.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPedidos3.setText("Pedidos");
        jButtonPedidos3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonPedidos3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButtonPedidos3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPedidos3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPedidos3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 140, 100));

        jButtonPedidos4.setBackground(new java.awt.Color(51, 153, 255));
        jButtonPedidos4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonPedidos4.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPedidos4.setText("Estoque");
        jButtonPedidos4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonPedidos4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButtonPedidos4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPedidos4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPedidos4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 220, 140, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icons/cliente_icon.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 90, 70));

        jButtonClientes.setBackground(new java.awt.Color(51, 153, 255));
        jButtonClientes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonClientes.setForeground(new java.awt.Color(255, 255, 255));
        jButtonClientes.setText("Clientes");
        jButtonClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonClientes.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButtonClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClientesActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 140, 100));

        jLabelClientes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/fundo-MenuPrincipal.jpg"))); // NOI18N
        getContentPane().add(jLabelClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(-360, -250, 1620, 1000));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClientesActionPerformed
        try {
            menuPrincipalController.navegarParaCadastroClientes();
        } catch (IOException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonClientesActionPerformed

    private void jButtonPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPedidosActionPerformed
        try {
            menuPrincipalController.navegarParaPedidos();
        } catch (IOException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonPedidosActionPerformed

    private void jButtonPedidos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPedidos1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPedidos1ActionPerformed

    private void jButtonPedidos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPedidos2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPedidos2ActionPerformed

    private void jButtonPedidos3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPedidos3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPedidos3ActionPerformed

    private void jButtonPedidos4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPedidos4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPedidos4ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MenuPrincipal().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClientes;
    private javax.swing.JButton jButtonPedidos;
    private javax.swing.JButton jButtonPedidos1;
    private javax.swing.JButton jButtonPedidos2;
    private javax.swing.JButton jButtonPedidos3;
    private javax.swing.JButton jButtonPedidos4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelClientes;
    private javax.swing.JLabel jLabelPedidos;
    // End of variables declaration//GEN-END:variables
}
