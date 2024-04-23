package ejer18;

public class Circulo extends Figura {

    Circulo(double lado){
        super(lado);
    }
    //override
    public void area(){
        System.out.println("Area circulo = " + (lado*lado*3.1416));
    }
    public void perimetro(){
        System.out.println("Perimetro Circulo = " + (lado*2*3.1416));
    }
    public String toString() {
        return "Circulo [lado=" + lado + "]";
    }

    
}
