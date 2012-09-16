/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nrodedni;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author mariano
 */
public class Funciones {
    
    public static String traerDiaHabil(GregorianCalendar ca){ 
       
        while((ca.get(Calendar.DAY_OF_WEEK)==1)||(ca.get(Calendar.DAY_OF_WEEK)==7)){
            ca.add(Calendar.DATE, 1);
        }
        return ca.get(Calendar.DATE)+"/"+ca.get(Calendar.MONTH)+"/"+ca.get(Calendar.YEAR);
    }
    
}
