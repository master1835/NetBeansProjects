/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopruebas;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Mariano
 */
public class Funciones {
    
    private int dia=Calendar.DATE;
    private int mes=Calendar.MONTH;
    private int ano=Calendar.YEAR;
    

    public Funciones(int dia, int mes, int ano) {
        this.dia=dia;
        this.mes=mes+1;
        this.ano=ano;
    }

     

    public int getAno() {
        return ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }
    
    
    
    public String traerMesLetras(GregorianCalendar fecha){
        String mess="";
        int mes=fecha.get(Calendar.MONTH);
           
        switch(mes){
            case 0: mess="Enero";
                break;
            case 1: mess="Febrero";
                break;
            case 2: mess="Marzo";
                break;
            case 3: mess="Abril";
                break;
            case 4: mess="Mayo";
                break;
            case 5: mess="Junio";
                break;
            case 6: mess="Julio";
                break;
            case 7: mess="Agosto";
                break;
            case 8: mess="Septiembre";
                break;
            case 9: mess="Octubre";
                break;
            case 10: mess="Noviembre";
                break;
            case 11: mess="Diciembre";
                break;
                
        }
        return mess;
    }
    
    public String traerDiaDeLaSemana(GregorianCalendar fecha) {
        String semm="";
        int sem=fecha.get(Calendar.DAY_OF_WEEK);
        
        switch(sem){
            case 1: semm="Domingo";
                    break;
            case 2: semm="Lunes";
                    break;
            case 3: semm="Martes";
                    break;
            case 4: semm="Miercoles";
                    break;
            case 5: semm="Jueves";
                    break;
            case 6: semm="Viernes";
                    break;
            case 7: semm="Sabado";
                    break;
            default: semm="Error";
        }
        return semm;
    }
    
    public String traerFechaCorta() {
    return(dia+"/"+mes+"/"+ano);
}
 /*   public GregorianCalendar convertirGregorianCalendar(int anio, int mes, int dia){
        
    }*/
}
