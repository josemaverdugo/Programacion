package tema7.aeropuerto;

public class Pasajero extends Personal{
    
    
    private int pasaporte;

    
    
    public Pasajero(String nombre, String apellidos, String dni, String email,int pasaporte) {
        super(nombre, apellidos, dni, email);
        this.pasaporte=pasaporte;
    }
    
    
        public int getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(int pasaporte) {
        this.pasaporte = pasaporte;
    }
    
}
