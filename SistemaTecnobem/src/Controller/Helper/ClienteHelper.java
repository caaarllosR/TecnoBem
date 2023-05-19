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
                cliente.getIdCliente(),
                cliente.getNome(),
                cliente.getCpfCnpj(),
                cliente.getEndereco(),
                cliente.getCep(),
                cliente.getTelefone1(),
                cliente.getTelefone2(),
                cliente.getEmail(),
                cliente.getObservacao(),
                cliente.getVencimento(),
                cliente.getLimite()
            });
        }
        
    }

    @Override
    public Cliente obterModelo() {

        String nome = view.getTextCliente().getText();
        String telefone1 = view.getTextTelefone1().getText();
        String telefone2 = view.getTextTelefone2().getText();
        String email = view.getTextEmail().getText();
        String cpfCnpj = view.getTextCpfCnpj().getText();
        String endereco = view.getTextEndereco().getText();
        String cep = view.getTextCEP().getText();
        String observacao = view.getTextObservacao().getText();
        String vencimento = view.getTextVencimento().getSelectedItem().toString();
        String limite = view.getTextLimite().getText() == null || view.getTextLimite().getText().equals("") ? "0" : view.getTextLimite().getText();
        
        Cliente cliente = new Cliente("0", nome, telefone1, telefone2, email, cpfCnpj, endereco, cep, observacao, vencimento, limite);
        
        return  cliente;

    }

    @Override
    public void limparTela() {
        
        view.getTextCliente().setText("");
        view.getTextTelefone1().setText("");
        view.getTextTelefone2().setText("");
        view.getTextEmail().setText("");
        view.getTextCpfCnpj().setText("");
        view.getTextEndereco().setText("");
        view.getTextCEP().setText("");
        view.getTextObservacao().setText("");
        view.getTextVencimento().setSelectedIndex(0);
        view.getTextLimite().setText("");
    }
    
}
