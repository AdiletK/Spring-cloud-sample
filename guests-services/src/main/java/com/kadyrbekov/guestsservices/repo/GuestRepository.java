package com.kadyrbekov.guestsservices.repo;

import com.kadyrbekov.guestsservices.entity.Guest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends CrudRepository<Guest, Long> {
}
