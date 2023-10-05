package com.esprit.myfirstproject.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE) //rend tous mles attributs private
public class Skieur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    int numSkieur;

    @ManyToMany(mappedBy = "skieurs") //la classe Piste gère la classe Skieur c pk il y a un mapped by dans la relation ManyToMany
    Set<Piste> pistes;


    @OneToOne(cascade = CascadeType.ALL)//relation 1..1 (avec composition <=> CascadeType.ALL) entre SKIEUR et ABONNEMENT
    Abonnement abonnement;

    @OneToMany(mappedBy = "skieur")// la classe skieur est la classe child(mapped by), elle est géréé par la classe InscriptionRepository
    Set<Inscription> inscriptions;


    String nomS;
    String prenomS;
    LocalDate dateNaissance;
    String ville;

}
