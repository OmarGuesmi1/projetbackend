package com.example.tpfoyer.services;


import com.example.tpfoyer.entity.Chambre;
import com.example.tpfoyer.entity.TypeChambre;
import com.example.tpfoyer.repository.ChambreRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class ChambreServiceimp implements IChambreService {

    ChambreRepository chambreRepository;
    public Chambre addChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    public void deleteChambre(Long idChambre) {
  chambreRepository.deleteById(idChambre);
    }

    public Chambre modifyChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }


    public List<Chambre> getAllChambre() {
        List<Chambre> chambres = chambreRepository.findAll();
        return chambres;
    }

   // @Scheduled(cron = "*/20 * * * * *")
    public List<Chambre> retrieveAllChambres() {
        List<Chambre> chambres = chambreRepository.findAll();
        for(Chambre chambre :chambres){
           // System.out.println(chambre);
            log.info("chambre: " + chambre);
        }
        return chambres;
    }

    public Chambre retrieveChambre(Long chambreId) {
        return chambreRepository.findById(chambreId).get();
}

    public Chambre findChambreByNumeroChambre(Long numC) {
        return chambreRepository.findChambreByNumeroChambre(numC);
    }

    public List<Chambre> findAllByTypeC(TypeChambre tc) {
        return chambreRepository.findAllByTypeC(tc);
    }

    public List<Chambre> findChambreByCin(String cin) {
        return chambreRepository.findChambreByCin(cin);
    }
}
