/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.PedidoHelper;
import Model.Pedido;
import Model.Cliente;
import Model.DAO.PedidoDAO;
import Model.DAO.ClienteDAO;
import Model.DAO.ServicoDAO;
import Model.Servico;
import View.CadastroPedido;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import javax.swing.JTable;

/**
 *
 * @author X
 */
public class PedidoController {
    
    private final CadastroPedido view;
    private final PedidoHelper helper;


    public PedidoController(CadastroPedido view) {
        this.view = view;
        this.helper = new PedidoHelper(view);
    }
    
    public void carregaTabela(){
        
        PedidoDAO pedidosDAO = new PedidoDAO();
        ArrayList<Pedido> pedidos = pedidosDAO.selectAll();
        
        helper.preencherTabela(pedidos);
    }
    
    public void atualizaTabela(Pedido pedido){
        
        PedidoDAO pedidosDAO = new PedidoDAO();
        pedidosDAO.update(pedido);     
    }
    
    public void carregaJComboClientes() {
        
        ClienteDAO clienteDAO = new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDAO.selectAll();
        helper.preencheComboClientes(clientes);
    }
    
    public void preencheText(JTable TablePedidos) {
        
        helper.obterTextTabela(TablePedidos);
    }
    
    public void limparText() {
        
        helper.limparTela();
    }
        
    public void agendar() {
        
        Pedido pedido = helper.obterModelo();
        PedidoDAO pedidoDAO = new PedidoDAO();
        pedidoDAO.insert(pedido);
        //pedidoDAO.update(pedido);
        
        carregaTabela();
        limparText();
               
        OpenOption options = StandardOpenOption.APPEND;
        File dp = new File("Base/Pedidos.csv");
	Path path = Paths.get(dp.getAbsolutePath());
        
        try (BufferedWriter w = Files.newBufferedWriter(path, StandardCharsets.UTF_8, options)) {
            w.write(pedido.getId()+";"+pedido.getCliente()+";"+pedido.getTSO()+";"+pedido.getServico()+";"+pedido.getOD()+";"+pedido.getOE()+";"+pedido.getValor()+";"+pedido.getDataEntrega()+";"+pedido.getPrevisaoDataSaida()+";"+pedido.getPerda()+";"+pedido.getObservacao()+"\n");
	} catch (IOException e){
            e.printStackTrace();
	}
    }
}
