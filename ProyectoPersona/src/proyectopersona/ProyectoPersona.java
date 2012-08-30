/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopersona;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author mariano
 */
public class ProyectoPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
           GregorianCalendar calen=new GregorianCalendar(1991, 5, 15);

    Persona p=new Persona(13456321, "gonzalez", "emiliano", calen);
    
    
    System.out.println(p.calcularEdad());
   
    if(p.equals(p)){
        System.out.println("las personas coinciden");
    }else{
        System.out.println("las personas NO coinciden");
    }
    }
}
