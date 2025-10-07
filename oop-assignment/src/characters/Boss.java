package characters;

public class Boss extends Monster{
    private int specialAttack;

    public Boss(String name, int specialAttack) {
        super(name);
        this.specialAttack = 30;
    }

    @Override
    public void saySomething() {
        System.out.println(name + " says something");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " makes a sound");
    }

    public void bossAttack(){
        roll = Math.round(Math.random() * 100);
        if(roll > 0 || roll <= 30) {
            //Special attack
        } else {
            // vanlig attack
        }
    }
}
