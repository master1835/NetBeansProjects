/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *
 * @author Mariano
 */
public class Rectangulo {
    private Punto origen; 
    private double  ancho;
    private double alto;

    public Rectangulo(Punto origen, double ancho, double alto) {
        this.origen = origen;
        this.ancho = ancho;
        this.alto = alto;
    }
    
    

    public double getAlto() {
        return alto;
    }

    public double getAncho() {
        return ancho;
    }

    public Punto getOrigen() {
        return origen;
    }
    public boolean equals(Rectangulo r){
        return(this.alto==r.getAlto()&&(this.ancho==r.getAncho()));
    }
    public double calcularArea(){
        return(alto*ancho);
    }
    public double calcularPerimetro(){
        return((alto*2)+(ancho*2));
    }
}
