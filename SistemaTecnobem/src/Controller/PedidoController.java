/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Controller.Helper.PedidoHelper;
import Model.Pedido;
import Model.Cliente;
import Model.DAO.Banco;
import Model.DAO.PedidoDAO;
import Model.DAO.ClienteDAO;
import View.CadastroPedido;
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
public class PedidoController {
    
    private final CadastroPedido viewCadastroPedido;
    private final PedidoHelper helper;

    public PedidoController() {
        this.viewCadastroPedido = null;
        this.helper = null;
    }
        
    public PedidoController(CadastroPedido view) {
        this.viewCadastroPedido = view;
        this.helper = new PedidoHelper(view);
    }
    

    
    public void carregaTabela(){
        
        PedidoDAO pedidosDAO = new PedidoDAO();
        ArrayList<Pedido> pedidos = pedidosDAO.selectAll();
        
        helper.preencherJTable(pedidos);
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
    
    public Pedido preencheCamposTela(JTable tablePedidos) {
        
        return helper.obterCamposJTable(tablePedidos);
    }
    
    public void limparText() {
        
        helper.limparTela();
    }
        
    public void agendar() {
        
        Pedido helperPedido = helper.obterModelo();
        PedidoDAO pedidoDAO = new PedidoDAO();
        pedidoDAO.insert(helperPedido);
        pedidoDAO.update(helperPedido);
        
        carregaTabela();
        limparText();
             
        File dp = new File("Base/Pedidos.csv");
	Path path = Paths.get(dp.getAbsolutePath());
        
        
        try (BufferedWriter w = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
            w.write("Id;Cliente;TSO;Produto;OD;OE;Valor;DataEntrega;PrevisaoSaida;Perda;Observação;Anexo;Pago\n");
            for (Pedido pedido : Banco.pedidos) {
                w.write(pedido.getId()+";"+pedido.getCliente()+";"+pedido.getTSO()+";"+pedido.getProduto()+";"+pedido.getOD()+";"+pedido.getOE()+";"+pedido.getValor()+";"+pedido.getDataEntrega()+";"+pedido.getPrevisaoDataSaida()+";"+pedido.getPerda()+";"+pedido.getObservacao()+";;"+pedido.getPago());
                w.newLine();
            }
	
        } catch (IOException e){
            e.printStackTrace();
	}
    }
}
