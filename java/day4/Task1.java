package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int arrayLength = scanner.nextInt();

        Random random = new Random();
        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i++)
        array[i] = random.nextInt(10);
        System.out.println(Arrays.toString(array));
        System.out.println(arrayLength);
        int counter8 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 8)
            counter8++;
        }
        System.out.println(counter8);
        int counter1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1)
                counter1++;
        }
            System.out.println(counter1);

        int counterEven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                counterEven++;
        }
        System.out.println(counterEven);

        int counterOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0)
                counterOdd++;
        }
        System.out.println(counterOdd);

        int sum = 0;
        for (int i = 0; i < array.length; i++)
            sum += array[i];

        System.out.println(sum);
    }
}



