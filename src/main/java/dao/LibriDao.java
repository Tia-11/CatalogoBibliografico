package dao;

import entities.Libri;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.UUID;

public class LibriDao {
    private final EntityManager em;

    public LibriDao(EntityManager em) {
        this.em = em;
    }

    public void aggiungiLibro(Libri libro){
        EntityTransaction transiction = em.getTransaction();
        transiction.begin();
        em.merge(libro);
        transiction.commit();
        System.out.println("salvato!!!");
    }

}
