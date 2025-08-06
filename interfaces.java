
// ------ Full Working Code -------

// Define Flyable interface with an abstract method fly()
interface Flyable {
    void fly();
}

// Define Swimmable interface with an abstract method swim()
interface Swimmable {
    void swim();

}

// Bird implements the Flyable interface, so it must define fly()
class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Bird is flying high!");
    }
}

// Fish implements Swimmable interface, so it must define swim()
class Fish implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Fish is swimming deep!");
    }
}

// Duck implements both Flyable and Swimmable interfaces
// This demonstrates multiple interface implementation in Java
class Duck implements Flyable, Swimmable {

    @Override
    public void fly() {
        System.out.println("Duck is flying......");

    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming......");
    }
} 

// Main class to test all implementations
public class interfaces {

    public static void main(String[] args) {

        // Interface-based polymorphism:
        // Flyable reference can point to any object of class that implements Flyable
        Flyable flyer = new Bird();                  // Bird object via Flyable reference
        Swimmable Swimmer = new Fish();              // Fish object via Swimmable reference

        // Create a Duck object (implements both interfaces)
        Duck duck = new Duck();

        // Call interface methods through their respective references
        flyer.fly();                                // Output: Bird is flying high!
        Swimmer.swim();                             // Output: Fish is swimming deep!

        // Call Duck's method directly 
        duck.fly();                                 // Output: Duck is flying......
        duck.swim();                                // Output: Duck is swimming.....

    }
}
