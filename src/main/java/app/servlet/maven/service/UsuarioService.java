package app.servlet.maven.service;

import app.servlet.maven.entity.Usuario;
import app.servlet.maven.model.IUsuarioModel;
import app.servlet.maven.model.UsuarioModelImpl;

/**
 *
 * @author labingsw05
 */
public class UsuarioService implements IUsuarioService{
    
    private IUsuarioModel model = new UsuarioModelImpl();
    
    @Override
    public void crearRegistro(Usuario usuario) {
        model.crearRegistro(usuario);
    }
    
}
