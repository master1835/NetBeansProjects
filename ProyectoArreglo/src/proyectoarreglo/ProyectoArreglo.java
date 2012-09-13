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

    public static void imprimirArreglo (int a[]){
        try{
            for(int i=0; i<a.length; i++){
                if(a[i]==000){
                   System.out.println ("error no se puede dividir por 0");
                }else{
                System.out.println(a[i]);
                }
            }
        }catch(Exception e){
            System.out.println("Error "+ e.toString());
        }
    }
    public static void main(String[] args) {
        
        int arreglo1[] = {1,2,3,4,5};
        
        int matriz[][] = {{3,6,1},{5,7,2}};
        int matriz2[][] = {{5,6,2},{7,0,-2}};
               
        Scanner in = new Scanner(System.in);
        
        System.out.println("cual es la longitud del arreglo");
        int n= in.nextInt();
        
        int[] a = new int [n];
        
        System.out.println("ingrese los " + n + " valores...");
        
        for(int i=0; i<n; i++){
            a[i]= in.nextInt();
        }
        
        ArregloEnteros ae = new ArregloEnteros(a);      //instanciamos el objeto
        
        System.out.println("ARREGLO ENTRADA");
        
        imprimirArreglo(ae.getArreglo());
        
      /*  System.out.println("indique desde donde hasta donde mostrar");
        int d= in.nextInt();
        int h= in.nextInt();
        System.out.println("mostrando desde "+d+" hasta "+h+"\n");
        imprimirArreglo(ae.parte(d, h));*/
        
        
        System.out.print("ordenados de forma ascendente: \n" );
        imprimirArreglo(ae.ordenarAsc());
        System.out.print("ordenados de forma descendiente: \n" );
        imprimirArreglo(ae.ordenarDesc());
        System.out.println("mayor: "+ ae.traerMayor());
        System.out.println("menor: "+ ae.traerMenor());
        System.out.println("signo: ");
        imprimirArreglo(ae.signo());
        System.out.println("suma de todos los elementos: "+ ae.calcularSuma());
        System.out.println("suma de 2 arreglos ");
        imprimirArreglo(ae.sumar(arreglo1));
        System.out.println("volteado:");
        imprimirArreglo(ae.invertir());
        System.out.println("dividir:");
        imprimirArreglo(ae.dividir(arreglo1));
        
    }
}
