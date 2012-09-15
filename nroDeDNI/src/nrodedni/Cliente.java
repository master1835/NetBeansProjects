/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nrodedni;

/**
 *
 * @author mariano
 */
public class Cliente {
    private static int idSiguiente=1;
    private int nroDeCliente;
    private String apellido;
    private String nombre;

    public Cliente(String apellido, String nombre) {
        
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getIdSiguiente() {
        return idSiguiente;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNroDeCliente() {
        return nroDeCliente;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNroDeCliente() {
        this.nroDeCliente = idSiguiente;
        idSiguiente++;
    }
    
    
    
}
