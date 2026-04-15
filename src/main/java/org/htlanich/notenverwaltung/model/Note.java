package org.htlanich.notenverwaltung.model;
import jakarta.persistence.*;

@Entity
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int note;
    private String fach;

    public Note() {}

    public Note(int note, String fach) {
        this.note = note;
        this.fach = fach;
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
}
