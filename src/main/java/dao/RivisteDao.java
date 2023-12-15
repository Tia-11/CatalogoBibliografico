package dao;

import entities.Libri;
import entities.Riviste;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class RivisteDao {
    private final EntityManager em;

    public RivisteDao(EntityManager em) {
        this.em = em;
    }

    public void aggiungiRivista(Riviste rivista){
        EntityTransaction transiction = em.getTransaction();
        transiction.begin();
        em.merge(rivista);
        transiction.commit();
        System.out.println("salvato!!!");
    }
}
