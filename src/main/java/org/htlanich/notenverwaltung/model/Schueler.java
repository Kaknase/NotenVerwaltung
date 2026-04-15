package org.htlanich.notenverwaltung.model;
import jakarta.persistence.*;


@Entity
public class Schueler
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long schuelerId;
    private String vorname;
    private String nachname;
    private int alter;
    private String klasse;

    public Schueler() {}

    public Schueler(String vorname, String nachname, int alter, String klasse) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
        this.klasse = klasse;
    }

    public Long getSchuelerId() {
        return schuelerId;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public int getAlter() {
        return alter;
    }

    public String getKlasse() {
        return klasse;
    }

    public void setSchuelerId(Long schuelerId) {
        this.schuelerId = schuelerId;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public void setKlasse(String klasse) {
        this.klasse = klasse;
    }
}
