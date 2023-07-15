/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Model.Nota;
import Model.Cliente;
import Model.GerenciadorDePedidos;
import View.CadastroPedido;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author X
 */
public class NotaHelper implements IHelper {
    
    private final CadastroPedido viewCadastroPedido;

    public NotaHelper(CadastroPedido view) {
        this.viewCadastroPedido = view;
    }

    public void preencherJTable(ArrayList<Nota> notas) {
        
        DefaultTableModel tableModel = (DefaultTableModel) viewCadastroPedido.getTablePedidos().getModel();
        tableModel.setNumRows(0);
        
        int ultimoId = GerenciadorDePedidos.getInstance().getIndice();
        int size = notas.size();
        
        for (int i = ultimoId; i < size; i++) {
            
            tableModel.addRow(new Object[]{
            notas.get(i).getId(),
            notas.get(i).getCliente(),
            notas.get(i).getTSO(),
            notas.get(i).getProduto(),
            notas.get(i).getOD(),
            notas.get(i).getOE(),
            notas.get(i).getValor(),
            notas.get(i).getDataEntrega(),
            notas.get(i).getPrevisaoDataSaida(),
            notas.get(i).getPerda(),
            notas.get(i).getObservacao(),
            "",   
            notas.get(i).getPago()
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
    public Nota obterModelo() {

        int    idNota = viewCadastroPedido.getTextId().getText().equals("") ? 0 : Integer.parseInt(viewCadastroPedido.getTextId().getText());
        int    idPedido = viewCadastroPedido.getTextId().getText().equals("") ? 0 : Integer.parseInt(viewCadastroPedido.getTextId().getText());
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
        Nota nota = new Nota(idNota, idPedido, cliente, TSO, servico, OD, OE, valor, dataEntrada, previsaoDataSaida, perda, observacao, anexo, pago);
        
        return nota;
    }
    
    public void obterIdLinhaJTable(JTable TableNotas) {

        DefaultTableModel tableModel = (DefaultTableModel) TableNotas.getModel();
        int row = TableNotas.getSelectedRow();
                
        viewCadastroPedido.getTextId().setText(tableModel.getValueAt(row, 0).toString());
    }
    
    public Nota obterCamposJTable(JTable tableNotas) {

        DefaultTableModel tableModel = (DefaultTableModel) tableNotas.getModel();
        int row = tableNotas.getSelectedRow();
        
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
        
        return new Nota(0, Integer.parseInt(id),cliente,TSO,produto,OD,OE,valor,dataEntrada,previsaoDataSaida,perda,pago);
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
