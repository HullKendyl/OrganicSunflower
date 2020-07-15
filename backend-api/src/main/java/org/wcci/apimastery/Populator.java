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
        Artist artist2 = new Artist("The Black Keys", 19,  "Warner", "Akron, Ohio","https://meet.google.com/linkredirect?authuser=0&dest=https%3A%2F%2Fmediad.publicbroadcasting.net%2Fp%2Fshared%2Fnpr%2Fstyles%2Fx_large%2Fnprshared%2F201908%2F736721375.jpg");
        Artist artist3 = new Artist("Ed Sheeran", 14, "Gingerbread Man Records", "Framlingham, United Kingdom","https://meet.google.com/linkredirect?authuser=0&dest=https%3A%2F%2Fraw.githubusercontent.com%2F2020-Summer-Cohort%2Fartists-albums-and-songs-codingforte%2Fdev%2Ffrontend-spa%2Fimages%2Fed-sheeran-2019-press.jpg%3Ftoken%3DAPP5FJXF47J4OBYIQGVW7WC7BR2I2" );
        Artist artist4 = new Artist("Lady Gaga", 13, "Interscope Records", "New York City" , "https://meet.google.com/linkredirect?authuser=0&dest=https%3A%2F%2Fraw.githubusercontent.com%2F2020-Summer-Cohort%2Fartists-albums-and-songs-codingforte%2Fdev%2Ffrontend-spa%2Fimages%2FLady%2520Gaga.jpg%3Ftoken%3DAPP5FJR2FRHPRQOS5CGJH227BR3CA");
        Artist artist5 = new Artist("T.Wong", 33, "Independent", "Columbus,Ohio", "https://files.slack.com/files-pri/T14LST83D-F01700AFVAN/t-wong-grungecake-thumbnail.png");

        artistStorage.save(artist1);
        artistStorage.save(artist2);
        artistStorage.save(artist3);
        artistStorage.save(artist4);
        artistStorage.save(artist5);

        Album album1 = new Album("The Debut Album", "Atlantic", "https://bertiehorsfield.files.wordpress.com/2011/11/ed-sheeran-album-cover_499x4281.jpg", artist3);
        Album album2 = new Album("The Upside Down", "N/A", "https://www.columbusunderground.com/wp-content/uploads/2018/09/t.wong_.jpg", artist5);
        Album album3 = new Album("Abbey Road", "Apple Records", "https://raw.githubusercontent.com/2020-Summer-Cohort/artists-albums-and-songs-codingforte/dev/frontend-spa/Images/AbbeyRoad.png?token=APQ4M7A3TH44ADAVHT4MV4K7BSORK", artist1);
        Album album4 = new Album("Yellow Submarine", "Apple Records", "https://raw.githubusercontent.com/2020-Summer-Cohort/artists-albums-and-songs-codingforte/dev/frontend-spa/Images/YellowSubmarine.png?token=APP5FJWWRDNS6XJYQNBFZDK7BSOVE", artist1);
        Album album5 = new Album("Lonely Hearts", "Apple Records", "https://raw.githubusercontent.com/2020-Summer-Cohort/artists-albums-and-songs-codingforte/dev/frontend-spa/Images/LoneyHearts.png?token=APP5FJQQTH6GXXGWJPKZJHK7BSOTE", artist1);
        Album album6 = new Album("Let's Rock", "Easy Eye Records","https://upload.wikimedia.org/wikipedia/en/thumb/8/8e/The_Black_Keys_-_Let%27s_Rock.png/220px-The_Black_Keys_-_Let%27s_Rock.png",artist2);
        Album album7 = new Album("The Fame", "Record Plant","https://raw.githubusercontent.com/2020-Summer-Cohort/artists-albums-and-songs-codingforte/dev/frontend-spa/Images/Ladygaga.jpg?token=APQ4M7EOIFEYCTATE6CXVVC7BSQPO", artist4);

        albumStorage.save(album1);
        albumStorage.save(album2);
        albumStorage.save(album3);
        albumStorage.save(album4);
        albumStorage.save(album5);
        albumStorage.save(album6);
        albumStorage.save(album7);

        Song song1 = new Song("Come Together","4:19","https://www.youtube.com/watch?v=45cYwDMibGo","https://raw.githubusercontent.com/2020-Summer-Cohort/artists-albums-and-songs-codingforte/dev/frontend-spa/Images/AbbeyRoad.png?token=APQ4M7A3TH44ADAVHT4MV4K7BSORK", album3);
        Song song2 = new Song("The A Team", "4:49", "https://www.youtube.com/watch?v=UAWcs5H-qgQ", "https://bertiehorsfield.files.wordpress.com/2011/11/ed-sheeran-album-cover_499x4281.jpg", album1);
        Song song3 = new Song("Wild", "4:07", "https://www.youtube.com/watch?v=E9W0WwB_d1k","https://www.columbusunderground.com/wp-content/uploads/2018/09/t.wong_.jpg", album2);
        Song song4 = new Song("Drunk", "3:48", "https://www.youtube.com/watch?v=G2fOum_KWQU", "https://bertiehorsfield.files.wordpress.com/2011/11/ed-sheeran-album-cover_499x4281.jpg", album1);
        Song song5 = new Song("Lego House", "4:05", "https://www.youtube.com/watch?v=c4BLVznuWnU", "https://bertiehorsfield.files.wordpress.com/2011/11/ed-sheeran-album-cover_499x4281.jpg", album1);
        Song song6 = new Song("Shine a Little Light", "3:17","https://www.youtube.com/watch?v=Jknn7MMszNo", "https://upload.wikimedia.org/wikipedia/en/thumb/8/8e/The_Black_Keys_-_Let%27s_Rock.png/220px-The_Black_Keys_-_Let%27s_Rock.png", album6);
        Song song7 = new Song("Eagle Birds", "2:41","https://www.youtube.com/watch?v=ImK1NHbrkxg", "https://upload.wikimedia.org/wikipedia/en/thumb/8/8e/The_Black_Keys_-_Let%27s_Rock.png/220px-The_Black_Keys_-_Let%27s_Rock.png", album6);
        Song song8 = new Song("Lo/Hi", "2:58","https://www.youtube.com/watch?v=JILfwu5AWIQ", "https://upload.wikimedia.org/wikipedia/en/thumb/8/8e/The_Black_Keys_-_Let%27s_Rock.png/220px-The_Black_Keys_-_Let%27s_Rock.png", album6);
        Song song9 = new Song ("Drugs", "5:15", "https://www.youtube.com/watch?v=j_HDCGq4DLg", "https://i.ytimg.com/vi/j_HDCGq4DLg/hqdefault.jpg?sqp=-oaymwEZCNACELwBSFXyq4qpAwsIARUAAIhCGAFwAQ==&rs=AOn4CLBm84u7chjZwh83a5PBcs8y1Wlx4A", album2);
        Song song10 = new Song("Doubt", "6:32", "https://www.youtube.com/watch?v=UDPEetr--uE","https://i.ytimg.com/vi/UDPEetr--uE/hqdefault.jpg?sqp=-oaymwEZCNACELwBSFXyq4qpAwsIARUAAIhCGAFwAQ==&rs=AOn4CLCjw5Aa-nIodU94aNCtheD_FScAAw", album2);
        Song song11 = new Song("Yellow Submarine","2:46","https://www.youtube.com/watch?v=m2uTFF_3MaA","https://raw.githubusercontent.com/2020-Summer-Cohort/artists-albums-and-songs-codingforte/dev/frontend-spa/Images/YellowSubmarine.png?token=APP5FJWWRDNS6XJYQNBFZDK7BSOVE", album4);
        Song song12 = new Song("Poker Face","3:33","https://meet.google.com/linkredirect?authuser=0&dest=https%3A%2F%2Fwww.youtube.com%2Fwatch%3Fv%3DbESGLojNYSo", "https://raw.githubusercontent.com/2020-Summer-Cohort/artists-albums-and-songs-codingforte/dev/frontend-spa/Images/Ladygaga.jpg?token=APQ4M7EOIFEYCTATE6CXVVC7BSQPO", album7);
        Song song13 = new Song("All You Need Is Love","5:54","https://www.youtube.com/watch?v=_7xMfIp-irg","https://raw.githubusercontent.com/2020-Summer-Cohort/artists-albums-and-songs-codingforte/dev/frontend-spa/Images/YellowSubmarine.png?token=APP5FJWWRDNS6XJYQNBFZDK7BSOVE", album4);
        Song song14 = new Song("Just Dance","4:06","https://www.youtube.com/watch?v=2Abk1jAONjw", "https://raw.githubusercontent.com/2020-Summer-Cohort/artists-albums-and-songs-codingforte/dev/frontend-spa/Images/Ladygaga.jpg?token=APQ4M7EOIFEYCTATE6CXVVC7BSQPO", album7);
        Song song15 = new Song("Born This Way","7:19","hhttps://meet.google.com/linkredirect?authuser=0&dest=https%3A%2F%2Fwww.youtube.com%2Fwatch%3Fv%3DwV1FrqwZyKw", "https://raw.githubusercontent.com/2020-Summer-Cohort/artists-albums-and-songs-codingforte/dev/frontend-spa/Images/Ladygaga.jpg?token=APQ4M7EOIFEYCTATE6CXVVC7BSQPO", album7);
        Song song16 = new Song("Getting Better","2:48", "https://www.youtube.com/watch?v=EGlo9LzmOME", "https://i.ytimg.com/vi/j_HDCGq4DLg/hqdefault.jpg?sqp=-oaymwEZCNACELwBSFXyq4qpAwsIARUAAIhCGAFwAQ==&rs=AOn4CLBm84u7chjZwh83a5PBcs8y1Wlx4A", album5);
        Song song17 = new Song("I Want You","7:47","https://meet.google.com/linkredirect?authuser=0&dest=https%3A%2F%2Fwww.youtube.com%2Fwatch%3Fv%3DtAe2Q_LhY8g","https://raw.githubusercontent.com/2020-Summer-Cohort/artists-albums-and-songs-codingforte/dev/frontend-spa/Images/AbbeyRoad.png?token=APQ4M7A3TH44ADAVHT4MV4K7BSORK", album3);
        Song song18 = new Song("Strawberry Fields Forever","4:24", "https://meet.google.com/linkredirect?authuser=0&dest=https%3A%2F%2Fwww.youtube.com%2Fwatch%3Fv%3DTHHZuwv18-0", "https://i.ytimg.com/vi/j_HDCGq4DLg/hqdefault.jpg?sqp=-oaymwEZCNACELwBSFXyq4qpAwsIARUAAIhCGAFwAQ==&rs=AOn4CLBm84u7chjZwh83a5PBcs8y1Wlx4A", album5);

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
