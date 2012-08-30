/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package producto;

/**
 *
 * @author mariano
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
    
    
     public String generarLineaProducto(){
        return codProducto+"marca: "+marca.getMarca()+"origen: "+origen.getPais();
    }
     
    
}
