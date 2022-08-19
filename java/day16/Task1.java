package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        File file = new File("Task16");
        try {
            Scanner scanner = new Scanner(file);
            String[] array = scanner.nextLine().split(" ");
            int sum = 0;
            for (String x : array) {
                sum += Integer.parseInt(x);
            }
            double average = sum / (double) array.length;
            System.out.printf(average + "--> %.3f", average);

        } catch (FileNotFoundException e) {
            System.out.println("Fail is not found");
            ;
        }

    }

}

