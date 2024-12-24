package com.example.tpfoyer.services;

import com.example.tpfoyer.entity.Foyer;

import java.util.List;

public interface IFoyerService {
    Foyer  addFoyer(Foyer foyer);
    void deleteFoyer(Long idFoyer);
    Foyer modifyFoyer( Foyer foyer);
    List<Foyer> getAllFoyers();
    List<Foyer> retreiveAllFoyers();
    Foyer retreivefoyerById(Long idFoyer);

}
