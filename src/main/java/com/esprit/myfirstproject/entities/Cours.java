package com.esprit.myfirstproject.entities;

import com.esprit.myfirstproject.entities.enums.Couleur;
import com.esprit.myfirstproject.entities.enums.Support;
import com.esprit.myfirstproject.entities.enums.TypeCours;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE) //rend tous les attributs private
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long numCours;
    int niveau;
    @Enumerated(EnumType.STRING)
    TypeCours typeCours;
    @Enumerated(EnumType.STRING)
    Support support;
    Float prix;
    int creneau;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cours")// la classe Cours est la classe child(mapped by), elle est géréé par la classe Inscription
    private Set<Inscription> inscriptions;

    @ManyToOne
    Moniteur moniteur ;




}