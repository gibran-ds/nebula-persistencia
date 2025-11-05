package org.itson.nebula.persistencia.definiciones;

import java.util.List;
import org.itson.nebula.persistencia.dtos.NuevoUsuarioDTO;
import org.itson.nebula.persistencia.entidades.Noticia;
import org.itson.nebula.persistencia.entidades.Usuario;
import org.itson.nebula.persistencia.excepciones.PersistenciaException;

public interface IPersistencia {
    public List<Noticia> consultarNoticias() throws PersistenciaException;
    public Usuario registrarUsuario(NuevoUsuarioDTO nuevoUsuario) throws PersistenciaException;
    public List<Usuario> consultarUsuarios() throws PersistenciaException;
}
