package org.wcci.apimastery.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.wcci.apimastery.entities.Album;
import org.wcci.apimastery.entities.Artist;
import org.wcci.apimastery.storages.AlbumStorage;
import org.wcci.apimastery.storages.ArtistStorage;

import javax.persistence.EntityManager;
import javax.tools.ForwardingJavaFileManager;
import javax.tools.JavaFileManager;
import java.util.Collection;

@RestController
public class ArtistController {
    private ArtistStorage artistStorage;
    private AlbumStorage albumStorage;

    public ArtistController(ArtistStorage artistStorage, AlbumStorage albumStorage) {
        this.artistStorage = artistStorage;
        this.albumStorage = albumStorage;
    }

    @GetMapping("/api/artists")
        public Collection<Artist> retrieveAllArtists(){
        return artistStorage.retrieveAllArtists();
    }

    @GetMapping("/api/artists/{id}/")
    public Artist retrieveArtistById(@PathVariable long id){
        return artistStorage.retrieveArtistById(id);
    }

    @PostMapping("/api/artists/add/")
    public Collection<Artist> addArtist(@RequestBody Artist artist){
        artistStorage.save(artist);
        return artistStorage.retrieveAllArtists();
    }

    @PatchMapping("/api/artists/{artistId}/addalbum/")
    public Artist addAlbumToArtist(@PathVariable long artistId, @RequestBody Album album){
        Artist artist = artistStorage.retrieveArtistById(artistId);
        Album albumToAdd = new Album(album.getAlbumTitle(), album.getRecordLabel(), album.getAlbumImage(), artist);
        albumStorage.save(albumToAdd);
        return albumToAdd.getArtist();
    }

    @DeleteMapping("/api/artists/{artistId}/")
    public Collection<Artist> deleteArtist(@PathVariable long artistId){
        artistStorage.delete(artistId);
        return artistStorage.retrieveAllArtists();
    }





}
