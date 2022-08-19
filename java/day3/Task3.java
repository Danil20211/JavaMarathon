package day3;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int[] array = {1, 4, 6, 3, 8};

        System.out.println(Arrays.toString(array));

        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while (counter < 5) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();

            if (b==0) {
                System.out.println("Деление на ноль");
                continue;
            }
            System.out.println(a / b);
            counter++;
        }
    }
}
