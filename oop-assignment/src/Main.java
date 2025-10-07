import characters.Boss;
import characters.Hero;
import characters.Orc;
import game.GameRunning;

public class Main {
    public static void main(String[] args) {
        startGame();
    }

    private static void startGame() {
        // Skapa characters
        characters.Hero hero = new Hero("Frodo");
        characters.Boss boss = new Boss("Bossen", 30);
        characters.Orc orc = new Orc("Orc");

        // Skapa ett game
        game.GameRunning newGame = new GameRunning(hero, boss, orc);
        newGame.startGame();
    }
}