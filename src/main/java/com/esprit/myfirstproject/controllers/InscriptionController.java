package com.esprit.myfirstproject.controllers;

import com.esprit.myfirstproject.entities.Inscription;
import com.esprit.myfirstproject.services.servicesimpl.InscriptionServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("inscriptions")// le path du controller → tjr en minuscule
@RequiredArgsConstructor // permet d'injester par constructeur
public class InscriptionController {

    private final InscriptionServiceImpl InscriptionService;

    @GetMapping
    public List<Inscription> getAll() {
        return InscriptionService.getAll(); // tjr appel d'une méthode provenant du service associé.
    }

    @GetMapping("{id}")
    public Inscription getInscriptionbyId(@PathVariable Long id) { //@pathvariable prend la mémé chaîne que le nom de l'attribut voir @GetMapping
        return InscriptionService.getId(id);
    }

    @PostMapping
    public Inscription addInscription(@RequestBody Inscription Inscription) {// @RequestBody pr les objets et @PathVariable pour les attributs
        return InscriptionService.addInscription(Inscription);
    }

    @PutMapping
    public Inscription updateInscription(@RequestBody Inscription Inscription) {
        return InscriptionService.updateInscription(Inscription);
    }

    //méthodes avancées
    @PostMapping("{idSkieur}") // on doit précisier l'id du skieur à ajouter dans l'inscription
    public Inscription addInscriptionAndAssignToSkieur(@PathVariable Long idSkieur,@RequestBody Inscription inscription){
        return InscriptionService.addInscriptionAndAssignToSkieur(idSkieur,inscription);
    }
}
