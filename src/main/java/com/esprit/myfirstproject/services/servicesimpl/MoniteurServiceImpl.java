package com.esprit.myfirstproject.services.servicesimpl;

import com.esprit.myfirstproject.entities.Moniteur;
import com.esprit.myfirstproject.repositories.MoniteurRepository;
import com.esprit.myfirstproject.services.MoniteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoniteurServiceImpl implements MoniteurService {

    @Autowired
    MoniteurRepository repository;

    @Override
    public Moniteur addMoniteur(Moniteur c) {
        return repository.save(c);
    }

    @Override
    public Moniteur updateMoniteur(Moniteur c) {
        return repository.save(c);
    }

    @Override
    public List<Moniteur> getAll() {
        return repository.findAll();
    }

    @Override
    public Moniteur getId(Long id) {
        return repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Moniteur " + id + " INEXISTANT !!!"));
    }

    @Override
    public boolean deleteById(Long id) {
        repository.deleteById(id);
        return !(repository.existsById(id));
    }
}
