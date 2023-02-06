package tema6.Videoclub;

public class Ejemplar {
    
    int codigo;
    String nombre;
    double precio;

   Ejemplar(){
       
   }
    
   void registrarEjemplar(int codigo, String nombre, double precio){
       this.codigo=codigo;
       this.nombre=nombre;
       this.precio=precio;    
   }
    
   void modificarEjemplar(int codigo, String nombre, double precio){
       this.codigo=codigo;
       this.nombre=nombre;
       this.precio=precio;
   }
   
   void eliminarEjemplar(int codigo, String nombre, double precio){
       this.codigo=codigo;
       this.nombre=nombre;
       this.precio=precio;
   }
    
   
   
}
