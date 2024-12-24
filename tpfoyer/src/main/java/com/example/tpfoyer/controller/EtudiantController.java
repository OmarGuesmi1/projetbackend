package com.example.tpfoyer.controller;

import com.example.tpfoyer.entity.Etudiant;
import com.example.tpfoyer.services.IEtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantController {
    IEtudiantService etudiantService;
    @GetMapping("/retrieve-all-etudiants")
    public List<Etudiant> getetudiants() {
        List<Etudiant> listetudiant = etudiantService.retreiveAllEtudiants();
        return listetudiant;
    }

    @GetMapping("/retrieve-etudiant/{etudiant-id}")
    public Etudiant retrieveetudiant(@PathVariable("etudiant-id") Long idEtudiant) {
        Etudiant etudiant = etudiantService.retriveetdutdiantById(idEtudiant);
        return etudiant;
    }
    @PostMapping("/add-etudiant")
    public Etudiant addetudiant(@RequestBody Etudiant c) {
        Etudiant etudiant = etudiantService.addEtudiant(c);
        return etudiant;
    }
    @DeleteMapping("/remove-etudiant/{etudiant-id}")
    public void removeetudiant(@PathVariable("etudiant-id") Long idEtudiant) {
        etudiantService.deleteEtudiant(idEtudiant);
    }
    @PutMapping("/modify-etudiant")
    public Etudiant modifyetudiant(@RequestBody Etudiant c) {
        Etudiant etudiant = etudiantService.modifyEtudiant(c);
        return etudiant;
    }

}
