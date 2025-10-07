import characters.Hero;
import game.GameRunning;
import items.Weapon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        startGame();
    }

    private static void startGame() {
        System.out.println("Welcome to the game");

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Do you want to continue y/n?");
            String cont = scanner.nextLine();

            // Välj hero name
            System.out.println("What is your hero's name?");
            String heroName = scanner.nextLine();

            cont = "n";
            // Välj weapon name
            System.out.println("What is you weapons name?");
            String weaponName = scanner.nextLine();
            items.Weapon weapon = new Weapon(weaponName);
            System.out.println("You have a weapon named " + weapon.getName() + ", with " + weapon.getDamage() + " damage");

            // Skapa hero
            characters.Hero hero = new Hero(heroName);

            // Skapa ett game
            game.GameRunning newGame = new GameRunning(hero);
            newGame.startGame();
        }


    }
}