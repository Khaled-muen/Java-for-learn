public class Car {

    // fields or attribute
    // encapsulation that mean save the data from access
    private int speed;
    private String color;
    private String model;
    private boolean isHatchBack;
    // defualt constructor

    public Car() {
    }

    public Car(boolean isHatchBack, int speed) {
        this.isHatchBack = isHatchBack;
        this.speed = speed;
    }

    public Car(String model) {
        this.model = model;
    }

    public Car(int speed, String model) {
        this.speed = speed;
        this.model = model;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isIsHatchBack() {
        return this.isHatchBack;
    }

    public boolean getIsHatchBack() {
        return this.isHatchBack;
    }

    public void setIsHatchBack(boolean isHatchBack) {
        this.isHatchBack = isHatchBack;
    }

    public void print() {
        System.out.println(model);
        System.out.println(speed);
    }

    // behavior , methods or functions
    public void turnOn() {
        System.out.println("the car turned on");
    }

    public void turnoff() {
        System.out.println("the car turned off");
    }

    public void brake() {
        System.out.println("brake");
    }

}
