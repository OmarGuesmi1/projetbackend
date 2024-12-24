package com.example.tpfoyer.controller;

import com.example.tpfoyer.entity.Bloc;
import com.example.tpfoyer.services.IBlocService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/bloc")
public class BlocController {
    IBlocService blocService;
    @GetMapping("/retrieve-all-blocs")
    public List<Bloc> getbloc() {
        List<Bloc> listbloc = blocService.retreiveAllBlocs();
        return listbloc;
    }

    @GetMapping("/retrieve-bloc/{bloc-id}")
    public Bloc retrievebloc(@PathVariable("bloc-id") Long idBloc) {
        Bloc bloc = blocService.retriveblocbyid(idBloc);
        return bloc;
    }
    @PostMapping("/add-bloc")
        public Bloc addbloc(@RequestBody Bloc c) {
        Bloc bloc = blocService.addBloc(c);
        return bloc;
    }
    @DeleteMapping("/remove-bloc/{bloc-id}")
    public void removebloc(@PathVariable("bloc-id") Long idBloc) {
        blocService.deleteBloc(idBloc);
    }
    @PutMapping("/modify-bloc")
    public Bloc modifybloc(@RequestBody Bloc c) {
        Bloc bloc = blocService.modifyBloc(c);
        return bloc;
    }

    //localhost:8089/tp8/projet/affecter-projet-a-projet-details/1/1
    @PutMapping("/affecter-projet-a-projet-details/{bloc-id}/{foyer-id}")
    public void affecgterProjetAProjetDetail(@PathVariable("bloc-id") Long idBloc,
                                            @PathVariable("foyer-id") Long idFoyer) {
        blocService.assignfoyertobloc(idBloc, idFoyer);
    }

    @PutMapping("/desaffecter-foyer/{bloc-id}")
    public Bloc desaffecterProjetDetail(@PathVariable("bloc-id") Long idBloc) {
        Bloc bloc = blocService.DesaffecterfoyerFrombloc(idBloc);
        return bloc;

}

    @GetMapping("/findAllByFoyerIsNull")
    public List<Bloc> findAllByFoyerIsNull() {
        List<Bloc> listbloc = blocService.findAllByFoyerIsNull();
        return listbloc;
    }



}
