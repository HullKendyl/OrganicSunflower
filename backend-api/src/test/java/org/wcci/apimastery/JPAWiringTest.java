package org.wcci.apimastery;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.wcci.apimastery.entities.Album;
import org.wcci.apimastery.entities.Artist;
import org.wcci.apimastery.entities.Song;
import org.wcci.apimastery.storages.repositories.AlbumRepository;
import org.wcci.apimastery.storages.repositories.ArtistRepository;
import org.wcci.apimastery.storages.repositories.SongRepository;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

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

        entityManager.flush();
        entityManager.clear();

        Optional<Artist> retrievedArtistOptional = artistRepo.findById(testArtist.getId());
        Artist retrievedArtist = retrievedArtistOptional.get();
        assertThat(retrievedArtist).isEqualTo(testArtist);
        assertThat(retrievedArtist.getAlbums()).containsExactlyInAnyOrder(testAlbum1, testAlbum2);
        }

        @Test
        public void albumShouldHaveMultipleSongs(){
        Artist testArtist = new Artist("Kendyl", 21, "Trey Recording", "Table 3", "Picture of Claudia and Kenny rocking out");
        artistRepo.save(testArtist);

        Album testAlbum = new Album("Album Title", "Record Label", "Album Image", testArtist);
        albumRepo.save(testAlbum);

        Song testSong1 = new Song("title", "Song Duration", "song link", "song image", testAlbum, testArtist);
        songRepo.save(testSong1);
        Song testSong2 = new Song("title", "Song Duration", "song link", "song image", testAlbum, testArtist);
        songRepo.save(testSong2);

        entityManager.flush();
        entityManager.clear();

        Album retrievedAlbum=albumRepo.findById(testAlbum.getId()).get();
        assertThat(retrievedAlbum).isEqualTo(testAlbum);
        assertThat(retrievedAlbum.getSongs()).containsExactlyInAnyOrder(testSong1, testSong2);

    }

    }



