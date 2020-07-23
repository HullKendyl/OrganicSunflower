package org.wcci.apimastery.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.wcci.apimastery.entities.Album;
import org.wcci.apimastery.entities.Song;
import org.wcci.apimastery.storages.AlbumStorage;
import org.wcci.apimastery.storages.SongStorage;

import java.util.Collection;

@RestController
public class SongController {
    private SongStorage songStorage;
    private AlbumStorage albumStorage;

    public SongController(SongStorage songStorage, AlbumStorage albumStorage) {
        this.songStorage = songStorage;
        this.albumStorage = albumStorage;
    }

    @GetMapping("/api/songs")
    public Collection<Song> findAllSongs(){
    return songStorage.findAllSongs();
    }

    @GetMapping("/api/songs/{id}/")
    public Song retrieveSongById(@PathVariable long id){
        return songStorage.findSongById(id);
    }

    @GetMapping("/api/songs/{id}/album")
    public Album fetchSongAlbum(@PathVariable long id){
        return songStorage.findSongById(id).getAlbum();
    }

    @DeleteMapping("/api/songs/{id}/")
    public Album deleteSong(@PathVariable long id){
        Album album = songStorage.findSongById(id).getAlbum();
        songStorage.delete(id);
        return albumStorage.findAlbumById(album.getId());
    }

}
