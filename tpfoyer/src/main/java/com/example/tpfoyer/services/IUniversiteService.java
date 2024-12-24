package com.example.tpfoyer.services;

import com.example.tpfoyer.entity.Universite;

import java.awt.*;
import java.util.List;

public interface IUniversiteService {
    Universite addUniversite(Universite universite);
    void deleteUniversite(Long iUuniversite);
    Universite modifyUniversite(Universite universite);
    List<Universite> getAllUniversites();
    List<Universite> retreiveAllUniversites();
    Universite retreiveuniversitebyID(Long universiteID);
}
