package com.esprit.myfirstproject.controllers;

import com.esprit.myfirstproject.entities.Skieur;
import com.esprit.myfirstproject.services.servicesimpl.SkieurServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("skieurs")// le path du controller → tjr en minuscule
@RequiredArgsConstructor // permet d'injester par constructeur
//pr l'attribut skieurService, on peut aussi l'injecter par champs en rajoutant seulement @Autowired
// pas la peine d'écrire final !!!!! => seulement pr l'injecteur par constructeur.
public class SkieurController {

    private final SkieurServiceImpl skieurService;

    @GetMapping
    public List<Skieur> getAll() {
        return skieurService.getAll(); // tjr appel d'une méthode provenant du service associé.
    }

    @GetMapping("{id}")
    public Skieur getSkieurbyId(@PathVariable Long id){ //@pathvariable prend la mémé chaîne que le nom de l'attribut voir @GetMapping
        return skieurService.getSkieurbyId(id);
    }

    @PostMapping
    public Skieur addSkieur(@RequestBody Skieur skieur) {// @RequestBody pr les objets et @PathVariable pour les attributs
        return skieurService.addSkieur(skieur);
    }

    @PutMapping("{id}")
    public Skieur updateSkieur(@RequestBody Skieur skieur) {
        return skieurService.updateSkieur(skieur);
    }



}
