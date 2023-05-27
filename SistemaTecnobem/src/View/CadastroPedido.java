/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.PedidoController;
import Model.DAO.Banco;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tiago
 */
public class CadastroPedido extends javax.swing.JFrame {

    private final PedidoController pedidoController;

    /**
     * Creates new form Agenda
     */
    public CadastroPedido() throws IOException {
        initComponents();
        pedidoController = new PedidoController(this);
        Banco.carregaClientes();
        Banco.carregaPedidos();
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
        LabelProduto = new javax.swing.JLabel();
        LabelValor = new javax.swing.JLabel();
        LabelData = new javax.swing.JLabel();
        LabelTSO = new javax.swing.JLabel();
        LabelAnexo = new javax.swing.JLabel();
        LabelData2 = new javax.swing.JLabel();
        LabelData3 = new javax.swing.JLabel();
        LabelObservacao = new javax.swing.JLabel();
        JComboBoxCliente = new javax.swing.JComboBox<>();
        TextDataEntrada = new javax.swing.JTextField();
        TextPrevisaoDataSaida = new javax.swing.JTextField();
        TextPerda = new javax.swing.JTextField();
        TextAnexo = new javax.swing.JTextField();
        JScrollPaneObservacao = new javax.swing.JScrollPane();
        TextObservacao = new javax.swing.JTextArea();
        ButtonAgendar = new javax.swing.JButton();
        ButtonGerarNota = new javax.swing.JButton();
        jScrollPanePedidos = new javax.swing.JScrollPane();
        TablePedidos = new javax.swing.JTable();
        TextTSO = new javax.swing.JTextField();
        TextValor = new javax.swing.JTextField();
        TextCodigoProduto = new javax.swing.JTextField();
        TextOD = new javax.swing.JTextField();
        TextOE = new javax.swing.JTextField();
        TextId = new javax.swing.JTextField();
        LabelId = new javax.swing.JLabel();
        jCheckBoxPago = new javax.swing.JCheckBox();
        LabelOD = new javax.swing.JLabel();
        ButtonLimpar = new javax.swing.JButton();
        LabelPago = new javax.swing.JLabel();
        javax.swing.JLabel LabelOE = new javax.swing.JLabel();
        LabelPedidoPainelFundo = new javax.swing.JLabel();
        LabelAgendaFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelAgenda.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        LabelAgenda.setForeground(new java.awt.Color(255, 255, 255));
        LabelAgenda.setText("Pedidos");
        getContentPane().add(LabelAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 150, 60));

        LabelCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelCliente.setForeground(new java.awt.Color(255, 255, 255));
        LabelCliente.setText("Cliente");
        getContentPane().add(LabelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        LabelProduto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelProduto.setForeground(new java.awt.Color(255, 255, 255));
        LabelProduto.setText("CodigoProduto");
        getContentPane().add(LabelProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        LabelValor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelValor.setForeground(new java.awt.Color(255, 255, 255));
        LabelValor.setText("Valor R$");
        getContentPane().add(LabelValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        LabelData.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelData.setForeground(new java.awt.Color(255, 255, 255));
        LabelData.setText("Data Entrada");
        getContentPane().add(LabelData, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        LabelTSO.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelTSO.setForeground(new java.awt.Color(255, 255, 255));
        LabelTSO.setText("TSO do Serviço");
        getContentPane().add(LabelTSO, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        LabelAnexo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelAnexo.setForeground(new java.awt.Color(255, 255, 255));
        LabelAnexo.setText("Anexo");
        getContentPane().add(LabelAnexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, -1, 20));

        LabelData2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelData2.setForeground(new java.awt.Color(255, 255, 255));
        LabelData2.setText("Previsão de Saida");
        getContentPane().add(LabelData2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, 20));

        LabelData3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelData3.setForeground(new java.awt.Color(255, 255, 255));
        LabelData3.setText("Perda");
        getContentPane().add(LabelData3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, -1, 20));

        LabelObservacao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelObservacao.setForeground(new java.awt.Color(255, 255, 255));
        LabelObservacao.setText("Observação");
        getContentPane().add(LabelObservacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, -1, -1));

        JComboBoxCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboBoxClienteActionPerformed(evt);
            }
        });
        getContentPane().add(JComboBoxCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 280, 30));

        TextDataEntrada.setToolTipText("");
        TextDataEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextDataEntradaActionPerformed(evt);
            }
        });
        getContentPane().add(TextDataEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 280, 30));

        TextPrevisaoDataSaida.setToolTipText("");
        TextPrevisaoDataSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextPrevisaoDataSaidaActionPerformed(evt);
            }
        });
        getContentPane().add(TextPrevisaoDataSaida, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 280, 30));

        TextPerda.setToolTipText("");
        TextPerda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextPerdaActionPerformed(evt);
            }
        });
        getContentPane().add(TextPerda, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 280, 30));

        TextAnexo.setToolTipText("");
        TextAnexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextAnexoActionPerformed(evt);
            }
        });
        getContentPane().add(TextAnexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 40, 30));

        TextObservacao.setColumns(20);
        TextObservacao.setRows(5);
        JScrollPaneObservacao.setViewportView(TextObservacao);

        getContentPane().add(JScrollPaneObservacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 610, 120));

        ButtonAgendar.setBackground(new java.awt.Color(60, 233, 106));
        ButtonAgendar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ButtonAgendar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonAgendar.setText("Agendar");
        ButtonAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAgendarActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonAgendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, 190, 50));

        ButtonGerarNota.setBackground(new java.awt.Color(60, 233, 106));
        ButtonGerarNota.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ButtonGerarNota.setForeground(new java.awt.Color(255, 255, 255));
        ButtonGerarNota.setText("GerarNota");
        ButtonGerarNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonGerarNotaActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonGerarNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 400, 180, 50));

        TablePedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Cliente", "TSO", "Código do Produto", "OD", "OE", "Valor", "Data de Entrada", "Previsão de Saida", "Perda", "Observação", "Anexo", "Pago"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablePedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TablePedidos.getTableHeader().setReorderingAllowed(false);
        TablePedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablePedidosMouseClicked(evt);
            }
        });
        jScrollPanePedidos.setViewportView(TablePedidos);

        getContentPane().add(jScrollPanePedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 1090, 170));

        TextTSO.setToolTipText("");
        TextTSO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextTSOActionPerformed(evt);
            }
        });
        getContentPane().add(TextTSO, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 280, 30));

        TextValor.setToolTipText("");
        TextValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextValorActionPerformed(evt);
            }
        });
        getContentPane().add(TextValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 280, 30));

        TextCodigoProduto.setToolTipText("");
        TextCodigoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextCodigoProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(TextCodigoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 280, 30));

        TextOD.setToolTipText("");
        TextOD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextODActionPerformed(evt);
            }
        });
        getContentPane().add(TextOD, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 280, 30));

        TextOE.setToolTipText("");
        TextOE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextOEActionPerformed(evt);
            }
        });
        getContentPane().add(TextOE, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 280, 30));

        TextId.setToolTipText("");
        TextId.setEnabled(false);
        TextId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextIdActionPerformed(evt);
            }
        });
        getContentPane().add(TextId, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 280, 30));

        LabelId.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelId.setForeground(new java.awt.Color(255, 255, 255));
        LabelId.setText("Id");
        getContentPane().add(LabelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));
        getContentPane().add(jCheckBoxPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, 30, 20));

        LabelOD.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelOD.setForeground(new java.awt.Color(255, 255, 255));
        LabelOD.setText("OD");
        getContentPane().add(LabelOD, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        ButtonLimpar.setBackground(new java.awt.Color(60, 233, 106));
        ButtonLimpar.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        ButtonLimpar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonLimpar.setText("Limpar");
        ButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLimparActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 110, 40));

        LabelPago.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelPago.setForeground(new java.awt.Color(255, 255, 255));
        LabelPago.setText("Pago");
        getContentPane().add(LabelPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, -1, 20));

        LabelOE.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelOE.setForeground(new java.awt.Color(255, 255, 255));
        LabelOE.setText("OE");
        getContentPane().add(LabelOE, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        LabelPedidoPainelFundo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        LabelPedidoPainelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Pedidos-PainelFundo.png"))); // NOI18N
        LabelPedidoPainelFundo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(LabelPedidoPainelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, -140, -1, 1000));

        LabelAgendaFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/PedidosFundo.png"))); // NOI18N
        LabelAgendaFundo.setAutoscrolls(true);
        getContentPane().add(LabelAgendaFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1300, 1000));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAgendarActionPerformed
        this.pedidoController.agendar();
    }//GEN-LAST:event_ButtonAgendarActionPerformed

    private void TextDataEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextDataEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextDataEntradaActionPerformed

    private void TextTSOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextTSOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextTSOActionPerformed

    private void TextValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextValorActionPerformed

    private void TextCodigoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextCodigoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextCodigoProdutoActionPerformed

    private void TextODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextODActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextODActionPerformed

    private void TextOEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextOEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextOEActionPerformed

    private void TextPrevisaoDataSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextPrevisaoDataSaidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextPrevisaoDataSaidaActionPerformed

    private void TextAnexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextAnexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextAnexoActionPerformed

    private void TextPerdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextPerdaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextPerdaActionPerformed

    private void ButtonGerarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonGerarNotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonGerarNotaActionPerformed

    private void JComboBoxClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboBoxClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JComboBoxClienteActionPerformed

    private void TablePedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablePedidosMouseClicked
              
        pedidoController.preencheText(TablePedidos);
    }//GEN-LAST:event_TablePedidosMouseClicked

    private void TextIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextIdActionPerformed

    private void ButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLimparActionPerformed
        
        pedidoController.limparText();
    }//GEN-LAST:event_ButtonLimparActionPerformed

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
                    new CadastroPedido().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(CadastroPedido.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
              
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAgendar;
    private javax.swing.JButton ButtonGerarNota;
    private javax.swing.JButton ButtonLimpar;
    private javax.swing.JComboBox<String> JComboBoxCliente;
    private javax.swing.JScrollPane JScrollPaneObservacao;
    private javax.swing.JLabel LabelAgenda;
    private javax.swing.JLabel LabelAgendaFundo;
    private javax.swing.JLabel LabelAnexo;
    private javax.swing.JLabel LabelCliente;
    private javax.swing.JLabel LabelData;
    private javax.swing.JLabel LabelData2;
    private javax.swing.JLabel LabelData3;
    private javax.swing.JLabel LabelId;
    private javax.swing.JLabel LabelOD;
    private javax.swing.JLabel LabelObservacao;
    private javax.swing.JLabel LabelPago;
    private javax.swing.JLabel LabelPedidoPainelFundo;
    private javax.swing.JLabel LabelProduto;
    private javax.swing.JLabel LabelTSO;
    private javax.swing.JLabel LabelValor;
    private javax.swing.JTable TablePedidos;
    private javax.swing.JTextField TextAnexo;
    private javax.swing.JTextField TextCodigoProduto;
    private javax.swing.JTextField TextDataEntrada;
    private javax.swing.JTextField TextId;
    private javax.swing.JTextField TextOD;
    private javax.swing.JTextField TextOE;
    private javax.swing.JTextArea TextObservacao;
    private javax.swing.JTextField TextPerda;
    private javax.swing.JTextField TextPrevisaoDataSaida;
    private javax.swing.JTextField TextTSO;
    private javax.swing.JTextField TextValor;
    private javax.swing.JCheckBox jCheckBoxPago;
    private javax.swing.JScrollPane jScrollPanePedidos;
    // End of variables declaration//GEN-END:variables

    private void iniciar() {

        this.pedidoController.carregaTabela();
        this.pedidoController.carregaJComboClientes();
    }

    public JTable getTablePedidos() {
        return TablePedidos;
    }

    public void setTablePedidos(JTable TablePedidos) {
        this.TablePedidos = TablePedidos;
    }

    public JComboBox<String> getJComboBoxCliente() {
        return JComboBoxCliente;
    }

    public void setJComboBoxCliente(JComboBox<String> jComboBoxCliente) {
        this.JComboBoxCliente = jComboBoxCliente;
    }

    public JTextArea getTextObservacao() {
        return TextObservacao;
    }

    public void setTextObservacao(JTextArea TextObservacao) {
        this.TextObservacao = TextObservacao;
    }

    public JTextField getTextId() {
        return TextId;
    }
        
    public JTextField getTextTSO() {
        return TextTSO;
    }

    public void setTextTSO(JTextField TextTSO) {
        this.TextTSO = TextTSO;
    }

    public JTextField getTextProduto() {
        return TextCodigoProduto;
    }

    public void setTextServico(JTextField TextServico) {
        this.TextCodigoProduto = TextServico;
    }

    public JTextField getTextOD() {
        return TextOD;
    }

    public void setTextOD(JTextField TextOD) {
        this.TextOD = TextOD;
    }
       
    public JTextField getTextOE() {
        return TextOE;
    }
        
    public void setTextOE(JTextField TextOE) {
        this.TextOE = TextOE;
    }
    
    public JTextField getTextValor() {
        return TextValor;
    }

    public void setTextValor(JTextField TextValor) {
        this.TextValor = TextValor;
    }
    
    public JTextField getTextDataEntrada() {
        return TextDataEntrada;
    }

    public void setTextDataEntrada(JTextField TextDataEntrada) {
        this.TextDataEntrada = TextDataEntrada;
    }
    
    public JTextField getTextPrevisaoDataSaida() {
        return TextPrevisaoDataSaida;
    }

    public void setPrevisaoDataSaida(JTextField TextPrevisaoDataSaida) {
        this.TextPrevisaoDataSaida = TextPrevisaoDataSaida;
    }
    
    public JTextField getTextPerda() {
        return TextPerda;
    }

    public void setTextPerda(JTextField TextPerda) {
        this.TextValor = TextPerda;
    }
    
    public JTextField getTextAnexo() {
        return TextAnexo;
    }

    public void setTextAnexo(JTextField TextAnexo) {
        this.TextValor = TextAnexo;
    }
    
    public JCheckBox getCheckBoxPago() {
        return jCheckBoxPago;
    }
    
    
}
