package org.example.examen20241.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idcategorie;
    private String codecategorie;
    private String nomCategorie;
    @ManyToMany(mappedBy = "categories")
    Set<evenement> evenements = new HashSet<>();
}
