
// Define an interface named Flyable
interface Flyable {
    // Abstract method to be implemented by any class that is Flyable
    void fly();

}

// Define an interface named Swimmable 
interface Swimmable {
    // Abstract method to be implemented by any class that is Swimmable 
    void swim();

}

// Class Bird implements the Flyable interface
class Bird implements Flyable {

    // The Bird class must implements the fly() method declared in Flyable
    @Override
    public void fly() {
        System.out.println("Bird is flying high!");
    }
} 

// Class Fish implements the Swimmable interface
class Fish implements Swimmable {

    // The Fish class must implemet the swim() method declared in Swimmable
    @Override
    public void swim() {
        System.out.println("Fish is swimming deep!");
    }
}

// Main class to test our interfaces and their implementations
public class InterfaceDemo {
    
    public static void main(String[] args) {

        // Create an object of Bird 
        Bird bird = new Bird();
        bird.fly();                           // Output: Bird is flying high!

        // Create an object of Fish
        Fish fish = new Fish();
        fish.swim();                         // Output: Fish is swimming deep!

        // Example of interface-based polymorphism
        Flyable myFlyer = new Bird();         // Interface reference pointing to Bird object
        myFlyer.fly();                        // Polymorphic call - resolves to Bird's fly()

        Swimmable mySwimmer = new Fish();     // Interface reference pointing to Fish object
        mySwimmer.swim();                     // Polymorphic call - resolves to Fish's swim()

    }
}
