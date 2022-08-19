package day11;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Courier courier = new Courier(warehouse);
        Picker picker = new Picker(warehouse);
        System.out.println(warehouse + " " + courier + " " + picker);
        picker.doWork();
        courier.doWork();
        System.out.println(warehouse + " " + courier + " " + picker);
        for (int i = 1; i <= 1500; i++) {
            picker.doWork();
            courier.doWork();
        }
        picker.bonus();
        courier.bonus();
        System.out.println(warehouse + " " + courier + " " + picker);
    }
}
