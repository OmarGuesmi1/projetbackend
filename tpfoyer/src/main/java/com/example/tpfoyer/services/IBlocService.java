package com.example.tpfoyer.services;

import com.example.tpfoyer.entity.Bloc;

import java.util.List;

public interface IBlocService {
    Bloc addBloc(Bloc bloc);
    void deleteBloc(Long idBloc);
    Bloc modifyBloc(Bloc bloc);
    List<Bloc> getAllBlocs();
    List<Bloc>retreiveAllBlocs();
    Bloc retriveblocbyid(Long idBloc);
    void assignfoyertobloc(Long idBloc, Long idFoyer);
    Bloc DesaffecterfoyerFrombloc(Long idBloc);
    List<Bloc> findAllByFoyerIsNull();
}
