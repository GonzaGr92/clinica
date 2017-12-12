/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.hibernate.Session;
import ui.PantallaPrincipal;

/**
 *
 * @author Guillermina
 */
public class ControladorPrincipal {
    private Session session;

    public ControladorPrincipal(Session session) {
        this.session = session;
    }
    
     public void run () {
        PantallaPrincipal panel = new PantallaPrincipal();
        panel.setVisible(true);
    }
}
