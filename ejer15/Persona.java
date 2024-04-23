package ejer15;

public class Persona {
    //atributos por defecto son publicos
    private String nombre;
    float estatura;
    private boolean online; //defecto inicializa en false
    protected int id; //se heredan
    
    
    //constructor por defecto lo hereda de la clase object
    public Persona(){
        nombre = "noname";
        this.estatura = 1.55f;

    }

    //get, set
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }
    public void setOnline(boolean online) {
        this.online = online;
    }
    public void setId(int id) {
        this.id = id;
    }
    public float getEstatura() {
        return estatura;
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
        "Estatura: " + estatura + "\n" +
        "Activo: " + online + "\n" +
        "ID: " + id;
    }

    public void incrementa(float estatura){
        this.estatura += estatura;
    }
    
}
