package tema7.ikea;

public class Mueble extends ProductoHogar {
    
    private String tipoDeMueble; 

    public Mueble( String nombre, String descripcion, double precio,String tipoDeMueble, String tipoDeMaterial) {
        super(tipoDeMaterial, nombre, descripcion, precio);
        this.tipoDeMueble = tipoDeMueble;
    }

    public String getTipoDeMueble() {
        return tipoDeMueble;
    }

    public void setTipoDeMueble(String tipoDeMueble) {
        this.tipoDeMueble = tipoDeMueble;
    }
   
    
}
