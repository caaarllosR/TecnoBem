/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Controller.Helper.NotaHelper;
import Controller.Helper.PedidoHelper;
import Model.Nota;
import Model.Cliente;
import Model.DAO.Banco;
import Model.DAO.NotaDAO;
import Model.DAO.ClienteDAO;
import Model.GerenciadorDePedidos;
import View.CadastroPedido;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import javax.swing.JTable;

/**
 *
 * @author X
 */
public class NotaController {
    
    private final CadastroPedido viewCadastroPedido;
    private final NotaHelper helper;

    public NotaController() {
        this.viewCadastroPedido = null;
        this.helper = null;
    }
        
    public NotaController(CadastroPedido view) {
        this.viewCadastroPedido = view;
        this.helper = new NotaHelper(view);
    }
    
    
    public void carregaTabela(){
        
        NotaDAO notasDAO = new NotaDAO();
        ArrayList<Nota> notas = notasDAO.selectAll();
        
        helper.preencherJTable(notas);
    }
    
    public void limparText() {
        
        helper.limparTela();
    }
    
    /*public void atualizaTabela(Nota nota){
        
        NotaDAO notasDAO = new NotaDAO();
        notasDAO.update(nota);     
    }
    
    
    public Nota preencheCamposTela(JTable tableNotas) {
        
        return helper.obterCamposJTable(tableNotas);
    }
    
        
    public void adicionar() {
        
        Nota helperNota = helper.obterModelo();
        NotaDAO notaDAO = new NotaDAO();
        notaDAO.insert(helperNota);
        notaDAO.update(helperNota);
        
        carregaTabela();
        limparText();
             
        File arquivoNotas = new File("Base/Notas.csv");
	Path path = Paths.get(arquivoNotas.getAbsolutePath());
        
        
        try (BufferedWriter w = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
            w.write("Id;Cliente;TSO;Produto;OD;OE;Valor;DataEntrega;PrevisaoSaida;Perda;Observação;Anexo;Pago\n");
            for (Nota nota : Banco.notas) {
                w.write(nota.getId()+";"+nota.getCliente()+";"+nota.getTSO()+";"+nota.getProduto()+";"+nota.getOD()+";"+nota.getOE()+";"+nota.getValor()+";"+nota.getDataEntrega()+";"+nota.getPrevisaoDataSaida()+";"+nota.getPerda()+";"+nota.getObservacao()+";;"+nota.getPago());
                w.newLine();
            }
	
        } catch (IOException e){
            e.printStackTrace();
	}
    }*/
    
    
    public void gerarNota() {
        
        Nota helperNota = helper.obterModelo();
        NotaDAO notaDAO = new NotaDAO();
        notaDAO.update(helperNota);
        
        carregaTabela();
        limparText();
             
        File arquivoNotas = new File("Base/Notas.csv");
	Path path = Paths.get(arquivoNotas.getAbsolutePath());
        
        try (BufferedWriter w = Files.newBufferedWriter(path, StandardCharsets.UTF_8, StandardOpenOption.APPEND)) {
            
            if (!arquivoNotas.exists()) {
                w.write("IdNota;IdNota;Cliente;TSO;Produto;OD;OE;Valor;DataEntrega;PrevisaoSaida;Perda;Observação;Anexo;Pago\n");
            }
            
            int ultimoId = GerenciadorDePedidos.getInstance().getIndice();
            int size = Banco.notas.size();
        
            for (int i = ultimoId; i < size; i++) {
                w.write(Banco.notas.get(i).getId()+";"+Banco.notas.get(i).getId()+";"+Banco.notas.get(i).getCliente()+";"+Banco.notas.get(i).getTSO()+";"+Banco.notas.get(i).getProduto()+";"+Banco.notas.get(i).getOD()+";"+Banco.notas.get(i).getOE()+";"+Banco.notas.get(i).getValor()+";"+Banco.notas.get(i).getDataEntrega()+";"+Banco.notas.get(i).getPrevisaoDataSaida()+";"+Banco.notas.get(i).getPerda()+";"+Banco.notas.get(i).getObservacao()+";;"+Banco.notas.get(i).getPago());
                w.newLine();
            }
            
            GerenciadorDePedidos.getInstance().setIndice(Banco.notas.size());

        } catch (IOException e){
            e.printStackTrace();
	}
        
    }
}
