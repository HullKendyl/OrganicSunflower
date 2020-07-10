package org.wcci.apimastery.entities;

import org.junit.jupiter.api.Test;

public class AlbumTest {

    @Test
    public void albumShouldExist(){
        Album underTest = new Album("Abbey Road", "XYZ records", "image", testArtist);
    }
}
