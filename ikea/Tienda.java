package tema7.ikea;

import java.util.Arrays;

public class Tienda {
    
    private Producto[] listaProducto;
   

    public Tienda(Producto[] listaProducto) {
        this.listaProducto = listaProducto;
    }
    
    
    
    public void agregarProducto(Producto producto){
        listaProducto = Arrays.copyOf(listaProducto, listaProducto.length + 1);
        listaProducto[listaProducto.length - 1] = producto;
    }
    
    
    public void mostrarProductos(){
        for (int i = 0; i < listaProducto.length ; i++) {
            System.out.print(" Producto: "+i +" Nombre: " +listaProducto[i].getNombre() + " Descripcion: " + listaProducto[i].getDescripcion()+" Precio: "+listaProducto[i].getPrecio() );    
         }
    }
    
}

