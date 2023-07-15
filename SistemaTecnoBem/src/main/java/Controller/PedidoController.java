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
import Model.GerenciadorDeNotas;
import Model.GerenciadorDePedidos;
import View.CadastroPedido;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
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
    
    public void limparTexto() {
        
        helper.limparTela();
    }
        
    public void limparTabela() {

        helper.limpaJTable();
    }
    
    public void adicionar() {
        
        Pedido helperPedido = helper.obterModelo();
        PedidoDAO pedidoDAO = new PedidoDAO();
        pedidoDAO.insert(helperPedido);
        pedidoDAO.update(helperPedido);
        
        carregaTabela();
        limparTexto();
        
        /*File arquivoPedidos = new File("Base/Pedidos.csv");
	Path path = Paths.get(arquivoPedidos.getAbsolutePath());
        
        
        try (BufferedWriter w = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
            w.write("Id;Cliente;TSO;Produto;OD;OE;Valor;DataEntrega;PrevisaoSaida;Perda;Observação;Anexo;Pago\n");
            for (Pedido pedido : Banco.pedidos) {
                w.write(pedido.getId()+";"+pedido.getCliente()+";"+pedido.getTSO()+";"+pedido.getProduto()+";"+pedido.getOD()+";"+pedido.getOE()+";"+pedido.getValor()+";"+pedido.getDataEntrega()+";"+pedido.getPrevisaoDataSaida()+";"+pedido.getPerda()+";"+pedido.getObservacao()+";;"+pedido.getPago());
                w.newLine();
            }
	
        } catch (IOException e){
            e.printStackTrace();
	}*/
    }
    
    
    public void gerarNota() {
        
        Pedido helperPedido = helper.obterModelo();
        PedidoDAO pedidoDAO = new PedidoDAO();
        pedidoDAO.update(helperPedido);
        
        carregaTabela();
        limparTexto();
        limparTabela();
             
        File arquivoPedidos = new File("Base/Pedidos.csv");
	Path path = Paths.get(arquivoPedidos.getAbsolutePath());
        int sizePedido = Banco.pedidos.size();
        int ultimoIdice = GerenciadorDePedidos.getInstance().getIndice();

        try (BufferedWriter w = Files.newBufferedWriter(path, StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {
            
            if (!arquivoPedidos.exists()) {
                w.write("IdPedido;Cliente;TSO;Produto;OD;OE;Valor;DataEntrega;PrevisaoSaida;Perda;Observação;Anexo;Pago");
            }
            
        
            for (int i = ultimoIdice; i < sizePedido; i++) {
                w.newLine();
                w.write(Banco.pedidos.get(i).getId()+";"+Banco.pedidos.get(i).getCliente()+";"+Banco.pedidos.get(i).getTSO()+";"+Banco.pedidos.get(i).getProduto()+";"+Banco.pedidos.get(i).getOD()+";"+Banco.pedidos.get(i).getOE()+";"+Banco.pedidos.get(i).getValor()+";"+Banco.pedidos.get(i).getDataEntrega()+";"+Banco.pedidos.get(i).getPrevisaoDataSaida()+";"+Banco.pedidos.get(i).getPerda()+";"+Banco.pedidos.get(i).getObservacao()+";;"+Banco.pedidos.get(i).getPago());               
            }
            
            GerenciadorDePedidos.getInstance().setIndice(Banco.pedidos.size());

        } catch (IOException e){
            e.printStackTrace();
	}
        
        File arquivoNotas = new File("Base/Notas.csv");
	path = Paths.get(arquivoNotas.getAbsolutePath());
        int ultimoIdiceNota = GerenciadorDeNotas.getInstance().getUltimoIndice();
        int ultimoIdNota = (ultimoIdiceNota - 1) < 0 ? 1 : Banco.notas.get(ultimoIdiceNota-1).getId()+1;
            
        try (BufferedWriter w = Files.newBufferedWriter(path, StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {
            
            if (!arquivoNotas.exists()) {
                w.write("IdNota;IdPedido;Cliente;TSO;Produto;OD;OE;Valor;DataEntrega;PrevisaoSaida;Perda;Observação;Anexo;Pago");
            }          
                    
            for (int i = ultimoIdice; i < sizePedido; i++) {
                w.newLine();
                w.write(ultimoIdNota+";"+Banco.pedidos.get(i).getId()+";"+Banco.pedidos.get(i).getCliente()+";"+Banco.pedidos.get(i).getTSO()+";"+Banco.pedidos.get(i).getProduto()+";"+Banco.pedidos.get(i).getOD()+";"+Banco.pedidos.get(i).getOE()+";"+Banco.pedidos.get(i).getValor()+";"+Banco.pedidos.get(i).getDataEntrega()+";"+Banco.pedidos.get(i).getPrevisaoDataSaida()+";"+Banco.pedidos.get(i).getPerda()+";"+Banco.pedidos.get(i).getObservacao()+";;"+Banco.pedidos.get(i).getPago());
            }
            
            GerenciadorDeNotas.getInstance().setUltimoIndice(Banco.notas.size());
                      
        } catch (IOException e){
            e.printStackTrace();
	}
        
        
        File jsonNota = new File("Base/Nota.json");
	path = Paths.get(jsonNota.getAbsolutePath());
        
        try (BufferedWriter w = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
  
            for (int i = ultimoIdice; i < sizePedido; i++) {
                w.newLine();
                w.write((i== ultimoIdice ? "[{" : "{")
                        +"\"IdNota\": \"00"+ultimoIdNota+"\","
                        +"\"Codigo\": \"\","
                        +"\"Cliente\": \""+Banco.pedidos.get(i).getCliente()+"\","
                        +"\"TSO\": \""+Banco.pedidos.get(i).getTSO()+"\","
                        +"\"Produto\": \""+Banco.pedidos.get(i).getProduto()+"\","
                        +"\"OD\": \""+Banco.pedidos.get(i).getOD()+"\","
                        +"\"OE\": \""+Banco.pedidos.get(i).getOE()+"\","
                        +"\"Valor\": \""+Banco.pedidos.get(i).getValor()+"\","
                        +"\"DataEntrega\": \""+Banco.pedidos.get(i).getDataEntrega()+"\","
                        +"\"PrevisaoSaidaNota\": \""+Banco.pedidos.get(i).getPrevisaoDataSaida()+"\","
                        +"\"Perda\": \""+Banco.pedidos.get(i).getPerda()+"\","
                        +"\"Observação\": \""+Banco.pedidos.get(i).getObservacao()+"\","
                        +"\"Total\": \""+0+"\","
                        +"\"Anexo\": \"\""
                        +((i+1) < sizePedido ? "}," : "}]"));
            }
            
        } catch (IOException e){
            e.printStackTrace();
	}
        
        
    }
}
