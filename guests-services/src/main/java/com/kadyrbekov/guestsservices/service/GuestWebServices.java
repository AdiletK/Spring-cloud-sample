package com.kadyrbekov.guestsservices.service;

import com.kadyrbekov.guestsservices.entity.Guest;
import com.kadyrbekov.guestsservices.repo.GuestRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/guests")
public class GuestWebServices {
    private final GuestRepository repository;

    public GuestWebServices(GuestRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Iterable<Guest> getAll(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Guest findById(@PathVariable Long id){
        return repository.findById(id)
                .get();
    }
}
