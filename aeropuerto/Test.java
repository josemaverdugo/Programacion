package tema7.aeropuerto;



public class Test {
    public static void main(String[] args) {
        Piloto p=new Piloto("Pablo", "Cubero Luque", "49824459L", "pablitopruna@gmail.com", 2000, true);
        Azafato a=new Azafato("Jose Luis", "Lopez Caro", "12345678P", "joseluishumilde@gmail.com", 1250, 2);
        Pasajero p1=new Pasajero("Alejandro", "Torres Rios", "98765432Q", "aletorrespejiguero@gmail.com", 145);
        Pasajero p2=new Pasajero("Jose Manuel", "Verdugo Mejias", "77868944Y", "josemaverdugo@gmail.com", 133);
        
        Pasajero[] Pasajeros=new Pasajero[2];
        
        Vuelo v=new Vuelo("Sevilla", "Kiev", p, Pasajeros, 3.5);
        
        
        
        
        
        
            
            
        }
        
      
    }

