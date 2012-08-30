/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofacturacion;

import java.util.Calendar;
import java.util.GregorianCalendar;


/**
 *
 * @author Mariano
 */
public class ProyectoFacturacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GregorianCalendar calen=new GregorianCalendar();
        Cliente c = new Cliente("gonzalez", "emiliano");
        Cliente c2 = new Cliente("rodriguez", "agustin");
        Cliente c3 = new Cliente("gomez", "sofia");
        Factura f = new Factura(c, 7, 1999, 545.36);
        Factura f2 = new Factura(c2, 4, 1992, 401.54);
        Factura f3 = new Factura(c3, 2, 1997, 222.87);
        Funciones fu = new Funciones();
        
        
        if (fu.esDiaHabil(new GregorianCalendar())){   
            System.out.println("es un día hábil");
        }else{
            System.out.println("NO es un día hábil");
        }
        
        if (fu.esDiaHabil(new GregorianCalendar(2012, 7, 26))){   
            System.out.println("es un día hábil");
        }else{
            System.out.println("NO es un día hábil");
        }
       
        System.out.println(c.traerCliente());
        System.out.println(c2.traerCliente());
        System.out.println(c3.traerCliente());
        
        
        System.out.println(f.traerFactura());
        System.out.println(f2.traerFactura());
        System.out.println(f3.traerFactura());
        
        
        System.out.println("fecha corta: " + Funciones.traerFechaCorta(calen));
        System.out.println("la fecha de la factura es: " + f.traerFechaDeLaFactura());
        System.out.println("la fecha de vencimiento de la factura es: " + f.traerFechaDeVencimiento());
        
    }
}
