package org.wcci.apimastery.storages.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wcci.apimastery.entities.Album;

public interface AlbumRepository extends CrudRepository<Album, Long> {
    Album findByAlbumTitle(String albumTitle);
}

