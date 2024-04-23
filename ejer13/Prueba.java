package ejer13;

public class Prueba {
    public static Runtime runtime = Runtime.getRuntime();
    public long valor;
    public String dato = "";

    public void rellenar(long n){
        for(int i=0; i<n; i++){
            this.dato += String.valueOf(i) + "-";
            System.out.println ("despues for: " + (runtime.totalMemory() - runtime.freeMemory()));
        }
             
    }
    
}
