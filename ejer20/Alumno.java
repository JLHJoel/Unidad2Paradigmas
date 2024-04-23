package ejer20;

public class Alumno {

    String matricula;
    
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public Carrera getProfesion() {
        return profesion;
    }
    public void setProfesion(Carrera profesion) {
        this.profesion = profesion;
    }
    Carrera profesion;
    
}
