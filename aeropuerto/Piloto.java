package tema7.aeropuerto;


public class Piloto extends Personal {
    
    private double sueldo;
    private boolean vuelosint;
    

    public Piloto(String nombre, String apellidos, String dni, String email,double sueldo,boolean vuelosint) {
        super(nombre, apellidos, dni, email);
        this.sueldo=sueldo;
        this.vuelosint=vuelosint;
        
        
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isVuelosint() {
        return vuelosint;
    }

    public void setVuelosint(boolean vuelosint) {
        this.vuelosint = vuelosint;
    }
    
    
    
    
    
}
