package org.wcci.apimastery.entities;

import org.junit.jupiter.api.Test;
import org.wcci.apimastery.entities.Song;

public class SongTest {

    @Test
    public void songShouldExist(){
        Song underTest = new Song("Come Together", "3:49", "www.youtube.com", "image");
    }
}
