package org.wcci.apimastery.entities;

import org.junit.jupiter.api.Test;
import org.wcci.apimastery.entities.Artist;

public class ArtistTest {

    @Test
    public void artistShouldExist(){
        Artist underTest = new Artist("The Beatles", 8, "XYZ Records", "Liverpool, UK","image");
    }
}
