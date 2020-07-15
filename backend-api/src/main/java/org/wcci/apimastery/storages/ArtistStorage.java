package org.wcci.apimastery.storages;

import org.springframework.stereotype.Service;
import org.wcci.apimastery.entities.Artist;
import org.wcci.apimastery.storages.repositories.ArtistRepository;

import java.util.Collection;

@Service
public class ArtistStorage {

    private ArtistRepository artistRepo;

    public ArtistStorage(ArtistRepository artistRepo) {
        this.artistRepo = artistRepo;
    }

    public Collection<Artist> retrieveAllArtists() {
        return (Collection<Artist>) artistRepo.findAll();
    }

    public Artist retrieveArtistById(long id) {
        return artistRepo.findById(id).get();
    }

    public Artist save(Artist artist) {
        return artistRepo.save(artist);
    }

    public void delete(long id) {
        artistRepo.deleteById(id);
    }
}
