package characters;

public abstract class Character {
    // Protected istället för private för att kunna använda i Hero klassen.
    protected String name;
    private int health;

    public Character(String name) {
        this.name = "placeholder";
        this.health = 100;
    }

    // Abstrakt metod
    public abstract void saySomething();

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int healthIncrease) {
        this.health = getHealth() + healthIncrease;
    }

    public boolean state() {
        return health > 0;
    }

    public void status() {
        System.out.println(name + "'s health is " + health);
    }

    public void takeDamage(int damage) {
        health -= damage;
        if(state()) {
            System.out.println(name + " took " + damage + " damage, " + health + " health left.");
        } else {
            health = 0;
        }
    }

    public void attack(int amount) {
        if(state()) {
            //target.health -= amount;
            System.out.println(name + " attacks " + " and makes " + amount + " damage");
        } else {
            System.out.println(name + " cant attack.");
        }
    }
}
