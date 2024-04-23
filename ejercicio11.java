//Lozano Hernandez Joel
//Ejercicio 11 Carpetas de archivos
import java.util.Scanner;
import java.io.File;

public class ejercicio11 {
     public static void main(String [] args){
        Scanner lector = new Scanner(System.in);
        System.out.println("Ejercicio 11 carpetas de archivos");
        File fichero = new File("c:/Users/JoelJr/Desktop/Prueba"); //Nota importante: Para que funcione el programa
        //correctamente debe agregar una ruta correspondiente a una carpeta de su computadora.
        mostrarCarpeta(fichero, "-> ");         
    }

    public static void mostrarCarpeta(File fichero, String tab){
        if(fichero.isDirectory()){
            File[] lista = fichero.listFiles();
            for(int i=0; i<lista.length ; i++){
                System.out.println(tab + lista[i].getName());
                if(lista[i].isDirectory()){
                    mostrarCarpeta(lista[i], "-" + tab);
                }
            }
        }
        else{
            System.out.println("Esto no es una carpeta");
        }

    }
    
}
