package day12.task4;

import day12.task3.MusicBand;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Silon");
        members1.add("Ferax");
        MusicBand band1 = new MusicBand("Beatles", 20, members1);
        List<String> members2 = new ArrayList<>();
        members2.add("Bob");
        members2.add("Nick");
        MusicBand band2 = new MusicBand("Stars", 22, members2);
        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1, band2);
        band1.printMembers();
        band2.printMembers();
    }
}
