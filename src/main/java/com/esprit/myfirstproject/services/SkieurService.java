package com.esprit.myfirstproject.services;

import com.esprit.myfirstproject.entities.Skieur;

import java.util.List;

public interface SkieurService {
    Skieur addSkieur(Skieur skieur);

    Skieur updateSkieur(Skieur skieur);

    List<Skieur> getAll();

    Skieur getSkieurbyId(Long id);

    boolean deleteById(Long id);
}
