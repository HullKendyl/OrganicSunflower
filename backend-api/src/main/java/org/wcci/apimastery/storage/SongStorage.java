package org.wcci.apimastery.storage;

import org.springframework.stereotype.Service;
import org.wcci.apimastery.entities.Song;
import org.wcci.apimastery.storage.repositories.SongRepository;

@Service
public class SongStorage {
    SongRepository songRepo;

    public SongStorage(SongRepository songRepo) {
        this.songRepo = songRepo;
    }

    public Song save(Song song) {
        return songRepo.save(song);
    }
}
