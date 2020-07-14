package org.wcci.apimastery.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
    @JsonIgnore
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Song song = (Song) o;

        if (id != song.id) return false;
        if (songTitle != null ? !songTitle.equals(song.songTitle) : song.songTitle != null) return false;
        if (songDuration != null ? !songDuration.equals(song.songDuration) : song.songDuration != null) return false;
        if (songLink != null ? !songLink.equals(song.songLink) : song.songLink != null) return false;
        if (songImage != null ? !songImage.equals(song.songImage) : song.songImage != null) return false;
        return album != null ? album.equals(song.album) : song.album == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (songTitle != null ? songTitle.hashCode() : 0);
        result = 31 * result + (songDuration != null ? songDuration.hashCode() : 0);
        result = 31 * result + (songLink != null ? songLink.hashCode() : 0);
        result = 31 * result + (songImage != null ? songImage.hashCode() : 0);
        result = 31 * result + (album != null ? album.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", songTitle='" + songTitle + '\'' +
                ", songDuration='" + songDuration + '\'' +
                ", songLink='" + songLink + '\'' +
                ", songImage='" + songImage + '\'' +
                ", album=" + album +
                '}';
    }
}
