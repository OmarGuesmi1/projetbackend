package org.example.examen3.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class coursclassroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idcoursclassroom;
    @Enumerated(EnumType.STRING)
    private specialite specialite;
    private String nom;
    private Integer nbrheurs;
    private boolean archive;
    @ManyToOne(cascade = CascadeType.ALL)
    private classe classes;
}
