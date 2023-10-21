package com.esprit.myfirstproject.services.servicesimpl;

import com.esprit.myfirstproject.entities.Skieur;
import com.esprit.myfirstproject.repositories.SkieurRepository;
import com.esprit.myfirstproject.services.SkieurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkieurServiceImpl implements SkieurService {

    @Autowired
    SkieurRepository repository;

    @Override
    public Skieur addSkieur(Skieur skieur) {
        return repository.save(skieur);
    }

    @Override
    public Skieur updateSkieur(Skieur skieur) {
        return repository.save(skieur);
    }

    @Override
    public List<Skieur> getAll() {
        return repository.findAll();
    }

    @Override
    public Skieur getSkieurbyId(Long id) {
        return repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Skieur " + id + " INEXISTANT !!!"));
    }

    @Override
    public boolean deleteById(Long id) {
        repository.deleteById(id);
        return !(repository.existsById(id));
    }
}
