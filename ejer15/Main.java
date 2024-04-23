//Lozano Hernandez Joel
//Ejercicio 15 POO herencia
package ejer15;

public class Main {
    public static void main(String[] args){
        Persona usuario = new Persona();
        System.out.println(usuario.toString());
        usuario.estatura = 1.62f;
        //usuario.nombre = "Oscar";
        usuario.setNombre("Oscar");
        usuario.setId(123);
        System.out.println("Ejercicio 15 POO herencia");
        
        System.out.println(usuario.toString());

        //Persona usuario2;
        //probar empleado
        System.out.println("Herencia Empleado");
        Empleado guardia =  new Empleado();
        System.out.println(guardia.toString());


        //
        System.out.println("Puesto: ");
        Puesto secretaria = new Puesto(2800, "Secretaria");
        System.out.println(secretaria.toString());

        guardia.setActividad(secretaria);
        //empleado con su puesto
        System.out.println("Empleado con puesto");
        System.out.println(guardia.toString());
        

    }    
}
