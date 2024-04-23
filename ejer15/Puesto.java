package ejer15;

public class Puesto {
    private int salario;
    private String descripcion;
    
    
    public void setSalario(int salario) {
        this.salario = salario;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public int getSalario() {
        return salario;
    }


    public String getDescripcion() {
        return descripcion;
    }


    public Puesto(){
        this.salario = 2500;
        this.descripcion = "administrativo";
    }

    public Puesto(int salario, String descripcion){
        this.salario = salario;
        this.descripcion = descripcion;
    }


    @Override
    public String toString() {
        return "Puesto [salario=" + salario + ", descripcion=" + descripcion + "]";
    }

    
    
}
