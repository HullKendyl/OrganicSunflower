package org.wcci.apimastery.entities;

import org.junit.jupiter.api.Test;

public class AlbumTest {

    @Test
    public void albumShouldExist(){
        Artist testArtist   = new Artist("Name", 22, "Record Label", "Hometown", " ArtistImage");
        Album underTest = new Album("Abbey Road", "XYZ records", "image", testArtist);
    }
}
