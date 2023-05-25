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
                pedido.getTSO(),
                pedido.getCliente(),
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

        String TSO = view.getTextTSO().getText();
        String cliente = obterCliente();
        String servico = view.getTextServico().getText();
        String OD = view.getTextOD().getText();
        String OE = view.getTextOE().getText();
        String valor = view.getTextValor().getText();
        String dataEntrada = view.getTextDataEntrada().getText();
        String PrevisaoDataSaida = view.getTextPrevisaoDataSaida().getText();
        String Perda = view.getTextPerda().getText();
        String observacao = view.getTextObservacao().getText();
        
        Pedido pedido = new Pedido(0, TSO, cliente, servico, OD, OE, valor, dataEntrada, PrevisaoDataSaida, Perda, observacao);
        
        return pedido;
    }

    @Override
    public void limparTela() {

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
