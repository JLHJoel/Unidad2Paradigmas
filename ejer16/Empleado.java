package ejer16;

public class Empleado extends Persona{
    private String NSS;
    private Puesto actividad; //variable tipo objeto

    public Empleado(){
        this.id = 0;
    }
    public Empleado(int id, String nombre, String apellido, String online, String NSS, String descripcion, int salario){
        
        this.id = id;
        setNombre(nombre);
        setApellido(apellido);
        setOnline(Boolean.valueOf(online)); //convertir string a boolean
        setNSS(NSS);
        this.setActividad(new Puesto(salario, descripcion));
    }

    

    public String getNSS() {
        return NSS;
    }
    public void setNSS(String nSS) {
        NSS = nSS;
    }
    public Puesto getActividad() {
        return actividad;
    }
    public void setActividad(Puesto actividad) {
        this.actividad = actividad;
    }

    



    @Override
    public String toString() {
        return "Empleado [NSS=" + NSS + ", actividad=" + actividad + "]";
    }
    
}
