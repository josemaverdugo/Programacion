package tema7.aeropuerto;

public class Trabajador extends Personal {
    
    
    private double sueldo;
    
    public Trabajador (String nombre, String apellidos, String dni, String email,double sueldo) {
        super(nombre, apellidos, dni, email);
        this.sueldo=sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    
    
    
    
}
