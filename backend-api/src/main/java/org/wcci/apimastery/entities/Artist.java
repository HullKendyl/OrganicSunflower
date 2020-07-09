package org.wcci.apimastery.entities;

import java.util.Collection;

public class Artist {
    private String name;
    private int age;
    private String recordLabel;
    private String homeTown;
    private Collection<Album> albums;
    private String artistImage;

    public Artist(String name, int age, String recordLabel, String homeTown, String artistImage) {
        this.name = name;
        this.age = age;
        this.recordLabel = recordLabel;
        this.homeTown = homeTown;
        this.artistImage = artistImage;
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
