/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.CadastroCliente;
import View.CadastroPedido;
import View.MenuPrincipal;
import java.io.IOException;

/**
 *
 * @author X
 */
public class MenuPrincipalController {
    
    private final MenuPrincipal view;

    public MenuPrincipalController(MenuPrincipal view) {
        this.view = view;
    }
    
    public void navegarParaPedidos() throws IOException{
        
        CadastroPedido pedidos = new CadastroPedido();
        pedidos.setVisible(true);
    }
    
    public void navegarParaCadastroClientes() throws IOException{
        
        CadastroCliente cadastroClientes = new CadastroCliente();
        cadastroClientes.setVisible(true);
    }
        
}
