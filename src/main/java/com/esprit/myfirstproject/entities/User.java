package com.esprit.myfirstproject.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    private Long userId;

    private String lastname;


}
