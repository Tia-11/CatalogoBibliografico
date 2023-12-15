package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

@Entity
@Table(name = "Utenti")
public class Utenti {

    private String nome;
    private String cognome;
    private String dataDiNascita;
    @Id
    private UUID numeroDiTessera;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(String dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public UUID getNumeroDiTessera() {
        return numeroDiTessera;
    }

    public void setNumeroDiTessera(UUID numeroDiTessera) {
        this.numeroDiTessera = numeroDiTessera;
    }

    public Utenti(){}

    public Utenti(String nome, String cognome, String dataDiNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataDiNascita = dataDiNascita;
        this.numeroDiTessera = UUID.randomUUID();
    }
}
