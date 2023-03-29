package tema9;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AcabaFin {
    
    public static void main(String[] args) {
        
        try {
            BufferedWriter fin=new BufferedWriter(new FileWriter("acabafin.txt",true));
            
            String f=null;
            Scanner escaner=new Scanner(System.in);
            f=escaner.next();
            while(!f.equals("fin")){
               f=escaner.next();
              fin.write(f);
              fin.newLine();
              fin.flush();
            }
            fin.close();
            
        } catch (Exception e) {
        }
        
    }
    
}
