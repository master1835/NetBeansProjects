/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package texto;

/**
 *
 * @author Mariano
 */
public class Main {
       public static void main(String[] args) {
        
        Textos t = new Textos();
        t.leer("carta_universitaria.txt");
        t.escribir("escrito.txt");
}
}
