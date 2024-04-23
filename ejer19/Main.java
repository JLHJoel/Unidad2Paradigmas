//Lozano Hernandez Joel
//Ejercicio 19 Doble herencia y abstraccion
package ejer19;

public class Main {
    public static void main(String[] args){
        
        Empleado profesor = new EmpleadoAsalariado(
            123, "Oscar", "Montero", "true", "123456789", 3000);
            profesor.calculoSalario();
            profesor.mostrarNomina();

        Empleado pintor = new EmpleadoContrato(
            789, "Mario", "Castro", "true", "123456789", 28000, 7);
            pintor.calculoSalario();
            pintor.mostrarNomina();


    }
    
}
