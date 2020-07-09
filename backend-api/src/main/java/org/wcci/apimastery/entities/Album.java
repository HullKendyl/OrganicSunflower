package org.wcci.apimastery.entities;

import java.util.Collection;

public class Album {
    private  String albumTitle;
    private  String recordLabel;
    private Collection<Song> songs;
    private String albumImage;

    public Album(String albumTitle, String recordLabel, String albumImage) {
        this.albumTitle = albumTitle;
        this.recordLabel = recordLabel;
        this.albumImage = albumImage;
    }

    public String getAlbumImage() {
        return albumImage;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public String getRecordLabel() {
        return recordLabel;
    }

    public Collection<Song> getSongs() {
        return songs;
    }
}
