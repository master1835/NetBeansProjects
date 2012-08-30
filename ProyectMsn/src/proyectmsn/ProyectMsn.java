/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectmsn;

/**
 *
 * @author Mariano
 */
public class ProyectMsn {

    
    public static Conector servidor, cliente;
    
    public static void main(String[] args) {
        
        servidor = new Conector();
        VentanaServidor server = new VentanaServidor();
        server.main();
    }
    
    public static void initServer(){
        servidor = new Conector();
    }
    public static void initCliente(String ip){
        cliente = new Conector(ip);
    }
}

