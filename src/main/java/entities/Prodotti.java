package entities;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "Prodotti")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Prodotti {
    @Id
    private UUID codiceISBN;
    private String titolo;
    private int annoPubblicazione;
    private int numeroPagine;

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public void setAnnoPubblicazione(int annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }

    public Prodotti(String titolo, int annoPubblicazione, int numeroPagine) {
        this.codiceISBN = UUID.randomUUID();
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.numeroPagine = numeroPagine;
    }
}