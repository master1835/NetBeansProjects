
package facu;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Funciones {
   
    public Funciones() {
        
    }
    
    public int calcularMcd (int a, int b) {
        int acumulador;
        int r;
        if (a<b) {
            acumulador=a;
            a=b;
            b=acumulador;
        } 
        
        while (b!=0) {
            
            r=a%b;
            a=b;
            b=r;
        }
        System.out.println("a"+a);
        
        return a;
    }
    
   /* public static String traerDiaDeLaSemana(){
        GregorianCalendar fecha=new GregorianCalendar();
        int d=(fecha.get(Calendar.DAY_OF_WEEK));
        
        String fe;
        switch (d){
            case 1: fe="Domingo";
                break;
            case 2: fe="Lunes";
                break;
            case 3: fe="Martes";
                break;
            case 4: fe="Miercoles";
                break;
            case 5: fe="Jueves";
                break;
            case 6: fe="Viernes";
                break;
            case 7: fe="Sabado";
                break;
            default: fe="error";
        }
        return fe;
    }
    */
    
}
