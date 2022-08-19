package day334;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test5 {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");
        animals.add("a");
        Collections.sort(animals, new StringLengthComparatable());
        System.out.println(animals);
    }
}
 class StringLengthComparatable implements Comparator<String> {

     @Override
     public int compare(String o1, String o2) {
         if (o1.length() > o2.length()) {
             return 1;
         } else if (o1.length() < o2.length()) {
             return -1;
         } else {
             return 0;
         }
     }
 }
