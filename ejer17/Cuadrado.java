package ejer17;

public class Cuadrado extends Figura {

    Cuadrado(double lado){
        super(lado);
    }
    //override
    public void area(double lado){
        System.out.println("Area cuadrado = " + (lado*lado));
    }
    public void perimetro(){
        System.out.println("Perimetro Cuadradado = " + (lado*4));
    }
    public String toString() {
        return "Cuadrado [lado=" + lado + "]";
    }

    
}
