package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i<=30; i+=2){
            list.add(i);
        }
        for (int j = 300; j<=350; j+=2){
            list.add(j);
        }
        System.out.println(list);
    }
}
