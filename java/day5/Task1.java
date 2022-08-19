package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setAgeOut(12);
        car.setColour("black");
        car.setModel("bmw");
        System.out.println("Машина " + car.getModel() + "возраст " + car.getAgeOut() + "цвет" + car.getColour());

    }
}
    class Car {
    private int ageOut;
    public void setAgeOut(int userAgeOut) {
        ageOut = userAgeOut;
    }
    public int getAgeOut() {
        return ageOut;
    }

    private String colour;

    private String model;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}