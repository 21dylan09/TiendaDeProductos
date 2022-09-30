/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendadeproductos;

/**
 *
 * @author dylan Lozano
 */
public class Tienda {
    
    private Producto p1;
    private Producto p2;
    private Producto p3;
    private Producto p4;
    
    
   public Tienda(){
   
    p1=new Producto();
    p2=new Producto();
    p3=new Producto();
    p4=new Producto();
   }



    public Tienda(Producto p1, Producto p2, Producto p3, Producto p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        
    }


    public Producto getP1() {
        return p1;
    }

    public void setP1(Producto p1) {
        this.p1 = p1;
    }

    public Producto getP2() {
        return p2;
    }

    public void setP2(Producto p2) {
        this.p2 = p2;
    }

    public Producto getP3() {
        return p3;
    }

    public void setP3(Producto p3) {
        this.p3 = p3;
    }

    public Producto getP4() {
        return p4;
    }

    public void setP4(Producto p4) {
        this.p4 = p4;
    }
    
    public double calcularDineroProductos(){
        double dineroProductos=p1.getUnidadesVendidas()*(p1.getPrecioBase() *+Producto.IVA_PAPEL)
                +p2.getUnidadesVendidas()*(p2.getPrecioBase() * Producto.IVA_MERCADO)
                +p3.getUnidadesVendidas()*(p3.getPrecioBase() * Producto.IVA_MERCADO)
                +p4.getUnidadesVendidas()*(p4.getPrecioBase() * Producto.IVA_FARMACIA);
        return dineroProductos;
    }
    public double calcularDineroEnCaja(){
        double dineroEnCaja=p1.getUnidadesVendidas()*p1.getPrecioBase() *(1+Producto.IVA_PAPEL)
                +p2.getUnidadesVendidas()*p2.getPrecioBase() *(1+Producto.IVA_MERCADO)
                +p3.getUnidadesVendidas()*p3.getPrecioBase() *(1+Producto.IVA_MERCADO)
                +p4.getUnidadesVendidas()*p4.getPrecioBase() *(1+Producto.IVA_FARMACIA);
        return dineroEnCaja;
    }
    public boolean quintaParte(){
         boolean unminima4 = (p4.getNumeroMinimo() ==
                 p1.getUnidadesVendidas() + p2.getUnidadesVendidas() + p3.getUnidadesVendidas() + p4.getUnidadesVendidas() / 5 );
         return unminima4;
    }
    
    public boolean promedioUV(){
         boolean unpromedioVB  = (p1.getUnidadesVendidas() + p2.getUnidadesVendidas() + p3.getUnidadesVendidas() + p4.getUnidadesVendidas() / 4 
                 > p1.getCantidadActual() + p2.getCantidadActual() + p3.getCantidadActual() + p4.getCantidadActual() / 4 );
         return unpromedioVB;
    }
    public double totalProductos(){
        double totalP = p1.getUnidadesVendidas()+p2.getUnidadesVendidas()
                +p3.getUnidadesVendidas()+p4.getUnidadesVendidas();
        return totalP;
    }
    
}
