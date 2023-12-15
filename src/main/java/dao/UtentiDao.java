package dao;

import entities.Utenti;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class UtentiDao {
    private final EntityManager em;

    public UtentiDao(EntityManager em) {
        this.em = em;
    }

    public void aggiungiUtente(Utenti utente){
        EntityTransaction transiction = em.getTransaction();
        transiction.begin();
        em.persist(utente);
        transiction.commit();
        System.out.println("salvato!!!");
    }

}
