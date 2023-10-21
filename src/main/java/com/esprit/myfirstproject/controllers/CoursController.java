package com.esprit.myfirstproject.controllers;

import com.esprit.myfirstproject.entities.Cours;
import com.esprit.myfirstproject.services.servicesimpl.CoursServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cours")// le path du controller → tjr en minuscule
@RequiredArgsConstructor // permet d'injester par constructeur
public class CoursController {
    private final CoursServiceImpl CoursService;

    @GetMapping
    public List<Cours> getAll() {
        return CoursService.getAll(); // tjr appel d'une méthode provenant du service associé.
    }

    @GetMapping("{id}")
    public Cours getCoursbyId(@PathVariable Long id) { //@pathvariable prend la mémé chaîne que le nom de l'attribut voir @GetMapping
        return CoursService.getCoursById(id);
    }

    @PostMapping
    public Cours addCours(@RequestBody Cours Cours) {// @RequestBody pr les objets et @PathVariable pour les attributs
        return CoursService.addCours(Cours);
    }

    @PutMapping
    public Cours updateCours(@RequestBody Cours Cours) {
        return CoursService.updateCours(Cours);
    }
}
