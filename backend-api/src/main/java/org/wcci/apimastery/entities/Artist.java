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

    @OneToMany(mappedBy = "artist")
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
}
