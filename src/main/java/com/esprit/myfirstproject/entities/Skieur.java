package com.esprit.myfirstproject.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Skieur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numSkieur;
    @ManyToMany(mappedBy = "skieurs") //la classe Piste gère la classe Skieur c pk il y a un mapped by dans la relation ManyToMany
    Set<Piste> pistes;
}
