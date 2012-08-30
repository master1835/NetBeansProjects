/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *
 * @author mariano
 */
public class Circulo {
    private Punto origen;   //preguntar por el "Punto
    private double  radio;
    private final double pi=Math.PI;
    
    public Circulo (Punto origen, double radio){
        this.origen=origen;
        this.radio=radio;
    }
    public Circulo(double radio){
        this.origen=new Punto(0.0,0.0);
        this.radio=radio;
    }

    public Punto getOrigen() {
        return origen;
    }

    public double getPi() {
        return pi;
    }

    public double getRadio() {
        return radio;
    }

    public void setOrigen(Punto origen) {
        this.origen = origen;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public boolean equals(Circulo c){
        return(this.radio==c.getRadio()&&(this.origen==c.getOrigen()));
    }
    
    public double calcularArea(){
        double area=pi*(radio*radio);
        return(area);
    }
    public double calcularPerimetro(){
        double perim=2*radio*pi;
        return(perim);
    
    }
}
