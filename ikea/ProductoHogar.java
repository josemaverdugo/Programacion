package tema7.ikea;

abstract class ProductoHogar extends Producto {
    
    private String tipoDeMaterial;

    public ProductoHogar(String tipoDeMaterial, String nombre, String descripcion, double precio) {
        super(nombre, descripcion, precio);
        this.tipoDeMaterial = tipoDeMaterial;
    }

    public String getTipoDeMaterial() {
        return tipoDeMaterial;
    }

    public void setTipoDeMaterial(String tipoDeMaterial) {
        this.tipoDeMaterial = tipoDeMaterial;
    }
    
    
    
    
    
}
