package inheritance;

class Vehicle {
    String brand = "Toyota";

    void start() {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle {
    void playMusic() {
        System.out.println(brand + " car playing music");
    }
}

class Bike extends Vehicle {
    void doWheelie() {
        System.out.println(brand + " bike doing wheelie");
    }
}

class Truck extends Vehicle {
    void loadCargo() {
        System.out.println(brand + " truck loading cargo");
    }
}

public class hierarchicalinheritance {
    public static void main(String[] args) {
        Car c = new Car();
        Bike b = new Bike();
        Truck t = new Truck();

        c.start();       // Inherited
        c.playMusic();   // Own

        b.start();       // Inherited
        b.doWheelie();   // Own

        t.start();       // Inherited
        t.loadCargo();   // Own
    }
}
