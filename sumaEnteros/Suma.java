package tema9.sumaEnteros;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Suma {
    public static void main(String[] args) {
        
        double suma=0;
        
        try {
            Scanner escaner = new Scanner(new File("numerosreales.txt"));
            
            
            while(escaner.hasNextLine()){
                suma = suma + Double.parseDouble(escaner.nextLine()) ;
                
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("La suma de los numeros del archivo es: "+suma );
    }
}
    
    
    
    
    
    
    



