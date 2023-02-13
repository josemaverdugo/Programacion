package tema7.aeropuerto;




public class Azafato extends Personal {
    
    private double sueldo;
    private int idioma;

    public Azafato(String nombre, String apellidos, String dni, String email,double sueldo,int idioma) {
        super(nombre, apellidos, dni, email);
        this.sueldo=sueldo;
        this.idioma=idioma;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getIdioma() {
        return idioma;
    }

    public void setIdiomas(int idioma) {
        this.idioma = idioma;
    }
    
}
