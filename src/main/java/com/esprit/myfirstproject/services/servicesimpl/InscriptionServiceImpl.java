package com.esprit.myfirstproject.services.servicesimpl;

import com.esprit.myfirstproject.entities.Inscription;
import com.esprit.myfirstproject.entities.Skieur;
import com.esprit.myfirstproject.repositories.InscriptionRepository;
import com.esprit.myfirstproject.repositories.SkieurRepository;
import com.esprit.myfirstproject.services.InscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InscriptionServiceImpl implements InscriptionService {

    @Autowired
    InscriptionRepository inscriptionRepository; // injection de champs

    @Autowired
    SkieurRepository skieurRepository;



    @Override
    public Inscription addInscription(Inscription ins) {
        return inscriptionRepository.save(ins);
    }

    @Override
    public Inscription updateInscription(Inscription ins) {
        return inscriptionRepository.save(ins);
    }

    @Override
    public List<Inscription> getAll() {
        return inscriptionRepository.findAll();
    }

    @Override
    public Inscription getId(Long id) {
        return inscriptionRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Inscription " + id + " INEXISTANTE !!!"));
    }

    @Override
    public boolean deleteById(Long id) {
        inscriptionRepository.deleteById(id);
        return !(inscriptionRepository.existsById(id));
    }

    //méthodes avancées
    public Inscription addInscriptionAndAssignToSkieur(Long idSkieur, Inscription inscription) {
        Skieur skieur = skieurRepository.findById(idSkieur).orElse(null); //peremt de récupérer le skieur selon l'id passée en paramêtre

        inscription.setSkieur(skieur); // on sauvegarde la valeur de skeiur dans l'ionscrption var inscription gère skieur (Voir cardinalités)
        return inscriptionRepository.save(inscription); // on sauvegarde l'inscription
    }
}
