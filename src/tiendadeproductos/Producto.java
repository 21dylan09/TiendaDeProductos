/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendadeproductos;

/**
 *
 * @author dylan Lozano
 */
public class Producto {
    //constantes
    public final static int PAPELERIA  = 1;
    public final static int SUPERMERCADO = 2;
    public final static int DROGUERIA = 3;
    
    public final static double IVA_PAPEL=0.16;
    public final static double IVA_FARMACIA=0.12;
    public final static double IVA_MERCADO=0.04;
    
    //Atributos
    private String nombre;
    private int tipo;
    private int cantidadActual;
    private int numeroMinimo;
    private double precioBase;
    private int unidadesVendidas;
    
    public  Producto(){
      
    }
    public Producto(String nombre, int tipo, int cantidadActual, int numeroMinimo, double precioBase, int unidadesVendidas) {
        this.nombre = nombre;
        this.tipo = tipo ;
        this.cantidadActual = cantidadActual;
        this.numeroMinimo = numeroMinimo;
        this.precioBase = precioBase;
        this.unidadesVendidas = unidadesVendidas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public int getNumeroMinimo() {
        return numeroMinimo;
    }

    public void setNumeroMinimo(int numeroMinimo) {
        this.numeroMinimo = numeroMinimo;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
    public int getUnidadesVendidas() {
        return unidadesVendidas;
    }

    public void setUnidadesVendidas(int unidadesVendidas) {
        this.unidadesVendidas = unidadesVendidas;
    }
    
    //Mtodos relacionados con requerimientos funcionales
    
    public void venderProducto(int cantidad){
        this.cantidadActual=this.cantidadActual-cantidad;
        this.unidadesVendidas=this.cantidadActual+cantidad;
        int sobran_antes_pedidos = 0;
        sobran_antes_pedidos = this.cantidadActual-numeroMinimo;
        this.unidadesVendidas = this.unidadesVendidas + cantidad;
    }
    public boolean cantidadactualdoblecantidadminima() {
      return this.cantidadActual >= 2 * this.numeroMinimo;
    }
    
    public boolean igualdadprocutosconbodega() {
        return this.unidadesVendidas == this.cantidadActual;
    }
    
    public boolean papeleria(){
        return this.tipo != Producto.PAPELERIA;
    }
    //P
    public boolean Nombre2(){
        return this.nombre == "Aspirina"  ;
    }


    public double valorUnitario(boolean conIVA){
        //valor unitario Con IVA
        if(conIVA){
        //tipo prodcuto PAPELERIA
        if (this.tipo==Producto.PAPELERIA)
            return precioBase+ (precioBase*Producto.IVA_PAPEL);
            
        //tipo prodcuto SUPERMERCADO
        else if (this.tipo==Producto.SUPERMERCADO)
            return precioBase+ (precioBase*Producto.IVA_MERCADO);
        //tipo prodcuto DROGUERIA
           return precioBase+ (precioBase*Producto.IVA_FARMACIA);
        }
        //valor unitario sin IVA
        return precioBase;
    }        
    
    public void venderUnidades(int cantidad){
        this.unidadesVendidas+=cantidad;
        this.unidadesVendidas-=cantidad;
    }
    
     //metodo para devolver un valor del producto de papeleria sin iva
     public double valorUnitariopapeleria (boolean conIVA){
        //valor unitario Con IVA
        if(conIVA)
            return precioBase+ (precioBase*Producto.IVA_PAPEL);
        //Valor unitario Sin IVA
        else
        return precioBase;
     }
     //Método subirValorUnitario
     public double subirValorUnitario(double precio){
         if(precio<1000){
             return precioBase+(precioBase* 0.1);
         }
         if(precio>=1000 && precio<=5000){
             return precioBase+(precioBase* 0.2);
         }
         if (precio>5000){
             return precioBase+(precioBase* 0.3);
         }
         else 
         return precioBase;
     }
     //Método hacerPedido?
      public String hacerPedido(boolean pedido){
          if (pedido){
          if(cantidadActual>numeroMinimo)    
          return "no";
          }else{
              return "si";
          }
        return null;
      }
       public double cambiarValorUnitario(boolean conT){
        //valor unitario Con IVA
        if(conT){
        //tipo prodcuto PAPELERIA
        if (this.tipo==Producto.PAPELERIA)
            return precioBase+ (precioBase*0.10);
            
        //tipo prodcuto SUPERMERCADO
        else if (this.tipo==Producto.SUPERMERCADO)
            return precioBase+ (precioBase*0.5);
        //tipo prodcuto DROGUERIA
           return precioBase+ (precioBase*0.10);
        }
        //valor unitario sin IVA
        return precioBase;
    }        
}
