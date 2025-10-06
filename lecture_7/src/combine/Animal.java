package combine;

public abstract class Animal {
    String name;

    // Constructor
    Animal(String name) {
        this.name = name;
    }

    // Abstract metod
    public abstract void makeSound();

    // Icke abstrakt metod == konkret metod
    public void sleep() {
        System.out.println(name + " is sleeping");
    }
}
