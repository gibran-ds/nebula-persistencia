package org.itson.nebula.persistencia.definiciones;

import java.util.List;
import org.itson.nebula.persistencia.dtos.NuevoUsuarioDTO;
import org.itson.nebula.persistencia.entidades.Usuario;
import org.itson.nebula.persistencia.excepciones.PersistenciaException;

public interface IUsuariosDAO {
    public Usuario registrar(NuevoUsuarioDTO nuevoUsuario) throws PersistenciaException;
    public List<Usuario> consultar() throws PersistenciaException;
}
