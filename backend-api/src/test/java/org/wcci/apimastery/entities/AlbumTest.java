package org.wcci.apimastery.entities;

import org.junit.jupiter.api.Test;
import org.wcci.apimastery.entities.Album;

public class AlbumTest {

    @Test
    public void albumShouldExist(){
        Album underTest = new Album("Abbey Road", "XYZ records", "image");
    }
}
