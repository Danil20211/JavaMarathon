package day6;




public class Task1{

    public static void main(String[] args) {
        Car car = new Car();
        car.setAgeOut(12);
        car.setColour("black");
        car.setModel("bmw");
        car.info();
        System.out.println(car.yearDifference(90));
        Motorbike motorbike1 = new Motorbike(25,"black", "bmw");
        motorbike1.info();
        System.out.println(motorbike1.yearDifference(90));


        }
    }



