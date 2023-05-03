// Car class
public class Car {
    // Instance variables
    private String brand;
    private String model;
    private String color;
    private int year;
    private boolean running;

    // Constructor
    public Car(String brand, String model, String color, int year) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.running = false;
    }

    // Methods
    public void start() {
        System.out.println("Welcome, starting the " + brand + " " + model);
        this.running = true;
    }

    public void accelerate() {
        if (this.running) {
            System.out.println("Accelerating the " + brand + " " + model);
        } else {
            System.out.println("Cannot accelerate, the car is not running");
        }
    }

    public void brake() {
        if (this.running) {
            System.out.println("Applying the brakes to the " + brand + " " + model);
        } else {
            System.out.println("Cannot brake, the car is not running");
        }
    }
}