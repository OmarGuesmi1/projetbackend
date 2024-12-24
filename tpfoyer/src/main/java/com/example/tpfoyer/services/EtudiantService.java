package com.example.tpfoyer.services;

import com.example.tpfoyer.entity.Etudiant;
import com.example.tpfoyer.entity.Foyer;
import com.example.tpfoyer.repository.EtudiantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantService implements IEtudiantService {
    EtudiantRepository etudiantRepository;
    public Etudiant addEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    public void deleteEtudiant(Long idEtudiant) {
        etudiantRepository.deleteById(idEtudiant);

    }

    public Etudiant modifyEtudiant(Etudiant etudiant) {
       return etudiantRepository.save(etudiant);
    }

    
    public List<Etudiant> getAllEtudiants() {
        List<Etudiant> etudiants = etudiantRepository.findAll();
        return etudiants;
    }

    public List<Etudiant> retreiveAllEtudiants() {
        return etudiantRepository.findAll();
    }

    public Etudiant retriveetdutdiantById(Long idEtudiant) {
        return etudiantRepository.findById(idEtudiant).get();
    }
}
