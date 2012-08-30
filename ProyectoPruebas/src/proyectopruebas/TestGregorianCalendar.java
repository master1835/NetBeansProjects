/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopruebas;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author mariano
 */
public class TestGregorianCalendar {
    public static void main(String[] args) {
   
        
        GregorianCalendar fecha=new GregorianCalendar();
        Funciones fe=new Funciones(fecha.get(Calendar.DATE), fecha.get(Calendar.MONTH), fecha.get(Calendar.YEAR));
        
        int nro_dia_sem=fecha.get(Calendar.DAY_OF_WEEK);
        System.out.println("numero de la semana: "+nro_dia_sem); //domingo=1, lunes=2 etc
        int dia=fecha.get(Calendar.DAY_OF_MONTH);
        System.out.println("Hoy es: "+ dia);
        int nro_mes=fecha.get(Calendar.MONTH);
        System.out.println("mes: "+(nro_mes+1)); //enero=0, febrero=1 etc
        int nro_ano=fecha.get(Calendar.YEAR);
        System.out.println("el año es: "+nro_ano);
       
        System.out.println("el mes es en letras es: "+fe.traerMesLetras(fecha));
        System.out.println("la fecha en formato largo es: "+fecha.get(Calendar.DAY_OF_MONTH)+" de "+fe.traerMesLetras(fecha)+" de "+fecha.get(Calendar.YEAR));
        System.out.println("la fecha en formato corto es: "+fe.traerFechaCorta());
        System.out.println("el día de la semana en letras es: "+fe.traerDiaDeLaSemana(fecha));
        
        
        if((nro_ano%4==0)||((nro_ano%100==0)&&(nro_ano%400!=0))){
            boolean esBisiesto=true;
            System.out.println("el año es bisiesto");
}else{
            boolean esBisiesto=false;
            System.out.println("el año NO es bisiesto");

        }
        
        Scanner in=new Scanner(System.in); //pide datos al usuario
        System.out.println("¿año?: "); int a=in.nextInt();
        System.out.println("¿mes? "); int m=in.nextInt();
        System.out.println("¿dia? "); int d=in.nextInt();
        
        
        GregorianCalendar fecha1=new GregorianCalendar(a, (m-1),d);
        nro_dia_sem=fecha1.get(Calendar.DAY_OF_WEEK);
        System.out.println("numero de la semana: "+nro_dia_sem); 
        dia=fecha1.get(Calendar.DAY_OF_MONTH);
        System.out.println("Hoy es: "+ dia);
        nro_mes=fecha1.get(Calendar.MONTH);
        System.out.println("mes: "+(nro_mes+1)); 
        nro_ano=fecha1.get(Calendar.YEAR);
        System.out.println("el año es: "+nro_ano);
        
        
        
        
        
             
        
}
}
