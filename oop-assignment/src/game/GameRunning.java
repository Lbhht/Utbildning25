package game;

import characters.Boss;
import characters.Hero;
import characters.Orc;

public class GameRunning {
    private Hero heroChar;
    private Boss bossChar;
    private Orc monster1;
    private Orc monster2;

    public GameRunning(Hero heroChar, Boss bossChar, Orc monster1, Orc monster2) {
        this.heroChar = heroChar;
        this.bossChar = bossChar;
        this.monster1 = monster1;
        this.monster2 = monster2;
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
            heroChar.gainExp(40);

            if (heroChar.getCurrentExp() > 200) {
                break;
            }
        }

    }
}
