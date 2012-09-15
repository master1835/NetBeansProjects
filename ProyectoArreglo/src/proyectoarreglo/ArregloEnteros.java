/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoarreglo;

/**
 *
 * @author mariano1
 */
public class ArregloEnteros {
 
    private int[] arreglo;

    public ArregloEnteros(int[] arreglo) {
        this.arreglo = arreglo;
    }

    public int[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(int[] arreglo) {
        this.arreglo = arreglo;
    }
    
    public int traerLongitud(){
    
    return arreglo.length;
}
    
    public int traerMenor(){
        int menor=99999;
        
        try{
        
        for(int i=0; i<arreglo.length; i++){
            if(arreglo[i]<menor){
                menor=arreglo[i];
            }
        } 
        }catch(Exception e){
            System.out.println("Error "+e.toString());
        }  
        return menor;
    }
    
    public int traerMayor(){
        int mayor=0;
        
        try{
        for(int i=0; i<arreglo.length; i++){
            if(arreglo[i]>mayor){
                mayor=arreglo[i];
            }
        }
        }catch(Exception e){
            System.out.println("Error "+e.toString());
        }  
        return mayor;
        
    }
    
    public int[] ordenarAsc(){
        
        int aux;
        try{
            for(int r=arreglo.length-1; r>=0; r--){
                for (int i=0; i<r; i++){
            
                    if (arreglo[i]>arreglo[i+1]){
                        aux=arreglo[i];
                        arreglo[i]=arreglo[i+1];
                        arreglo[i+1]=aux;
                    }
                }
                
            }
          
       }catch(Exception e){
        System.out.println("Error "+e.toString());
        }
    
       return arreglo;
    }
    
     public int[] ordenarDesc(){
       // int [] ordesc = new int [arreglo.length];
        int aux;
        try{
            for(int r=0; r>arreglo.length; r++){
                for (int i=arreglo.length-1; i>=r; i--){
            
                    if (arreglo[i]>arreglo[i-1]){
                        aux=arreglo[i];
                        arreglo[i]=arreglo[i-1];
                        arreglo[i-1]=aux;
                    }
                }
                
            }
         // for(int s=0; s<arreglo.length; s++){
          //   ordesc[s]=arreglo[s];
          //}
       }catch(Exception e){
        System.out.println("Error "+e.toString());
        }
    
       return arreglo;
    }
    
    public int[] sumar(int[] arreglo1){
        int [] suma = new int [arreglo.length];
        try{
            for(int i=0; i<arreglo.length; i++){
                suma[i]=arreglo[i]+arreglo1[i];
                }
            }catch(Exception e){
                System.out.println("Error "+e.toString());
            }
        return suma;
        }
    
     public int[] resta(int[] arreglo1){
        int [] resta = new int [arreglo.length];
        try{
            for(int i=0; i<arreglo.length; i++){
                resta[i]=arreglo[i]-arreglo1[i];
                }
            }catch(Exception e){
                System.out.println("Error "+e.toString());
            }
        return resta;
        }
     
    public int[] dividir(int[] arreglo1){
        int [] div = new int [arreglo.length];
        try{
            for(int i=0; i<arreglo.length; i++){
                if(arreglo1[i]==0){
                    div[i]=000;
                }else{
                    div[i]=arreglo[i]/arreglo1[i];
                }
            }}catch(Exception e){
                System.out.println("Error "+e.toString());
            }
        return div;
        }
    
    public int calcularSuma(){
        int suma=0;
        try{
            for(int i=0; i<arreglo.length; i++){
                suma=arreglo[i]+suma;
                }
            }catch(Exception e){
                System.out.println("Error "+e.toString());
            }
        return suma;
        }
    
    public int[] invertir(){
        int r=0;
        int inv[] = new int [arreglo.length];
        
        try{    
                for (int i=arreglo.length-1; i>=0; i--) {
                    inv[r]=arreglo[i];
                    r++;
                }
        }catch(Exception e){
            System.out.println("Error "+e.toString());
        }
        return inv;
    }
    
    public int[] signo(){
        
      try{
        for(int i=0; i<arreglo.length; i++){
            
            if(arreglo[i]<0){
                
               arreglo[i] = -1;
                   
            }else
                if(arreglo[i]==0){
                    arreglo[i] = 0;
                }else
                    if(arreglo[i]>0){
                        arreglo[i]=1;}
        }         
      }catch(Exception e){
                System.out.println("Error "+e.toString());
            }
        return arreglo;
    }
    
    public double[] calcularPromedio(){
        
    }
    
    public int[] parte(int desde, int hasta){
        int [] part = new int [hasta-desde];
        
        for( int i=desde; i<=hasta; i++){
            part[i]=arreglo[i];
        }
        
        return part;
    }
    
    public double[] potencia(double ex){
        double [] pot = new double [arreglo.length];
        
      try{
            for(int i=0; i<arreglo.length; i++){
            pot[i]= Math.pow(arreglo[i], ex);
            }
      }catch(Exception e){
                System.out.println("Error "+e.toString());
            
      }
        return pot;
    }
}
