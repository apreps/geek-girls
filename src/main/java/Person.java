public class Person {
    // Instance variables
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Methods
    public void sayHello() {
        System.out.println("Hello, my name is " + name);
    }

    public void sayAge() {
        System.out.println("I am " + age + " years old");
    }
}