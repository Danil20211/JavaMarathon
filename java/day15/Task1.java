package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {


    public static void main(String[] args) {
        File file = new File("C:\\Users\\Роман\\Desktop\\aaaaaaaaaaaa\\[obuka.org]Доп материал\\JavaMarathon2020\\src\\main\\resources\\shoes.csv");
        try {
            Scanner scanner = new Scanner(file);
            File fileOut = new File("C:\\Users\\Роман\\Desktop\\aaaaaaaaaaaa\\[obuka.org]Доп материал\\JavaMarathon2020\\src\\main\\resources\\shoesPrint.txt");
            PrintWriter pw = new PrintWriter(fileOut);
            while (scanner.hasNextLine()) {
                String[] array = scanner.nextLine().split(";");
                if (Integer.parseInt(array[2]) == 0) {
                    pw.println(array[0] + ", " + array[1] + ", " + array[2]);
                }
            }
            pw.close();
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
