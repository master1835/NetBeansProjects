/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facu;

/**
 *
 * @author mariano
 */
public class Facu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Funciones func=new Funciones();
    
        System.out.println("mcd "+func.calcularMcd(8,2));
        Fraccion f1=new Fraccion(2,3);   //creo objeto o instancia que es lo mismo 
     Fraccion f2=new Fraccion(5,2);
     Fraccion f3=new Fraccion(4,6);
     OperacionesFraccionarias j=new OperacionesFraccionarias(new Fraccion(2,3));
    
     
     
     System.out.println("numerador "+f1.getNumerador() + "  denominador " +f1.getDenominador());
     
     Fraccion sum= j.sumar(f2);
     System.out.println("resultado de la suma: " + sum);
     
    
     System.out.println("resultado de la division: " + j.dividir(f2));  //mas eficiente
     
     Fraccion prod = j.multiplicar(f2);
     System.out.println("resultado multiplicacion: " + prod.getNumerador() + "/" + prod.getDenominador());
    
    
     System.out.println("pasado a decimal: " + j.aReal());
     
     boolean igual = f1.igual(new Fraccion (2,3), new Fraccion (7,4));
     System.out.println(igual);
     
     
     boolean mayor= j.esMayor(new Fraccion (7,4));
     if (mayor){
         System.out.println("el mayor es: " + j.getF1());
     }else{
          System.out.println("el mayor es: " + f2.getNumerador()+"/"+f2.getDenominador());
     }
     boolean menor= j.esMenor(new Fraccion (7,4));
     if (menor){
         System.out.println("el menor es: " + j.getF1());
     }else{
          System.out.println("el menor es: " + f2.getNumerador()+"/"+f2.getDenominador());
     }
    }
}
