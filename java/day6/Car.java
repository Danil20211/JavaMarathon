package day6;

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

    void info() {
        System.out.println("это авто");
    }
    int yearDifference(int inputYear)
    {
return Math.abs(inputYear - ageOut);
    }
}