package org.itson.nebula.persistencia.implementaciones;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ManejadorConexiones {
    
    private static final String NEBULA_PU = "org.itson.Nebula.PU";
    
    public static EntityManager crearEntityManager(){
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory(NEBULA_PU);
        EntityManager entityManager = emFactory.createEntityManager();
        return entityManager;
    }
}
