package tema8.EjercicioLlamada;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;


public class test {
    public static void main(String[] args) {
        LocalDateTime a= LocalDateTime.of(2020, Month.OCTOBER, 9, 11, 30);
        LocalDateTime b=LocalDateTime.of(2020, Month.OCTOBER, 9, 15, 15);
        LocalDateTime c= LocalDateTime.of(2020, Month.OCTOBER, 9, 9, 33);
        LLamada l1= new LLamada("654371127", "954656383", true, a, b, 5);
        LLamada l2= new LLamada("654371127", "954656383", false, c, a, 4);
        LLamada l3= new LLamada("654371127", "954656383", true, c, a, 3);
        LLamada []t = new LLamada[]{l1,l2,l3};
        System.out.println(Arrays.toString(t));
        Arrays.sort(t);
        System.out.println(Arrays.toString(t));
        
        
    }
}


