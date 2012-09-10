package ejercicio2;
public class Main {

    public static void main(String[] args) {

        Parcial parcial = new Parcial();
        int[] arreglo = new int[5];

        arreglo[0] = 7;
        arreglo[1] = 11; 
        arreglo[2] = 19; 
        arreglo[3] = 22; 
        arreglo[4] = 23;

        System.out.println("Es primo: "+parcial.esPrimo(17));

        System.out.println("Arreglo de primos:");

        for(int i=0;i<(parcial.traerLosPrimos(arreglo).length);i++){
            
            if(parcial.traerLosPrimos(arreglo)[i]!=0){
            System.out.println(parcial.traerLosPrimos(arreglo)[i]);
            }else{
                System.out.println("---");
            }}
        System.out.println("Es par: "+parcial.esPar(29));

    }

}
