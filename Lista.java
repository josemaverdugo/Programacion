package tema8;
import java.util.Arrays;
import java.util.Scanner;

public class Lista implements Cola,Pila {
   Integer[] tabla;

   public Lista() {
      tabla = new Integer[0];
   }
   
   Scanner escaner = new Scanner(System.in);
    
    public void encolar() {
       
        int z=escaner.nextInt();
        while(z>=0){
        this.insertarFinal(z);
        z=escaner.nextInt();
        }
        
    }
   @Override
    public void desencolar() {
 
    while(tabla.length>0){
    this.eliminar(0);
        System.out.println(Arrays.toString(tabla));
    }
    }

   void insertarPrincipio(Integer nuevo) {
      tabla = Arrays.copyOf(tabla, tabla.length + 1);
      System.arraycopy(tabla, 0, tabla, 1, tabla.length - 1);
      tabla[0] = nuevo;
   }

   void insertarFinal(Integer nuevo) {
      tabla = Arrays.copyOf(tabla, tabla.length + 1);
      tabla[tabla.length - 1] = nuevo;
   }

   void insertarFinal(Lista otraLista) {
      int tamIni = tabla.length;
      tabla = Arrays.copyOf(tabla, tabla.length + otraLista.tabla.length);
      System.arraycopy(otraLista.tabla, 0, tabla, tamIni, otraLista.tabla.length);
   }

   void insertar(int posicion, Integer nuevo) {
      tabla = Arrays.copyOf(tabla, tabla.length + 1);
      System.arraycopy(tabla, posicion, tabla, posicion + 1,
         tabla.length - posicion - 1);
      tabla[posicion] = nuevo;
   }

   Integer eliminar(int indice) {
      Integer eliminado = null;
      if (indice >= 0 && indice < tabla.length) {
         eliminado = tabla[indice];
         for (int i = indice + 1; i < tabla.length; i++) {
            tabla[i - 1] = tabla[i];
         }
         tabla = Arrays.copyOf(tabla, tabla.length - 1);
      }
      return eliminado;
   }

   Integer get(int indice) {
      Integer resultado = null;
      if (indice >= 0 && indice < tabla.length) {
         resultado = tabla[indice];
      }
      return resultado;
   }

   int buscar(Integer claveBusqueda) {
      int indice = -1;
      for (int i = 0; i < tabla.length && indice == -1; i++) {
         if (tabla[i].equals(claveBusqueda)) {
            indice = i;
         } else {
         }
      }
      return indice;
   }

   public int numeroElementos() {
      return tabla.length;
   }

   public void mostrar() {
      System.out.println("Lista: " + Arrays.toString(tabla));
   }
   
   @Override
   public void encolar(int a){
       insertarFinal(a);
   }
   
   
   public void desencolar1(){
       this.eliminar(0);
   }
  
   
   @Override
   public void apilar(int a){
       insertarPrincipio(a);
   }
   @Override
   public void desapilar(){
       eliminar(0);
   }
  
   
   
}
