package org.wcci.apimastery.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;
import org.springframework.ui.Model;
import org.wcci.apimastery.storages.AlbumStorage;
import org.wcci.apimastery.storages.ArtistStorage;
import org.wcci.apimastery.storages.SongStorage;

import static org.mockito.Mockito.mock;

public class AlbumControllerTest {

    private AlbumStorage mockAlbumStorage;
    private AlbumController underTest;
    private Model model;
    private SongStorage mockSongStorage;
    private ArtistStorage mockArtistStorage;

    @BeforeEach
    void setUp() {
        mockAlbumStorage = mock(AlbumStorage.class);
        mockSongStorage = mock(SongStorage.class);
        mockArtistStorage = mock(ArtistStorage.class);
        underTest = new AlbumController(mockAlbumStorage, mockSongStorage, mockArtistStorage);
        model = Mockito.mock(Model.class);
    }


}
