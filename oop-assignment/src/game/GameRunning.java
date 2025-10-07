package game;

import characters.Boss;
import characters.Hero;
import characters.Orc;
import helper.RandomNumber;

public class GameRunning {
    private Hero heroChar;
    private Boss bossChar;
    private Orc monster1;

    public GameRunning(Hero heroChar, Boss bossChar, Orc monster1) {
        this.heroChar = heroChar;
        this.bossChar = bossChar;
        this.monster1 = monster1;
    }

    public void startGame() {
        System.out.println("Welcome to the game");
        // Välj hero name


        while(heroChar.state() && heroChar.getLevel() < 10){
            System.out.println("---- Encounter -----");


            // Välj vart du vill gå

            // Vilken encounter?

            // Attack hero
            heroChar.attack(10);
            heroChar.attack(RandomNumber.randomInt());

            // Damage monster
            bossChar.takeDamage(4);
            monster1.takeDamage(3);

            // Attack monster
            bossChar.attack(15);
            monster1.attack(6);

            // Damage hero
            heroChar.takeDamage(5);

            // Random sound
            bossChar.makeSound();
            monster1.makeSound();
            bossChar.saySomething();
            monster1.saySomething();


            // Öka expn
            heroChar.gainExp(60);

            heroChar.status();

            if (heroChar.getCurrentExp() > 200) {
                break;
            }
        }

    }
}
