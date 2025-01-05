package org.example.examen20241.controller;

import lombok.AllArgsConstructor;
import org.example.examen20241.entity.*;
import org.example.examen20241.service.serviceimp;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@AllArgsConstructor
public class controller {
    serviceimp service;
    @PostMapping("/add-internaute")
    public internaute ajouterInternaute(@RequestBody internaute c) {
        internaute internaute = service.ajouterInternaute(c);
        return internaute;
    }
    @PostMapping("/add-evenement")
    public evenement ajouterEvenement(@RequestBody evenement c) {
        evenement evenement = service.ajouterEvenement(c);
        return evenement;
    }

    @PostMapping("/ajouterTicketsEtAffecterAEvenementEtInternaute/{idevenement}/{idinternaute}")
    public List<ticket> ajouterTicketsEtAffecterAEvenementEtInternaute(@RequestBody List<ticket> tickets,@PathVariable("idevenement") Long idevenement,@PathVariable("idinternaute") Long idinternaute) {

        return service.ajouterTicketsEtAffecterAEvenementEtInternaute(tickets,idevenement,idinternaute);
    }
    @GetMapping("/nbInternauteParTrancheAgeEtDateEvenement/{trancheAge}/{dateMin}/{dateMax}")
    public Long nbInternauteParTrancheAgeEtDateEvenement(@PathVariable("trancheAge") trancheage trancheAge, @PathVariable("dateMin") LocalDate dateMin, @PathVariable("dateMax") LocalDate dateMax) {
        return service.nbInternauteParTrancheAgeEtDateEvenement(trancheAge,dateMin,dateMax);
    }
    @GetMapping("/montantRecupereParEvtEtTypeTicket/{nomEvt}/{typeTicket}")
    public Double montantRecupereParEvtEtTypeTicket(@PathVariable("nomEvt") String nomevent, @PathVariable("typeTicket") typeticket type) {
        return service.montantRecupereParEvtEtTypeTicket(nomevent,type);
    }

    @GetMapping("/internauteLePlusActif")
    public String internauteLePlusActif() {
        return service.internauteLePlusActif();
    }
}
