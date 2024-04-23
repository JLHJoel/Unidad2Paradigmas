package ejer15;

public class Empleado extends Persona{
    private String NSS;
    private Puesto actividad; //variable tipo objeto

    

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
