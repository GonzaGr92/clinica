
package modelo;

import java.util.ArrayList;

public class Profesional extends Persona{
   private int id; 
   private int matricula;
   private ArrayList<RegimenHorario> regimenHorario;

    public Profesional(String apellido, String nombre, int telefono, int dni, String email) {
        super(apellido, nombre, telefono, dni, email);
    }

    public Profesional(int matricula, String apellido, String nombre, int telefono, int dni, String email) {
        super(apellido, nombre, telefono, dni, email);
        this.matricula = matricula;
    }

    public ArrayList<RegimenHorario> getRegimenHorario() {
        return regimenHorario;
    }

    public void setRegimenHorario(ArrayList<RegimenHorario> regimenHorario) {
        this.regimenHorario = regimenHorario;
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
