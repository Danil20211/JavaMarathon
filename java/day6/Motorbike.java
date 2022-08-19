package day6;

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
    public void info() {
        System.out.println("это Motorbike");
    }
    int yearDifference(int inputYear) {
        return Math.abs(inputYear - year);
    }
}

