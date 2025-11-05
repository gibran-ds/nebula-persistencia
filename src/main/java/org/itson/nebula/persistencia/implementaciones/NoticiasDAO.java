package org.itson.nebula.persistencia.implementaciones;

import java.util.List;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.itson.nebula.persistencia.definiciones.INoticiasDAO;
import org.itson.nebula.persistencia.entidades.Noticia;
import org.itson.nebula.persistencia.excepciones.PersistenciaException;

public class NoticiasDAO implements INoticiasDAO {
    
    private static final Logger LOGGER = Logger.getLogger(NoticiasDAO.class.getName());

    @Override
    public List<Noticia> consultar() throws PersistenciaException {
        try{           
            EntityManager entityManager = ManejadorConexiones.crearEntityManager();
            final String JPQLQuery = "select n from Noticia n";
            TypedQuery<Noticia> query = entityManager.createQuery(JPQLQuery, Noticia.class);
            List<Noticia> noticias = query.getResultList();
            return noticias;
        }catch(Exception ex){
            String mensajeError = "Error al consultar las noticias: " + ex.getMessage();
            LOGGER.severe(mensajeError);
            throw new PersistenciaException(mensajeError);
        }
    
    }
    
}
