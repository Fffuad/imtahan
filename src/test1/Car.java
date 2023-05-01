package test1;

public class Car extends Wehicle{
    private String bodyStyle;

    public Car(String make, String colour, int year, String model) {
        super(make, colour, year, model);
    }

    public void carDetail(){
        System.out.println("Fast car");

    }

    public Car(String make, String colour, int year, String model, String bodyStyle) {
        super(make, colour, year, model);
        this.bodyStyle = bodyStyle;
    }

    public Car(String bodyStyle) {
        this.bodyStyle = bodyStyle;
    }

    public String getBodyStyle() {
        return bodyStyle;
    }

    public void setBodyStyle(String bodyStyle) {
        this.bodyStyle = bodyStyle;
    }

    @Override
    public String toString() {
        return "Car{" +
                "bodyStyle='" + bodyStyle + '\'' +
                '}';
    }
}
