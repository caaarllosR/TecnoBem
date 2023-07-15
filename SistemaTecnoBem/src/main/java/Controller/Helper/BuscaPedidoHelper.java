/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Model.Pedido;
import Model.Cliente;
import View.BuscaPedido;
import View.CadastroPedido;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author X
 */
public class BuscaPedidoHelper implements IHelper {
    
    private final BuscaPedido viewBuscaPedido;

    public BuscaPedidoHelper(BuscaPedido view) {
        this.viewBuscaPedido = view;
    }

    public void preencherJTable(ArrayList<Pedido> pedidos) {
        
        
        DefaultTableModel tableModel = (DefaultTableModel) viewBuscaPedido.getTablePedidos().getModel();
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

        

    @Override
    public Pedido obterModelo() {
        return null;
    }
    
    
    public Pedido obterCamposJTable(JTable tablePedidos) {

        DefaultTableModel tableModel = (DefaultTableModel) tablePedidos.getModel();
        int row = tablePedidos.getSelectedRow();
        
        String idNota = tableModel.getValueAt(row, 0).toString();
        String cliente = tableModel.getValueAt(row, 1).toString();
        String TSO = tableModel.getValueAt(row, 2).toString();
        String produto = tableModel.getValueAt(row, 3).toString();
        String OD = tableModel.getValueAt(row, 4).toString();
        String OE = tableModel.getValueAt(row, 5).toString();
        String valor = tableModel.getValueAt(row, 6).toString();
        String dataEntrada = tableModel.getValueAt(row, 7).toString();
        String previsaoDataSaida = tableModel.getValueAt(row, 8).toString();
        String perda = tableModel.getValueAt(row, 9).toString();
        String pago = tableModel.getValueAt(row, 11).toString();

        return new Pedido(Integer.parseInt(idNota),cliente,TSO,produto,OD,OE,valor,dataEntrada,previsaoDataSaida,perda,pago);
    }

    @Override
    public void limparTela() {

    }
    
}
