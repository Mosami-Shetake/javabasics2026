// Parent class
class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating");
    }
}

// Child class
class Dog extends Animal {
    void bark() {
        System.out.println(name + " is barking");
    }
}

// Main class
public class ExtendsDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.name = "Tommy";    // Inherited from Animal
        d.eat();             // Inherited method
        d.bark();            // Own method
    }
}