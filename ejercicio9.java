//Lozano Hernandez Joel
//Ejercicio 9 Generar numeros aleatorios con recursividad
import java.util.Scanner;
import java.util.Random;

public class ejercicio9{
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ejercicio 9 Generar numeros aleatorios con recursividad");
        Random num = new Random();
        int aux;
        int[] a = new int[15];
        // boolean igual;
        // for(int i=0; i<a.length; i++){
        //     do{
        //     aux = num.nextInt(1, 16);
        //     System.out.println("buscando" + aux);
        //     //recorrer el arreglo y verificar que no exista aux
        //     igual = false;
        //     for(int j=0; j<a.length; j++){
        //         if(a[j]==aux){
        //             igual = true;
        //         }
        //     }
        //     }while(igual==true);
        //     a[i] = aux;
        //     System.out.println("asignando " + a[i]);
        // }
        // int factorial=1; //factorial de cero =1
        // for(int i=0; i<num; i++){
        //     factorial += factorial * i;
        //     System.out.println(factorial);
        // } 
        // System.out.println("factorial con recursividad");
        // System.out.println(Factorial(num));   
        System.out.println("numeros con recursividad");
        for(int i=0; i<a.length; i++){
            a[i] = generarNum(a);
            System.out.println("asignando "+ a[i]);
            }
        }    


    //con recursividad

    

    public static int Factorial(int n){
        if(n<0){//condicion que aborta
            return 0;
        }
        else{
        if(n==1){//condicion de paro, resuelve todo
            return 1;
        }
        else{
            return n * Factorial(n-1);//llamada recursiva
        }
        }
    }

    public static int generarNum(int [] a){
        int aux=0;
        Random num = new Random();
        aux = num.nextInt(1, 16);
        System.out.println("buscando " + aux);
        //recorrer el arreglo y verificar que no exista aux
        for(int j=0; j<a.length; j++){
            if(a[j]==aux){
                generarNum(a);
            }
        }
        return aux;
           
    }
}

