package org.wcci.apimastery.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
    @JsonIgnore
    @ManyToOne
    private Artist artist;
    @OneToMany(mappedBy = "album", orphanRemoval = true)
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

    public String getArtistName() {return artist.getName();}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Album album = (Album) o;

        if (id != album.id) return false;
        if (albumTitle != null ? !albumTitle.equals(album.albumTitle) : album.albumTitle != null) return false;
        if (recordLabel != null ? !recordLabel.equals(album.recordLabel) : album.recordLabel != null) return false;
        if (albumImage != null ? !albumImage.equals(album.albumImage) : album.albumImage != null) return false;
        return artist != null ? artist.equals(album.artist) : album.artist == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (albumTitle != null ? albumTitle.hashCode() : 0);
        result = 31 * result + (recordLabel != null ? recordLabel.hashCode() : 0);
        result = 31 * result + (albumImage != null ? albumImage.hashCode() : 0);
        result = 31 * result + (artist != null ? artist.hashCode() : 0);
        return result;


    }

    @Override
    public String toString() {
        return "Album{" +
                "id=" + id +
                ", albumTitle='" + albumTitle + '\'' +
                ", recordLabel='" + recordLabel + '\'' +
                ", albumImage='" + albumImage + '\'' +
                ", artist=" + artist +
                '}';
    }
}
