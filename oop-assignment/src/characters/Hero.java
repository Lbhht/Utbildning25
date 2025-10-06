package characters;

public class Hero extends Character{
    public Hero(String name) {
        super(name);
    }

    @Override
    public void saySomething() {
        System.out.println(name + " says something");
    }
}
