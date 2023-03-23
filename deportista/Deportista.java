package tema9.deportista;

public class Deportista {
    
    String nombre;
    int edad;
    double estatura;

    public Deportista(String nombre, int edad, double estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }

    @Override
    public String toString() {
        return "Deportista{" + "nombre=" + nombre + ", edad=" + edad + ", estatura=" + estatura + '}';
    }
    
    
    
}
