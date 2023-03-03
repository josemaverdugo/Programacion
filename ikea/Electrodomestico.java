package tema7.ikea;

public class Electrodomestico extends ProductoHogar {
    
    private EficienciaEnergetica eficiencia;

    public Electrodomestico( String nombre, String descripcion, double precio, String tipoDeMaterial,EficienciaEnergetica eficiencia) {
        super(tipoDeMaterial, nombre, descripcion, precio);
        this.eficiencia = eficiencia;
    }

    public EficienciaEnergetica getEficiencia() {
        return eficiencia;
    }

    public void setEficiencia(EficienciaEnergetica eficiencia) {
        this.eficiencia = eficiencia;
    }
    
    
    
}
