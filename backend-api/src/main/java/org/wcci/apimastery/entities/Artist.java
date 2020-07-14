package org.wcci.apimastery.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class Artist {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private int age;
    private String recordLabel;
    private String homeTown;
    private String artistImage;

    @OneToMany(mappedBy = "artist", orphanRemoval = true)
    private Collection<Album> albums;

    protected Artist() {
    }

    public Artist(String name, int age, String recordLabel, String homeTown, String artistImage) {
        this.name = name;
        this.age = age;
        this.recordLabel = recordLabel;
        this.homeTown = homeTown;
        this.artistImage = artistImage;
    }

    public long getId() {
        return id;
    }

    public String getArtistImage() {
        return artistImage;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRecordLabel() {
        return recordLabel;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public Collection<Album> getAlbums() {
        return albums;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Artist artist = (Artist) o;

        if (id != artist.id) return false;
        if (age != artist.age) return false;
        if (name != null ? !name.equals(artist.name) : artist.name != null) return false;
        if (recordLabel != null ? !recordLabel.equals(artist.recordLabel) : artist.recordLabel != null) return false;
        if (homeTown != null ? !homeTown.equals(artist.homeTown) : artist.homeTown != null) return false;
        return artistImage != null ? artistImage.equals(artist.artistImage) : artist.artistImage == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (recordLabel != null ? recordLabel.hashCode() : 0);
        result = 31 * result + (homeTown != null ? homeTown.hashCode() : 0);
        result = 31 * result + (artistImage != null ? artistImage.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", recordLabel='" + recordLabel + '\'' +
                ", homeTown='" + homeTown + '\'' +
                ", artistImage='" + artistImage + '\'' +
                '}';
    }
}
