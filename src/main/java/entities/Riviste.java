package entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Riviste")
public class Riviste extends Prodotti {
    private Periodicita periodicita;

    public Periodicita getPeriodicita() {
        return periodicita;
    }

    public void setPeriodicita(Periodicita periodicita) {
        this.periodicita = periodicita;
    }

    public Riviste(String titolo, int annoPubblicazione, int numeroPagine, Periodicita periodicita) {
        super(titolo, annoPubblicazione, numeroPagine);
        this.periodicita = periodicita;
    }
}
