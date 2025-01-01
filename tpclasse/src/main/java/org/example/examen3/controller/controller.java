package org.example.examen3.controller;

import lombok.AllArgsConstructor;
import org.example.examen3.entity.*;
import org.example.examen3.service.serviceimp;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class controller {
serviceimp service;

    @PostMapping("/add-utilisateur")
    public utilisateur ajouterUtilisateur(@RequestBody utilisateur c) {
        utilisateur utilisateur = service.ajouterUtilisateur(c);
        return utilisateur;
    }

    @PostMapping("/add-classe")
    public classe ajouterClasse(@RequestBody classe c) {
        classe classe = service.ajouterClasse(c);
        return classe;
    }
    @PostMapping("/add-coursclassroom/{codeclasse}")
    public coursclassroom ajouterCoursclassroom(@RequestBody coursclassroom coursclassroom,@PathVariable("codeclasse") Integer codeclasse) {
        coursclassroom c = service.ajouterCoursclassroom(coursclassroom,codeclasse);
        return c ;
    }

    @PostMapping("/add-affecterutilisateurclasse/{iduser}/{codeclasse}")
    public void affecterutilisateurclasse(@PathVariable("iduser") Integer iduser,@PathVariable("codeclasse") Integer codeclasse) {
         service.affecterutilisateurclasse(iduser,codeclasse);

    }
    @GetMapping("/nbutilisateurparniveau/{niveau}")
    public Integer nbutilisateurparniveau(@PathVariable("niveau") niveau niveau) {
        return service.nbutilisateurparniveau(niveau);
    }
    @GetMapping("/desaffectercoursclassroomclasse/{idcoursclassroom}")
    public void desaffectercoursclassroomclasse(@PathVariable("idcoursclassroom") Integer idcoursclassroom) {
         service.desaffectercoursclassroomclasse(idcoursclassroom);
    }
    @GetMapping("/nbrheuresparspecetniveau/{sp}/{niveau}")
    public Integer nbrheuresparspecetniveau(@PathVariable("sp") specialite sp,@PathVariable("niveau") niveau niveau) {
      return   service.nbrheuresparspecetniveau(sp,niveau);
    }
}
