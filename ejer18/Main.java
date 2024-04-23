//Lozano Hernandez Joel
//Ejercicio 18 Polimorfismo con clase abstracta
package ejer18;

public class Main {
    public static void main(String[] args){
        System.out.println("Ejercicio 18 Polimorfismo con clase abstracta");
        // Figura objeto = new Figura(15);
        // System.out.println(objeto.toString());
        // objeto.incremento();
        // System.out.println(objeto.toString());

        Cuadrado mesa = new Cuadrado(1.5);
        System.out.println("Objeto con herencia");
        System.out.println(mesa.toString());
        mesa.perimetro();
        mesa.area();
        mesa.incremento();
        System.out.println(mesa.toString());

        //polimorfismo
        System.out.println("Ventana");
        Figura ventana = new Cuadrado(5);
        ventana.perimetro();
        ventana.area();
        System.out.println(ventana.toString()); //figura
        ventana.porcentaje(50.3);

        Figura llanta = new Circulo(0.25);
        System.out.println(llanta.toString());
        llanta.perimetro();
        llanta.area();




    }
    
}
