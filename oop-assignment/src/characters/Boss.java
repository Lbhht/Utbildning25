package characters;

public class Boss extends Monster{
    private int specialAttack;

    public Boss(String name, int specialAttack) {
        super(name);
        this.specialAttack = 2;
    }

    @Override
    public void saySomething() {
        System.out.println(name + " says something");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " makes a sound");
    }

    public void bossAttack(int amount){
        if(state()) {
            System.out.println("&&&&&&&&&&&&&&& "+ name + " does a special attack and makes " + amount * specialAttack + " damage &&&&&&&&&&&&&&&");
        } else {
            System.out.println(name + " cant attack.");
        }
    }
}
