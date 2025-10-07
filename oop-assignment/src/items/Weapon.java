package items;

public class Weapon {
    private int damage;
    private String name;

    public Weapon(String name) {
        this.damage = 5;
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }
}
