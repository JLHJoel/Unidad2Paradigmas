package ejer19;

public class Empleado extends Persona{
    private String NSS;
    private double sueldo;

    public Empleado(){
        this.id = 0;
        this.sueldo = 0;
    }
    public Empleado(int id, String nombre, String apellido, String online, String NSS, double sueldo){
        
        this.id = id;
        setNombre(nombre);
        setApellido(apellido);
        setOnline(Boolean.valueOf(online)); //convertir string a boolean
        setNSS(NSS);
        setSueldo(sueldo);
    }

    

    public String getNSS() {
        return NSS;
    }
    public void setNSS(String nSS) {
        NSS = nSS;
    }

    

    public double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    @Override
    public String toString() {
        return "Empleado [NSS=" + NSS + ", sueldo=" + sueldo + "]";
    }

    public void calculoSalario(){}
    public void mostrarNomina(){}

    
    
}
