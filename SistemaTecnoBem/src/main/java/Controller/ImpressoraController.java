/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author X
 */
public class ImpressoraController {
    
    private JFrame frame;
    
    public ImpressoraController(JFrame frame) {
        
        this.frame = frame;
    }
    
    
    public void printJFrame() {
        
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        // Definir as dimensões da folha A4
        double pageWidth  = 595; // Largura em pixels (72dpi)
        double pageHeight = 842; // Altura em pixels (72dpi)

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

                // Obter as dimensões do painel de conteúdo
                int contentWidth = contentPane.getWidth();
                int contentHeight = contentPane.getHeight();

                // Redimensionar o painel para caber na folha A4
                double scaleX = pageWidth / contentWidth;
                double scaleY = pageHeight / contentHeight;
                double scaleFactor = Math.min(scaleX, scaleY);
                g2d.scale(scaleFactor, scaleFactor);

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
}
