package org.itson.nebula.persistencia.implementaciones;

import java.util.List;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.itson.nebula.persistencia.definiciones.IUsuariosDAO;
import org.itson.nebula.persistencia.dtos.NuevoUsuarioDTO;
import org.itson.nebula.persistencia.entidades.Usuario;
import org.itson.nebula.persistencia.excepciones.PersistenciaException;

public class UsuariosDAO implements IUsuariosDAO {

    private static final Logger LOGGER = Logger.getLogger(UsuariosDAO.class.getName());
    
    /**
     * Constructor por defecto protegido para evitar que se accede fuera sin utilizar la facha de persitencia
     */
    protected UsuariosDAO(){}
    
    @Override
    public Usuario registrar(NuevoUsuarioDTO nuevoUsuario) throws PersistenciaException {
        try{
            Usuario usuario = new Usuario();
            usuario.setNombre(nuevoUsuario.getNombre());
            usuario.setPseudonimo(nuevoUsuario.getPseudonimo());
            usuario.setTipo(nuevoUsuario.getTipo());
            usuario.setCorreo(nuevoUsuario.getCorreo());            
            EntityManager entityManager = ManejadorConexiones.crearEntityManager();
            entityManager.persist(usuario);   
            entityManager.close();
            return usuario;
        }catch(Exception ex){
            String mensajeError = "Error al registrar un usuario: " + ex.getMessage();
            LOGGER.severe(mensajeError);
            throw new PersistenciaException(mensajeError);
        }
    }

    @Override
    public List<Usuario> consultar() throws PersistenciaException {
        try{           
            EntityManager entityManager = ManejadorConexiones.crearEntityManager();
            final String JPQLQuery = "select u from Usuario u";
            TypedQuery<Usuario> query = entityManager.createQuery(JPQLQuery, Usuario.class);
            List<Usuario> usuarios = query.getResultList();
            return usuarios;
        }catch(Exception ex){
            String mensajeError = "Error al consultar a los usuarios: " + ex.getMessage();
            LOGGER.severe(mensajeError);
            throw new PersistenciaException(mensajeError);
        }
    }
    
}
