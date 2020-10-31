package com.example.wypozyczalnia.service;

import com.example.wypozyczalnia.model.Reservation;
import com.example.wypozyczalnia.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReservationService {
    @Autowired
    private final ReservationRepository reservationRepository;

    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public List<Reservation> listAll() {
        return reservationRepository.findAll();
    }

    public void save(Reservation reservation) {
        reservationRepository.save(reservation);
    }

    public Reservation get(Long id) {
        return reservationRepository.findById(id).get();
    }

    public void delete(Long id) {
        reservationRepository.deleteById(id);
    }

}
