package com.example.tpfoyer.services;

import com.example.tpfoyer.entity.Bloc;
import com.example.tpfoyer.entity.Chambre;
import com.example.tpfoyer.entity.Foyer;
import com.example.tpfoyer.repository.BlocRepository;
import com.example.tpfoyer.repository.FoyerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BlocService implements IBlocService {
    FoyerRepository foyerRepository;
    BlocRepository blocRepository;
    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    public void deleteBloc(Long idBloc) {
        blocRepository.deleteById(idBloc);
    }
    public Bloc modifyBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    public List<Bloc> getAllBlocs() {
        List<Bloc> blocs= blocRepository.findAll();
        return blocs;

    }

    public List<Bloc> retreiveAllBlocs() {
        return blocRepository.findAll();
    }

    public Bloc retriveblocbyid(Long idBloc) {
        return blocRepository.findById(idBloc).get();
    }

    public void assignfoyertobloc(Long idBloc, Long idFoyer) {
        Foyer foyer = foyerRepository.findById(idFoyer).get();
        Bloc bloc = blocRepository.findById(idBloc).get();
        bloc.setFoyer(foyer);
        blocRepository.save(bloc);
    }

    public Bloc DesaffecterfoyerFrombloc(Long idBloc) {
        Bloc bloc = blocRepository.findById(idBloc).get();
        bloc.setFoyer(null);
        return blocRepository.save(bloc);

    }

    public List<Bloc> findAllByFoyerIsNull() {
        return blocRepository.findAllByFoyerIsNull();
    }

}
