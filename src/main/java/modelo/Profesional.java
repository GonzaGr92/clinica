
package modelo;

import java.util.ArrayList;

public class Profesional extends Persona{
   private int id; 
   private int matricula;
   private ArrayList <Turno> turnos;

    public Profesional(String apellido, String nombre, int telefono, int dni, String email) {
        super(apellido, nombre, telefono, dni, email);
    }

    public Profesional(int matricula, ArrayList<Turno> turno, String apellido, String nombre, int telefono, int dni, String email) {
        super(apellido, nombre, telefono, dni, email);
        this.matricula = matricula;
        this.turnos = turno;
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

    public ArrayList<Turno> getTurno() {
        return turnos;
    }

    public void setTurno(ArrayList<Turno> turnos) {
        this.turnos = turnos;
    }

    

    
   
    
}
