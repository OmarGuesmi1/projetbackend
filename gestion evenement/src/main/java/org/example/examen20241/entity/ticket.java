package org.example.examen20241.entity;

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
public class ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idticket;
    private String codeticket;
    private Double prixticket;
    @Enumerated(EnumType.STRING)
    private typeticket typeticket;
    @ManyToOne(cascade = CascadeType.ALL)
    private internaute internaute;
    @ManyToOne(cascade = CascadeType.ALL)
    private evenement evenement;
}
