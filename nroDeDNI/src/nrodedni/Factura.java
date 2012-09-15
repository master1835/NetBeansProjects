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
public class Factura {
    private static int idSiguiente=1;
    private int nroDeFactura;
    private Cliente cliente;
    private int mes;
    private int anio;
    private int consumo;

    public Factura(Cliente cliente, int mes, int anio, int consumo) {
        this.cliente = cliente;
        this.mes = mes;
        this.anio = anio;
        this.consumo = consumo;
    }

    public int getAnio() {
        return anio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getConsumo() {
        return consumo;
    }

    public int getIdSiguiente() {
        return idSiguiente;
    }


    public int getMes() {
        return mes;
    }

    public int getNroDeFactura() {
        return nroDeFactura;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }


    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setNroDeFactura() {
        this.nroDeFactura = idSiguiente;
        idSiguiente++;
    }
    
    public String traerFechaDeLaFactura(){
        int dia=10;
        GregorianCalendar c=new GregorianCalendar(anio, mes, dia);
        
        while((c.get(Calendar.DAY_OF_WEEK)==1)||(c.get(Calendar.DAY_OF_WEEK)==7)){
            
            dia++;
            c.set(anio, mes, dia);
        }
        return dia+"/"+mes+"/"+anio;
    }
    public String traerFechaDeVencimiento(){
        int dia=20;
        GregorianCalendar ca=new GregorianCalendar(anio, mes, dia);
        
        while((ca.get(Calendar.DAY_OF_WEEK)==1)||(ca.get(Calendar.DAY_OF_WEEK)==7)){
            dia++;
            ca.set(anio, mes, dia);
        }
        return dia+"/"+mes+"/"+anio;
    }
    
    public double calcularTotalSinImpuestos(){
        double resu;
        
        if (consumo<160){
            resu=(consumo * 0.91) * 0.56;
        }else{
            resu = consumo-160;
            resu=(resu*0.91)+((160 * 0.91) * 0.56);
        }
        return resu;
    }
    
    public double calcularIva(){
        return calcularTotalSinImpuestos()*0.21;
    }
    
    public double calcularProvincial(){
        return calcularTotalSinImpuestos()*0.09;
    }
    public double calcularTotal(){
        return calcularProvincial()+calcularIva()+calcularTotalSinImpuestos();
    }
}
