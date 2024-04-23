//Lozano Hernandez Joel
//Ejercicio 17 Polimorfismo
package ejer17;

public class Main {
    public static void main(String[] args){
        System.out.println("Ejercicio 17 Polimorfismo");
        Figura objeto = new Figura(15);
        System.out.println(objeto.toString());
        objeto.incremento();
        System.out.println(objeto.toString());

        Cuadrado mesa = new Cuadrado(1.5);
        System.out.println("Objeto con herencia");
        System.out.println(mesa.toString());
        mesa.perimetro();
        mesa.area();

        //polimorfismo
        Figura ventana = new Cuadrado(1);
        ventana.perimetro();
        ventana.area();
        System.out.println(ventana.toString());

        Figura llanta = new Circulo(0.25);
        System.out.println(llanta.toString());
        llanta.perimetro();
        llanta.area();




    }
    
}
