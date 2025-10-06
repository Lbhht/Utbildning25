package polymorfism;

public class Cat extends Animal{
    // Metodöverskuggning - Override
    @Override
    public void sound() {
        System.out.println("Cat mewos");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats");
    }
}
