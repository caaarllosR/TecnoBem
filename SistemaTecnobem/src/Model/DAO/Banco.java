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
                    w.write("Id;Cliente;CpfCnpj;Endereço;CEP;Telefone1;Telefone2;E-mail;Observação;Vencimento;Limite\n");
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
        
        // carregamento do arquivo de pedidos para a base de dados       
        File filePedidos = new File("Base/Pedidos.csv");
        
        if (filePedidos.exists()) {
	Path pathPedidos = Paths.get(filePedidos.getAbsolutePath());
        
        int id = 0;
        String TSO = "";
        String cliente = "";
        String servico = "";
        String OD = "";
        String OE = "";
        String valor = "";
        String dataEntrega = "";
        String previsaoDataSaida = "";
        String perda = "";
        String observacao = "";
               

        
        try(BufferedReader br = Files.newBufferedReader(pathPedidos)){

            br.readLine();
                    
            while(br.ready()){

                String[] dadosPedido = br.readLine().split(";");             

                id = Integer.parseInt(dadosPedido[0]);
                cliente = dadosPedido.length >= 2 ? dadosPedido[1] : "";
                TSO = dadosPedido.length >= 3 ? dadosPedido[2] : "";
                servico = dadosPedido.length >= 4 ? dadosPedido[3] : "";
                OD = dadosPedido.length >= 5 ? dadosPedido[4] : "";                                
                OE = dadosPedido.length >= 6 ? dadosPedido[5] : "";                                                
                valor = dadosPedido.length >= 7 ? dadosPedido[6] : "";
                dataEntrega = dadosPedido.length >= 8 ? dadosPedido[7] : "";
                previsaoDataSaida = dadosPedido.length >= 9 ? dadosPedido[8] : "";
                perda = dadosPedido.length >= 10 ? dadosPedido[9] : "";    
                observacao = dadosPedido.length == 11 ? dadosPedido[10] : "";
                
                pedidos.add(new Pedido(id, cliente, TSO, servico, OD, OE, valor, dataEntrega, previsaoDataSaida, perda, observacao));
                        
            } 
                
            br.close();

	}catch(IOException e){
            e.printStackTrace();
	}
             
    }
    }
}
