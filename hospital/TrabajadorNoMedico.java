package tema7.hospital;

public class TrabajadorNoMedico extends Trabajador {
    
    private String areaTrabajo;
    private EspecialistasNoMedicos especialidad;

    public TrabajadorNoMedico(String areaTrabajo, EspecialistasNoMedicos especialidad, String nombre, int nIdentificacion, double sueldo) {
        super(nombre, nIdentificacion, sueldo);
        this.areaTrabajo = areaTrabajo;
        this.especialidad = especialidad;
    }

    public String getAreaTrabajo() {
        return areaTrabajo;
    }

    public void setAreaTrabajo(String areaTrabajo) {
        this.areaTrabajo = areaTrabajo;
    }

    public EspecialistasNoMedicos getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(EspecialistasNoMedicos especialidad) {
        this.especialidad = especialidad;
    }
    
    
    
    
    
}
