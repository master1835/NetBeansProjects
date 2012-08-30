package ejercicio2;

public class Parcial {

    public Parcial() {
    }

    public boolean esPrimo(int n) {
        if(n==2)
            return true;
        else {
            if(n==1)
                return false;
            else {
                for(int i=2;i<n;i++) {
                    if(n%i == 0)
                    return false;
                }
        return true;
            }
        }
    }

    public int[] traerLosPrimos(int[] arreglo) {
        int i, j=0;
        int[] primos = new int[arreglo.length];
        for(i=0;i<(arreglo.length);i++) {

            if(esPrimo(arreglo[i])) {
                primos[j] = arreglo[i];
                j++;
            }
        }
        return primos;
    }

    public boolean esPar(int n) {
        if(n%2 == 0)
            return true;
        else
            return false;
    }
}
