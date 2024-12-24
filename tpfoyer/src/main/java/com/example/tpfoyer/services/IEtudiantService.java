package com.example.tpfoyer.services;

import com.example.tpfoyer.entity.Etudiant;
import com.example.tpfoyer.repository.EtudiantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IEtudiantService {
Etudiant addEtudiant(Etudiant etudiant);
void deleteEtudiant(Long idEtudiant);
Etudiant modifyEtudiant(Etudiant etudiant);
List<Etudiant> getAllEtudiants();
List<Etudiant> retreiveAllEtudiants();
Etudiant retriveetdutdiantById(Long idEtudiant);
}
