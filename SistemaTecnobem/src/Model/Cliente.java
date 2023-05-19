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
public class Cliente {

    private String idCliente = "";
    private String nome = "";
    private String endereco = "";
    private String cep = "";
    private String telefone1 = "";
    private String telefone2 = "";
    private String email = "";
    private String cpfCnpj = "";
    private String observacao = "";
    private String vencimento = "";
    private String limite = "";
    
    public Cliente(String idCliente, String nome, String telefone1, String telefone2, String email, String cpfCnpj, String endereco, String cep, String observacao, String vencimento, String limite) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.telefone1 = telefone1;
        this.telefone2 = telefone2;
        this.email = email;
        this.cpfCnpj = cpfCnpj;
        this.endereco = endereco;
        this.cep = cep;
        this.observacao = observacao;
        this.vencimento = vencimento;
        this.limite = limite;

    }

    public Cliente(String idCliente, String nome, String endereco, String cep) {
        this.idCliente = idCliente;
        this.nome = nome;        
        this.endereco = endereco;
        this.cep = cep;
    }
    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNome(){
        return nome;
    }

    public String getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }
    
    public String getLimite() {
        return limite;
    }

    public void setLimite(String limite) {
        this.limite = limite;
    }
}
