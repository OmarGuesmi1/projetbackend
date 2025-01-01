package org.example.examen3.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.examen3.entity.*;
import org.example.examen3.repository.classerepository;
import org.example.examen3.repository.coursclassroomrepository;
import org.example.examen3.repository.utilisateurrepository;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
@AllArgsConstructor
public class serviceimp implements service {
    utilisateurrepository utilisateurrepository;
    classerepository classerepository;
    coursclassroomrepository coursclassroomrepository;
    public utilisateur ajouterUtilisateur(utilisateur utilisateur) {
        return utilisateurrepository.save(utilisateur);
    }

    public classe ajouterClasse(classe classe) {
        return classerepository.save(classe);
    }

    public coursclassroom ajouterCoursclassroom(coursclassroom coursclassroom, Integer codeclasse) {

      classe c= classerepository.findById(codeclasse).get();
      coursclassroom.setClasses(c);
        return coursclassroomrepository.save(coursclassroom);
    }

    public void affecterutilisateurclasse(Integer iduser, Integer codeclasse) {

        utilisateur utilisateur = utilisateurrepository.findById(iduser).get();
        classe c= classerepository.findById(codeclasse).get();
        utilisateur.setClasse(c);
        utilisateurrepository.save(utilisateur);

    }

    public Integer nbutilisateurparniveau(niveau niveau) {
        return utilisateurrepository.countUtilisateur(niveau);
    }

    public void desaffectercoursclassroomclasse(Integer idcoursclassroom) {
        coursclassroom c = coursclassroomrepository.findById(idcoursclassroom).get();
        c.setClasses(null);
        coursclassroomrepository.save(c);

    }
    @Scheduled(cron = "*/4 * * * * *")
    public void archivercoursclassroom() {
        List<coursclassroom> coursclassrooms = coursclassroomrepository.findAll();
        for(coursclassroom c :coursclassrooms){
           if(c.isArchive()==true) {
               log.info("archive : " + c.getNom());

           }

        }

    }

    public Integer nbrheuresparspecetniveau(specialite sp, niveau niveau) {
        return coursclassroomrepository.findcoursclassroomBySpecialiteAndClasseNiveau(niveau,sp);
    }
}
