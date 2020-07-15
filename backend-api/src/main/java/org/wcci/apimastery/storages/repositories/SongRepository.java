package org.wcci.apimastery.storages.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wcci.apimastery.entities.Song;

public interface SongRepository extends CrudRepository <Song, Long> {
}
