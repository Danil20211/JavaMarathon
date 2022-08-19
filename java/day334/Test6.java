package day334;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test6 {

    public static void main(String[] args) {
        List<Integer> animals = new ArrayList<>();
        animals.add(1);
        animals.add(100);
        animals.add(0);
        animals.add(18);
        Collections.sort(animals, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) {
                    return -1;
                } else if (o1 < o2) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(animals);
    }
}

