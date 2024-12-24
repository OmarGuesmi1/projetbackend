package com.example.tpfoyer.services;

import com.example.tpfoyer.entity.Universite;
import com.example.tpfoyer.repository.UniversiteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteService implements IUniversiteService {
     UniversiteRepository universiteRepository;

    public Universite addUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    public void deleteUniversite(Long iUuniversite) {
    universiteRepository.deleteById(iUuniversite);
    }

    public Universite modifyUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    public List<Universite> getAllUniversites() {
        List<Universite> universites = universiteRepository.findAll();
        return universites;
    }

    public List<Universite> retreiveAllUniversites() {
        return universiteRepository.findAll();
    }

    public Universite retreiveuniversitebyID(Long universiteID) {
        return universiteRepository.findById(universiteID).get();
    }
}
