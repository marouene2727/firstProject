package com.esprit.myfirstproject.services;

import com.esprit.myfirstproject.entities.Piste;

import java.util.List;

public interface PisteService {
    Piste addPiste(Piste p);

    Piste updatePiste(Piste p);

    List<Piste> getAll();

    Piste getId(Long id);

    boolean deleteById(Long id);
}
