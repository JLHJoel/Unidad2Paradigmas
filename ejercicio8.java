//Lozano Hernandez Joel
//Ejercicio 8 Calculo de factorial con recursividad
import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ejercicio 8 Calculo de factorial con recursividad");
        int num=5;
        int factorial=1; //factorial de cero =1
        for(int i=0; i<num; i++){
            factorial += factorial * i;
            System.out.println(factorial);
        } 
        System.out.println("factorial con recursividad");
        System.out.println(Factorial(num));       
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
}
