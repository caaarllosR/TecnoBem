/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author X
 */
public class Usuario extends Pessoa {
    
    protected String login;
    protected String senha;
    protected String nivelAcesso;

    public Usuario(int id, String nome, char sexo, String dataNascimento, String login, String senha, String nivelAcesso) {
        super(id, nome, sexo, dataNascimento);
        this.login = login;
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    public Usuario(String login, String senha, String nivelAcesso, int id, String nome) {
        super(id, nome);
        this.login = login;
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    public Usuario(String login, String senha) {
        super(0, null);
        this.login = login;
        this.senha = senha;
    }

    
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    
    
    
}
