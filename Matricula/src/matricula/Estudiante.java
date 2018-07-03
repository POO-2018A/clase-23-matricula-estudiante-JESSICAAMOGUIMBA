package matricula;

import java.util.ArrayList;

/**
 *
 * @author FRANCISCO
 */
public class Estudiante {
    
    private String nombre;
    private String apellido;
    private String Edad;
    
 private ArrayList<Materia> materias;
    //Constructor Vacio
    public Estudiante (){

    }
    
    
    public Estudiante(String nombre, String apellido, String Edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.Edad = Edad;
        this.materias=materias;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    

    @Override
    public String toString() {
        return nombre + "     " + apellido ;
    }

    public String imprimir (){
    return this.nombre + " " + this.apellido;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }
    
    
    
    
}
