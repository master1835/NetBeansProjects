/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package saludo;

import javax.swing.JOptionPane; //Importamos la clase JOptionPane


public class Saludo {

     String nombre; //Este será la información para el I/O

    public Saludo() {

    	//El constructor llama a sus métodos

    	pideNombre();

    	muestraSaludo();    	
    }
     private void pideNombre(){

    	nombre=JOptionPane.showInputDialog(null,"Escribe tu nombre");//Pide el nombre

    }

    private void muestraSaludo(){

        if (nombre==null) {
        JOptionPane.showMessageDialog(null,"Oprimiste Cancelar Pelotudo");
        }else
            if(nombre.equals("")){  //Las cadenas no se comparan con == sino con el método equals()

    		JOptionPane.showMessageDialog(null,"Oprimiste aceptar sin escribir tu nombre Pelotudo");
        
            }else{
            
        
            JOptionPane.showMessageDialog(null,"Hola "+nombre);//Saluda en pantalla
        }
        
    	

    }    
    public static void main(String[] args) {
       
        new Saludo();

    }
}
