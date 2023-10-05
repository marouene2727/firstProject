package com.esprit.myfirstproject.repositories;

import com.esprit.myfirstproject.entities.Abonnement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbonnementRepository extends JpaRepository<Abonnement,Long> {

}
