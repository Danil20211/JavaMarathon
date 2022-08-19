package day334;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test3 {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeHashSet =new TreeSet<>();
        linkedHashSet.add("Mike");
        hashSet.add("Bob");
        linkedHashSet.add("Donald");
        linkedHashSet.add("nike");
        for(String name: linkedHashSet) {
            System.out.println(name);
        }
        System.out.println(hashSet.contains("Bob"));
    }
}
