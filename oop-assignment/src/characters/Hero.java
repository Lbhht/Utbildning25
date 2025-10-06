package characters;

public class Hero extends Character{
    int level;
    int currentExp;

    public Hero(String name) {
        super(name);
        this.level = 1;
        this.currentExp = 0;
    }

    @Override
    public void saySomething() {
        System.out.println(name + " says something");
    }

    public void gainExp() {

    }
}
