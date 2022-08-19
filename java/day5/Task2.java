package day5;

public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike1 = new Motorbike(25,"black", "bmw");
        System.out.println(motorbike1.getYear() + "\n" + motorbike1.getColour() + "\n" +  motorbike1.getModel());
    }
}

    class Motorbike {
        private int year;
        private String colour;
        private String model;

        public Motorbike(int year, String colour, String model) {
            this.year = year;
            this.colour = colour;
            this.model = model;
        }

        public int getYear() {
            return year;
        }

        public String getColour() {
            return colour;
        }

        public String getModel() {
            return model;
        }


    }

