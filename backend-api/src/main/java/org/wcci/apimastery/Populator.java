package org.wcci.apimastery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wcci.apimastery.entities.Album;
import org.wcci.apimastery.entities.Artist;
import org.wcci.apimastery.entities.Song;
import org.wcci.apimastery.storages.AlbumStorage;
import org.wcci.apimastery.storages.ArtistStorage;
import org.wcci.apimastery.storages.SongStorage;

@Component
public class Populator implements CommandLineRunner {

    @Autowired
    AlbumStorage albumStorage;
    @Autowired
    ArtistStorage artistStorage;
    @Autowired
    SongStorage songStorage;

    @Override
    public void run(String... args) throws Exception {
        Artist artist1 = new Artist("The Beatles", 8, "Polidor Records", "Liverpool, England", "https://i.pinimg.com/736x/4c/1b/24/4c1b241a248c7e881fd67bc355570aaf.jpg" );
        Artist artist2 = new Artist("The Black Keys", 19,  "Warner", "Akron, Ohio","https://images.sk-static.com/images/media/profile_images/artists/108359/huge_avatar");
        Artist artist3 = new Artist("Ed Sheeran", 14, "Gingerbread Man Records", "Framlingham, United Kingdom","https://thumbor.forbes.com/thumbor/fit-in/416x416/filters%3Aformat%28jpg%29/https%3A%2F%2Fspecials-images.forbesimg.com%2Fimageserve%2F5ed564163dbc9800060b2829%2F0x0.jpg%3Fbackground%3D000000%26cropX1%3D0%26cropX2%3D1080%26cropY1%3D0%26cropY2%3D1080");
        Artist artist4 = new Artist("Lady Gaga", 13, "Interscope Records", "New York City" , "https://upload.wikimedia.org/wikipedia/en/d/dd/Lady_Gaga_%E2%80%93_The_Fame_album_cover.png");
        Artist artist5 = new Artist("T.Wong", 33, "Independent", "Columbus,Ohio", "https://nataliescoalfiredpizza.com/wp-content/uploads/2018/09/40808585_2153004124773457_5214232572430647296_n.jpg");

        artistStorage.save(artist1);
        artistStorage.save(artist2);
        artistStorage.save(artist3);
        artistStorage.save(artist4);
        artistStorage.save(artist5);

        Album album1 = new Album("The Debut Album", "Atlantic", "https://bertiehorsfield.files.wordpress.com/2011/11/ed-sheeran-album-cover_499x4281.jpg", artist3);
        Album album2 = new Album("The Upside Down", "N/A", "https://www.columbusunderground.com/wp-content/uploads/2018/09/t.wong_.jpg", artist5);
        Album album3 = new Album("Abbey Road", "Apple Records", "https://d2s36jztkuk7aw.cloudfront.net/sites/default/files/tile/image/original_1.jpg", artist1);
        Album album4 = new Album("Yellow Submarine", "Apple Records", "https://d2s36jztkuk7aw.cloudfront.net/sites/default/files/styles/media_responsive_widest/public/tile/image/YellowSub.jpg?itok=EMK_FRld&timestamp=1373976663", artist1);
        Album album5 = new Album("Lonely Hearts", "Apple Records", "https://upload.wikimedia.org/wikipedia/en/5/50/Sgt._Pepper%27s_Lonely_Hearts_Club_Band.jpg", artist1);
        Album album6 = new Album("Let's Rock", "Easy Eye Records","https://upload.wikimedia.org/wikipedia/en/thumb/8/8e/The_Black_Keys_-_Let%27s_Rock.png/220px-The_Black_Keys_-_Let%27s_Rock.png",artist2);
        Album album7 = new Album("The Fame", "Record Plant","https://upload.wikimedia.org/wikipedia/en/d/dd/Lady_Gaga_%E2%80%93_The_Fame_album_cover.png", artist4);

        albumStorage.save(album1);
        albumStorage.save(album2);
        albumStorage.save(album3);
        albumStorage.save(album4);
        albumStorage.save(album5);
        albumStorage.save(album6);
        albumStorage.save(album7);

        Song song1 = new Song("Come Together","4:19","https://www.youtube.com/embed/jayz4tShUwU","https://d2s36jztkuk7aw.cloudfront.net/sites/default/files/tile/image/original_1.jpg", album3, artist1);
        Song song2 = new Song("The A Team", "4:49", "https://www.youtube.com/embed/WYABDdnBu0w", "https://bertiehorsfield.files.wordpress.com/2011/11/ed-sheeran-album-cover_499x4281.jpg", album1, artist3);
        Song song3 = new Song("Wild", "4:07", "https://www.youtube.com/embed/E9W0WwB_d1k","https://www.columbusunderground.com/wp-content/uploads/2018/09/t.wong_.jpg", album2, artist5);
        Song song4 = new Song("Drunk", "3:48", "https://www.youtube.com/embed/igurI9sHO14", "https://bertiehorsfield.files.wordpress.com/2011/11/ed-sheeran-album-cover_499x4281.jpg", album1, artist3);
        Song song5 = new Song("Lego House", "4:05", "https://www.youtube.com/embed/AlnZReStfKs", "https://bertiehorsfield.files.wordpress.com/2011/11/ed-sheeran-album-cover_499x4281.jpg", album1, artist3);
        Song song6 = new Song("Shine a Little Light", "3:17","https://www.youtube.com/embed/cCi6NL7z4_o" , "https://upload.wikimedia.org/wikipedia/en/thumb/8/8e/The_Black_Keys_-_Let%27s_Rock.png/220px-The_Black_Keys_-_Let%27s_Rock.png", album6, artist2);
        Song song7 = new Song("Eagle Birds", "2:41","https://www.youtube.com/embed/5xkK28u71-U", "https://upload.wikimedia.org/wikipedia/en/thumb/8/8e/The_Black_Keys_-_Let%27s_Rock.png/220px-The_Black_Keys_-_Let%27s_Rock.png", album6, artist2);
        Song song8 = new Song("Lo/Hi", "2:58","https://www.youtube.com/embed/JILfwu5AWIQ", "https://upload.wikimedia.org/wikipedia/en/thumb/8/8e/The_Black_Keys_-_Let%27s_Rock.png/220px-The_Black_Keys_-_Let%27s_Rock.png", album6, artist2);
        Song song9 = new Song ("Drugs", "5:15", "https://www.youtube.com/embed/j_HDCGq4DLg", "https://i.ytimg.com/vi/j_HDCGq4DLg/hqdefault.jpg?sqp=-oaymwEZCNACELwBSFXyq4qpAwsIARUAAIhCGAFwAQ==&rs=AOn4CLBm84u7chjZwh83a5PBcs8y1Wlx4A", album2 ,artist5);
        Song song10 = new Song("Doubt", "6:32", "https://www.youtube.com/embed/UDPEetr--uE","https://i.ytimg.com/vi/UDPEetr--uE/hqdefault.jpg?sqp=-oaymwEZCNACELwBSFXyq4qpAwsIARUAAIhCGAFwAQ==&rs=AOn4CLCjw5Aa-nIodU94aNCtheD_FScAAw", album2, artist5);
        Song song11 = new Song("Yellow Submarine","2:46","https://www.youtube.com/embed/m2uTFF_3MaA","https://meet.google.com/linkredirect?authuser=0&dest=https%3A%2F%2Fd2s36jztkuk7aw.cloudfront.net%2Fsites%2Fdefault%2Ffiles%2Fstyles%2Fmedia_responsive_widest%2Fpublic%2Ftile%2Fimage%2FYellowSub.jpg%3Fitok%3DEMK_FRld%26timestamp%3D1373976663", album4, artist1);
        Song song12 = new Song("Poker Face","3:33","https://www.youtube.com/embed/bESGLojNYSo", "https://meet.google.com/linkredirect?authuser=0&dest=https%3A%2F%2Fvignette.wikia.nocookie.net%2Fladygaga%2Fimages%2F7%2F75%2FTheFame.jpg%2Frevision%2Flatest%3Fcb%3D20110410191050", album7, artist4);
        Song song13 = new Song("All You Need Is Love","5:54","https://www.youtube.com/embed/_7xMfIp-irg","https://raw.githubusercontent.com/2020-Summer-Cohort/artists-albums-and-songs-codingforte/dev/frontend-spa/Images/YellowSubmarine.png?token=APP5FJWWRDNS6XJYQNBFZDK7BSOVE", album4, artist1);
        Song song14 = new Song("Just Dance","4:06","https://www.youtube.com/embed/2Abk1jAONjw", "https://meet.google.com/linkredirect?authuser=0&dest=https%3A%2F%2Fvignette.wikia.nocookie.net%2Fladygaga%2Fimages%2F7%2F75%2FTheFame.jpg%2Frevision%2Flatest%3Fcb%3D20110410191050", album7, artist4);
        Song song15 = new Song("Born This Way","7:19","https://www.youtube.com/embed/wV1FrqwZyKw", "https://meet.google.com/linkredirect?authuser=0&dest=https%3A%2F%2Fvignette.wikia.nocookie.net%2Fladygaga%2Fimages%2F7%2F75%2FTheFame.jpg%2Frevision%2Flatest%3Fcb%3D20110410191050", album7, artist4);
        Song song16 = new Song("Getting Better","2:48", "https://www.youtube.com/embed/EGlo9LzmOME", "https://meet.google.com/linkredirect?authuser=0&dest=https%3A%2F%2Fupload.wikimedia.org%2Fwikipedia%2Fen%2F5%2F50%2FSgt._Pepper%2527s_Lonely_Hearts_Club_Band.jpg", album5, artist1);
        Song song17 = new Song("I Want You","7:47","https://www.youtube.com/embed/tAe2Q_LhY8g","https://meet.google.com/linkredirect?authuser=0&dest=https%3A%2F%2Fd2s36jztkuk7aw.cloudfront.net%2Fsites%2Fdefault%2Ffiles%2Ftile%2Fimage%2Foriginal_1.jpg", album3, artist1);
        Song song18 = new Song("Strawberry Fields Forever","4:24", "https://www.youtube.com/embed/HtUH9z_Oey8", "https://meet.google.com/linkredirect?authuser=0&dest=https%3A%2F%2Fupload.wikimedia.org%2Fwikipedia%2Fen%2F5%2F50%2FSgt._Pepper%2527s_Lonely_Hearts_Club_Band.jpg", album5, artist1);

        songStorage.save(song1);
        songStorage.save(song2);
        songStorage.save(song3);
        songStorage.save(song4);
        songStorage.save(song5);
        songStorage.save(song6);
        songStorage.save(song7);
        songStorage.save(song8);
        songStorage.save(song9);
        songStorage.save(song10);
        songStorage.save(song11);
        songStorage.save(song12);
        songStorage.save(song13);
        songStorage.save(song14);
        songStorage.save(song15);
        songStorage.save(song16);
        songStorage.save(song17);
        songStorage.save(song18);
    }
}
