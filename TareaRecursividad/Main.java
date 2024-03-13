//Lozano Hernandez Joel
//Tarea ejercicios de recursividad

package TareaRecursividad;

import java.util.Arrays;

public class Main {
    public static void main(String [] args){

        int num = 6;
        int[] array =  {1, 3, 2, 7};
        int arraysize = array.length;
        
        

        System.out.println("Ejemplos de ejercicios de recursividad");
        System.out.println("\nNumero utilizado para calcular el factorial: " + num);
        System.out.println("\nArreglo utilizado para calcular la suma de los elementos del arreglo: " + Arrays.toString(array));

        System.out.println("\nCalcular el factorial de un numero");
        System.out.println("\n" + factorialRec(num));

        System.out.println("\nSumar de los elementos de un arreglo");
        System.out.println("\n" + sumarrayRec(array, arraysize) + "\n");

    }

    public static int factorialRec(int num){

        if(num==0 || num==1){ //este es el caso base, se sabe que el factorial de 0 o de 1 siempre sera 1
            return 1;
        }
        else{
            return num * factorialRec(num-1); //aqui es donde se utiliza la recursividad, en caso de no ser 0 o 1, retornamos la multiplicacion
                                              //del numero por el mismo numero menos 1, lo cual ira multiplicando todos los numeros anteriores hasta llegar al caso base
        }
    }

    public static int sumarrayRec(int [] array, int size){

        if(size<=0){ //este es el caso base, si no hay elementos en el arreglo, no hay nada que sumar
            return 0;
        }
        else{
            return array[size-1] + sumarrayRec(array, size-1); //este es el caso recursivo, se va sumando el elemento anterior del arreglo, al elemento entrante en la funcion, 
                                                               //por lo cual se va repitiendo, sumando todos los numeros hasta llegar a 0 elementos
        }
    }
    
}
