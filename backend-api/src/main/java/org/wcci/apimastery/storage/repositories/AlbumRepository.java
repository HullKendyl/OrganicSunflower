package org.wcci.apimastery.storage.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wcci.apimastery.entities.Album;

public interface AlbumRepository extends CrudRepository<Album, Long> {
    Album findByAlbumTitle(String albumTitle);
}

