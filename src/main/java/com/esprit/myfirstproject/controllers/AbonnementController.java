package com.esprit.myfirstproject.controllers;

import com.esprit.myfirstproject.entities.Abonnement;
import com.esprit.myfirstproject.services.servicesimpl.AbonnementServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("abonnements")// le path du controller → tjr en minuscule
@RequiredArgsConstructor // permet d'injester par constructeur
public class AbonnementController {

    private final AbonnementServiceImpl abonnementService;

    @GetMapping
    public List<Abonnement> getAll() {
        return abonnementService.getAll(); // tjr appel d'une méthode provenant du service associé.
    }

    @GetMapping("{id}")
    public Abonnement getAbonnementbyId(@PathVariable Long id) { //@pathvariable prend la mémé chaîne que le nom de l'attribut voir @GetMapping
        return abonnementService.getId(id);
    }

    @PostMapping
    public Abonnement addAbonnement(@RequestBody Abonnement Abonnement) {// @RequestBody pr les objets et @PathVariable pour les attributs
        return abonnementService.addAbonnement(Abonnement);
    }

    @PutMapping
    public Abonnement updateAbonnement(@RequestBody Abonnement Abonnement) {
        return abonnementService.updateAbonnement(Abonnement);
    }

}
