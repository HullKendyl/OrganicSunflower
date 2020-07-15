package org.wcci.apimastery.storages;

import org.springframework.stereotype.Service;
import org.wcci.apimastery.entities.Song;
import org.wcci.apimastery.storages.repositories.SongRepository;

import java.util.Collection;

@Service
public class SongStorage {
    SongRepository songRepo;

    public SongStorage(SongRepository songRepo) {
        this.songRepo = songRepo;
    }

    public Song save(Song song) {
        return songRepo.save(song);
    }

    public Collection<Song> findAllSongs() {
        return (Collection<Song>)songRepo.findAll();
    }

    public Song findSongById(long id) {
        return songRepo.findById(id).get();
    }

    public void delete(long id) {
        songRepo.deleteById(id);
    }
}
