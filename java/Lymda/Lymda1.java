package Lymda;

import java.util.*;
import java.util.stream.Collectors;

public class Lymda1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int[] arr = new int[10];
        fillList(list);
        fillArr(arr);
//        System.out.println(list);
//        System.out.println(Arrays.toString(arr));
//      for (int i=0; i<10;i++) {
//            arr[i]=arr[i]*2;
//           list.set(i, list.get(i)*2);
//   }
//        arr = Arrays.stream(arr).map(a -> a * 2).toArray();
//        list = list.stream().map(a -> a * 2).collect(Collectors.toList());
//        arr = Arrays.stream(arr).map(a -> 3).toArray();
//        arr = Arrays.stream(arr).map(a -> a + 1).toArray();
//
//        System.out.println(list);
//        System.out.println(Arrays.toString(arr));
        List<Integer> list2 = new ArrayList<>();
        int[] arr2 = new int[10];

        fillList(list2);
        fillArr(arr2);

//        arr2 = Arrays.stream(arr2).filter(a -> a % 2 == 0).toArray();
//        System.out.println(Arrays.toString(arr2));
//        list2 = list2.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());
//        System.out.println(list2);
//
//        Arrays.stream(arr2).forEach(System.out::println);
//        list2.stream().forEach(a -> System.out.println(a));

//        int sum = Arrays.stream(arr2).reduce((acc, b) -> acc + b).getAsInt();
//        System.out.println(sum);
//        int sum2 = list2.stream().reduce((acc, b) -> acc * b).get();
//        System.out.println(sum2);

        arr2 = Arrays.stream(arr2).filter(a -> a % 2 != 0).map(a -> a * 2).toArray();
        System.out.println(Arrays.toString(arr2));

        Set<Integer> set =new HashSet<>();
        set.add(1);
        set.add(3);
        System.out.println(set);
        set=set.stream().map(a->a*2).collect(Collectors.toSet());
        System.out.println(set);

    }

    private static void fillArr(int[] arr) {
        for (int i = 0; i < 10; i++)
            arr[i] = i + 1;
    }

    private static void fillList(List<Integer> list) {
        for (int i = 0; i < 10; i++)
            list.add(i + 1);
    }
}
