/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author X
 */
public class GerenciadorDePedidos {
    
    private static final GerenciadorDePedidos INSTANCE = new GerenciadorDePedidos();
    private Pedido pedidos;
    private int ultimoIndice;
            
    private GerenciadorDePedidos() {
    }

    public static GerenciadorDePedidos getInstance() {
      return INSTANCE;
    }

    public Pedido getPedido() {
          return pedidos;
    }
    
    public int getIndice() {
          return ultimoIndice;
    }
        
    public void setPedido(Pedido pedidos) {
          this.pedidos = pedidos;
    }
    
    public void setIndice(int ultimoIndice) {
          this.ultimoIndice = ultimoIndice;
    }
        

}