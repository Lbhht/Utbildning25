import inheritence.Animal;
import inheritence.Dog;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome");
//        inheritenceDemo();
//        polymorfismDemo();
//        abstractionDemo();
//        interfaceDemo();
        combineDemo();
    }

    private static void combineDemo() {
        combine.Animal dog = new combine.Dog("Laban");
        combine.Animal cat = new combine.Cat("Katten");

        // Polymorfiskt anrop
        dog.makeSound();
        cat.makeSound();

        // Metodanrop till basklassen
        dog.sleep();
        cat.sleep();
    }

    private static void interfaceDemo() {
        interfaces.Car car = new interfaces.Car();
        car.move();
    }

    private static void abstractionDemo() {
        System.out.println("Abstraction");

//        abstraction.Animal animal = new Animal();   // Abstrakt klass får/kan inte instansieras
        abstraction.Dog dog = new abstraction.Dog();
        dog.sleep();
        dog.makeSound();

    }

    private static void polymorfismDemo() {
        polymorfism.Animal animal = new polymorfism.Animal();
        animal.sound();
        animal.eat();

        polymorfism.Dog dog = new polymorfism.Dog();
        dog.sound();
        dog.eat();

        polymorfism.Cat cat = new polymorfism.Cat();
        cat.sound();
        cat.eat();

        // Math
        polymorfism.MathOperations mathOperations = new polymorfism.MathOperations();
        int sum1 = mathOperations.add(3, 5);
        System.out.println("Int sum = " + sum1);

        double sum2 = mathOperations.add(3, 5);
        System.out.println("Double sum = " + sum2);
    }

    public static void inheritenceDemo() {
        System.out.println("Inheritence / Arv");

        Animal animal = new Animal();
        animal.name = "Katten";
        animal.age = 5;
        animal.eat();
        animal.info();

        Dog dog = new Dog();
        dog.name = "Fido";
        dog.age = 2;

        dog.eat();
        dog.info();
        dog.bark();
    }
}