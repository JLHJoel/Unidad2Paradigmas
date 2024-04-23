package ejer19;

public class EmpleadoHora extends Empleado {

    private double sueldoHora;
    private double horasTrabajadas;

    public double getSueldoHora() {
        return sueldoHora;
    }

    public void setSueldoHora(double sueldoHora) {
        this.sueldoHora = sueldoHora;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public EmpleadoHora(int id, String nombre, String paterno, String online, String NSS, double sueldoHora){
        super(id, nombre, paterno, online, NSS, 0);
        this.sueldoHora = sueldoHora;
        this.horasTrabajadas = 0;
    }

    public void calculoSalario(){
        setSueldo(sueldoHora * horasTrabajadas);
    }
    public void mostrarNomina(){
        System.out.println("Nomina de Empleado por Hora");
        System.out.println("Nombre: " + getNombre() + "Apellido: " + getApellido()+ "NSS: " + getNSS()
        + ", Sueldo Total: " + getSueldo()+ "\n");
        
    }
    
}
