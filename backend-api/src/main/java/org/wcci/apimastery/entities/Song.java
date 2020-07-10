package org.wcci.apimastery.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Song {
    @Id
    @GeneratedValue
    private long id;
    private String songTitle;
    private String songDuration;
    private String songLink;
    private String songImage;
    @ManyToOne
    private Album album;

    public Song(String songTitle, String songDuration, String songLink, String songImage, Album album) {
        this.songTitle = songTitle;
        this.songDuration = songDuration;
        this.songLink = songLink;
        this.songImage = songImage;
        this.album = album;
    }

    protected Song() {
    }

    public long getId() {
        return id;
    }

    public Album getAlbum() {
        return album;
    }

    public String getSongImage() {
        return songImage;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public String getSongDuration() {
        return songDuration;
    }

    public String getSongLink() {
        return songLink;
    }
}
