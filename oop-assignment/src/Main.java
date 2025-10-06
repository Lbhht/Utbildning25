import characters.Hero;

public class Main {
    public static void main(String[] args) {
//        startGame();
        gameDemo();
    }

    private static void gameDemo() {
        characters.Hero char1 = new Hero("Arthur");
        char1.saySomething();
        System.out.println(char1.getHealth());
        System.out.println(char1.getName());
        char1.takeDamage(10);
    }
}