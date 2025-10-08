package characters;

public class Hero extends Character{
    private int level;
    private int currentExp;

    public Hero(String name) {
        super(name);
        this.level = 1;
        this.currentExp = 0;
    }

    @Override
    public void saySomething() {
        System.out.println("~~~~ " + name + " says something");
    }

    public int getLevel() {
        return level;
    }

    public int getCurrentExp() {
        return currentExp;
    }

    public void increaseLevel() {
        this.level++;
        System.out.println("Level up to level: " + getLevel());
        setHealth(20);
    }

    public void setCurrentExp(int expGain) {
        if (expGain == 0) {
            this.currentExp = 0;
        } else {
        this.currentExp += expGain;
        }
    }

    public void gainExp(int expGain) {
        // öka exp
        setCurrentExp(expGain);

        System.out.println("Exp increased by: " + expGain);

        if(currentExp > 100) {
            increaseLevel();
            setCurrentExp(0);
        }
    }
}
