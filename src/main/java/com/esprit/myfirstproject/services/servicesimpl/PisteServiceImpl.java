package com.esprit.myfirstproject.services.servicesimpl;

import com.esprit.myfirstproject.entities.Piste;
import com.esprit.myfirstproject.repositories.PisteRepository;
import com.esprit.myfirstproject.services.PisteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PisteServiceImpl implements PisteService {

    @Autowired
    PisteRepository repository;

    @Override
    public Piste addPiste(Piste p) {
        return repository.save(p);
    }

    @Override
    public Piste updatePiste(Piste p) {
        return repository.save(p);
    }

    @Override
    public List<Piste> getAll() {
        return repository.findAll();
    }

    @Override
    public Piste getId(Long id) {
        return repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Piste " + id + " INEXISTANTE !!!"));
    }

    @Override
    public boolean deleteById(Long id) {
        repository.deleteById(id);
        return !(repository.existsById(id));
    }
}
