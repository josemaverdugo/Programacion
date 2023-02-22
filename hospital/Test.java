package tema7.hospital;

public class Test {
    
    public static void main(String[] args) {
        Medico m1=new Medico(333,33,EspecialistasMedicos.Cardiologos,"Pablo",333,3333);
        TrabajadorNoMedico NM1=new TrabajadorNoMedico("Area 33",EspecialistasNoMedicos.Limpiadores,"Jose Luis",21,333);
        System.out.println(m1.getNombre());
        
        
    }
    
}
