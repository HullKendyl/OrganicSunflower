package org.wcci.apimastery.controllers;

import org.springframework.stereotype.Controller;
import org.wcci.apimastery.storage.AlbumStorage;
import org.wcci.apimastery.storage.ArtistStorage;

@Controller
public class ArtistController {
    private ArtistStorage artistStorage;
    private AlbumStorage albumStorage;

    public ArtistController(ArtistStorage artistStorage, AlbumStorage albumStorage) {
        this.artistStorage = artistStorage;
        this.albumStorage = albumStorage;
    }



}
