package com.example.tpfoyer.services;

import com.example.tpfoyer.entity.Chambre;
import com.example.tpfoyer.entity.TypeChambre;

import java.util.List;

public interface IChambreService {
     Chambre addChambre(Chambre chambre);
     void deleteChambre(Long idChambre);
     Chambre modifyChambre(Chambre chambre);
     List<Chambre> getAllChambre();
     public  List<Chambre> retrieveAllChambres();
     public Chambre retrieveChambre(Long chambreId);
     Chambre findChambreByNumeroChambre(Long numC);
     List<Chambre> findAllByTypeC(TypeChambre tc);
     List<Chambre> findChambreByCin(String cin);
}
