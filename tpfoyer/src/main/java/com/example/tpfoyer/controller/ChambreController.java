package com.example.tpfoyer.controller;

import com.example.tpfoyer.entity.Chambre;
import com.example.tpfoyer.entity.TypeChambre;
import com.example.tpfoyer.services.IChambreService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/chambre")
public class ChambreController {
    IChambreService chambreService;
    @GetMapping("/retrieve-all-chambres")
    public List<Chambre> getChambres() {
        List<Chambre> listChambres = chambreService.retrieveAllChambres();
        return listChambres;
    }

    @GetMapping("/retrieve-chambre/{chambre-id}")
    public Chambre retrieveChambre(@PathVariable("chambre-id") Long idChambre) {
        Chambre chambre = chambreService.retrieveChambre(idChambre);
        return chambre;
    }
    @PostMapping("/add-chambre")
    public Chambre addChambre(@RequestBody Chambre c) {
        Chambre chambre = chambreService.addChambre(c);
        return chambre;
    }
    @DeleteMapping("/remove-chambre/{chambre-id}")
    public void removeChambre(@PathVariable("chambre-id") Long idchambre) {
        chambreService.deleteChambre(idchambre);
    }
    @PutMapping("/modify-chambre")
    public Chambre modifyChambre(@RequestBody Chambre c) {
        Chambre chambre = chambreService.modifyChambre(c);
        return chambre;
    }

    @GetMapping("/chambrebynumero/{numero}")
    public Chambre findChambreByNumeroChambre(@PathVariable("numero") Long numeroChambre) {
        Chambre chambre = chambreService.findChambreByNumeroChambre(numeroChambre);
        return chambre;
    }

    @GetMapping("/chambrebytype/{type}")
    public List<Chambre> findAllByTypeC(@PathVariable("type") TypeChambre TypeChambre) {
        List<Chambre> chambre = chambreService.findAllByTypeC(TypeChambre);
        return chambre;
    }

    @GetMapping("/findChambreByCin/{cin}")
    public List<Chambre> findChambreByCin(@PathVariable("cin") String cin) {
        List<Chambre> chambre = chambreService.findChambreByCin(cin);
        return chambre;
    }

}
