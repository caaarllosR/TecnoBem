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
     * Insere um agendamento dentro do banco de dados
     * @param pedido exige que seja passado um objeto do tipo agendamento
     */
    public void insert(Pedido pedido){
          
        if(pedido.getId() == 0){
            pedido.setId(proximoId());
            Banco.pedidos.add(pedido);
        }
        
        
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param agendamento
     * @return 
     */
    public boolean update(Pedido agendamento){
        
        for (int i = 0; i < Banco.pedidos.size(); i++) {
            if(comparaId(Banco.pedidos.get(i),agendamento)){
                Banco.pedidos.set(i, agendamento);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do agendamento passado
     * @param agendamento
     * @return 
     */
    public boolean delete(Pedido agendamento){
        for (Pedido agendamentoLista : Banco.pedidos) {
            if(comparaId(agendamentoLista,agendamento)){
                Banco.pedidos.remove(agendamentoLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os agendamentos do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Pedido> selectAll(){
        return Banco.pedidos;
    }
    
    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param agendamento
     * @param agendamentoAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean comparaId(Pedido agendamento, Pedido agendamentoAComparar) {
        return agendamento.getId() ==  agendamentoAComparar.getId();
    }
    
    private int proximoId(){
        
        int maiorId = 0;
        
        for (Pedido agendamento : Banco.pedidos) {           
           int id = agendamento.getId();
            
            if(maiorId < id){
                maiorId = id;
            }
            
        }
        
        return maiorId + 1;
    }
    
}
