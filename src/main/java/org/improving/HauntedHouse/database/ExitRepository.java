package org.improving.HauntedHouse.database;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//honestly will end up deleting this class since the room repository handles 99.9% of our haunted house
@Repository
public interface ExitRepository extends CrudRepository {
}
