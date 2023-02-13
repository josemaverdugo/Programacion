package tema7.aeropuerto;

public class Vuelo {
    
    private String ciudadOrigen;
    private String ciudadDestino;
    private Piloto piloto;
    private Pasajero [] pasajero;
    private double duracion;

    public Vuelo(String ciudadOrigen, String ciudadDestino, Piloto piloto, Pasajero[] pasajero, double duracion) {
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.piloto = piloto;
        this.pasajero = pasajero;
        this.duracion = duracion;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public Pasajero[] getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero[] pasajero) {
        this.pasajero = pasajero;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
        
}
