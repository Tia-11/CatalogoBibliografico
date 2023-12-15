package entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Prestiti")
public class Prestito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "utente_id")
    private Utente utente;
    @Enumerated(EnumType.STRING)
    private TipologiaProdotto tipologiaProdotto;
    private LocalDate dataInizioPrestito;
    private LocalDate dataRestituzionePrevista;
    private LocalDate dataRestituzioneEffettiva;

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public TipologiaProdotto getTipologiaProdotto() {
        return tipologiaProdotto;
    }

    public void setTipologiaProdotto(TipologiaProdotto tipologiaProdotto) {
        this.tipologiaProdotto = tipologiaProdotto;
    }

    public LocalDate getDataInizioPrestito() {
        return dataInizioPrestito;
    }

    public void setDataInizioPrestito(LocalDate dataInizioPrestito) {
        this.dataInizioPrestito = dataInizioPrestito;
    }

    public LocalDate getDataRestituzionePrevista() {
        return dataRestituzionePrevista;
    }

    public void setDataRestituzionePrevista(LocalDate dataRestituzionePrevista) {
        this.dataRestituzionePrevista = dataRestituzionePrevista;
    }

    public LocalDate getDataRestituzioneEffettiva() {
        return dataRestituzioneEffettiva;
    }

    public void setDataRestituzioneEffettiva(LocalDate dataRestituzioneEffettiva) {
        this.dataRestituzioneEffettiva = dataRestituzioneEffettiva;
    }

    public Prestito(Utente utente, TipologiaProdotto tipologiaProdotto, LocalDate dataInizioPrestito, LocalDate dataRestituzionePrevista, LocalDate dataRestituzioneEffettiva) {
        this.utente = utente;
        this.tipologiaProdotto = tipologiaProdotto;
        this.dataInizioPrestito = dataInizioPrestito;
        this.dataRestituzionePrevista = dataRestituzionePrevista;
        this.dataRestituzioneEffettiva = dataRestituzioneEffettiva;
    }
}