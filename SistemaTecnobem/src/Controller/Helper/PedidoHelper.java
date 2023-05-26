/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Model.Pedido;
import Model.Cliente;
import Model.Servico;
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
    
    private final CadastroPedido view;

    public PedidoHelper(CadastroPedido view) {
        this.view = view;
    }

    public void preencherTabela(ArrayList<Pedido> pedidos) {
        
        DefaultTableModel tableModel = (DefaultTableModel) view.getTablePedidos().getModel();
        tableModel.setNumRows(0);
        
        for (Pedido pedido : pedidos) {
            
            tableModel.addRow(new Object[]{
                pedido.getId(),
                pedido.getCliente(),
                pedido.getTSO(),
                pedido.getServico(),
                pedido.getOD(),
                pedido.getOE(),
                pedido.getValor(),
                pedido.getDataEntrega(),
                pedido.getPrevisaoDataSaida(),
                pedido.getPerda(),
                pedido.getObservacao()
            });
        }
        
    }

    public void preencheComboClientes(ArrayList<Cliente> clientes) {

        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getJComboBoxCliente().getModel();
        
        for (Cliente cliente : clientes) {
            comboBoxModel.addElement(cliente.getNome());
        }
    }


    public String obterCliente() {

        return (String) view.getJComboBoxCliente().getSelectedItem();
    }
        
    public void setarValor(float valor) {
        view.getTextValor().setText(valor+"");
    }

    @Override
    public Pedido obterModelo() {

        int    id = view.getTextId().getText().equals("") ? 0 : Integer.parseInt(view.getTextId().getText());
        String TSO = view.getTextTSO().getText();
        String cliente = obterCliente();
        String servico = view.getTextServico().getText();
        String OD = view.getTextOD().getText();
        String OE = view.getTextOE().getText();
        String valor = view.getTextValor().getText();
        String dataEntrada = view.getTextDataEntrada().getText();
        String previsaoDataSaida = view.getTextPrevisaoDataSaida().getText();
        String perda = view.getTextPerda().getText();
        String observacao = view.getTextObservacao().getText();
        
        System.out.println("TESTANDO ID: "+id);
        Pedido pedido = new Pedido(id, cliente, TSO, servico, OD, OE, valor, dataEntrada, previsaoDataSaida, perda, observacao);
        
        return pedido;
    }
    
    public void obterTextTabela(JTable TablePedidos) {

        DefaultTableModel tableModel = (DefaultTableModel) TablePedidos.getModel();
        
        int row = TablePedidos.getSelectedRow();
        
        view.getTextId().setText(tableModel.getValueAt(row, 0).toString());
        
        view.getJComboBoxCliente().getItemAt(row);
        
        view.getTextTSO().setText(tableModel.getValueAt(row, 2).toString());
        view.getTextServico().setText(tableModel.getValueAt(row, 3).toString());
        view.getTextOD().setText(tableModel.getValueAt(row, 4).toString());
        view.getTextOE().setText(tableModel.getValueAt(row, 5).toString());
        view.getTextValor().setText(tableModel.getValueAt(row, 6).toString());
        view.getTextDataEntrada().setText(tableModel.getValueAt(row, 7).toString());
        view.getTextPrevisaoDataSaida().setText(tableModel.getValueAt(row, 8).toString());
        view.getTextPerda().setText(tableModel.getValueAt(row, 9).toString());
        view.getTextObservacao().setText(tableModel.getValueAt(row, 10).toString());
    }

    @Override
    public void limparTela() {

        view.getTextId().setText("");
        view.getTextDataEntrada().setText("");
        view.getTextTSO().setText("");
        view.getTextServico().setText("");
        view.getTextOD().setText("");
        view.getTextOE().setText("");
        view.getTextValor().setText("");
        view.getTextDataEntrada().setText("");
        view.getTextPrevisaoDataSaida().setText("");
        view.getTextPerda().setText("");
        view.getTextObservacao().setText("");
        view.getTextAnexo().setText("");
    }
    
}
