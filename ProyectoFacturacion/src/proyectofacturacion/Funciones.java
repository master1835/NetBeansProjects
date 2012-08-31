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
public class Funciones {
   
    public static boolean esDiaHabil(GregorianCalendar f){
        boolean dhab=false;
        
        if ((f.get(Calendar.DAY_OF_WEEK)==1) || (f.get(Calendar.DAY_OF_WEEK)==7)){
        dhab=true;
      }
       
    return dhab;
    }
    
    public static String traerFechaCorta(GregorianCalendar f){
        String g = f.get(Calendar.DATE)+"/"+(f.get(Calendar.MONTH)+1)+"/"+f.get(Calendar.YEAR);
        return g;
    }
    
    public static GregorianCalendar traerPrimerDiaHabil(GregorianCalendar f){
    int dia = f.get(Calendar.DAY_OF_WEEK);

        while ((dia==1)||(dia==7))
        {
            dia++;
        } 

    return new GregorianCalendar(f.get(Calendar.YEAR), f.get(Calendar.MONTH), dia);
    }
    
    public String traerPrimerDiaHabilFechaCorta(GregorianCalendar f){
       
        int dia=f.get(Calendar.DATE);
        
        while ((dia==1)||(dia==7)) {
            
             dia++;
        }
        
        return traerFechaCorta(new GregorianCalendar(f.get(Calendar.YEAR), f.get(Calendar.MONTH), dia));
    }
    
}
