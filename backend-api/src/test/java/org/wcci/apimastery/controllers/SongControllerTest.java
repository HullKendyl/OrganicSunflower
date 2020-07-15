package org.wcci.apimastery.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;
import org.springframework.ui.Model;
import org.wcci.apimastery.storages.SongStorage;

import static org.mockito.Mockito.mock;

public class SongControllerTest {

    private SongStorage mockSongStorage;
    private SongController underTest;
    private Model model;

    @BeforeEach
    void setUp(){
        mockSongStorage = mock(SongStorage.class);
        underTest = new SongController(mockSongStorage);
        model = Mockito.mock(Model.class);
    }

}
