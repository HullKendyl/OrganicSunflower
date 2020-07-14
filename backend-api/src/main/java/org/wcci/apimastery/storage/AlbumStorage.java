package org.wcci.apimastery.storage;

import org.springframework.stereotype.Service;
import org.wcci.apimastery.entities.Album;
import org.wcci.apimastery.storage.repositories.AlbumRepository;

import java.util.Collection;

@Service
public class AlbumStorage {
    private AlbumRepository albumRepo;

    public AlbumStorage(AlbumRepository albumRepo) {
        this.albumRepo = albumRepo;
    }

    public Album save(Album album) {
        return albumRepo.save(album);
    }

    public Collection<Album> findAllAlbums() {
        return (Collection<Album>) albumRepo.findAll();
    }

    public Album findAlbumById(long id) {
        return albumRepo.findById(id).get();
    }

    public void delete(long id) {
        albumRepo.deleteById(id);
    }
}
