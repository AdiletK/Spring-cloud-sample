package com.kadyrbekov.roomservices.service;

import com.kadyrbekov.roomservices.entity.Room;
import com.kadyrbekov.roomservices.repo.RoomRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rooms")
public class RoomWebServices {
    private final RoomRepository repository;

    public RoomWebServices(RoomRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Iterable<Room> getAll(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Room findById(@PathVariable Long id){
        return repository.findById(id)
                .get();
    }
}
