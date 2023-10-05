package com.esprit.myfirstproject.services;

import com.esprit.myfirstproject.entities.Cours;

import java.util.List;

public interface CoursService {
    Cours addCours(Cours c);

    Cours updateCours(Cours c);

    List<Cours> getAll();

    Cours getCoursById(Long id);

    boolean deleteById(Long id);
}
