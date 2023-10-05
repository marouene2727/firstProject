package com.esprit.myfirstproject.services;

import com.esprit.myfirstproject.entities.Abonnement;
import com.esprit.myfirstproject.entities.Abonnement;

import java.util.List;

public interface AbonnementService {
    Abonnement addAbonnement(Abonnement a);

    Abonnement updateAbonnement(Abonnement a);

    List<Abonnement> getAll();

    Abonnement getId(Long id);

    boolean deleteById(Long id);
}
