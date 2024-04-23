//Lozano Hernandez Joel
//Ejercicio 13 Uso de memoria
package ejer13;
import java.util.Random;


public class ejercicio13{
    public static Runtime runtime = Runtime.getRuntime();
    public static void main (String args[]){
    int dataSize = 1024 * 1024;
  
    
  
    System.out.println ("Memoria máxima: " + runtime.maxMemory());
    System.out.println ("Memoria total: " + runtime.totalMemory());
    System.out.println ("Memoria libre: " + runtime.freeMemory());
    System.out.println ("Memoria usada: " + (runtime.totalMemory() - runtime.freeMemory()));
    //probar for de ejer9
    Random num = new Random();
    int aux;
    int[] a = new int[15];
    boolean igual;
    for(int i=0; i<a.length; i++){
            do{
            aux = num.nextInt(1, 16);
            System.out.println("buscando" + aux);
            //recorrer el arreglo y verificar que no exista aux
            igual = false;
            for(int j=0; j<a.length; j++){
                if(a[j]==aux){
                    igual = true;
                }
            }
            }while(igual==true);
            a[i] = aux;
            System.out.println("asignando " + a[i]);
    }//for
    System.out.println ("al terminar for Memoria usada: " + (runtime.totalMemory() - runtime.freeMemory()));
    System.out.println(invertir(134));
    //declarar objeto
    Prueba objeto = new Prueba();
    System.out.println ("declarar objeto: " + (runtime.totalMemory() - runtime.freeMemory()));



}

public static int invertir(int n){
    int resto;
    int invert = 0;
    while(n>0){
        resto = n % 10;
        invert = invert * 10 + resto;
        n /= 10;
    }
    System.out.println ("antes salir de invertir: " + (runtime.totalMemory() - runtime.freeMemory()));
    return invert;
}
}