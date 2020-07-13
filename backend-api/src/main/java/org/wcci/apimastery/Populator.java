package org.wcci.apimastery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wcci.apimastery.entities.Artist;
import org.wcci.apimastery.storage.repositories.AlbumRepository;
import org.wcci.apimastery.storage.repositories.ArtistRepository;
import org.wcci.apimastery.storage.repositories.SongRepository;

@Component
public class Populator implements CommandLineRunner {

    @Autowired
    AlbumRepository albumRepo;
    @Autowired
    ArtistRepository artistRepo;
    @Autowired
    SongRepository songRepo;

    @Override
    public void run(String... args) throws Exception {
        Artist artist1 = new Artist("The Beatles", 8, "Polidor Records", "Liverpool, England", "https://i.pinimg.com/736x/4c/1b/24/4c1b241a248c7e881fd67bc355570aaf.jpg" );
        Artist artist2 = new Artist("The Black Keys", 19,  "Warner", "Akron, Ohio","https://meet.google.com/linkredirect?authuser=0&dest=https%3A%2F%2Fmediad.publicbroadcasting.net%2Fp%2Fshared%2Fnpr%2Fstyles%2Fx_large%2Fnprshared%2F201908%2F736721375.jpg");
        Artist artist3 = new Artist("Ed Sheeran", 14, "Gingerbread Man Records", "Framlingham, United Kingdom","https://meet.google.com/linkredirect?authuser=0&dest=https%3A%2F%2Fraw.githubusercontent.com%2F2020-Summer-Cohort%2Fartists-albums-and-songs-codingforte%2Fdev%2Ffrontend-spa%2Fimages%2Fed-sheeran-2019-press.jpg%3Ftoken%3DAPP5FJXF47J4OBYIQGVW7WC7BR2I2" );
        Artist artist4 = new Artist("Lady Gaga", 13, "Interscope Records", "New York City" , "https://meet.google.com/linkredirect?authuser=0&dest=https%3A%2F%2Fraw.githubusercontent.com%2F2020-Summer-Cohort%2Fartists-albums-and-songs-codingforte%2Fdev%2Ffrontend-spa%2Fimages%2FLady%2520Gaga.jpg%3Ftoken%3DAPP5FJR2FRHPRQOS5CGJH227BR3CA");
        Artist artist5 = new Artist("T.Wong", 33, "Independent", "Columbus,Ohio", "https://files.slack.com/files-pri/T14LST83D-F01700AFVAN/t-wong-grungecake-thumbnail.png");
    }


}
