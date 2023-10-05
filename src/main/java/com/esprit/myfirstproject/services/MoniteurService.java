package com.esprit.myfirstproject.services;

import com.esprit.myfirstproject.entities.Moniteur;

import java.util.List;

public interface MoniteurService {
    Moniteur addMoniteur(Moniteur c);

    Moniteur updateMoniteur(Moniteur c);

    List<Moniteur> getAll();

    Moniteur getId(Long id);

    boolean deleteById(Long id);
}
