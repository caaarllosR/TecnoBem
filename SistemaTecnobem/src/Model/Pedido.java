/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author X
 */
public class Pedido {
    
    private int id;
    private String cliente;
    private String servico;
    private String OD;
    private String OE;
    private String valor;
    private String dataEntrada;
    private String previsaoDataSaida;
    private String perda;
    private String observacao;
    private String TSO;

    public Pedido(int id, String TSO, String cliente, String servico, String OD, String OE, String valor, String dataEntrada, String previsaoDataSaida, String perda) {
        this.id = id;
        this.cliente = cliente;
        this.TSO = TSO;
        this.servico = servico;
        this.OD = OD;
        this.OE = OE;
        this.valor = valor;
        /*try {
            this.data = new SimpleDateFormat("dd/MM/yyyy").parse(data);
        } catch (ParseException ex) {
            Logger.getLogger(Pedido.class.getName()).log(Level.SEVERE, "deu ruim", ex);
        }*/
        this.dataEntrada = dataEntrada;
        this.previsaoDataSaida = previsaoDataSaida;
        this.perda = perda;
    }
    
    
    public Pedido(int id, String TSO, String cliente, String servico, String OD, String OE, String valor, String dataEntrada, String previsaoDataSaida, String perda, String observacao) {
        
        this(id, TSO, cliente, servico, OD, OE, valor, dataEntrada, previsaoDataSaida, perda);
        this.observacao = observacao;
    }
        

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getOD() {
        return OD;
    }

    public void setOD(String OD) {
        this.OD = OD;
    }
    
    public String getOE() {
        return OE;
    }

    public void setOE(String OE) {
        this.OE = OE;
    }
    
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getDataEntrega() {
        //return new SimpleDateFormat("dd/MM/yyyy").format(data);
        return dataEntrada;
    }
    
    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    public String getPrevisaoDataSaida() {
        return previsaoDataSaida;
    }

    public void setPrevisaoDataSaida(String previsaoDataSaida) {
        this.previsaoDataSaida = previsaoDataSaida;
    }
    
    public String getPerda() {
        return perda;
    }

    public void setPerda(String perda) {
        this.perda = perda;
    }

    public String getTSO() {
        return TSO;
    }

    public void setTSO(String TSO) {
        this.TSO = TSO;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }
    
    
    
}
