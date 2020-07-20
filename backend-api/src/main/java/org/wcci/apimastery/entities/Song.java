package org.wcci.apimastery.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Objects;

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
    @JsonIgnore
    @ManyToOne
    private Artist artist;

    public Song(String songTitle, String songDuration, String songLink, String songImage, Album album, Artist artist) {
        this.songTitle = songTitle;
        this.songDuration = songDuration;
        this.songLink = songLink;
        this.songImage = songImage;
        this.album = album;
        this.artist = artist;
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

    public Artist getArtist() {
        return artist;
    }

    public String getAlbumTitle() {return album.getAlbumTitle();}

    public String getArtistName() {return artist.getName();}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return id == song.id &&
                Objects.equals(songTitle, song.songTitle) &&
                Objects.equals(songDuration, song.songDuration) &&
                Objects.equals(songLink, song.songLink) &&
                Objects.equals(songImage, song.songImage) &&
                Objects.equals(album, song.album) &&
                Objects.equals(artist, song.artist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, songTitle, songDuration, songLink, songImage, album, artist);
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
                ", artist=" + artist +
                '}';
    }
}
