package org.improving.HauntedHouse.database;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository {
    // List<Room> findByName(String name);
}
