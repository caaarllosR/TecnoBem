/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.ClienteHelper;
import Model.Cliente;
import Model.DAO.Banco;
import Model.DAO.ClienteDAO;
import View.CadastroCliente;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.swing.JTable;

/**
 *
 * @author X
 */
public class ClienteController {

    private final CadastroCliente view;
    private final ClienteHelper helper;


    public ClienteController(CadastroCliente view) {
        this.view = view;
        this.helper = new ClienteHelper(view);
    }

    public void preencheCamposTela(JTable tableClientes) {
        
        helper.obterCamposJTable(tableClientes);
    }
    
    public void limparText() {
       
        helper.limparTela();
    }
        
    public void carregaTabela(){
        
        ClienteDAO clienteDAO = new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDAO.selectAll();
        
        helper.preencherJTable(clientes);
    }
    
    public void cadastrar() throws IOException {
        
        Cliente helperCliente = helper.obterModelo();
        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.insert(helperCliente);
        clienteDAO.update(helperCliente);
        System.out.println("helper.obterModelo: "+helperCliente.getId());

        carregaTabela();
        limparText();

        File dp = new File("Base/Clientes.csv");
	Path path = Paths.get(dp.getAbsolutePath());
        
        try (BufferedWriter w = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
            w.write("Id;Cliente;CpfCnpj;Endereço;CEP;Telefone1;Telefone2;E-mail;Observação;Vencimento;Limite;LimiteUtilizado\n");          
            for(Cliente cliente : Banco.clientes) {
                w.write(cliente.getId()+";"+cliente.getNome()+";"+cliente.getCpfCnpj()+";"+cliente.getEndereco()+";"+cliente.getCep()+";"+cliente.getTelefone1()+";"+cliente.getTelefone2()
                    +";"+cliente.getEmail()+";"+cliente.getObservacao()
                    +";"+cliente.getVencimento()+";"+cliente.getLimite()+";"+cliente.getLimiteUtilizado());
                w.newLine();
            }
        }catch (IOException e){
            e.printStackTrace();
	}
    }
    
}
