package com.example.tpfoyer.controller;


import com.example.tpfoyer.entity.Reservation;
import com.example.tpfoyer.services.IReservationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class ReservationController {
    IReservationService reservationService;
    @GetMapping("/retrieve-all-reservation")
    public List<Reservation> getreservations() {
        List<Reservation> listreservation = reservationService.retriveallReservations();
        return listreservation;
    }

    @GetMapping("/retrieve-reservation/{reservation-id}")
    public Reservation retreivereservation(@PathVariable("reservation-id") String idReservation) {
        Reservation reservation = reservationService.retrivereservationbyid(idReservation);
        return reservation;
    }
    @PostMapping("/add-reservation")
    public Reservation addreservation(@RequestBody Reservation c) {
        Reservation reservation = reservationService.addReservation(c);
        return reservation;
    }
    @DeleteMapping("/remove-reservation/{reservation-id}")
    public void removereservation(@PathVariable("reservation-id") String idReservation) {
        reservationService.deleteReservation(idReservation);
    }
    @PutMapping("/modify-reservation")
    public Reservation modifyreservation(@RequestBody Reservation c) {
        Reservation reservation = reservationService.modifyReservation(c);
        return reservation;
    }

}
