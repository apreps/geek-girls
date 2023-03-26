// Car class
public class Car {
    // Instance variables
    private String make;
    private String model;
    private String color;
    private int year;
    private boolean running;

    // Constructor
    public Car(String make, String model, String color, int year) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.running = false;
    }

    // Methods
    public void start() {
        System.out.println("Starting the " + make + " " + model);
        this.running = true;
    }

    public void accelerate() {
        if (this.running) {
            System.out.println("Accelerating the " + make + " " + model);
        } else {
            System.out.println("Cannot accelerate, the car is not running");
        }
    }

    public void brake() {
        if (this.running) {
            System.out.println("Applying the brakes to the " + make + " " + model);
        } else {
            System.out.println("Cannot brake, the car is not running");
        }
    }
}