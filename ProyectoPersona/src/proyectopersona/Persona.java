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
public class Persona {
private int nroDocumento;
private String apellido;
private String nombre;
private GregorianCalendar fechaNacimiento;

    public Persona(int nroDocumento, String apellido, String nombre, GregorianCalendar fechaNacimiento) {
        this.nroDocumento = nroDocumento;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getApellido() {
        return apellido;
    }

    public GregorianCalendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNroDocumento() {
        return nroDocumento;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFechaNacimiento(GregorianCalendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNroDocumento(int nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

public String calcularEdad(){
    
    String edad;
    int mes=0;
    int dia=0;
    
    int anioNac=fechaNacimiento.get(Calendar.YEAR);
    int mesNac=fechaNacimiento.get(Calendar.MONTH)+1;
    int diaNac=fechaNacimiento.get(Calendar.DATE);
    
     int anioHoy=new GregorianCalendar().get(Calendar.YEAR);
     int mesHoy=new GregorianCalendar().get(Calendar.MONTH)+1;
     int diaHoy=new GregorianCalendar().get(Calendar.DATE);
     
      int anio = anioHoy-anioNac;
    
    if (mesHoy<mesNac){
       mes = (mesHoy-mesNac);  //porque todavia no cumplió los años
       anio--;  //año -1
        
       dia = diaHoy-diaNac;           
        
    } else
        if((mesHoy==mesNac)&&(diaNac<diaHoy)){
            anio--;
        }else{
        mes = mesHoy-mesNac;  //ya cumplió los años
        dia = diaHoy-diaNac;
    }
   
     if (mes<0){
         mes=mes+12;
     }
     if (dia<0){
         dia=dia+30;
     }
    
     
     
     if (anio == 0) {
         edad = mes+" meses y "+dia+" dias";
     }else{
         edad = anio+" años y "+mes+" meses";
     }
     
    return edad;
}

public boolean equals (Persona p) {
    boolean r;
    if((this.nombre==p.nombre)&&(this.apellido==p.apellido)){
        r=true;
    }else{
        r=false;
    }
    return r;
}
}
