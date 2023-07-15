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
        jButtonFinanceiro = new javax.swing.JButton();
        jButtonColaboradores = new javax.swing.JButton();
        jButtonProdutos = new javax.swing.JButton();
        jButtonEstoque = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonlClientes = new javax.swing.JButton();
        jLabelMenuPrincipalFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelPedidos.setIcon(new javax.swing.ImageIcon("D:\\Develop\\Java\\TECNOBEM\\SistemaTecnoBem\\src\\main\\java\\View\\imagens\\icons\\pedido_icon.png")); // NOI18N
        getContentPane().add(jLabelPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, -1, 70));

        jButtonPedidos.setBackground(new java.awt.Color(51, 153, 255));
        jButtonPedidos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonPedidos.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPedidos.setText("Pedidos");
        jButtonPedidos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonPedidos.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButtonPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPedidosActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 140, 100));

        jButtonFinanceiro.setBackground(new java.awt.Color(51, 153, 255));
        jButtonFinanceiro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonFinanceiro.setForeground(new java.awt.Color(255, 255, 255));
        jButtonFinanceiro.setText("Financeiro");
        jButtonFinanceiro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonFinanceiro.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButtonFinanceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinanceiroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonFinanceiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, 140, 100));

        jButtonColaboradores.setBackground(new java.awt.Color(51, 153, 255));
        jButtonColaboradores.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonColaboradores.setForeground(new java.awt.Color(255, 255, 255));
        jButtonColaboradores.setText("Colaboradores");
        jButtonColaboradores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonColaboradores.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButtonColaboradores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonColaboradoresActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonColaboradores, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 220, 170, 100));

        jButtonProdutos.setBackground(new java.awt.Color(51, 153, 255));
        jButtonProdutos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonProdutos.setForeground(new java.awt.Color(255, 255, 255));
        jButtonProdutos.setText("Produtos");
        jButtonProdutos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonProdutos.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButtonProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProdutosActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 140, 100));

        jButtonEstoque.setBackground(new java.awt.Color(51, 153, 255));
        jButtonEstoque.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonEstoque.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEstoque.setText("Estoque");
        jButtonEstoque.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonEstoque.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButtonEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEstoqueActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 220, 140, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Develop\\Java\\TECNOBEM\\SistemaTecnoBem\\src\\main\\java\\View\\imagens\\icons\\cliente_icon.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 90, 70));

        jButtonlClientes.setBackground(new java.awt.Color(51, 153, 255));
        jButtonlClientes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonlClientes.setForeground(new java.awt.Color(255, 255, 255));
        jButtonlClientes.setText("Clientes");
        jButtonlClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonlClientes.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButtonlClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonlClientesActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonlClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 140, 100));

        jLabelMenuPrincipalFundo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelMenuPrincipalFundo.setIcon(new javax.swing.ImageIcon("D:\\Develop\\Java\\TECNOBEM\\SistemaTecnoBem\\src\\main\\java\\View\\imagens\\fundo-MenuPrincipal.jpg")); // NOI18N
        getContentPane().add(jLabelMenuPrincipalFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-330, -230, 1620, 1000));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonlClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonlClientesActionPerformed
        try {
            menuPrincipalController.navegarParaCadastroClientes();
        } catch (IOException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonlClientesActionPerformed

    private void jButtonPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPedidosActionPerformed
        try {
            menuPrincipalController.navegarParaPedidos();
        } catch (IOException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonPedidosActionPerformed

    private void jButtonFinanceiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinanceiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonFinanceiroActionPerformed

    private void jButtonColaboradoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonColaboradoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonColaboradoresActionPerformed

    private void jButtonProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProdutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonProdutosActionPerformed

    private void jButtonEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEstoqueActionPerformed

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
    private javax.swing.JButton jButtonColaboradores;
    private javax.swing.JButton jButtonEstoque;
    private javax.swing.JButton jButtonFinanceiro;
    private javax.swing.JButton jButtonPedidos;
    private javax.swing.JButton jButtonProdutos;
    private javax.swing.JButton jButtonlClientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelMenuPrincipalFundo;
    private javax.swing.JLabel jLabelPedidos;
    // End of variables declaration//GEN-END:variables
}