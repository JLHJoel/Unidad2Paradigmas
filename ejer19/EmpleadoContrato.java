package ejer19;

public class EmpleadoContrato extends Empleado {

    private double sueldoFijo;
    private int plazos;

    public double getSueldoFijo() {
        return sueldoFijo;
    }

    public void setSueldoFijo(double sueldoFijo) {
        this.sueldoFijo = sueldoFijo;
    }

    public int getPlazos() {
        return plazos;
    }

    public void setPlazos(int plazos) {
        this.plazos = plazos;
    }

    public EmpleadoContrato(int id, String nombre, String paterno, String online, String NSS, double sueldoFijo, int plazos){
        super(id, nombre, paterno, online, NSS, 0);
        this.sueldoFijo = sueldoFijo;
        this.plazos = plazos;
    }

    public void calculoSalario(){
        setSueldo(sueldoFijo / plazos);
    }
    public void mostrarNomina(){
        System.out.println("Nomina de Empleado por Contrato");
        System.out.println("Nombre: " + getNombre() + "Apellido: " + getApellido()+ "NSS: " + getNSS()
        + ", Pago c/plazo: " + getSueldo()+ "Pago Total: " + getSueldoFijo() +"\n");
        
    }
    
}
