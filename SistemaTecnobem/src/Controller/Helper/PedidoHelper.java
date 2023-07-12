/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Model.Pedido;
import Model.Cliente;
import View.CadastroPedido;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author X
 */
public class PedidoHelper implements IHelper {
    
    private final CadastroPedido viewCadastroPedido;

    public PedidoHelper(CadastroPedido view) {
        this.viewCadastroPedido = view;
    }

    public void preencherJTable(ArrayList<Pedido> pedidos) {
        
        
        DefaultTableModel tableModel = (DefaultTableModel) viewCadastroPedido.getTablePedidos().getModel();
        tableModel.setNumRows(0);
        
        for (Pedido pedido : pedidos) {
            
            tableModel.addRow(new Object[]{
                pedido.getId(),
                pedido.getCliente(),
                pedido.getTSO(),
                pedido.getProduto(),
                pedido.getOD(),
                pedido.getOE(),
                pedido.getValor(),
                pedido.getDataEntrega(),
                pedido.getPrevisaoDataSaida(),
                pedido.getPerda(),
                pedido.getObservacao(),
                "",
                pedido.getPago()
            });
        }
        
    }

    public void preencheComboClientes(ArrayList<Cliente> clientes) {

        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) viewCadastroPedido.getJComboBoxCliente().getModel();
        
        for (Cliente cliente : clientes) {
            comboBoxModel.addElement(cliente.getNome());
        }
    }


    public String obterCliente() {

        return (String) viewCadastroPedido.getJComboBoxCliente().getSelectedItem();
    }
        
    public void setarValor(float valor) {
        viewCadastroPedido.getTextValor().setText(valor+"");
    }

    @Override
    public Pedido obterModelo() {

        int    id = viewCadastroPedido.getTextId().getText().equals("") ? 0 : Integer.parseInt(viewCadastroPedido.getTextId().getText());
        String TSO = viewCadastroPedido.getTextTSO().getText();
        String cliente = obterCliente();
        String servico = viewCadastroPedido.getTextProduto().getText();
        String OD = viewCadastroPedido.getTextOD().getText();
        String OE = viewCadastroPedido.getTextOE().getText();
        String valor = viewCadastroPedido.getTextValor().getText();
        String dataEntrada = viewCadastroPedido.getTextDataEntrada().getText();
        String previsaoDataSaida = viewCadastroPedido.getTextPrevisaoDataSaida().getText();
        String perda = viewCadastroPedido.getTextPerda().getText();
        String observacao = viewCadastroPedido.getTextObservacao().getText();
        String anexo = viewCadastroPedido.getTextAnexo().getText();
        String pago = viewCadastroPedido.getCheckBoxPago().isSelected() ? "SIM" : "NÂO";
        Pedido pedido = new Pedido(id, cliente, TSO, servico, OD, OE, valor, dataEntrada, previsaoDataSaida, perda, observacao, anexo, pago);
        
        return pedido;
    }
    
    public void obterIdLinhaJTable(JTable TablePedidos) {

        DefaultTableModel tableModel = (DefaultTableModel) TablePedidos.getModel();
        int row = TablePedidos.getSelectedRow();
        
        
        viewCadastroPedido.getTextId().setText(tableModel.getValueAt(row, 0).toString());
    }
    
    public Pedido obterCamposJTable(JTable tablePedidos) {

        DefaultTableModel tableModel = (DefaultTableModel) tablePedidos.getModel();
        int row = tablePedidos.getSelectedRow();
        
        String id = tableModel.getValueAt(row, 0).toString();
        String cliente = tableModel.getValueAt(row, 1).toString();
        String TSO = tableModel.getValueAt(row, 2).toString();
        String produto = tableModel.getValueAt(row, 3).toString();
        String OD = tableModel.getValueAt(row, 4).toString();
        String OE = tableModel.getValueAt(row, 5).toString();
        String valor = tableModel.getValueAt(row, 6).toString();
        String dataEntrada = tableModel.getValueAt(row, 7).toString();
        String previsaoDataSaida = tableModel.getValueAt(row, 8).toString();
        String perda = tableModel.getValueAt(row, 9).toString();
        String pago = tableModel.getValueAt(row, 12).toString();

        viewCadastroPedido.getTextId().setText(id);
        
        int comboSize = viewCadastroPedido.getJComboBoxCliente().getItemCount();
        String nomeCliente = cliente;
        
        for (int i = 0; i < comboSize; i++ ) {
            if (viewCadastroPedido.getJComboBoxCliente().getItemAt(i).equals(nomeCliente)) {
                viewCadastroPedido.getJComboBoxCliente().setSelectedIndex(i);
            }
        }

        viewCadastroPedido.getTextTSO().setText(TSO);
        viewCadastroPedido.getTextProduto().setText(produto);
        viewCadastroPedido.getTextOD().setText(OD);
        viewCadastroPedido.getTextOE().setText(OE);
        viewCadastroPedido.getTextValor().setText(valor);
        viewCadastroPedido.getTextDataEntrada().setText(dataEntrada);
        viewCadastroPedido.getTextPrevisaoDataSaida().setText(previsaoDataSaida);
        viewCadastroPedido.getTextPerda().setText(perda);
        viewCadastroPedido.getTextObservacao().setText(tableModel.getValueAt(row, 10).toString());
        viewCadastroPedido.getCheckBoxPago().setSelected(!pago.equals("SIM") ? false : true);
        
        return new Pedido(Integer.parseInt(id),cliente,TSO,produto,OD,OE,valor,dataEntrada,previsaoDataSaida,perda,pago);
    }

    @Override
    public void limparTela() {

        viewCadastroPedido.getTextId().setText("");
        viewCadastroPedido.getTextDataEntrada().setText("");
        viewCadastroPedido.getTextTSO().setText("");
        viewCadastroPedido.getTextProduto().setText("");
        viewCadastroPedido.getTextOD().setText("");
        viewCadastroPedido.getTextOE().setText("");
        viewCadastroPedido.getTextValor().setText("");
        viewCadastroPedido.getTextDataEntrada().setText("");
        viewCadastroPedido.getTextPrevisaoDataSaida().setText("");
        viewCadastroPedido.getTextPerda().setText("");
        viewCadastroPedido.getTextObservacao().setText("");
        viewCadastroPedido.getTextAnexo().setText("");
        viewCadastroPedido.getCheckBoxPago().setSelected(false);
    }
    
}
