package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите этаж");
        int floorCount = scanner.nextInt();
        if (floorCount >= 1 && floorCount <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (floorCount >= 5 && floorCount <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (floorCount >= 9) {
            System.out.println("Высокоэтажный");
        } else {
            System.out.println("Некорректный ввод");
        }
    }
}