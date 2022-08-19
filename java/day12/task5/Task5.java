package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Vasi", 26));
        members1.add(new MusicArtist("Misha", 30));
        MusicBand musicBand1 = new MusicBand("Beatles", 2000, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Bob", 25));
        members2.add(new MusicArtist("Nick", 19));
        MusicBand musicBand2 = new MusicBand("Baba", 1800, members2);
        musicBand1.printMembers();
        musicBand2.printMembers();
        MusicBand.transferMembers(musicBand1, musicBand2);
        musicBand1.printMembers();
        musicBand2.printMembers();

    }
}
