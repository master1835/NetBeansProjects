package ejercicio3;

public class Main {

    public static void main(String[] args) {

        Sucesion sucesion = new Sucesion(5);
        for(int i=0; i<(sucesion.devolverSucesion().length); i++){
        System.out.println(sucesion.devolverSucesion()[i]);
        }
    }

}
