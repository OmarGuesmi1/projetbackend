package com.example.tpfoyer.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEtudiant;
    private String nomET;
    private String prenomET;
    private long cin;
    private String ecole;
    private Date dateNaissance;
    @JsonIgnore
    @ManyToMany(mappedBy = "etudiants")
    Set <Reservation> reservations;

}
