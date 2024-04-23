package ejer17;

public class Figura{
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
    
    
}
