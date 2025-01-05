package org.example.examen20241.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class evenement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idevenement;
    private String nomevenement;
    private Long nbplacerestante;
    private LocalDate dateevenement;
    @OneToMany(mappedBy = "evenement")
    Set<ticket> tickets=new HashSet<>();
    @ManyToMany(cascade = CascadeType.ALL)
    Set<categorie> categories=new HashSet<>();
}
