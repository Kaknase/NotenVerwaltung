package org.htlanich.notenverwaltung.service;

import org.htlanich.notenverwaltung.model.Schueler;
import org.htlanich.notenverwaltung.model.schuelerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Optional<Schueler> noten(Long id){
        return schuelerRepository.findById(id);
    }



}
