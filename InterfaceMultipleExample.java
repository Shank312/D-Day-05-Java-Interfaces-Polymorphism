
// Define the Flyable interface
interface Flyable {
    // Abstract method that any Flyable class must implement
    void fly();
}

// Define the Swimmable interface
interface Swimmable {
    // Abstract method that any Swimmable class must implement
    void swim();
}

// Duck implements both Flyable and Swimmable interfaces
class Duck implements Flyable, Swimmable {

    // Provide implementation of the fly() method from Flyable interface
    @Override
    public void fly() {
        System.out.println("Duck is flying.....");
    }

    // Provide implemenatation of swim method from Flyable interface
    @Override
    public void swim() {
        System.out.println("Duck is swimming.....");
    }

}

// Main class to test Duck behavior
public class InterfaceMultipleExample {
    public static void main(String[] args) {

        // Create a Duck object
        Duck duck = new Duck();
        duck.fly();                              // Output: Duck is flying.......
        duck.swim();                             // Output: Duck is swimming.....

        // Interface-based polymorphism examples 
        
        // Reference of type Flyable pointing to Duck object
        Flyable flyingDuck = new Duck();
        flyingDuck.fly();                        // Only fly() is accessible here
        
        // Reference of type Swimmable pointing to Duck object
        Swimmable swimmingDuck = new Duck();
        swimmingDuck.swim();                        // Only swim() is accessible here

    }
}


