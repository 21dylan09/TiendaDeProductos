package tiendadeproductos;

//import java.util.Scanner;

/**
 *
 * @author dylan Lozano
 */
public class TiendaDeProductos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instanciar productos
        Tienda miTienda;
        miTienda = new Tienda();
        System.out.println("Evaluación de expresiones aritméticas (1):");
        Producto P1 = new Producto("Libreta", Producto.PAPELERIA, 23, 15,5500,87 );
        double resultado1 = P1.getPrecioBase()*P1.getCantidadActual()/P1.getNumeroMinimo();
        miTienda.setP1(P1);
        System.out.println("La cuarta expresión es de: " + resultado1);
        
        Producto P2 = new Producto("Leche", Producto.SUPERMERCADO, 150, 30,2100,30 );
        double resultado2 = (P2.getCantidadActual()-P2.getNumeroMinimo());
        miTienda.setP2(P2);
        System.out.println("La primera expresión es de: " + resultado2);
        
        Producto P3 = new Producto("Jabon", Producto.SUPERMERCADO, 15, 50,4200,80 );
        double resultado3 = (P3.getUnidadesVendidas() + P3.getCantidadActual()) * 
        (P3.getPrecioBase() + P3.getPrecioBase() * Producto.IVA_MERCADO );
        miTienda.setP3(P3);
        System.out.println("La tercera expresión es de: " + resultado3);
        
        Producto P4 = new Producto("Aspirina", Producto.DROGUERIA, 60, 100,2400,200 );
        double resultado4 = (P4.getPrecioBase()/(P4.getCantidadActual()*12));
        System.out.println("La segunda expresión es de: " + resultado4);
        double resultado5 = (P2.getPrecioBase()*P2.getUnidadesVendidas()*Producto.IVA_MERCADO);
        System.out.println("La quinta expresión es de: " + resultado5 + "\n");
        miTienda.setP4(P4);
        //promedio
        System.out.println("Evaluación de expresiones aritméticas (2):");
        double resultado6 =(P4.getPrecioBase()*(1+ Producto.IVA_FARMACIA)*P4.getUnidadesVendidas()/P4.getCantidadActual());
        System.out.println("La primera expresión de la tienda es de: " + resultado6);
        double tienda1 = (P1.getPrecioBase() + P2.getPrecioBase() + P4.getPrecioBase() + P4.getPrecioBase() / 4);
        System.out.println("El promedio del valor de los productos de la tienda es de : " + tienda1);
        double tienda2 = ((P1.getCantidadActual()- P1.getNumeroMinimo()) * (P1.getPrecioBase() * (1 + Producto.IVA_PAPEL)));
        System.out.println("la tercera espresion de la tienda es de: " + tienda2 + "\n");
        
        //mitienda.calculadordineroEncaja CLASE
       
        System.out.println("Evaluación de expresiones aritméticas (3): ");
        System.out.println("dineroEnCaja?p1.darCantidadMinima ( ) * ( p2.darValorUnitario ( ) )" + (miTienda.calcularDineroEnCaja()-(P1.getNumeroMinimo()*P2.getPrecioBase())));
        System.out.println("p3.darProductosVendidos ( ) * ( 1 + p3.darIVA ( ) )" + P3.getUnidadesVendidas()*(1+Producto.IVA_MERCADO) + "\n");
        System.out.println("Creación de expresiones: ");
        System.out.println("Valor de venta de un producto con IVA del 16% " + P1.getPrecioBase()+(P1.getPrecioBase()*Producto.IVA_PAPEL));
        System.out.println("Número de unidades que se deben vender para alcanzar el tope mínimo " + (P2.getCantidadActual()- P2.getNumeroMinimo()));
        System.out.println("Veces que se ha vendido la cantidad mínima del producto: " + (P3.getUnidadesVendidas()/P3.getNumeroMinimo()));
        System.out.println("Número de unidades sobrantes si se arman paquetes de 10 unidades con lo disponible en bodega: " +
                P4.getCantidadActual()%10 + "\n");
        System.out.println("ººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººº");
        System.out.println("Creación de expresiones (2): ");
        System.out.println(miTienda.calcularDineroEnCaja());
        double rTienda = miTienda.calcularDineroEnCaja()*0.25;
        System.out.println("Dinero en caja de la tienda incrementado en un 25%: " + (miTienda.calcularDineroEnCaja() + rTienda));
        double rIva= (P1.getUnidadesVendidas()*Producto.IVA_PAPEL) + (P2.getUnidadesVendidas()*Producto.IVA_MERCADO) + (P3.getUnidadesVendidas()*Producto.IVA_MERCADO) 
                + (P4.getUnidadesVendidas()*Producto.IVA_FARMACIA);
        System.out.println("Total del iva a pagar por las unidades vendidas de todos los productos: " + rIva +"%");
        double rPagar = miTienda.calcularDineroEnCaja() / P3.getPrecioBase();
        System.out.println("Número de unidades del producto 3 que se pueden pagar con el dinero en caja de la tienda a su valor unitario: " + rPagar + "\n");
        
    //Evaluación de expresiones con operadores relacionales:
    System.out.println("ººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººº" );
     if (P1.getTipo()==Producto.PAPELERIA){
         System.out.println("El producto es de papeleria");   
     }
     if (P1.getTipo() != Producto.DROGUERIA){
         System.out.println("El producto no es de drogueria, es de papeleria");   
     }
     if (P2.getNumeroMinimo()>= P2.getCantidadActual()){
         System.out.println("Aun hay productos disponibles");   
     }
     else {
         System.out.println("No hay disponibilidad del producto");
     }
     if (P3.getPrecioBase()<= 10000){
         System.out.println("Puede comprar el producto");   
     }
     else {
         System.out.println("Saldo insuficiente");
     }
     if (P4.getCantidadActual()-P4.getNumeroMinimo() != P4.getUnidadesVendidas()){  //-40 != 200
         System.out.println("No hay productos disponibles");   
     }
     else {
         System.out.println("Si hay productos disponibles");
     }
     if (P3.getCantidadActual()*P3.getPrecioBase() == P3.getUnidadesVendidas()* Producto.IVA_PAPEL){ // 63000 == 3.2
         System.out.println("Iva del producto");   
     }
     else{
         System.out.println("El valor disponible en bodega no es igual al IVA de los productos vendidos");
     }
     if (P1.getUnidadesVendidas()+P2.getUnidadesVendidas() > P3.getUnidadesVendidas()){
         System.out.println("Se ha vendido mas libretas y leches que el jabón");
     }
     else{
         System.out.println("Se ha vendido mas jabon que libretas y leche al tiempo");
     }
     //dineroEnCaja <=p4.darProductosVendidos ( ) * ( ( 1+ p4.darIVA ( ) )*  p4.darValorUnitario ( ) )

     if(miTienda.calcularDineroEnCaja()<=(P1.getPrecioBase()*Producto.IVA_PAPEL)*((1+(P4.getPrecioBase()*Producto.IVA_FARMACIA
             ))*P4.getPrecioBase())){
         System.out.println("Aún tiene vueltas para dar ");
     }
     //( p1.darCantidadBodega ( ) +  p2.darCantidadBodega ( ) +  p3.darCantidadBodega ( ) +  p4.darCantidadBodega ( ) ) <= 1000
     if (P1.getCantidadActual()+P2.getCantidadActual()+P3.getCantidadActual()+P4.getCantidadActual()<= 1000){
         System.out.println("Tiene menos de mil productos en la bodega");
     }
     else{
         System.out.println("Tiena mas de mil productos disponibles en la bodega");
     }
    System.out.println("ººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººº" ); 
     System.out.println("Creación de expresiones relacionales");
     System.out.println(P1.getNombre()+": " + "¿La cantidad en bodega es mayor o igual al doble de la cantidad mínima?: " + P1.cantidadactualdoblecantidadminima() );
     System.out.println(P2.getNombre()+": "+ "¿La cantidad de bodega es el doble de a cantidad  minima?:  " + P2.cantidadactualdoblecantidadminima());
     System.out.println(P3.getNombre()+": "+ "¿La cantidad de bodega es el doble de a cantidad  minima?:  " + P3.cantidadactualdoblecantidadminima());
     System.out.println(P4.getNombre()+": "+ "¿La cantidad de bodega es el doble de a cantidad  minima?:  " + P4.cantidadactualdoblecantidadminima());
     System.out.println("¿El tipo de " + P1.getNombre() + " de tipo " + P1.getTipo() + " no es de la papeleria? " + P1.papeleria());
     System.out.println("¿El tipo de " + P2.getNombre() + " de tipo " + P2.getTipo() + " no es de la papeleria? " + P2.papeleria());
     System.out.println("¿El tipo de " + P3.getNombre() + " de tipo " + P3.getTipo() + " no es de la papeleria? " + P3.papeleria());
     System.out.println("¿El tipo de " + P4.getNombre() + " de tipo " + P4.getTipo() + " no es de la papeleria? " + P4.papeleria());
     System.out.println(P1.getNombre()+": "+ "¿El total de productos vendidos, es  igual a la cantidad en bodega?: " + P1.igualdadprocutosconbodega());
     System.out.println(P2.getNombre()+": "+ "¿El total de productos vendidos, es  igual a la cantidad en bodega?: " + P2.igualdadprocutosconbodega());
     System.out.println(P3.getNombre()+": "+ "¿El total de productos vendidos, es  igual a la cantidad en bodega?: " + P3.igualdadprocutosconbodega());
     System.out.println(P4.getNombre()+": "+ "¿El total de productos vendidos, es  igual a la cantidad en bodega?: " + P4.igualdadprocutosconbodega());
     System.out.println("¿El nombre del producto 2 es aspirina?: " + P2.Nombre2() );
     System.out.println("ººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººº" ); 
     System.out.println("¿La cantidad mínima del producto 4 es  una quinta parte de la cantidad de  productos vendidos?: " + miTienda.quintaParte());
     System.out.println("¿El valor obtenido por los productos vendidos (incluyendo el IVA) es menor a un tercio del dinero en caja?:");
     System.out.println("¿El promedio de unidades vendidas de  todos los productos es mayor al  promedio de unidades en bodega de  todos los productos?: " + miTienda.promedioUV()+ "\n");
     System.out.println("ººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººººº" );
     System.out.println("Valor unitario de " +P1.getNombre() +" con iva es de: "+miTienda.getP1().valorUnitario(true));
     System.out.println("Valor unitario de "+P1.getNombre() + " sin iva es de: "+miTienda.getP1().valorUnitario(false));
        
     System.out.println("Valor unitario de "+P2.getNombre() + " con iva es de: "+miTienda.getP2().valorUnitario(true));
     System.out.println("Valor unitario de "+P2.getNombre() + " sin iva es de: "+miTienda.getP2().valorUnitario(false));
        
     System.out.println("Valor unitario de "+P3.getNombre() + " con iva es de: "+miTienda.getP3().valorUnitario(true));
     System.out.println("Valor unitario de "+P3.getNombre() + " sin iva es de: "+miTienda.getP3().valorUnitario(false));
        
     System.out.println("Valor unitario de "+P4.getNombre() + " con iva es de: "+miTienda.getP4().valorUnitario(true));
     System.out.println("Valor unitario de "+P4.getNombre() + " sin iva es de: "+miTienda.getP4().valorUnitario(false));
    }
    
     
}
