package tema7.ikea;

public class testIkea {
    public static void main(String[] args) {
        
        Mueble kallax= new Mueble("Kallax","Estanteria con 6 accesorios blanco",199.99,"Madera","Estanteria");
        Electrodomestico forsa= new Electrodomestico("Forsa","Lampara flexo de trabajo", 14.99, "Plastico",EficienciaEnergetica.A);
        
        
        Producto[] lista= new Producto[0];
        
        Tienda listaProducto= new Tienda(lista);
        listaProducto.agregarProducto(kallax);
        listaProducto.agregarProducto(forsa);
        
        listaProducto.mostrarProductos();
    }
}     
    
    

