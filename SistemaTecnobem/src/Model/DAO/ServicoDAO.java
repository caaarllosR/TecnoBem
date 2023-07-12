/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Produto;
import java.util.ArrayList;

/**
 *
 * @author Carlos
 */
public class ServicoDAO {
    
    
    /**
     * Insere um servico dentro do banco de dados
     * @param servico exige que seja passado um objeto do tipo servico
     */
    public void insert(Produto servico){
        Banco.produtos.add(servico);
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param servico
     * @return 
     */
    public boolean update(Produto servico){
        
        for (int i = 0; i < Banco.produtos.size(); i++) {
            if(idSaoIguais(Banco.produtos.get(i),servico)){
                Banco.produtos.set(i, servico);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do servico passado
     * @param servico
     * @return 
     */
    public boolean delete(Produto servico){
        for (Produto servicoLista : Banco.produtos) {
            if(idSaoIguais(servicoLista,servico)){
                Banco.produtos.remove(servicoLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os servicos do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Produto> selectAll(){
        return Banco.produtos;
    }
    
    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param servico
     * @param servicoAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(Produto servico, Produto servicoAComparar) {
        return servico.getId() ==  servicoAComparar.getId();
    }
    
}
