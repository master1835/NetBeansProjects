/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facu;

/**
 *
 * @author mariano
 */
public class TestOperacionesFraccionarias {
    public static void main(String[] args) {
        
        Fraccion f1=new Fraccion(2,3);
        Fraccion f2=new Fraccion(5,2);
        Fraccion f3=new Fraccion(4,6);
        
        OperacionesFraccionarias op=new OperacionesFraccionarias (f1);
        
                
            System.out.println (f1+"*"+f2+"="+op.multiplicar(f2));
            System.out.println ();
            
    }
}
