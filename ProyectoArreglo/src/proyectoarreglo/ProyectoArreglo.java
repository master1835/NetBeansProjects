/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoarreglo;

import java.util.Scanner;

/**
 *
 * @author mariano1
 */
public class ProyectoArreglo {

    public static void imprimirArreglo (int [] a){
        try{
            for(int i=0; i<a.length; i++)
                System.out.println(a[i]+",");
                System.out.println(a[a.length-1]);
            
        }catch(Exception e){
            System.out.println("Error "+ e.toString());
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("cual es la longitud del arreglo");
        int n= in.nextInt();
        
        int[] a = new int [n];
        
        for(int i=0; i<=n; i++){
            a[i]= in.nextInt();
        }
        
        ArregloEnteros ae = new ArregloEnteros(a);
        
        System.out.println("ARREGLO ENTRADA");
        
        imprimirArreglo(ae.getArreglo());
        
        System.out.println("ARREGLO ");
    }
}
