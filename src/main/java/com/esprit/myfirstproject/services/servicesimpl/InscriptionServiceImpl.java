package com.esprit.myfirstproject.services.servicesimpl;

import com.esprit.myfirstproject.entities.Inscription;
import com.esprit.myfirstproject.repositories.InscriptionRepository;
import com.esprit.myfirstproject.services.InscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InscriptionServiceImpl implements InscriptionService {

    @Autowired
    InscriptionRepository repository;

    @Override
    public Inscription addInscription(Inscription ins) {
        return repository.save(ins);
    }

    @Override
    public Inscription updateInscription(Inscription ins) {
        return repository.save(ins);
    }

    @Override
    public List<Inscription> getAll() {
        return repository.findAll();
    }

    @Override
    public Inscription getId(Long id) {
        return repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Inscription " + id + " INEXISTANTE !!!"));
    }

    @Override
    public boolean deleteById(Long id) {
        repository.deleteById(id);
        return !(repository.existsById(id));
    }
}
