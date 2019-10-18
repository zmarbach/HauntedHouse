package org.improving.HauntedHouse.database;

import org.improving.HauntedHouse.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends CrudRepository {
     List<Room> findByName(String name);
}
