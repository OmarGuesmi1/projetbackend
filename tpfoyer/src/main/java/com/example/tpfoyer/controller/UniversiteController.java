package com.example.tpfoyer.controller;


import com.example.tpfoyer.entity.Reservation;
import com.example.tpfoyer.entity.Universite;
import com.example.tpfoyer.services.IUniversiteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/universite")
public class UniversiteController {
    IUniversiteService universiteService;
    @GetMapping("/retrieve-all-universite")
    public List<Universite> getuniversite() {
        List<Universite> listuniversite = universiteService.retreiveAllUniversites();
        return listuniversite;
    }

    @GetMapping("/retrieve-universite/{universite-id}")
    public Universite retreiveuniversite(@PathVariable("universite-id") Long idUniversite) {
        Universite universite = universiteService.retreiveuniversitebyID(idUniversite);
        return universite;
    }
    @PostMapping("/add-universite")
    public Universite adduniversite(@RequestBody Universite c) {
        Universite universite = universiteService.addUniversite(c);
        return universite;
    }
    @DeleteMapping("/remove-universite/{universite-id}")
    public void removeuniversite(@PathVariable("universite-id") Long idUniversite) {
        universiteService.deleteUniversite(idUniversite);
    }
    @PutMapping("/modify-universite")
    public Universite modifyuniversite(@RequestBody Universite c) {
        Universite universite = universiteService.modifyUniversite(c);
        return universite;
    }

}
