package com.esprit.myfirstproject.repositories;

import com.esprit.myfirstproject.entities.Skieur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkieurRepository extends JpaRepository<Skieur, Long> {

}
