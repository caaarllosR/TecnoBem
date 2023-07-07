/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author X
 */
public class GerenciadorDepedidos {
    
    private static final GerenciadorDepedidos INSTANCE = new GerenciadorDepedidos();
    private Pedido pedido;

    private GerenciadorDepedidos() {
    }

    public static GerenciadorDepedidos getInstance() {
      return INSTANCE;
    }

    public Pedido getPedido() {
          return pedido;
    }

    public void setPedido(Pedido pedido) {
          this.pedido = pedido;
    }
}