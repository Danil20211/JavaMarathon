package day334;

import java.util.HashSet;
import java.util.Set;

public class Test4 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        Set<Integer> set2 = new HashSet<>();
        set2.add(5);
        set2.add(6);
        set2.add(7);
        set2.add(1);

        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2); // объединение множеств
        System.out.println(union);

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2); // пересечение множеств
        System.out.println(intersection);

        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2); // разность множеств
        System.out.println(difference);

    }
}
