package org.wcci.apimastery.controllers;

import org.springframework.web.bind.annotation.*;
import org.wcci.apimastery.entities.Album;
import org.wcci.apimastery.entities.Artist;
import org.wcci.apimastery.entities.Song;
import org.wcci.apimastery.storages.AlbumStorage;
import org.wcci.apimastery.storages.ArtistStorage;
import org.wcci.apimastery.storages.SongStorage;

import java.util.Collection;

@RestController
public class AlbumController {
    private AlbumStorage albumStorage;
    private SongStorage songStorage;
    private ArtistStorage artistStorage;


    public AlbumController(AlbumStorage albumStorage, SongStorage songStorage, ArtistStorage artistStorage) {
        this.albumStorage = albumStorage;
        this.songStorage = songStorage;
        this.artistStorage = artistStorage;
    }

    @GetMapping("/api/albums")
    public Collection<Album> retrieveAllAlbums(){
        return albumStorage.findAllAlbums();
    }

    @GetMapping("/api/albums/{id}/")
    public Album retrieveAlbumById(@PathVariable long id){
        return albumStorage.findAlbumById(id);
    }

    @PostMapping("/api/albums/add/")
    public Album addAlbum(@RequestBody Album album){
        return albumStorage.save(album);
    }

    @PatchMapping("/api/albums/{albumId}/addsong/")
    public Album addSongToAlbum(@PathVariable long albumId, @RequestBody Song song){
        Album albumToUpdate = albumStorage.findAlbumById(albumId);
        Song songToAdd = new Song(song.getSongTitle(), song.getSongDuration(), song.getSongLink(), song.getSongImage(), albumToUpdate, albumToUpdate.getArtist());
        songStorage.save(songToAdd);
        return songToAdd.getAlbum();
    }

    @DeleteMapping("/api/albums/{albumId}/")
    public Artist deleteAlbum(@PathVariable long albumId){
        Artist artist = albumStorage.findAlbumById(albumId).getArtist();
        albumStorage.delete(albumId);
        return artistStorage.retrieveArtistById(artist.getId());
    }
}
