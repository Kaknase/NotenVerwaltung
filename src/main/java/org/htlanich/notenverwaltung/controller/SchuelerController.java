package org.htlanich.notenverwaltung.controller;

import org.htlanich.notenverwaltung.model.Schueler;
import org.htlanich.notenverwaltung.service.VerwaltungsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/notenverwaltung/schueler")
public class SchuelerController
{
    @Autowired
    private VerwaltungsService verwaltungsService;

    @GetMapping("/anzeige/{id}")
    public Optional<Schueler> getNoten(@PathVariable Long id){
        return verwaltungsService.noten(id);
    }

    @GetMapping("/anzeige/alle")
    public List<Schueler> getNoten(){
        return verwaltungsService.alleSchueler();
    }
}
