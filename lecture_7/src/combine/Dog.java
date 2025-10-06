package combine;

public class Dog extends Animal{
    public Dog(String dog) {
        super(dog);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " barks");
    }
}
