public class SimpleProject {
    public static void main(String[] args) {
        // Create an instance of the Person class
        Person person = new Person("John", 25);

        // Call the methods on the person object
        person.sayHello();
        person.sayAge();

        // Create an instance of the Car class
        Car car = new Car("Tesla", "Model S", "Red", 2019);

        // Call the methods on the car object
        car.start();
        car.accelerate();
        car.brake();
    }
}
