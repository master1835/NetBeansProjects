package ejercicio11;

public class Main {

    public static void main(String[] args) {

        Resolvente resolvente = new Resolvente(1,-1,-2);
        System.out.println("Testeo 1-3-1");
        if (resolvente.validarDatos()) {
            System.out.println("X1 = "+resolvente.devolverRaices()[0]);
            System.out.println("X2 = "+resolvente.devolverRaices()[1]);
        }
        else
            System.out.println("Raices imaginarias.");

        Resolvente resolvente2 = new Resolvente(2,2,2);
        System.out.println("Testeo 1-3-2");
        if (resolvente2.validarDatos()) {
            System.out.println("X1 = "+resolvente2.devolverRaices()[0]);
            System.out.println("X2 = "+resolvente2.devolverRaices()[1]);
        }
        else
            System.out.println("Raices imaginarias.");
    }
}
