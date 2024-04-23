//Ejercicio 20 Programacion funcional
//Lozano Hernandez Joel
package ejer20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        //programacion imperativa
        System.out.println("Prog Imperativa");
        int cont = 0;
        List <Integer> positivos = new ArrayList<>(Arrays.asList(1,8,3,56,15));
        System.out.println("Mostrar numeros positivos");
        for(int i=0; i<positivos.size(); i++){
            if(positivos.get(i)>0){
                cont++;
                System.out.println(positivos.get(i));
            }
        }
        System.out.println("Total de positivos " + cont);

        //programacion declarativa
        System.out.println("Estilo declarativo");
        Long c = positivos.stream().filter(n -> n>0).count();
        System.out.println("Total de positivos " + c);

        //funcion pura
        int anio= 2024;
        System.out.println(anio + "es bisiesto?" + estatica.bisiesto(anio));
        System.out.println("Aleatorio " + estatica.aleatorio(1,100));

        //composicion de funciones
        System.out.println("Bisiesto aleatorio " + estatica.bisiesto(estatica.aleatorio(1999, 2050)));

        //funcion no pura
        cont =15;
        System.out.println("funcion no pura " + estatica.suma5(1234));

        //instancia simple
        Carrera ing = new Carrera();
        ing.setNombre("Ing. Software");

        //estado compartido
        Alumno pedro = new Alumno();
        pedro.setMatricula("123");
        pedro.setProfesion(ing);

        
    }
    
}
