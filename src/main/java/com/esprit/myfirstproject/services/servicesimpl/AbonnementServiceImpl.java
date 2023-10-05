package com.esprit.myfirstproject.services.servicesimpl;

import com.esprit.myfirstproject.entities.Abonnement;
import com.esprit.myfirstproject.repositories.AbonnementRepository;
import com.esprit.myfirstproject.services.AbonnementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AbonnementServiceImpl implements AbonnementService {

    @Autowired // similaire à new
    AbonnementRepository repository;

    @Override
    public Abonnement addAbonnement(Abonnement a) {
        return repository.save(a);
    }

    @Override
    public Abonnement updateAbonnement(Abonnement a) {
        return repository.save(a);
    }

    @Override
    public List<Abonnement> getAll() {
        return repository.findAll();
    }

    @Override
    public Abonnement getId(Long id) {
        return repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Abonnement " + id + " INEXISTANT !!!"));
    }

    @Override
    public boolean deleteById(Long id) {
        repository.deleteById(id);
        return !(repository.existsById(id));
    }
}
