/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoencriptacion;

/**
 *
 * @author Mariano
 */
public class ProyectoEncriptacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        String mensaje = "mensaje oculto";
        
        char array[] = mensaje.toCharArray();
        
        for(int i=0; i<array.length; i++){
            array[i] = (char)(array[i] + (char)1); //todas las letras le suma 1 en el abecedario
        }
        
        String encriptado = String.valueOf(array); //transforma el arreglo en String
        
        System.out.println("encriptado: "+encriptado+"\n\n");
        
       for(int i=0; i<array.length; i++){
            array[i] = (char)(array[i] - (char)1); //todas las letras le suma 1 en el abecedario
        }
       
       String desencriptado = String.valueOf(array);
       System.out.println("original: "+desencriptado);
       
    }
}
