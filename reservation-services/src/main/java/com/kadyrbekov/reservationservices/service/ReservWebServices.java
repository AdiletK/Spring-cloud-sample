package com.kadyrbekov.reservationservices.service;

import com.kadyrbekov.reservationservices.entity.Reservation;
import com.kadyrbekov.reservationservices.repo.ReservationRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reservations")
public class ReservWebServices {
    private final ReservationRepository repository;

    public ReservWebServices(ReservationRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Iterable<Reservation> getAll(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Reservation findById(@PathVariable Long id){
        return repository.findById(id)
                .get();
    }
}
