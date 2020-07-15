package org.wcci.apimastery.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.wcci.apimastery.entities.Song;
import org.wcci.apimastery.storages.SongStorage;

import java.util.Collection;

@RestController
public class SongController {
    private SongStorage songStorage;

    public SongController(SongStorage songStorage) {
        this.songStorage = songStorage;
    }

    @GetMapping("/api/songs")
    public Collection<Song> findAllSongs(){
    return songStorage.findAllSongs();
    }

    @GetMapping("/api/songs/{id}/")
    public Song retrieveSongById(@PathVariable long id){
        return songStorage.findSongById(id);
    }

    @DeleteMapping("/api/songs/{id}/")
    public Collection<Song> deleteSong(@PathVariable long id){
        songStorage.delete(id);
        return songStorage.findAllSongs();
    }

}
