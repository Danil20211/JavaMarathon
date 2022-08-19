package day334;

import java.util.Stack;

public class Test8 {
    public static void main(String[] args) {
        Stack<Integer> integers = new Stack<>();
        integers.push(5);
        integers.push(3);
        integers.push(1);

        while (!integers.empty()) {
            System.out.println(integers.pop());
        }
    }
}
