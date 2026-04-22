package org.htlanich.notenverwaltung.service;

import org.htlanich.notenverwaltung.model.Note;
import org.htlanich.notenverwaltung.model.Schueler;
import org.htlanich.notenverwaltung.model.noteRepository;
import org.htlanich.notenverwaltung.model.schuelerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VerwaltungsService
{

    public final schuelerRepository schuelerRepository;
    public final noteRepository noteRepository;

    public VerwaltungsService(schuelerRepository schuelerRepository, noteRepository noteRepository)
    {
        this.schuelerRepository = schuelerRepository;
        this.noteRepository = noteRepository;
    }

    public List<Schueler> alleSchueler()
    {
        return schuelerRepository.findAll();
    }

    public List<Note> noten(Long id){
        Note note = new Note(1,"SWP");
        Schueler schueler = schuelerRepository.findById(id).orElseThrow();
        note.setSchueler(schueler);
        noteRepository.save(note);
        return schueler.getNoten();
    }




}
