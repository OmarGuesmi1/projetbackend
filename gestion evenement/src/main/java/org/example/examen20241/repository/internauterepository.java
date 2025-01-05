package org.example.examen20241.repository;

import org.example.examen20241.entity.internaute;
import org.example.examen20241.entity.trancheage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface internauterepository extends JpaRepository<internaute,Long> {
    Long countByTrancheageAndTicketsEvenementDateevenementBetween(trancheage trancheage, LocalDate datemax , LocalDate datemin);
}
