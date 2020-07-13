package org.wcci.apimastery.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;
import org.springframework.ui.Model;
import org.wcci.apimastery.storage.AlbumStorage;

import static org.mockito.Mockito.mock;

public class AlbumControllerTest {

    private AlbumStorage mockAlbumStorage;
    private AlbumController underTest;
    private Model model;

    @BeforeEach
    void setUp(){
        mockAlbumStorage = mock(AlbumStorage.class);
        underTest = new AlbumController(mockAlbumStorage);
        model = Mockito.mock(Model.class);

    }

}
