/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *
 * @author mariano
 */
public class Punto {
   private double x;
   private double y;
   
    
public Punto() {
    this.x=0;
    this.y=0;
}

public Punto(double x, double y) {
        this.x=x;
        this.y=y;
}

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
public boolean equals(Punto p) {
    return((x==p.getX())&&(y==p.getY()));
}
public double calcularDistancia(Punto p2){
    
   return Math.sqrt(Math.pow((p2.getX()-x),2) + Math.pow((p2.getY()-y),2));
}
public String toString() {
    return ("("+x+","+y+")");
}
    public String traerPunto() {
        return ("("+x+", "+y+")");
    }
    public String traerPunto(Punto p) {
         return ("("+x+", "+y+")");
    }
}


