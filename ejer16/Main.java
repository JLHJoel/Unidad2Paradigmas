//Lozano Hernandez Joel
//Ejercicio 16  Lectura e impresion de datos utilizando ArrayList
package ejer16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        Scanner ptr = new Scanner(System.in);
        ArrayList<Puesto> puestos = new ArrayList<>();
        ArrayList<Empleado> empleados = new ArrayList<>();
        int opcion;
        // Ruta del archivo CSV
        String archivoCSV = "C:\\Users\\JoelJr\\Desktop\\Paradigmas\\ejer16\\puesto.csv";

        // Define el BufferedReader
        BufferedReader br = null;

        try {
            // Inicializa el BufferedReader
            br = new BufferedReader(new FileReader(archivoCSV));

            // Lee la primera línea del archivo (si tiene encabezado)
            // String encabezado = br.readLine();

            // Lee la siguiente línea del archivo
            String linea = br.readLine();

            // Mientras haya líneas en el archivo
            while (linea != null) {
                // Divide la línea en nombre y estatura
                String[] datos = linea.split(",");

                // Muestra nombre y estatura en pantalla
                System.out.println("Puesto: " + datos[0] + ", Sueldo: " + datos[1]);

                // Crea un nuevo objeto Puesto y lo agrega a la lista
                Puesto puesto = new Puesto(datos[0], Integer.parseInt(datos[1].trim()));
                puestos.add(puesto);

                // Lee la siguiente línea del archivo
                linea = br.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Cierra el BufferedReader
            try {
                if (br != null)
                    br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println();
        // cicla todo el arrayLista e imprime el contenido de cada una de estas
        for (int x = 0; x < puestos.size(); x++) {
            System.out.println(puestos.get(x));
        }

        do {
            // Llama al método menu
            menu();
            opcion = ptr.nextInt();
            switch (opcion) {
                case 1:
                    empleados.add(alta(puestos)); 
                    int id = empleados.size();
                    empleados.get(id-1).setId(id); //Asignar num empleados
                    break;
                case 2:
                    baja(empleados);
                    break;
                case 3:
                    mostrar(empleados);
                    break;
                case 4:
                    guardar(empleados);
                    break;

            }
        } while (opcion != 5);
    }

    public static void menu() {
        // Lectura de empleados
        System.out.println("\nMenu");
        System.out.println("1. Alta Empleado");
        System.out.println("2. Baja Empleado");
        System.out.println("3. Mostrar Lista");
        System.out.println("4. Guardar Archivo");
        System.out.println("5. Salir");
        System.out.println("Ingrese una opcion: ");
    }

    public static Empleado alta(ArrayList<Puesto> puestos) {
        Scanner ptr = new Scanner(System.in);
        Empleado temp = new Empleado();
        int numPuesto;
        System.out.println("Alta Empleado");
        System.out.println("Nombre: ");
        temp.setNombre(ptr.nextLine());
        System.out.println("Apellido: ");
        temp.setApellido(ptr.nextLine());
        System.out.println("Numero de IMSS: ");
        temp.setNSS(ptr.nextLine());
        System.out.println("Puesto: ");
        
        for (int x = 0; x < puestos.size(); x++) {
            System.out.println(" " + (x + 1) + ". " + puestos.get(x));
        }
        numPuesto = (Integer.parseInt(ptr.nextLine()));
        temp.setActividad(puestos.get(numPuesto-1)); // Asignar el Puesto seleccionado1
        // ptr.close();
        return temp;
    }
    
    

    public static void baja(ArrayList<Empleado> empleados) {
        Scanner ptr = new Scanner(System.in);
        int num = 0;
        System.out.println("Numero de Empleado: ");
        num = (Integer.parseInt(ptr.nextLine())-1);
        empleados.remove(num);
        // ptr.close();
    }

    public static void mostrar(ArrayList<Empleado> empleados){
        for (int x = 0; x < empleados.size(); x++) {
            System.out.println("Empleado No: " + empleados.get(x).getId());
            System.out.println(empleados.get(x));
        }
    }

    public static void guardar(ArrayList<Empleado> empleados) {
        try(FileWriter fw = new FileWriter("empleados.txt")){
            for (Empleado empleado : empleados) {
                String linea = "Empleado No: " + empleado.getId() + "\n"
                        + "Apellido: " + empleado.getApellido() + "\n"
                        + "Nombre: " + empleado.getNombre() + "\n"
                        + "Vivo: " + empleado.isOnline() + "\n"
                        + "NSS: " + empleado.getNSS() + "\n"
                        + "Puesto: " + empleado.getActividad().getDescripcion() + "\n"
                        + "Salario: " + empleado.getActividad().getSalario() + "\n\n";
                System.out.println(linea);
                fw.write(linea);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
