package org.example.examen3.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class classe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codeclasse;
    private String titre;
    @Enumerated(EnumType.STRING)
    private niveau niveau;
    @OneToMany(mappedBy = "classes")
    Set<coursclassroom> coursclassrooms;
}
