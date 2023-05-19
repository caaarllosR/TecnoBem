/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Pedido;
import Model.Cliente;
import Model.Servico;
import Model.Usuario;
import java.io.BufferedReader;
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
import java.util.StringTokenizer;

/**
 *
 * @author Carlos
 */
public class Banco {
    
    public static ArrayList<Usuario> usuarios;
    public static ArrayList<Cliente> clientes;
    public static ArrayList<Servico> servicos;
    public static ArrayList<Pedido>  pedidos;
    
    
    public static void carregaUsuarios() throws IOException{
    
        //Instancia os Objetos
        usuarios = new ArrayList<Usuario>();
        
        //criando elementos
        
        Usuario adm = new Usuario(1, "Administrador", 'M', "09/05/1996",  "adm", "123", "administrador");
        usuarios.add(adm);
        
    }
    
    public static void carregaClientes() throws IOException{
    
        //Instancia os Objetos
        clientes = new ArrayList<Cliente>();
        String id = "";
        String cliente = "";
        String cpfCnpj = "";
        String endereco = "";
        String cep = "";
        String telefone1 = "";
        String telefone2 = "";
        String email = "";
        String observacao = ""; 
        String vencimento = ""; 
        String limite = ""; 
        
        // carregamento do arquivo de clientes para a base de dados
        
        File fileClientes = new File("Base/Clientes.csv");
        fileClientes.createNewFile();       
        OpenOption options = StandardOpenOption.APPEND;
        
	Path pathClientes = Paths.get(fileClientes.getAbsolutePath());
        
        try(BufferedReader br = Files.newBufferedReader(pathClientes)){
            
            if(br.readLine() == null) {
                try (BufferedWriter w = Files.newBufferedWriter(pathClientes, StandardCharsets.UTF_8, options)) {
                    w.write("Id;Cliente;CpfCnpj;Endereço;CEP;Telefone1;Telefone2;E-mail;Observação,Vencimento,Limite\n");
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            
            br.close();
        }
        
        try(BufferedReader br = Files.newBufferedReader(pathClientes)){ 
            
            br.readLine();

            while(br.ready()){

                String[] dadosCliente = br.readLine().split(";");
                
                for(String item : dadosCliente) {
                    System.out.println(dadosCliente[0]);
                }
                
                //StringTokenizer stDadosCliente = new StringTokenizer(br.readLine(),";");               
                
                    id = dadosCliente[0];
                                
                    cliente = dadosCliente[1];

                    cpfCnpj = dadosCliente[2];

                    endereco = dadosCliente[3];

                    cep = dadosCliente[4];

                    telefone1 = dadosCliente[5];

                    telefone2 = dadosCliente[6];

                    email = dadosCliente[7];

                    observacao = dadosCliente[8];
                
                    vencimento = dadosCliente[9];
                
                    limite = dadosCliente[10];

                clientes.add(new Cliente(id, cliente, cpfCnpj, endereco, cep, telefone1, telefone2, email, observacao, vencimento, limite));
            }
            
            br.close();
            
	}catch(IOException e){
            e.printStackTrace();
	}
                                
    }
    
    public static void carregaPedidos() throws IOException{
    
        //Instancia os Objetos
        pedidos = new ArrayList<Pedido>();
        
        String TSO = "";
        String cliente = "";
        String servico = "";
        String OD = "";
        String OE = "";
        String valor = "";
        String dataEntrega = "";
        String observacao = "";
        
        
        // carregamento do arquivo de pedidos para a base de dados
        
        File filePedidos = new File("Base/Pedidos.csv");
        filePedidos.createNewFile();
        OpenOption options = StandardOpenOption.APPEND;
           
	Path pathPedidos = Paths.get(filePedidos.getAbsolutePath());
        int idPedidos = 1;
                    
        try(BufferedReader br = Files.newBufferedReader(pathPedidos)){
            
            if(br.readLine() == null) {
                try (BufferedWriter w = Files.newBufferedWriter(pathPedidos, StandardCharsets.UTF_8, options)) {
                    w.write("TSO;Cliente;Serviço;OD;OE;Valor;DataEntrega;Observação\n");
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            
            br.close();
        }
        
        try(BufferedReader br = Files.newBufferedReader(pathPedidos)){

            br.readLine();
                    
            while(br.ready()){

                StringTokenizer stDadosPedido = new StringTokenizer(br.readLine(),";");

                if (stDadosPedido.hasMoreElements()) {
                    TSO = stDadosPedido.nextToken();
                }

                if (stDadosPedido.hasMoreElements()) {
                    cliente = stDadosPedido.nextToken();
                }

                if (stDadosPedido.hasMoreElements()) {
                    servico = stDadosPedido.nextToken();
                }

                if (stDadosPedido.hasMoreElements()) {
                    OD = stDadosPedido.nextToken();
                }
                                
                if (stDadosPedido.hasMoreElements()) {
                    OE = stDadosPedido.nextToken();
                }
                                                
                if (stDadosPedido.hasMoreElements()) {
                    valor = stDadosPedido.nextToken();
                }

                if (stDadosPedido.hasMoreElements()) {
                    dataEntrega = stDadosPedido.nextToken();
                }

                if (stDadosPedido.hasMoreElements()) {
                    observacao = stDadosPedido.nextToken();
                }

                pedidos.add(new Pedido(idPedidos, TSO, cliente, servico, OD, OE, valor, dataEntrega, observacao));
                        
            }
            
            br.close();

	}catch(IOException e){
            e.printStackTrace();
	}
             
    }
    
}
