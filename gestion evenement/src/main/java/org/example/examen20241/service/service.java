package org.example.examen20241.service;

import org.example.examen20241.entity.*;

import java.time.LocalDate;
import java.util.List;

public interface service {
    internaute ajouterInternaute (internaute internaute) ;
    evenement ajouterEvenement(evenement evenement);
    void listeEvenementsParCategorie();
    List<ticket> ajouterTicketsEtAffecterAEvenementEtInternaute(List<ticket> tickets, Long idevenement, Long idinternaute );
    Long nbInternauteParTrancheAgeEtDateEvenement(trancheage trancheAge, LocalDate dateMin, LocalDate dateMax);
    Double montantRecupereParEvtEtTypeTicket(String nomevent, typeticket type);
    String internauteLePlusActif();




}
