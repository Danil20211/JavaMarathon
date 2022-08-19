package day334;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test2 {
    public static void main(String[] args){
        Map<Integer, String> hashMap = new HashMap<>(); //не гарантирует порядок
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>(); // в каком порядке ключ-значение добавили в том и будут
        Map<Integer,String> treeMap = new TreeMap<>();
        //гарантирует что пары будут отсортированы по ключу
        testMap(treeMap);
    }
    public static void testMap(Map<Integer, String> map) {
        map.put(20, "Bob");
        map.put(35, "Tom");
        map.put(40, "Mike");
        map.put(25, "Bob");
        for (Map.Entry<Integer, String> m: map.entrySet()) {
            System.out.println(m.getKey() + " : " + m.getValue());
        }
    }
}
