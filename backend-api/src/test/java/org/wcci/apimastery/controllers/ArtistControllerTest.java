package org.wcci.apimastery.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;
import org.springframework.ui.Model;
import org.wcci.apimastery.storages.AlbumStorage;
import org.wcci.apimastery.storages.ArtistStorage;

import static org.mockito.Mockito.mock;

public class ArtistControllerTest {

    private ArtistStorage mockArtistStorage;
    private AlbumStorage mockAlbumStorage;
    private ArtistController underTest;
    private Model model;

    @BeforeEach
    void setUp(){
        mockArtistStorage = mock(ArtistStorage.class);
        mockAlbumStorage = mock(AlbumStorage.class);
        underTest = new ArtistController(mockArtistStorage, mockAlbumStorage);
        model = Mockito.mock(Model.class);
    }
}


