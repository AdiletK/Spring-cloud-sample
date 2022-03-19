package com.kadyrbekov.reservationservices.repo;

import com.kadyrbekov.reservationservices.entity.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {
}
