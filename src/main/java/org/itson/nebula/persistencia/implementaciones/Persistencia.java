
package org.itson.nebula.persistencia.implementaciones;

import java.util.List;
import org.itson.nebula.persistencia.definiciones.INoticiasDAO;
import org.itson.nebula.persistencia.definiciones.IPersistencia;
import org.itson.nebula.persistencia.definiciones.IUsuariosDAO;
import org.itson.nebula.persistencia.dtos.NuevoUsuarioDTO;
import org.itson.nebula.persistencia.entidades.Noticia;
import org.itson.nebula.persistencia.entidades.Usuario;
import org.itson.nebula.persistencia.excepciones.PersistenciaException;

public class Persistencia implements IPersistencia {

    private final INoticiasDAO NOTICIAS_DAO;
    private final IUsuariosDAO USUARIOS_DAO;
    
    public Persistencia(){
        this.NOTICIAS_DAO = new NoticiasDAO();
        this.USUARIOS_DAO = new UsuariosDAO();
    }
    
    @Override
    public List<Noticia> consultarNoticias() throws PersistenciaException {
        return this.NOTICIAS_DAO.consultar();
    }

    @Override
    public Usuario registrarUsuario(NuevoUsuarioDTO nuevoUsuario) throws PersistenciaException {
        return this.USUARIOS_DAO.registrar(nuevoUsuario);
    }

    @Override
    public List<Usuario> consultarUsuarios() throws PersistenciaException {
        return this.USUARIOS_DAO.consultar();
    }
    
}
