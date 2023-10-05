package com.esprit.myfirstproject.services.servicesimpl;

import com.esprit.myfirstproject.entities.Cours;
import com.esprit.myfirstproject.repositories.CoursRepository;
import com.esprit.myfirstproject.services.CoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursServiceImpl implements CoursService {

    @Autowired //permet d'injecter une instance de l'implémentation de CoursRepository même si c'est une interface.
    CoursRepository repository;

    @Override
    public Cours addCours(Cours c) {
        return repository.save(c);
    }

    @Override
    public Cours updateCours(Cours c) {
        return repository.save(c);
    }

    @Override
    public List<Cours> getAll() {
        return repository.findAll();
    }

    @Override
    public Cours getCoursById(Long id) {
        return repository.findById(id).orElseThrow(() -> new IllegalArgumentException("COURS " + id + " INEXISTANT !!!"));
    }

    @Override
    public boolean deleteById(Long id) {
        repository.deleteById(id);
        return !(repository.existsById(id)); // retourne true/false selon l'existence de l'objet Recherché (retournee LE CONTRAIRE car "!")
    }
}
