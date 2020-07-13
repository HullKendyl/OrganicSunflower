package org.wcci.apimastery.controllers;

import org.springframework.stereotype.Controller;
import org.wcci.apimastery.storage.AlbumStorage;

@Controller
public class AlbumController {
    private AlbumStorage albumStorage;

    public AlbumController(AlbumStorage albumStorage) {

        this.albumStorage = albumStorage;
    }
}
