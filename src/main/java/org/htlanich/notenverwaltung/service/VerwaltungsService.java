package org.htlanich.notenverwaltung.service;

import org.htlanich.notenverwaltung.model.Note;
import org.htlanich.notenverwaltung.model.Schueler;
import org.htlanich.notenverwaltung.model.schuelerRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VerwaltungsService
{

    public final schuelerRepository schuelerRepository;

    public VerwaltungsService(schuelerRepository schuelerRepository)
    {
        this.schuelerRepository = schuelerRepository;
    }

    public List<Schueler> alleSchueler()
    {
        return schuelerRepository.findAll();
    }

    public List<Schueler> noten(Long id){
        Schueler s1 = new Schueler("Fabio", "Lantos", 3, "3AHWIi");
        schuelerRepository.save(s1);
        return schuelerRepository.findAll();
    }
}
