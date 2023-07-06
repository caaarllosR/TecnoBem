/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import java.awt.image.BufferedImage;
import Controller.Helper.PedidoHelper;
import Model.Pedido;
import Model.Cliente;
import Model.DAO.Banco;
import Model.DAO.PedidoDAO;
import Model.DAO.ClienteDAO;
import View.CadastroPedido;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;

/**
 *
 * @author X
 */
public class PedidoController {
    
    private final CadastroPedido view;
    private final PedidoHelper helper;


    public PedidoController(CadastroPedido view) {
        this.view = view;
        this.helper = new PedidoHelper(view);
    }
    
    public void carregaTabela(){
        
        PedidoDAO pedidosDAO = new PedidoDAO();
        ArrayList<Pedido> pedidos = pedidosDAO.selectAll();
        
        helper.preencherTabela(pedidos);
    }
    
    public void atualizaTabela(Pedido pedido){
        
        PedidoDAO pedidosDAO = new PedidoDAO();
        pedidosDAO.update(pedido);     
    }
    
    public void carregaJComboClientes() {
        
        ClienteDAO clienteDAO = new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDAO.selectAll();
        helper.preencheComboClientes(clientes);
    }
    
    public void preencheText(JTable TablePedidos) {
        
        helper.obterTextTabela(TablePedidos);
    }
    
    public void limparText() {
        
        helper.limparTela();
    }
        
    public void agendar() {
        
        Pedido helperPedido = helper.obterModelo();
        PedidoDAO pedidoDAO = new PedidoDAO();
        pedidoDAO.insert(helperPedido);
        pedidoDAO.update(helperPedido);
        
        carregaTabela();
        limparText();
             
        File dp = new File("Base/Pedidos.csv");
	Path path = Paths.get(dp.getAbsolutePath());
        
        
        try (BufferedWriter w = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
            w.write("Id;Cliente;TSO;Pedido;OD;OE;Valor;DataEntrega;PrevisaoSaida;Perda;Observação;Anexo\n");
            for (Pedido pedido : Banco.pedidos) {
                w.write(pedido.getId()+";"+pedido.getCliente()+";"+pedido.getTSO()+";"+pedido.getServico()+";"+pedido.getOD()+";"+pedido.getOE()+";"+pedido.getValor()+";"+pedido.getDataEntrega()+";"+pedido.getPrevisaoDataSaida()+";"+pedido.getPerda()+";"+pedido.getObservacao()+";"+pedido.getPago());
                w.newLine();
            }
	
        } catch (IOException e){
            e.printStackTrace();
	}
    }
  
    public void printJFrame(JFrame frame) {
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        // Realizar a impressão do conteúdo do JFrame
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(new Printable() {
            @Override
            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
                if (pageIndex > 0) {
                    return NO_SUCH_PAGE;
                }

                Graphics2D g2d = (Graphics2D) graphics;
                g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());

                JPanel contentPane = (JPanel) frame.getContentPane();
                contentPane.printAll(g2d);

                return PAGE_EXISTS;
            }
        });

        if (job.printDialog()) {
            try {
                job.print();
                System.out.println("Impressão concluída com sucesso.");
            } catch (PrinterException ex) {
                ex.printStackTrace();
            }
        }
    }

    public Image resizeImage(Image image, int desiredWidth) {
        int originalWidth = image.getWidth(null);
        int originalHeight = image.getHeight(null);
        int scaledHeight = (int) ((double) originalHeight / originalWidth * desiredWidth);

        BufferedImage resizedImage = new BufferedImage(desiredWidth, scaledHeight, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = resizedImage.createGraphics();
        g2d.drawImage(image, 0, 0, desiredWidth, scaledHeight, null);
        g2d.dispose();

        return resizedImage;
    }
}
