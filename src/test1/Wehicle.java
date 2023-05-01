package test1;

public class Wehicle {
    private String make;
    private String colour;
    private int year;
    private String model;
    public void printDetail(){
        System.out.println("anyway");
    }

    public Wehicle(String make, String colour, int year, String model) {
        this.make = make;
        this.colour = colour;
        this.year = year;
        this.model = model;
    }

    private void printDetails(){

    }

    public Wehicle() {
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Wehicle{" +
                "make='" + make + '\'' +
                ", colour='" + colour + '\'' +
                ", year=" + year +
                ", model='" + model + '\'' +
                '}';
    }
}
