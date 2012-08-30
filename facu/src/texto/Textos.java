/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package texto;
import java.io.*;
/**
 *
 * @author Mariano
 */
public class Textos {
 
    public void leer (String nombreArchivo) {
        
        try{
            FileReader r = new FileReader(nombreArchivo);
            BufferedReader buffer = new BufferedReader(r);
            
          /*  System.out.println(buffer.readLine());  //imprime el 1º renglón
            System.out.println(buffer.readLine());  //si la pongo de nuevo ahora imprime el 2º
            */
            
            String temp="";
            
            while(temp!=null){
                temp=buffer.readLine();
                if(temp==null){
                    break;}/* se pone break xq sino al final va a salir el mesaje null, 
                     * esto lo evita saliendo del bucle antes
                     */
                System.out.println(temp);
                
            }
            
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void escribir (String nombreArchivo){
        
        File f = new File(nombreArchivo); //crea un objeto de tipo archivo, File es una palabra reservada
        
        //escritura en el archivo
        try{
          FileWriter w = new FileWriter(f); //FileWriter
          BufferedWriter bw= new BufferedWriter(w); //BufferWriter
          PrintWriter pw = new PrintWriter(bw); //PrintWriter, escribe el archivo
          
          pw.write("esto es un ejemplo \n");
          pw.append(" -esto está concatenado");
          pw.close();
          bw.close();
          
        }catch(IOException e){};
        
    }
    }
