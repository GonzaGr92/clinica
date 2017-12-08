
package modelo;

public class Profesional extends Persona{
   private int id; 
   private int matricula;

    public Profesional(String apellido, String nombre, int telefono, int dni, String email) {
        super(apellido, nombre, telefono, dni, email);
    }

    public Profesional(int matricula, String apellido, String nombre, int telefono, int dni, String email) {
        super(apellido, nombre, telefono, dni, email);
        this.matricula = matricula;
    }

   @Override
    public int getId() {
        return id;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

   
    
}
