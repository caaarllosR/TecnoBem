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
public class Nota {
    
    private int    idNota;
    private int    idPedido;
    private String cliente;
    private String TSO;
    private String produto;
    private String OD;
    private String OE;
    private String valor;
    private String dataEntrada;
    private String previsaoDataSaida;
    private String perda;
    private String observacao;
    private String anexo;
    private String pago;
    
    public Nota(int idNota, int idPedido, String cliente, String TSO, String produto, String OD, String OE, String valor, String dataEntrada, String previsaoDataSaida, String perda, String pago) {
        this.idNota = idNota;
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.TSO = TSO;
        this.produto = produto;
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
        this.pago = pago;
    }
      
    public Nota(int idNota, int idPedido, String cliente, String TSO, String produto, String OD, String OE, String valor, String dataEntrada, String previsaoDataSaida, String perda, String observacao, String anexo, String pago) {
        
        this(idNota, idPedido, cliente, TSO, produto, OD, OE, valor, dataEntrada, previsaoDataSaida, perda, pago);
        this.anexo = anexo;
        this.observacao = observacao;
    }
        

    public int getId() {
        return idNota;
    }

    public void setId(int idNota) {
        this.idNota = idNota;
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

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }
    
    public String getPago() {
        return pago;
    }

}
