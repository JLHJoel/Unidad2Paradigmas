package ejer19;

public class Persona {
    //atributos por defecto son publicos
    private String nombre;
    private String apellido;

    private boolean online; //defecto inicializa en false
    protected int id; //se heredan
    
    
    //constructor por defecto lo hereda de la clase object
    public Persona(){
        this.nombre = "";
        this.apellido = "";
        

    }

    //get, set
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setOnline(boolean online) {
        this.online = online;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getApellido() {
        return apellido;
    }
    public boolean isOnline() {
        return online;
    }
    public int getId() {
        return id;
    }
    
    //otros metodos
    public String toString(){
         

        return "Nombre: " + nombre + "\n" + 
        "Apellido: " + apellido + "\n" +
        "Activo: " + online + "\n" +
        "ID: " + id;
    }

    // public void incrementa(float estatura){
    //     this.estatura += estatura;
    // }
    
}
