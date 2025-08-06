
// Define an interface named Animal
interface Animal {
    // This is an abstract method. Any class implementing Animal must define this.
    void speak();
}

// Define a class Dog that implements the Animal interface
class Dog implements Animal {

    // Implement the speak() method for Dog
    @Override 
    public void speak() {
        System.out.println("Dog says: Woof!");
    }
}

// Define a class Cat that also implements the Animal interface
class Cat implements Animal {

    // Implement the speak() method for Cat
    @Override
    public void speak() {
        System.out.println("Cat says: Meow!");
    }
}

// Main class to test interface and polymorphism
public class InterfaceExample {

    public static void main(String[] args) {

        // Create a Dog object
        Dog dog = new Dog();
        dog.speak();                               // Output: Dog says: Woof!

        // Create a Cat object
        Cat cat = new Cat();
        cat.speak();                               // Output: Cat says: Meow!

        // Interface-based polymorphism;
        // Animal reference can point to any object that implements Animal
        Animal a1 = new Dog();                     // Refernce of type Animal, object of Dog
        Animal a2 = new Cat();                     // Refernce of type Animal, object of Cat

        // Call the overridden methods through interface references;
        a1.speak();                               // Output: Dog says: Woof!
        a2.speak();                               // Output: Cat says: Meow!
    }
}