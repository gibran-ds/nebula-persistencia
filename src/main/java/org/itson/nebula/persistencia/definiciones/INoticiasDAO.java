package org.itson.nebula.persistencia.definiciones;

import java.util.List;
import org.itson.nebula.persistencia.entidades.Noticia;
import org.itson.nebula.persistencia.excepciones.PersistenciaException;

public interface INoticiasDAO {    
    public List<Noticia> consultar() throws PersistenciaException;
}
