/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.LocalTime;

/**
 *
 * @author Cintia
 */
public class RegimenHorario {
    
    private LocalTime entrada;
    private LocalTime salida;
    private Dias dia;

    public RegimenHorario(LocalTime entrada, LocalTime salida, Dias dia) {
        this.entrada = entrada;
        this.salida = salida;
        this.dia = dia;
    }

    public LocalTime getEntrada() {
        return entrada;
    }

    public void setEntrada(LocalTime entrada) {
        this.entrada = entrada;
    }

    public LocalTime getSalida() {
        return salida;
    }

    public void setSalida(LocalTime salida) {
        this.salida = salida;
    }

    public Dias getDia() {
        return dia;
    }

    public void setDia(Dias dia) {
        this.dia = dia;
    }
    
    
    
}
