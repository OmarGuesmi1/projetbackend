package com.example.tpfoyer.services;

import com.example.tpfoyer.entity.Reservation;

import java.util.List;

public interface IReservationService {

    Reservation addReservation(Reservation reservation);
    void deleteReservation(String idReservation);
    Reservation modifyReservation(Reservation reservation);
    List<Reservation> getAllReservations();
    Reservation retrivereservationbyid(String idReservation);
    List<Reservation> retriveallReservations();
}
