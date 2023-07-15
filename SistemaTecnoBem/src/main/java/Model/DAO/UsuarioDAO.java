/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Usuario;
import java.util.ArrayList;

/**
 *
 * @author Carlos
 */
public class UsuarioDAO {
            
    /**
     * Insere um usuario dentro do banco de dados
     * @param usuario exige que seja passado um objeto do tipo usuario
     */
    public void insert(Usuario usuario){
        Banco.usuarios.add(usuario);
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param usuario
     * @return 
     */
    public boolean update(Usuario usuario){
        
        for (int i = 0; i < Banco.usuarios.size(); i++) {
            if(idSaoIguais(Banco.usuarios.get(i),usuario)){
                Banco.usuarios.set(i, usuario);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do usuario passado
     * @param usuario
     * @return 
     */
    public boolean delete(Usuario usuario){
        for (Usuario usuarioLista : Banco.usuarios) {
            if(idSaoIguais(usuarioLista,usuario)){
                Banco.usuarios.remove(usuarioLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os usuarios do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Usuario> selectAll(){
        return Banco.usuarios;
    }
    
    /**
     * Retorna um Objeto do tipo usuario se a funcao encontrar o usuario passado como parâmetro no banco, para considerar sao usado nome e senha
     * @param usuario
     * @return Usuario encontrado no banco de dados
     */
    public Usuario selectPorLoginESenha(Usuario usuario){
        for (Usuario usuarioLista : Banco.usuarios) {
            if(loginESenhaSaoIguais(usuarioLista,usuario)){
                return usuarioLista;
            }
        }
        return null;
    }

    /**
     * Recebe dois objetos e verifica se são iguais verificando o nome e senha
     * @param usuario
     * @param usuarioAPesquisar
     * @return verdadeiro caso sejam iguais e falso caso nao forem iguais
     */
    private boolean loginESenhaSaoIguais(Usuario usuario, Usuario usuarioAPesquisar) {
        return usuario.getLogin().equals(usuarioAPesquisar.getLogin()) && usuario.getSenha().equals(usuarioAPesquisar.getSenha());
    }

    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param usuario
     * @param usuarioAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(Usuario usuario, Usuario usuarioAComparar) {
        return usuario.getId() ==  usuarioAComparar.getId();
    }
    
    
    
}
