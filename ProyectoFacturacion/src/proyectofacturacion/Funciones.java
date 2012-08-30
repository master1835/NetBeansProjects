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
        boolean r = false;
        int dia=f.get(Calendar.DATE); 
        
        while (r==false){
        if ((dia>1)||(dia<7)){
            
            break;
        }
        dia=dia+1;
        }
        f.set(f.get(Calendar.YEAR), f.get(Calendar.MONTH), dia);
        return f;
    }
    
    public String traerPrimerDiaHabilFechaCorta(GregorianCalendar f){
        boolean r = true;
        int dia=f.get(Calendar.DATE);
        
        while (r==true){
        if ((dia>1)||(dia<7)){
            
            break;
        }
        dia=dia+1;
        }
        f.set(f.get(Calendar.YEAR), f.get(Calendar.MONTH), dia);
        return (dia+"/"+f.MONTH+"/"+f.YEAR);
    }
    
}
