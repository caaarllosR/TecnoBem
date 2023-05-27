/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Model.Cliente;
import Model.Pedido;
import Model.Servico;
import View.CadastroCliente;
import View.CadastroPedido;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author X
 */
public class ClienteHelper  implements IHelper {

    private final CadastroCliente view;

    public ClienteHelper(CadastroCliente view) {
        this.view = view;
    }

    public void preencherTabela(ArrayList<Cliente> clientes) {
        
        DefaultTableModel tableModel = (DefaultTableModel) view.getTableClientes().getModel();
        tableModel.setNumRows(0);
        
        for (Cliente cliente : clientes) {
            
            tableModel.addRow(new Object[]{
                cliente.getId(),
                cliente.getNome(),
                cliente.getCpfCnpj(),
                cliente.getEndereco(),
                cliente.getCep(),
                cliente.getTelefone1(),
                cliente.getTelefone2(),
                cliente.getEmail(),
                cliente.getObservacao(),
                cliente.getVencimento(),
                cliente.getLimite(),
                cliente.getLimiteUtilizado()
            });
        }
        
    }

    @Override
    public Cliente obterModelo() {

        int    id = view.getTextId().getText().equals("") ? 0 : Integer.parseInt(view.getTextId().getText());
        String nome = view.getTextCliente().getText();        
        String cpfCnpj = view.getTextCpfCnpj().getText();
        String endereco = view.getTextEndereco().getText();
        String cep = view.getTextCEP().getText();
        String telefone1 = view.getTextTelefone1().getText();
        String telefone2 = view.getTextTelefone2().getText();
        String email = view.getTextEmail().getText();
        String observacao = view.getTextObservacao().getText();
        String vencimento = view.getJComboBoxVencimento().getSelectedItem().toString();
        String limite = view.getTextLimite().getText();
        String limiteUtilizado = view.getTextLimiteUtilizado().getText() == null || view.getTextLimiteUtilizado().getText().equals("") ? "0" : view.getTextLimiteUtilizado().getText();
        
        Cliente cliente = new Cliente("0", nome, cpfCnpj, endereco, cep, telefone1, telefone2, email, observacao, vencimento, limite, limiteUtilizado);
        
        return  cliente;

    }

    public void obterTextTabela(JTable TableClientes) {

        DefaultTableModel tableModel = (DefaultTableModel) TableClientes.getModel();
        int row = TableClientes.getSelectedRow();
        
        view.getTextId().setText(tableModel.getValueAt(row, 0).toString());
        view.getTextCliente().setText(tableModel.getValueAt(row, 1).toString());
        view.getTextCpfCnpj().setText(tableModel.getValueAt(row, 2).toString());
        view.getTextEndereco().setText(tableModel.getValueAt(row, 3).toString());
        view.getTextCEP().setText(tableModel.getValueAt(row, 4).toString());
        view.getTextTelefone1().setText(tableModel.getValueAt(row, 5).toString());
        view.getTextTelefone2().setText(tableModel.getValueAt(row, 6).toString());
        view.getTextEmail().setText(tableModel.getValueAt(row, 7).toString());
        view.getTextObservacao().setText(tableModel.getValueAt(row, 8).toString());
        
        int comboSize = view.getJComboBoxVencimento().getItemCount();
        String vencimento = tableModel.getValueAt(row, 9).toString();
        
        for (int i = 0; i < comboSize; i++ ) {
            if (view.getJComboBoxVencimento().getItemAt(i).toString().equals(vencimento)) {
                view.getJComboBoxVencimento().setSelectedIndex(i);
            }
        }
        
        view.getTextLimite().setText(tableModel.getValueAt(row, 10).toString());
        view.getTextLimiteUtilizado().setText(tableModel.getValueAt(row, 11).toString());
    }
        
    @Override
    public void limparTela() {
        
        view.getTextId().setText("");
        view.getTextCliente().setText("");
        view.getTextTelefone1().setText("");
        view.getTextTelefone2().setText("");
        view.getTextEmail().setText("");
        view.getTextCpfCnpj().setText("");
        view.getTextEndereco().setText("");
        view.getTextCEP().setText("");
        view.getTextObservacao().setText("");
        view.getJComboBoxVencimento().setSelectedIndex(0);
        view.getTextLimite().setText("");
        view.getTextLimiteUtilizado().setText("");
        
    }
    
}
