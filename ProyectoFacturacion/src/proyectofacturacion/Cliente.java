/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofacturacion;

/**
 *
 * @author Mariano
 */
public class Cliente {
    private static int idSiguienteCliente=1;
    private String apellido;
    private String nombre;
    private int nroDeCliente;

    public Cliente(String apellido, String nombre) {
        
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
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
        this.nroDeCliente = idSiguienteCliente;
        idSiguienteCliente++;
    }
    
    public String traerCliente(){
        setNroDeCliente();
        return (nroDeCliente+" "+nombre+" "+apellido);
    }
    
    
    @Override
    public String toString(){
        return nombre+" "+apellido;
    }
}
