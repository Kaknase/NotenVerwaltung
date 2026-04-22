package org.htlanich.notenverwaltung.model;
import jakarta.persistence.*;

@Entity
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long note_id;

    private int note;
    private String fach;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "schueler_id")
    private Schueler schueler;


    public Note() {}

    public Note(int note, String fach) {
        this.note = note;
        this.fach = fach;

    }

    public Long getNote_id() {
        return note_id;
    }

    public void setNote_id(Long note_id) {
        this.note_id = note_id;
    }

    public int getNote() {
        return note;
    }

    public String getFach() {
        return fach;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public void setFach(String fach) {
        this.fach = fach;
    }

    public void setSchueler(Schueler schueler) {
        this.schueler = schueler;
    }
}
