package characters;

public abstract class Monster extends Character{

    public Monster(String name) {
        super(name);
    }

    public abstract void makeSound();
}
