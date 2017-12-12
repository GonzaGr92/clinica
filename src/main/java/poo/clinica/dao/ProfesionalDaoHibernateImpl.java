
package poo.clinica.dao;

import java.util.List;
import modelo.Profesional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ProfesionalDaoHibernateImpl implements ProfesionalDao {
    
    private final SessionFactory sessionFactory;

    public ProfesionalDaoHibernateImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Profesional> obtenerTodos() {
        Session session = sessionFactory.openSession();
        List<Profesional> retorno = session.createQuery("from Profesionales").list();
        session.close();
        
        return retorno;
    }    
}
