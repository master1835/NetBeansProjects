/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectmsn;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Mariano
 */
public class Conector extends Thread {
    
    private Socket s;
    private ServerSocket ss;
    private InputStreamReader entradaSocket;;
    private DataOutputStream salida;
    private BufferedReader entrada;
    final int puerto = 4314;

    public Conector() {
        
        try{
            ss = new ServerSocket(puerto);
            s = ss.accept();
            
            //creación de entrada de datos para lectura de los mensajes
            entradaSocket = new InputStreamReader(s.getInputStream());
            entrada = new BufferedReader(entradaSocket);
            
            //creación de salida de datos para envio de los mensajes
            salida = new DataOutputStream(s.getOutputStream());
            
        }catch (Exception e){};
        
    }
    
    public Conector(String ip) {
         try{
           
            s = new Socket(ip, this.puerto);
            
            //creación de entrada de datos para lectura de los mensajes
            entradaSocket = new InputStreamReader(s.getInputStream());
            entrada = new BufferedReader(entradaSocket);
            
            //creación de salida de datos para envio de los mensajes
            salida = new DataOutputStream(s.getOutputStream());
            
        }catch (Exception e){};
    }
    
    public void enviarMSG(String msg){
        try{
              salida.writeUTF(msg);
        }catch(IOException e){};
      
    }
    
    public String leerMSG(){
        try{
            return entrada.readLine();
        }catch (IOException e){};
        return null;
    }
    
    public void desconectar(){
    
        try{
        s.close();
        }catch(Exception e){};
        try{
        ss.close();
        }catch(Exception e){};
    }
    
    public void run(){
        
        String texto;
        while(true){
            try{
                texto= entrada.readLine();
                VentanaCliente.jTextArea1.setText(VentanaCliente.jTextArea1.getText()+"\n"+texto);
            }catch(IOException e){};
        }
    }
}
