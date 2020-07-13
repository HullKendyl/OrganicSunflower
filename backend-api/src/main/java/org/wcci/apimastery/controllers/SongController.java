package org.wcci.apimastery.controllers;

import org.springframework.stereotype.Controller;
import org.wcci.apimastery.storage.SongStorage;

@Controller
public class SongController {
    private SongStorage songStorage;

    public SongController(SongStorage songStorage) {

        this.songStorage = songStorage;
    }
}
