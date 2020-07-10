package org.wcci.apimastery.entities;

import org.junit.jupiter.api.Test;
import org.wcci.apimastery.entities.Song;

public class SongTest {

    @Test
    public void songShouldExist(){
        Artist testArtist = new Artist("Name", 22, "Record Label", "Hometown", " ArtistImage" );
        Album testAlbum = new Album("Album", "Artist", "AlbumImage", testArtist);
        Song underTest = new Song("Come Together", "3:49", "www.youtube.com", "image", testAlbum);
    }
}
