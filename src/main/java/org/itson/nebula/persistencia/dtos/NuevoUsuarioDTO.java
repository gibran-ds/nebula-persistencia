package org.itson.nebula.persistencia.dtos;

import org.itson.nebula.persistencia.entidades.TipoMembresia;

public class NuevoUsuarioDTO {
    private String nombre;
    private String correo;
    private String pseudonimo;
    private TipoMembresia tipo;

    public NuevoUsuarioDTO(String nombre, String correo, String pseudonimo, TipoMembresia tipo) {
        this.nombre = nombre;
        this.correo = correo;
        this.pseudonimo = pseudonimo;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getPseudonimo() {
        return pseudonimo;
    }

    public TipoMembresia getTipo() {
        return tipo;
    }
}
