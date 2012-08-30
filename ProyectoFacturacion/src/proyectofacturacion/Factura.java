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
public class Factura {
    private static int idSiguienteFactura=1;
    private int numero;
    private Cliente cliente;
    private int mes;
    private int anio;
    private double monto;

    public Factura(Cliente cliente, int mes, int anio, double monto) {
        
        this.cliente = cliente;
        this.mes = mes;
        this.anio = anio;
        this.monto = monto;
    }

    public int getAnio() {
        return anio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getMes() {
        return mes;
    }

    public double getMonto() {
        return monto;
    }

    public int getNumero() {
        return numero;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setNumero() {
        this.numero = idSiguienteFactura;
        idSiguienteFactura++;
    }
    
    public String traerFactura(){
        setNumero();
        return(numero+" "+cliente+" "+monto);
        
    }
    GregorianCalendar al = new GregorianCalendar();
    public String traerFechaDeLaFactura(){
        GregorianCalendar c=new GregorianCalendar(anio, mes, al.get(Calendar.DATE));
        
        String f = "";
        if(c.get(Calendar.DATE)==10){
            
           c=Funciones.traerPrimerDiaHabil(c);
            
            f = ("la fecha de la factura es: "+Funciones.traerFechaCorta(c));
        }else{
            f=("no es la fecha");
        }
        return f;
    }
    
    public String traerFechaDeVencimiento(){
        GregorianCalendar c=new GregorianCalendar(anio, mes, al.get(Calendar.DATE));
        String f = "";
        if(c.DATE==20){
           c=Funciones.traerPrimerDiaHabil(c);
            
            f = ("la fecha de la factura es: "+Funciones.traerFechaCorta(c));
        }else{
            f=("no es la fecha");
        }
        return f;
    }
}
