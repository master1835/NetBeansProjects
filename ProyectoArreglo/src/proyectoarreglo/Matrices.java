
package proyectoarreglo;

/**
 *
 * @author mariano1
 */
public class Matrices {
    private int[][] matriz;

    public Matrices(int[][] matriz) {
        this.matriz = matriz;
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }
    
    public int[][] calcularSuma(int matriz2[][]){
        int matrizsum[][]= new int [matriz.length][matriz[0].length];
        try{
        for(int i=0; i<matriz.length; i++){           
            
            for(int n=0; n<matriz[i].length; n++){
                matrizsum[i][n]=matriz[i][n]+matriz2[i][n];
            }
        }
               
        }catch(Exception e){
            System.out.println("Error "+e.toString());
        }
        return matrizsum;
    }
}
