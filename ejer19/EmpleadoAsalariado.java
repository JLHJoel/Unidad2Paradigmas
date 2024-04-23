package ejer19;

public class EmpleadoAsalariado extends Empleado {

    private double sueldoDiario;

    public EmpleadoAsalariado(int id, String nombre, String paterno, String online, String NSS, double sueldoDiario){
        super(id, nombre, paterno, online, NSS, 0);
        this.sueldoDiario = sueldoDiario;
    }

    public void calculoSalario(){
        setSueldo(sueldoDiario * 7);
    }
    public void mostrarNomina(){
        System.out.println("Nomina Asalariado");
        System.out.println("Nombre: " + getNombre() + "Apellido: " + getApellido()+ "NSS: " + getNSS()
        + ", Sueldo Semanal: " + getSueldo()+ "\n");
        
    }
    
}
