/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author X
 */
public class GerenciadorDeNotas {
    
    private static final GerenciadorDeNotas INSTANCE = new GerenciadorDeNotas();
    private Nota notas;
    private int ultimoIndice;
    private int ultimoId;
            
    private GerenciadorDeNotas() {
    }

    public static GerenciadorDeNotas getInstance() {
      return INSTANCE;
    }

    public Nota getNota() {
          return notas;
    }
    
    public int getUltimoIndice() {
          return ultimoIndice;
    }       
        
    public void setNota(Nota notas) {
          this.notas = notas;
    }
    
    public void setUltimoIndice(int ultimoIndice) {
          this.ultimoIndice = ultimoIndice;
    }
}