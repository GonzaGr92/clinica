/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author gustavo
 */
public class Paciente extends Persona {

    private int id;
    private String direccion;
    private String obraSocial;
    private int nroAfiliado;
    private Derivacion derivacion;
    private ArrayList <Turno> turnos;

    public Paciente(String apellido, String nombre, int telefono, int dni, String email) {
        super(apellido, nombre, telefono, dni, email);
    }

    public Paciente(String direccion, String obraSocial, int nroAfiliado, Derivacion derivacion, ArrayList<Turno> turno, String apellido, String nombre, int telefono, int dni, String email) {
        super(apellido, nombre, telefono, dni, email);
        this.direccion = direccion;
        this.obraSocial = obraSocial;
        this.nroAfiliado = nroAfiliado;
        this.derivacion = derivacion;
        this.turnos = turno;
    }

    @Override
    public int getId() {
        return id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(String obraSocial) {
        this.obraSocial = obraSocial;
    }

    public int getNroAfiliado() {
        return nroAfiliado;
    }

    public void setNroAfiliado(int nroAfiliado) { 
        this.nroAfiliado = nroAfiliado;
    }

    public Derivacion getDerivacion() {
        return derivacion;
    }

    public void setDerivacion(Derivacion derivacion) {
        this.derivacion = derivacion;
    }

    public ArrayList<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(ArrayList<Turno> turnos) {
        this.turnos = turnos;
    }
    
}
