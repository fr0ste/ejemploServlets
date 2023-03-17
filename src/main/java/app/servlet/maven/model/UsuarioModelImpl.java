package app.servlet.maven.model;

import app.servlet.maven.entity.Usuario;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author labingsw05
 */
public class UsuarioModelImpl implements IUsuarioModel{
    
    private SessionFactory sf;
    private Session s;
    
    @Override
    public void crearRegistro(Usuario usuario) {
         try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.save(usuario);
            s.getTransaction().commit();
            s.close();
        } catch (HibernateException e) {
             System.err.println("Error " + e.getMessage());
        }
    }
    
    
    public static void main(String[] args) {
        
        UsuarioModelImpl model = new UsuarioModelImpl();
        
        Usuario u = new Usuario();
        
        u.setNombre("pepe");
        u.setPass("pecas");
        
        
        model.crearRegistro(u);
        
        
        
    }
    
}
