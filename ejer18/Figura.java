package ejer18;

public abstract class Figura{
    protected double lado;
    Figura(double lado){
        this.lado = lado;
    }
    public void area(){}
    public void perimetro(){}
    @Override
    public String toString() {
        return "Figura [lado=" + lado + "]";
    }

    public void incremento(){ //metodo implementado
        lado++;
    }

    public void porcentaje(double porc){
        System.out.println("Porcentaje double = " + (lado* porc / 100));
    }

    public void porcentaje(int porc){
        System.out.println("Porcentaje entero = " + (lado*porc / 100));
    }
    
    
}
