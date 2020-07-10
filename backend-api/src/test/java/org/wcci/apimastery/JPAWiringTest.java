package org.wcci.apimastery;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.wcci.apimastery.entities.Album;
import org.wcci.apimastery.entities.Artist;
import org.wcci.apimastery.repositories.AlbumRepository;
import org.wcci.apimastery.repositories.ArtistRepository;
import org.wcci.apimastery.repositories.SongRepository;

@DataJpaTest

public class JPAWiringTest {
    @Autowired
    private AlbumRepository albumRepo;

    @Autowired
    private ArtistRepository artistRepo;

    @Autowired
    private SongRepository songRepo;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void artistCanHaveMultipleAlbums() {
        Artist testArtist = new Artist("Kendyl", 21, "Trey Recording", "Table 3", "Picture of Claudia and Kenny rocking out");
        artistRepo.save(testArtist);

        Album testAlbum1 = new Album("WCCI Theme Song", "Trey Recording", "Picture of Claudia and Kenny rocking out", testArtist);
        albumRepo.save(testAlbum1);
        Album testAlbum2 = new Album("Table 3 Theme Song", "Kenny Recording", "Picture of Christin and Kendyl rocking out", testArtist);
        albumRepo.save(testAlbum2);


    }


}
