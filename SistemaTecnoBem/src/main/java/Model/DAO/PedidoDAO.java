/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Pedido;
import java.util.ArrayList;

/**
 *
 * @author Carlos
 */
public class PedidoDAO {
    
    /**
     * Insere um pedido dentro do banco de dados
     * @param pedido exige que seja passado um objeto do tipo pedido
     */
    public boolean insert(Pedido pedido){
        
        if(pedido.getId() == 0){
            pedido.setId(proximoId());
            Banco.pedidos.add(pedido);
            return true;
        }     
        return false;      
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param pedido
     * @return 
     */
    public boolean update(Pedido pedido){
        
        for (int i = 0; i < Banco.pedidos.size(); i++) {
            if(comparaId(Banco.pedidos.get(i),pedido)){
                Banco.pedidos.set(i, pedido);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do pedido passado
     * @param pedido
     * @return 
     */
    public boolean delete(Pedido pedido){
        for (Pedido pedidoLista : Banco.pedidos) {
            if(comparaId(pedidoLista,pedido)){
                Banco.pedidos.remove(pedido);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os pedidos do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Pedido> selectAll(){
        return Banco.pedidos;
    }
    
    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param pedido
     * @param pedidoAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean comparaId(Pedido pedido, Pedido pedidoAComparar) {
        System.out.println("Pedido Id: "+pedido.getId()+"pedidoAComparar Id: "+pedidoAComparar.getId());
        return pedido.getId() == pedidoAComparar.getId();
    }
    
    private int proximoId(){
        
        int maiorId = 0;
        
        for (Pedido pedido : Banco.pedidos) {           
           int id = pedido.getId();
            
            if(maiorId < id){
                maiorId = id;
            }
            
        }
        
        return maiorId + 1;
    }
    
}
