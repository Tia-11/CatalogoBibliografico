package org.example;

import dao.LibriDao;
import dao.PrestitiDao;
import dao.RivisteDao;
import dao.UtentiDao;
import entities.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.util.UUID;

public class Application {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("CatalogoBibliografico");

    public static void main(String[] args) {

        EntityManager em = emf.createEntityManager();

        LibriDao ld = new LibriDao(em);

        UtentiDao ud = new UtentiDao(em);

        RivisteDao rd = new RivisteDao(em);

        PrestitiDao pd = new PrestitiDao(em);

        Libri libroProva1 = new Libri("Boh", 2040, 300, "ciao", "ciaociao");

        Utenti utenteProva = new Utenti("mattia", "pigola", "1993-05-11");

        Riviste rivisteProva = new Riviste("rivistaprova",2021,201, Periodicita.SEMESTRALE);

        UUID utenteId = UUID.fromString("23ba227d-a874-47e8-8a0a-5dc47bf2863b");

        Prestiti prestitoProva = new Prestiti(
                utenteId,
                libroProva1,
                LocalDate.now(),
                LocalDate.now().plusDays(14),
                null
        );


        em.close();
        emf.close();
    }
}
