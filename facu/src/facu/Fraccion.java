package facu;


public class Fraccion {

private int numerador;  //atributos
private int denominador;    //atributos

    public Fraccion(int numerador, int denominador) { //constructor
        this.numerador = numerador;   
        this.denominador = denominador;
    }   //fin constructor

    public int getDenominador() {
        return denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public void setNumerador(int nuemerador) {
        this.numerador = numerador;
    }
public String toString() {return numerador+"/"+denominador;}
    public Fraccion() {
    }
    
public void simplificar() {
    int mcd=new Funciones().calcularMcd(numerador, denominador);
    numerador=numerador/mcd;
    denominador=denominador/mcd;
}
    
/*public Fraccion multiplicar (Fraccion f1, Fraccion f2) {
    Fraccion p=new Fraccion();
    p.setNumerador(f1.getNumerador() * f2.getNumerador());
    p.setDenominador(f1.getDenominador() * f2.getDenominador());
    return p;
    
}*/
public boolean igual (Fraccion f1, Fraccion f2) {
    return (f1.getNumerador() * f2.getDenominador() == f1.getDenominador() * f2.getNumerador());
        

}

}