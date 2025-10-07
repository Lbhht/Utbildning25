package characters;

public abstract class Monster extends Character{

    protected Monster(String name) {
        super(name);
    }

    // Abstrakt metod
    public abstract void makeSound();
}
