package org.example.examen20241.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.examen20241.entity.*;
import org.example.examen20241.repository.categorierepository;
import org.example.examen20241.repository.evenementrepository;
import org.example.examen20241.repository.internauterepository;
import org.example.examen20241.repository.ticketrepository;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Slf4j
@Service
@AllArgsConstructor
public class serviceimp implements service {

    internauterepository internauterepository;
    evenementrepository evenementrepository;
    categorierepository categorierrepository;
    ticketrepository ticketrepository;
    public internaute ajouterInternaute(internaute internaute) {
        return internauterepository.save(internaute);
    }

    public evenement ajouterEvenement(evenement evenement) {
        return evenementrepository.save(evenement);
    }
    //@Scheduled(cron = "*/4 * * * * *")
    public void listeEvenementsParCategorie() {
        List<evenement> evenements = evenementrepository.findAll();
        List<categorie> categories = categorierrepository.findAll();
        for(categorie c :categories){
            log.info("categorie: " + c.getNomCategorie());
            for(evenement e :evenements){
            log.info(  e.getNomevenement()   +  "planifier le: " + e.getDateevenement());

        }}
    }

    public List<ticket> ajouterTicketsEtAffecterAEvenementEtInternaute(List<ticket> tickets, Long idevenement, Long idinternaute) {
        internaute internaute = internauterepository.findById(idinternaute).get();
        evenement evenement = evenementrepository.findById(idevenement).get();
        for(ticket c :tickets){

            c.setEvenement(evenement);
            c.setInternaute(internaute);
        }

        return ticketrepository.saveAll(tickets);




    }

    public Long nbInternauteParTrancheAgeEtDateEvenement(trancheage trancheAge, LocalDate dateMin, LocalDate dateMax) {
        return internauterepository.countByTrancheageAndTicketsEvenementDateevenementBetween(trancheAge, dateMin, dateMax);
    }

    public Double montantRecupereParEvtEtTypeTicket(String nomevent, typeticket type) {
        return ticketrepository.findByTypeticketAndEvenementNomevenement(nomevent,type);
    }

    public String internauteLePlusActif() {

        List<ticket> ticket = ticketrepository.findAll();
        for(ticket c :ticket){

            if(c.getPrixticket()>20){
                return c.getInternaute().getIdinternaute2();
            }
        }

        return "null";
    }
}
