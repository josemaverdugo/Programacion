package tema6.Videoclub;

public class Cliente {
    
    int codigo;
    String nombre;
    Bono Bono;

    Cliente(){
        
    }
    
    void registrarCliente(int codigo, String nombre, Bono Bono){
        
        this.codigo=codigo;
        this.nombre=nombre;
        this.Bono=Bono;
    }
    
    
     void modificarCliente(int codigo, String nombre, Bono Bono){
         this.codigo=codigo;
         this.nombre=nombre;
         this.Bono=Bono;
           
    }
    
     
     void eliminarCliente(int codigo, String nombre,Bono Bono){
         this.codigo=codigo;
         this.nombre=nombre;
         this.Bono=Bono;
         
     }
    
 
     
     
}
