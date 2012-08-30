/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package producto;

/**
 *
 * @author mariano
 */
public class Marca {
private int codMarca;
private String marca;

    public Marca(int codMarca, String marca) {
        this.codMarca = codMarca;
        this.marca = marca;
    }

    public int getCodMarca() {
        return codMarca;
    }

    public String getMarca() {
        return marca;
    }

    public void setCodMarca(int codMarca) {
        this.codMarca = codMarca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

   
    
    
    
    }
