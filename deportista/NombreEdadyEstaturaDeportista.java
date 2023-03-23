package tema9.deportista;


import java.util.Scanner;

public class NombreEdadyEstaturaDeportista {
    
    public static void main(String[] args) {
        
        Scanner escaner=new Scanner(System.in);
        
        System.out.println("Introduce el nombre, la edad y la estatura del deportista: ");
        String nombre= escaner.next();
        int edad= escaner.nextInt();
        double estatura= escaner.nextDouble();
        Deportista d1= new Deportista(nombre, edad, estatura);
        
        System.out.println(d1.toString());
        
        
        
        
        
        
    }
}
