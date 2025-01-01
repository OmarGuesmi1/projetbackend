package org.example.examen3.service;

import org.example.examen3.entity.*;

public interface service {
    public utilisateur ajouterUtilisateur(utilisateur utilisateur);
    public classe ajouterClasse(classe classe);
    public coursclassroom ajouterCoursclassroom(coursclassroom coursclassroom , Integer codeclasse);
    public void affecterutilisateurclasse(Integer iduser,Integer codeclasse );
    public Integer nbutilisateurparniveau(niveau niveau);
    public void desaffectercoursclassroomclasse(Integer idcoursclassroom);
    public void archivercoursclassroom();
    public Integer nbrheuresparspecetniveau(specialite sp, niveau niveau);
}
