package characters;

public class Orc extends Monster{
    public Orc(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Orc makes a sound");
    }

    @Override
    public void saySomething() {
        System.out.println("Orc says something");
    }
}
