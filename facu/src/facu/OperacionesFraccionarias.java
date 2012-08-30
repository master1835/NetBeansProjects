/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facu;

/**
 *
 * @author mariano
 */
public class OperacionesFraccionarias {
private Fraccion f1;    //atributos


//constructor
public OperacionesFraccionarias(Fraccion f1) {
    this.f1 =f1;
}//fin constructor


//geter
    public Fraccion getF1() {
        return f1;
    }
//seter
    public void setF1(Fraccion f1) {
        this.f1 = f1;
    }
    
    //metodos
public Fraccion multiplicar(Fraccion f2) {
    Fraccion m= new Fraccion (f1.getNumerador() * f2.getNumerador(),f1.getDenominador() * f2.getDenominador());
    m.simplificar();
    return m;
}
public Fraccion potencia(int n){
    int num=(int) Math.pow(Double.parseDouble(String.valueOf(f1.getNumerador())), n);
    int den=(int) Math.pow(Double.parseDouble(String.valueOf(f1.getNumerador())), n);
    
    Fraccion pot= new Fraccion (num,den);
        return pot; 
}
public Fraccion sumar(Fraccion f2) {
   
   int dencom=f1.getDenominador() * f2.getDenominador();
   
   int numeradorSuma = ((dencom/f1.getDenominador())*f1.getNumerador())+((dencom/f2.getDenominador())*f2.getNumerador());
   
   Fraccion sum= new Fraccion (numeradorSuma, dencom);
   
   return sum;
}
public Fraccion dividir (Fraccion f2) {
        
        /*int divNumerador=f1.getNumerador()*f2.getDenominador();
        int divDenominador=f1.getDenominador()*f2.getNumerador();*///metod más largo y en el paréntesis de abajo iría (divNumerador, div Denominador)
        
        Fraccion d=new Fraccion(f1.getNumerador()*f2.getDenominador(), f1.getDenominador()*f2.getNumerador());
        return d;
}
public boolean esMayor (Fraccion f2) {
    boolean v;
    double n1= f1.getNumerador() / f1.getDenominador();
    double n2= f2.getNumerador() / f2.getDenominador();
   
    if (n1>n2){
        v=true;
    }else{
        v=false;
    }  
    
    return v;
}
public boolean esMenor (Fraccion f2) {
    boolean v;
    double n1= f1.getNumerador() / f1.getDenominador();
    double n2= f2.getNumerador() / f2.getDenominador();
   
    if (n1<n2){
        v=true;
    }else{
        v=false;
    }  
    
    return v;
}

public double aReal () {
   double num1=f1.getNumerador();
   double num2=f1.getDenominador();
   
   double fra1 = num1/num2;
    
   return(fra1);
}

}
