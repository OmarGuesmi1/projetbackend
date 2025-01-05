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
public class internaute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idinternaute;
    private String idinternaute2;
    @Enumerated(EnumType.STRING)
    private trancheage trancheage;
    @OneToMany(mappedBy = "internaute")
    Set<ticket> tickets=new HashSet<>();
}
