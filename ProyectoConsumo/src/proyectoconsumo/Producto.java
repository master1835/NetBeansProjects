/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoconsumo;

/**
 *
 * @author Mariano
 */
public class Producto {
    private String codProducto;
    private String producto;
    private Marca marca;
    private Pais origen;
    private double precio;

    public Producto(String codProducto, String producto, Marca marca, Pais origen, double precio) {
        this.codProducto = codProducto;
        this.producto = producto;
        this.marca = marca;
        this.origen = origen;
        this.precio = precio;
    }

    public String getCodProducto() {
        return codProducto;
    }

    public Marca getMarca() {
        return marca;
    }

    public Pais getOrigen() {
        return origen;
    }

    public double getPrecio() {
        return precio;
    }

    public String getProducto() {
        return producto;
    }

    public void setCodProducto(String codProducto) {
        this.codProducto = codProducto;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public void setOrigen(Pais origen) {
        this.origen = origen;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

   
    
    public boolean equals (Producto p){
        
        String prod="TV LED";
        boolean r;
        
        if(p.getProducto()==prod){
            r=true;
        }else{
            r=false;
        }
        
        return r;
    }
    public boolean esDeOrigen (Pais p){
        String origen="Argentina";
        boolean r;
        
        if(p.getPais()==origen){
            r=true;
        }else{
            r=false;
        }
        
        return r;
    }
    
    public boolean esDeLaMarca(Marca m){
        String marc="BGH";
        boolean r;
        
        if(m.getMarca()==marc){
            r=true;
        }else{
            r=false;
        }
        
        return r;
    }
    
    public String generarLineaProducto(){
   
       return ("CodProd: "+codProducto+"  "+ producto+" Orígen: "+origen+" producido por "+marca+" a un precio de $"+precio);
}
    }
    

