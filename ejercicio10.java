//Lozano Hernandez Joel
//Ejercicio 10 Mas ejemplos de recursividad resueltos
import java.util.Scanner;



public class ejercicio10 {
    public static void main(String [] args){
        Scanner lector = new Scanner(System.in);
        System.out.println("Ejercicio 10 Mas ejemplos de recursividad resueltos");
        System.out.println("Division con restas");
        
        System.out.println("10/2 = " + division(9, 2));
        System.out.println("Invertir numero");
        System.out.println(invertir(134));
    }

    //10/2 = (10-2, 2), 8/2 = (8-2, 2)
    public static int division(int a, int b){
        if(b > a){
            return 0;//ej 2/7 resultado con decimal no se inicia  
        } 
	    else{
            return division(a-b, b) + 1;
        }
	    
    }

    public static int invertir(int n){
        int resto;
        int invert = 0;
        while(n>0){
            resto = n % 10;
            invert = invert * 10 + resto;
            n /= 10;
        }
        return invert;
    }

    public static int invertirRec(int n, int invert){
        int resto = 0;
        if(n==0){
            return invert;
        }
        else{
            resto = n%10;
            return invertirRec(n/10, invert*10 + resto);
        }
    }
    
}
