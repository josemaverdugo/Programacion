
package tema7.hospital;


public class Medico extends Trabajador{
    
    private int nColegiado;
    private int nPacientesAtendidos;
    private EspecialistasMedicos especialidad;

    public Medico(int nColegiado, int nPacientesAtendidos, EspecialistasMedicos especialidad, String nombre, int nIdentificacion, double sueldo) {
        super(nombre, nIdentificacion, sueldo);
        this.nColegiado = nColegiado;
        this.nPacientesAtendidos = nPacientesAtendidos;
        this.especialidad = especialidad;
    }

    public int getnColegiado() {
        return nColegiado;
    }

    public void setnColegiado(int nColegiado) {
        this.nColegiado = nColegiado;
    }

    public int getnPacientes() {
        return nPacientesAtendidos;
    }

    public void setnPacientes(int nPacientes) {
        this.nPacientesAtendidos = nPacientes;
    }

    public EspecialistasMedicos getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(EspecialistasMedicos especialidad) {
        this.especialidad = especialidad;
    }
    
    
    
    
}
