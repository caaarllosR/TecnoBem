/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author X
 */
public class Nota {
    
    private String TSO;
    private String codigo;
    private String nota;
    private String cliente;
    private String produto;
    private String valor;
    private String total;
    private String data;

    public Nota (String TSO, String codigo, String nota, String cliente, String produto, String valor, String total, String data){
        this.TSO = TSO;
        this.codigo = codigo;
        this.nota = nota;
        this.cliente = cliente;
        this.produto = produto;
        this.valor = valor;
        this.total = total;
        this.data = data;
    }
    
    public String getTSO() {
        return TSO;
    }
    
    public void setTSO(String TSO) {
        this.TSO = TSO;
    }
    
    public String getCodigo() {
        return codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String getNota() {
        return nota;
    }
    
    public void setNota(String nota) {
        this.nota = nota;
    }
    
    public String getCliente() {
        return cliente;
    }
    
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    public String getProduto() {
        return produto;
    }
    
    public void setProduto(String produto) {
        this.produto = produto;
    }
    
    public String getValor() {
        return valor;
    }
    
    public void setValor(String valor) {
        this.valor = valor;
    }
    
    public String getTotal() {
        return total;
    }
    
    public void setTotal(String total) {
        this.total = total;
    }
    
    public String getData() {
        return data;
    }
    
    public void setData(String data) {
        this.data = data;
    }
}