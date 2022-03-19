package com.kadyrbekov.roomservices.repo;

import com.kadyrbekov.roomservices.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
}
