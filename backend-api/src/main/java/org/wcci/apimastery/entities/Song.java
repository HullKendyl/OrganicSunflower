package org.wcci.apimastery.entities;

public class Song {
    private  String songTitle;
    private  String songDuration;
    private String songLink;
    private String songImage;

    public Song(String songTitle, String songDuration, String songLink, String songImage) {
        this.songTitle = songTitle;
        this.songDuration = songDuration;
        this.songLink = songLink;
        this.songImage = songImage;
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
