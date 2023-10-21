package com.esprit.myfirstproject.services;

import com.esprit.myfirstproject.entities.Inscription;

import java.util.List;

public interface InscriptionService {
    Inscription addInscription(Inscription ins);

    Inscription updateInscription(Inscription ins);

    List<Inscription> getAll();

    Inscription getId(Long id);

    boolean deleteById(Long id);

    Inscription addInscriptionAndAssignToSkieur(Long idSkieur, Inscription inscription);
}
