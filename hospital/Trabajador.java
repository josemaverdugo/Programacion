package tema7.hospital;

public class Trabajador {
    
    private String nombre;
    private int nIdentificacion;
    private double sueldo;

    public Trabajador(String nombre, int nIdentificacion, double sueldo) {
        this.nombre = nombre;
        this.nIdentificacion = nIdentificacion;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getnIdentificacion() {
        return nIdentificacion;
    }

    public void setnIdentificacion(int nIdentificacion) {
        this.nIdentificacion = nIdentificacion;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    
    
}
