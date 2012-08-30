/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoconsumo;

/**
 *
 * @author Mariano
 */
public class ProyectoConsumo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Marca m = new Marca(1, "BGH");
        Marca m2 = new Marca(2, "Lenovo");
        Pais pa = new Pais(1, "Argentina");
        Pais pa2 = new Pais(2, "China");
        Producto pr1= new Producto("500742", "TV.LED 47''BGH FEELNO.BLE4712D", m, pa, 7699.00);
        Producto pr2= new Producto("361693", "NOTEBOOK LENOVO G470 59337429", m2, pa2, 4299.00);
        
        System.out.println(m.equals(m));
        System.out.println(pa.equals(pa));
        System.out.println(pr1.equals(pr1));
        System.out.println(pr1.generarLineaProducto());
        System.out.println(pr2.generarLineaProducto());
    }
}
