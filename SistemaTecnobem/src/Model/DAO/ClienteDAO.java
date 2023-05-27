/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Cliente;
import java.util.ArrayList;

/**
 *
 * @author Carlos
 */
public class ClienteDAO {
    
    
    /**
     * Insere um cliente dentro do banco de dados
     * @param cliente exige que seja passado um objeto do tipo cliente
     */
    public void insert(Cliente cliente){
        
        if(cliente.getId().equals("0")){
            cliente.setId(proximoId().toString());
            Banco.clientes.add(cliente);
        }
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param cliente
     * @return 
     */
    public boolean update(Cliente cliente){
        
        for (int i = 0; i < Banco.clientes.size(); i++) {
            if(comparaId(Banco.clientes.get(i),cliente)){
                Banco.clientes.set(i, cliente);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do cliente passado
     * @param cliente
     * @return 
     */
    public boolean delete(Cliente cliente){
        for (Cliente clienteLista : Banco.clientes) {
            if(comparaId(clienteLista,cliente)){
                Banco.clientes.remove(clienteLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os clientes do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Cliente> selectAll(){
        return Banco.clientes;
    }
    
    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param cliente
     * @param clienteAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean comparaId(Cliente cliente, Cliente clienteAComparar) {
        return cliente.getId().equals(clienteAComparar.getId());
    }
    
    private Integer proximoId(){
        
        Integer maiorId = 0;
        
        for (Cliente cliente : Banco.clientes) {           
           int id = Integer.parseInt(cliente.getId());
            
            if(maiorId < id){
                maiorId = id;
            }
            
        }
        
        return maiorId + 1;
    }
    
}
