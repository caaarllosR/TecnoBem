/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.ClienteHelper;
import Controller.Helper.PedidoHelper;
import Model.Cliente;
import Model.DAO.ClienteDAO;
import Model.DAO.PedidoDAO;
import Model.Pedido;
import View.CadastroCliente;
import View.CadastroPedido;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

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

    public void carregaTabela(){
        
        ClienteDAO clienteDAO = new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDAO.selectAll();
        
        helper.preencherTabela(clientes);
    }
    
    public void cadastrar() throws IOException {
        
        Cliente cliente = helper.obterModelo();
        new ClienteDAO().insert(cliente);
        
        carregaTabela();
        helper.limparTela();

        OpenOption options = StandardOpenOption.APPEND;
        File dp = new File("Base/Clientes.csv");
	Path path = Paths.get(dp.getAbsolutePath());
        
        try (BufferedWriter w = Files.newBufferedWriter(path, StandardCharsets.UTF_8, options)) {
            w.write(cliente.getIdCliente()+";"+cliente.getNome()+";"+cliente.getTelefone1()+";"+cliente.getTelefone2()
                    +";"+cliente.getEmail()+";"+cliente.getCpfCnpj()+";"+cliente.getEndereco()+";"+cliente.getCep()+";"+cliente.getObservacao()
                    +";"+cliente.getVencimento()+";"+cliente.getLimite()+"\n");
	}catch (IOException e){
            e.printStackTrace();
	}
    }
    
}
