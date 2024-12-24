package com.example.tpfoyer.services;

import com.example.tpfoyer.entity.Chambre;
import com.example.tpfoyer.entity.Foyer;
import com.example.tpfoyer.repository.FoyerRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
@AllArgsConstructor
public class FoyerService implements IFoyerService {
    FoyerRepository foyerRepository;
    public Foyer addFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }
    public void deleteFoyer(Long idFoyer) {
        foyerRepository.deleteById(idFoyer);
    }
    public Foyer modifyFoyer( Foyer foyer) {
        return foyerRepository.save(foyer);
    }
    public List<Foyer> getAllFoyers() {
        List<Foyer> foyers = foyerRepository.findAll();
        return foyers;
    }

    @Scheduled(cron = "20 30 9 * 2 MON-WED")
    public List<Foyer> retreiveAllFoyers() {
        List<Foyer> foyer = foyerRepository.findAll();
        for(Foyer foyer1 :foyer){
            // System.out.println(chambre);
            log.info("foyer: " + foyer);
        }
        return foyerRepository.findAll();
    }

    public Foyer retreivefoyerById(Long idFoyer) {
        return foyerRepository.findById(idFoyer).get();
    }

}
