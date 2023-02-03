package tema6;

import java.util.Arrays;
import java.util.Random;



public class billeteOculto {
    public static void main(String[] args) {
        String tabla[][]=new String [8][4];
        Random verdugo=new Random();
        for (int a = 0; a < 8; a++) {
            for (int b = 0; b < 4; b++) {
                tabla[a][b]="-";
                 }
            
            }
        
        tabla[verdugo.nextInt(7)][verdugo.nextInt(3)]="€";
        System.out.println(Arrays.toString(tabla[0]));
        System.out.println(Arrays.toString(tabla[1]));
        System.out.println(Arrays.toString(tabla[2]));
        System.out.println(Arrays.toString(tabla[3]));
        System.out.println(Arrays.toString(tabla[4]));
        System.out.println(Arrays.toString(tabla[5]));
        System.out.println(Arrays.toString(tabla[6]));
        System.out.println(Arrays.toString(tabla[7]));
        
        
    }
   
    
}
