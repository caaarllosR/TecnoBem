/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Nota;
import java.util.ArrayList;

/**
 *
 * @author Carlos
 */
public class NotaDAO {
    
    /**
     * Insere um nota dentro do banco de dados
     * @param nota exige que seja passado um objeto do tipo nota
     */
    public boolean insert(Nota nota){
        
        if(nota.getId() == 0){
            nota.setId(proximoId());
            Banco.notas.add(nota);
            return true;
        }     
        return false;      
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param nota
     * @return 
     */
    public boolean update(Nota nota){
        
        for (int i = 0; i < Banco.notas.size(); i++) {
            if(comparaId(Banco.notas.get(i),nota)){
                Banco.notas.set(i, nota);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do nota passado
     * @param nota
     * @return 
     */
    public boolean delete(Nota nota){
        for (Nota notaLista : Banco.notas) {
            if(comparaId(notaLista,nota)){
                Banco.notas.remove(nota);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os notas do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Nota> selectAll(){
        return Banco.notas;
    }
    
    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param nota
     * @param notaAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean comparaId(Nota nota, Nota notaAComparar) {
        System.out.println("Nota Id: "+nota.getId()+"notaAComparar Id: "+notaAComparar.getId());
        return nota.getId() == notaAComparar.getId();
    }
    
    private int proximoId(){
        
        int maiorId = 0;
        
        for (Nota nota : Banco.notas) {           
           int id = nota.getId();
            
            if(maiorId < id){
                maiorId = id;
            }
            
        }
        
        return maiorId + 1;
    }
    
}
