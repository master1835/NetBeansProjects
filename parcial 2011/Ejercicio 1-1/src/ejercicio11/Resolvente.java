package ejercicio11;

public class Resolvente {
    private double a;
    private double b;
    private double c;

    public Resolvente(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean validarDatos() {
        double discriminante = Math.pow(b,2)-4*a*c;
        if(discriminante < 0)
            return false;
        else
            return true;
    }

    public double[] devolverRaices() {
        double[] raices = new double[2];
        raices[0] = (-b+Math.sqrt(Math.pow(b,2)-4*a*c))/2*a;
        raices[1] = (-b-Math.sqrt(Math.pow(b,2)-4*a*c))/2*a;
        return raices;
    }

}
