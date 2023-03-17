package tema8.EjercicioLlamada;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class LLamada implements Comparable  {
    
    String numerotelefonoC;
    String numerotelefonoI;
    boolean llamadasaliente;
    LocalDateTime inicio;
    LocalDateTime fin;
    int zona;
    Double[] tarifa={0.10,0.15,0.20,0.25,0.30};

    public LLamada(String numerotelefonoC, String numerotelefonoI, boolean llamadasaliente, LocalDateTime inicio, LocalDateTime fin, int zona) {
        this.numerotelefonoC = numerotelefonoC;
        this.numerotelefonoI = numerotelefonoI;
        this.llamadasaliente = llamadasaliente;
        this.inicio = inicio;
        this.fin = fin;
        this.zona=zona;
    } 

    @Override
    public int compareTo(Object o) {
       
        int res = numerotelefonoC.compareTo(((LLamada) o).numerotelefonoC);
        if (res == 0) {
            res = inicio.compareTo(((LLamada) o).inicio);
        }
        return res;
    }
     int duracion(){
        int resdur;
        resdur = (int) inicio.until(fin, ChronoUnit.MINUTES);
        return resdur;
    }
    double coste(){
        double res=0;
        if(llamadasaliente==true){
            switch (zona) {
                case 1:
                    res=duracion()*tarifa[0];
                    break;
                case 2:
                    res=duracion()*tarifa[1];
                    break;
                case 3:
                    res=duracion()*tarifa[2];
                    break;
                case 4:
                    res=duracion()*tarifa[3];
                    break;
                case 5:
                    res=duracion()*tarifa[4];
                    break;
                default:
                    break;
            }
            }else{
                res=0;
            }
        return res; 
    }

@Override
    public String toString() {
        return "\n" + "En la llamada el telefono del cliente ha sido " + numerotelefonoC + "  el del interlocutor " + numerotelefonoI + ", la llamada comenzo " + inicio + "  la duracion fue de " +duracion()+ " y la llamada tuvo un coste de " + coste() ;
    }
    
         

    
    
    
    

    
    
    
    
}
