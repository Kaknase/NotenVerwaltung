package org.htlanich.notenverwaltung.controller;

import org.htlanich.notenverwaltung.model.Note;
import org.htlanich.notenverwaltung.service.VerwaltungsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("notenverwaltung/schueler")
public class SchuelerController
{
    private VerwaltungsService verwaltungsService;

    @GetMapping("anzeige/{id}")
    public ArrayList<Note> getNoten(@PathVariable Long id){
        return verwaltungsService.noten(id);
    }
}
