/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nrodedni;

/**
 *
 * @author mariano
 */
public class NroDeDNI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente c1=new Cliente("gonzalez", "mariano");
        Cliente c2=new Cliente("lopez", "lucia");
        Cliente c3=new Cliente("martinez", "juan");
        Factura f1=new Factura(c2, 6, 2012, 140);
        Factura f2=new Factura(c3, 10, 2012, 245);
        Factura f3=new Factura(c1, 8, 2012, 120);
        
        c1.setNroDeCliente();
        c2.setNroDeCliente();
        c3.setNroDeCliente();
        
        f1.setNroDeFactura();
        f1.getCliente().getNroDeCliente();
        System.out.println("factura nro "+f1.getNroDeFactura()+" Fecha "+f1.traerFechaDeLaFactura()
                +" del numero de cliente "+c2.getNroDeCliente()+" "+f1.getCliente().getNombre()+" "+f1.getCliente().getApellido()+" Vencimiento "+
                f1.traerFechaDeVencimiento()+" Total sin impuestos "+f1.calcularTotalSinImpuestos()+" IVA "+f1.calcularIva()
                +" Imp. Provinciales "+f1.calcularProvincial()+" total a pagar "+f1.calcularTotal());
        
        f2.setNroDeFactura();
        f2.getCliente().getNroDeCliente();
        
        System.out.println("factura nro "+f2.getNroDeFactura()+" Fecha "+f2.traerFechaDeLaFactura()
                +" del numero de cliente "+c3.getNroDeCliente()+" "+f2.getCliente().getNombre()+" "+f2.getCliente().getApellido()+" Vencimiento "+
                f2.traerFechaDeVencimiento()+" Total sin impuestos "+f2.calcularTotalSinImpuestos()+" IVA "+f1.calcularIva()
                +" Imp. Provinciales "+f2.calcularProvincial()+" total a pagar "+f2.calcularTotal());
        
        f3.setNroDeFactura();
        f3.getCliente().getNroDeCliente();
        
        System.out.println("factura nro "+f3.getNroDeFactura()+" Fecha "+f3.traerFechaDeLaFactura()
                +" del numero de cliente "+c1.getNroDeCliente()+" "+f3.getCliente().getNombre()+" "+f3.getCliente().getApellido()+" Vencimiento "+
                f3.traerFechaDeVencimiento()+" Total sin impuestos "+f3.calcularTotalSinImpuestos()+" IVA "+f1.calcularIva()
                +" Imp. Provinciales "+f3.calcularProvincial()+" total a pagar "+f3.calcularTotal());
        
        
        
    }
}
