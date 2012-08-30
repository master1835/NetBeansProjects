package ejercicio3;

public class Sucesion {
    private int n;

    public Sucesion(int n) {
        this.n = n;
    }

    public double[] devolverSucesion() {
        double[] arreglo = new double[n];
        for(int i=1;i<=n;i++)
            arreglo[i-1] = 3*i/(i+1);
        return arreglo;
    }

}
  
