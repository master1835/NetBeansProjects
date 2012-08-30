/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package producto;

/**
 *
 * @author mariano
 */
public class Main {
    
    public static void main(String[] args) {
     Pais pais=new Pais(1, "Argentina");
     Marca marca=new Marca(1, "BGH");
     Marca marca2=new Marca(2, "Lenovo");
     Producto prod=new Producto(500742, "TV led 47", Marca.class, Pais);
     
     System.out.printl(prod, prod.gen);
    }
    
}
