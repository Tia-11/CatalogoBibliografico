package dao;

import entities.Prestiti;
import entities.Utenti;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class PrestitiDao {
    private final EntityManager em;

    public PrestitiDao(EntityManager em) {
        this.em = em;
    }

    public void aggiungiPrestito(Prestiti prestito){
        EntityTransaction transiction = em.getTransaction();
        transiction.begin();
        em.merge(prestito);
        transiction.commit();
        System.out.println("salvato!!!");
    }
}
