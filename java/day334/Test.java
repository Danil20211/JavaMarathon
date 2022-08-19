package day334;

import java.util.Map;
import java.util.HashMap;
public class Test {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "один");
        map.put(2, "two");
        for(Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m.getKey() + m.getValue());
        }
    }
}
