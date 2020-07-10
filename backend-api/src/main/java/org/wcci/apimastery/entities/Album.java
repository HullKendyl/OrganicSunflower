package org.wcci.apimastery.entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Album {
    @Id
    @GeneratedValue
    private long id;
    private String albumTitle;
    private String recordLabel;
    private String albumImage;
    @ManyToOne
    private Artist artist;
    @OneToMany(mappedBy = "album")
    private Collection<Song> songs;

    protected Album() {
    }

    public Album(String albumTitle, String recordLabel, String albumImage, Artist artist) {
        this.albumTitle = albumTitle;
        this.recordLabel = recordLabel;
        this.albumImage = albumImage;
        this.artist = artist;
    }

    public Artist getArtist() {
        return artist;
    }

    public long getId() {
        return id;
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
