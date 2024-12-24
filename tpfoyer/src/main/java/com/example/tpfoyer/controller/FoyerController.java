package com.example.tpfoyer.controller;

import com.example.tpfoyer.entity.Foyer;
import com.example.tpfoyer.services.IFoyerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/foyer")
public class FoyerController {
    IFoyerService foyerService;
    @GetMapping("/retrieve-all-foyers")
    public List<Foyer> getfoyers() {
        List<Foyer> listfoyers = foyerService.retreiveAllFoyers();
        return listfoyers;
    }

    @GetMapping("/retrieve-foyer/{foyer-id}")
    public Foyer retreivefoyer(@PathVariable("foyer-id") Long idFoyer) {
        Foyer foyer = foyerService.retreivefoyerById(idFoyer);
        return foyer;
    }
    @PostMapping("/add-foyer")
    public Foyer addfoyer(@RequestBody Foyer c) {
        Foyer foyer = foyerService.addFoyer(c);
        return foyer;
    }
    @DeleteMapping("/remove-foyer/{foyer-id}")
    public void removefoyer(@PathVariable("foyer-id") Long idFoyer) {
        foyerService.deleteFoyer(idFoyer);
    }
    @PutMapping("/modify-foyer")
    public Foyer modifyfoyer(@RequestBody Foyer c) {
        Foyer foyer = foyerService.modifyFoyer(c);
        return foyer;
    }

}
