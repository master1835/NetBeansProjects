/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoarreglo;

/**
 *
 * @author mariano1
 */
public class ArregloEnteros {
 
    private int[] arreglo;

    public ArregloEnteros(int[] arreglo) {
        this.arreglo = arreglo;
    }

    public int[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(int[] arreglo) {
        this.arreglo = arreglo;
    }
    
    public int traerLongitud(){
    
    return arreglo.length;
}
    
    public int traerMenor(){
        int menor=99999;
        
        for(int i=0; i<=arreglo.length; i++){
            if(arreglo[i]<menor){
                menor=arreglo[i];
            }
        } 
        return menor;
        
    }
    
    public int[] sumar(int[] arreglo1){
        int [] suma = new int [arreglo.length];
        try{
            for(int i=0; i<arreglo.length; i++){
                suma[i]=arreglo[i]+arreglo1[i];
                }
            }catch(Exception e){
                System.out.println("Error "+e.toString());
            }
        return suma;
        }
        
    } 
