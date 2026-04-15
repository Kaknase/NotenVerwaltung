package org.htlanich.notenverwaltung.controller;

import org.htlanich.notenverwaltung.model.Schueler;
import org.htlanich.notenverwaltung.service.VerwaltungsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("notenverwaltung/schueler")
public class SchuelerController
{
    private VerwaltungsService verwaltungsService;

    @GetMapping("/anzeige/{id}")
    public List<Schueler> getNoten(@PathVariable Long id){
        return verwaltungsService.noten(id);
    }
}
