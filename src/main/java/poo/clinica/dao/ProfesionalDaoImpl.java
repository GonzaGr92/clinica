
package poo.clinica.dao;

import java.util.ArrayList;
import java.util.List;
import modelo.Profesional;

public class ProfesionalDaoImpl implements ProfesionalDao {
    
    private final List<Profesional> profesionales;

    public ProfesionalDaoImpl() {
        this.profesionales = new ArrayList<>();
    }

    @Override
    public List<Profesional> obtenerTodos() {
        return profesionales;
    }
    
}
