/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author gustavo
 */
public class Paciente extends Persona {

    private int id;
    private String direccion;
    private String obraSocial;
    private int nroAfiliado;
    private String derivacion;

    public Paciente(String apellido, String nombre, int telefono, int dni, String email) {
        super(apellido, nombre, telefono, dni, email);
    }

    public Paciente(String direccion, String obraSocial, int nroAfiliado, String derivacion, String apellido, String nombre, int telefono, int dni, String email) {
        super(apellido, nombre, telefono, dni, email);
        this.direccion = direccion;
        this.obraSocial = obraSocial;
        this.nroAfiliado = nroAfiliado;
        this.derivacion = derivacion;
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

    public String getDerivacion() {
        return derivacion;
    }

    public void setDerivacion(String derivacion) {
        this.derivacion = derivacion;
    }

}
