/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ClienteController;
import Controller.PedidoController;
import Model.DAO.Banco;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author tiago
 */
public class CadastroCliente extends javax.swing.JFrame {

    private final ClienteController clienteController;

    /**
     * Creates new form Agenda
     */
    public CadastroCliente() throws IOException {
        initComponents();
        clienteController = new ClienteController(this);
        Banco.carregaClientes();
        iniciar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelAgenda = new javax.swing.JLabel();
        LabelCliente = new javax.swing.JLabel();
        LabelCpfCnpj = new javax.swing.JLabel();
        Label = new javax.swing.JLabel();
        LabelCEP = new javax.swing.JLabel();
        LabelTelefone1 = new javax.swing.JLabel();
        LabelTelefone2 = new javax.swing.JLabel();
        LabelObservacao = new javax.swing.JLabel();
        LabelLimite = new javax.swing.JLabel();
        TextLimite = new javax.swing.JTextField();
        TextCliente = new javax.swing.JTextField();
        LabelVencimento = new javax.swing.JLabel();
        JScrollPane2 = new javax.swing.JScrollPane();
        TextObservacao = new javax.swing.JTextArea();
        ButtonCadastrarCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableClientes = new javax.swing.JTable();
        TextEmail = new javax.swing.JTextField();
        TextCpfCnpj = new javax.swing.JTextField();
        TextEndereco = new javax.swing.JTextField();
        TextCEP = new javax.swing.JTextField();
        TextTelefone1 = new javax.swing.JTextField();
        TextTelefone2 = new javax.swing.JTextField();
        jComboVencimento = new javax.swing.JComboBox<>();
        LabelEmail = new javax.swing.JLabel();
        LabelClientePainelFundo = new javax.swing.JLabel();
        LabelCadastroClienteFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1150, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelAgenda.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        LabelAgenda.setForeground(new java.awt.Color(255, 255, 255));
        LabelAgenda.setText("Cadastro Clientes");
        getContentPane().add(LabelAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 370, 60));

        LabelCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelCliente.setForeground(new java.awt.Color(255, 255, 255));
        LabelCliente.setText("Cliente");
        getContentPane().add(LabelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        LabelCpfCnpj.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelCpfCnpj.setForeground(new java.awt.Color(255, 255, 255));
        LabelCpfCnpj.setText("CpfCnpj");
        getContentPane().add(LabelCpfCnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        Label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Label.setForeground(new java.awt.Color(255, 255, 255));
        Label.setText("Endereço");
        getContentPane().add(Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        LabelCEP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelCEP.setForeground(new java.awt.Color(255, 255, 255));
        LabelCEP.setText("CEP");
        getContentPane().add(LabelCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        LabelTelefone1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelTelefone1.setForeground(new java.awt.Color(255, 255, 255));
        LabelTelefone1.setText("Telefone1");
        getContentPane().add(LabelTelefone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        LabelTelefone2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelTelefone2.setForeground(new java.awt.Color(255, 255, 255));
        LabelTelefone2.setText("Telefone2");
        getContentPane().add(LabelTelefone2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        LabelObservacao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelObservacao.setForeground(new java.awt.Color(255, 255, 255));
        LabelObservacao.setText("Observação");
        getContentPane().add(LabelObservacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, -1, -1));

        LabelLimite.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelLimite.setForeground(new java.awt.Color(255, 255, 255));
        LabelLimite.setText("Limite ");
        getContentPane().add(LabelLimite, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        TextLimite.setToolTipText("");
        TextLimite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextLimiteActionPerformed(evt);
            }
        });
        getContentPane().add(TextLimite, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 280, 30));

        TextCliente.setToolTipText("");
        TextCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextClienteActionPerformed(evt);
            }
        });
        getContentPane().add(TextCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 280, 30));

        LabelVencimento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelVencimento.setForeground(new java.awt.Color(255, 255, 255));
        LabelVencimento.setText("Vencimento");
        getContentPane().add(LabelVencimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        TextObservacao.setColumns(20);
        TextObservacao.setRows(5);
        JScrollPane2.setViewportView(TextObservacao);

        getContentPane().add(JScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 610, 150));

        ButtonCadastrarCliente.setBackground(new java.awt.Color(60, 233, 106));
        ButtonCadastrarCliente.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ButtonCadastrarCliente.setForeground(new java.awt.Color(255, 255, 255));
        ButtonCadastrarCliente.setText("Cadastrar");
        ButtonCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCadastrarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonCadastrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 610, 50));

        TableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Cliente", "CpfCnpj", "Endereço", "CEP", "Telefone1", "Telefone2", "Email", "Observação", "Vencimento", "Limite"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(TableClientes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 1090, 180));

        TextEmail.setToolTipText("");
        TextEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextEmailActionPerformed(evt);
            }
        });
        getContentPane().add(TextEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 280, 30));

        TextCpfCnpj.setToolTipText("");
        TextCpfCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextCpfCnpjActionPerformed(evt);
            }
        });
        getContentPane().add(TextCpfCnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 280, 30));

        TextEndereco.setToolTipText("");
        TextEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextEnderecoActionPerformed(evt);
            }
        });
        getContentPane().add(TextEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 280, 30));

        TextCEP.setToolTipText("");
        TextCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextCEPActionPerformed(evt);
            }
        });
        getContentPane().add(TextCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 280, 30));

        TextTelefone1.setToolTipText("");
        TextTelefone1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextTelefone1ActionPerformed(evt);
            }
        });
        getContentPane().add(TextTelefone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 280, 30));

        TextTelefone2.setToolTipText("");
        TextTelefone2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextTelefone2ActionPerformed(evt);
            }
        });
        getContentPane().add(TextTelefone2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 280, 30));

        jComboVencimento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quinzenal", "Mensal" }));
        jComboVencimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboVencimentoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboVencimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 280, 30));

        LabelEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelEmail.setForeground(new java.awt.Color(255, 255, 255));
        LabelEmail.setText("Email");
        getContentPane().add(LabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        LabelClientePainelFundo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelClientePainelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Pedidos-PainelFundo.png"))); // NOI18N
        LabelClientePainelFundo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(LabelClientePainelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, -190, -1, 1000));

        LabelCadastroClienteFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/PedidosFundo.png"))); // NOI18N
        LabelCadastroClienteFundo.setAutoscrolls(true);
        getContentPane().add(LabelCadastroClienteFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 1000));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCadastrarClienteActionPerformed
        try {
            this.clienteController.cadastrar();
        } catch (IOException ex) {
            Logger.getLogger(CadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ButtonCadastrarClienteActionPerformed

    private void TextClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextClienteActionPerformed

    private void TextEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextEmailActionPerformed

    private void TextCpfCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextCpfCnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextCpfCnpjActionPerformed

    private void TextEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextEnderecoActionPerformed

    private void TextCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextCEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextCEPActionPerformed

    private void TextTelefone1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextTelefone1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextTelefone1ActionPerformed

    private void TextTelefone2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextTelefone2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextTelefone2ActionPerformed

    private void TextLimiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextLimiteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextLimiteActionPerformed

    private void jComboVencimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboVencimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboVencimentoActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CadastroCliente().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(CadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCadastrarCliente;
    private javax.swing.JScrollPane JScrollPane2;
    private javax.swing.JLabel Label;
    private javax.swing.JLabel LabelAgenda;
    private javax.swing.JLabel LabelCEP;
    private javax.swing.JLabel LabelCadastroClienteFundo;
    private javax.swing.JLabel LabelCliente;
    private javax.swing.JLabel LabelClientePainelFundo;
    private javax.swing.JLabel LabelCpfCnpj;
    private javax.swing.JLabel LabelEmail;
    private javax.swing.JLabel LabelLimite;
    private javax.swing.JLabel LabelObservacao;
    private javax.swing.JLabel LabelTelefone1;
    private javax.swing.JLabel LabelTelefone2;
    private javax.swing.JLabel LabelVencimento;
    private javax.swing.JTable TableClientes;
    private javax.swing.JTextField TextCEP;
    private javax.swing.JTextField TextCliente;
    private javax.swing.JTextField TextCpfCnpj;
    private javax.swing.JTextField TextEmail;
    private javax.swing.JTextField TextEndereco;
    private javax.swing.JTextField TextLimite;
    private javax.swing.JTextArea TextObservacao;
    private javax.swing.JTextField TextTelefone1;
    private javax.swing.JTextField TextTelefone2;
    private javax.swing.JComboBox<String> jComboVencimento;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void iniciar() {

        this.clienteController.atualizaTabela();
    }

    public JTextArea getTextObservacao() {
        return TextObservacao;
    }

    public void setTextObservacao(JTextArea TextObservacao) {
        this.TextObservacao = TextObservacao;
    }

    public JTable getTableClientes() {
        return TableClientes;
    }

    public void setTableClientes(JTable TableClientes) {
        this.TableClientes = TableClientes;
    }

    public JTextField getTextCEP() {
        return TextCEP;
    }

    public void setTextCEP(JTextField TextCEP) {
        this.TextCEP = TextCEP;
    }

    public JTextField getTextCliente() {
        return TextCliente;
    }

    public void setTextCliente(JTextField TextCliente) {
        this.TextCliente = TextCliente;
    }

    public JTextField getTextCpfCnpj() {
        return TextCpfCnpj;
    }

    public void setTextCpfCnpj(JTextField TextCpfCnpj) {
        this.TextCpfCnpj = TextCpfCnpj;
    }

    public JTextField getTextEmail() {
        return TextEmail;
    }

    public void setTextEmail(JTextField TextEmail) {
        this.TextEmail = TextEmail;
    }

    public JTextField getTextEndereco() {
        return TextEndereco;
    }

    public void setTextEndereco(JTextField TextEndereco) {
        this.TextEndereco = TextEndereco;
    }

    public JTextField getTextTelefone1() {
        return TextTelefone1;
    }

    public void setTextTelefone1(JTextField TextTelefone1) {
        this.TextTelefone1 = TextTelefone1;
    }

    public JTextField getTextTelefone2() {
        return TextTelefone2;
    }

    public void setTextTelefone2(JTextField TextTelefone2) {
        this.TextTelefone2 = TextTelefone2;
    }

    public JComboBox getTextVencimento() {
        return jComboVencimento;
    }
    
    public void setTextVencimento(JTextField jComboVencimento) {
        //this.jComboVencimento = jComboVencimento;
    }
    
    public JTextField getTextLimite() {
        return TextLimite;
    }
    
    public void setTextLimite(JTextField TextLimite) {
        this.TextLimite = TextLimite;
    }
    
}
