package game;

import characters.Hero;
import characters.Orc;
import helper.RandomNumber;

public class DifferentFights {
    public void Fight(Hero heroChar) {
        // Skapa en orc
        characters.Orc orc = new Orc("Orc");

        while(orc.state() && heroChar.state() && heroChar.getLevel() < 10) {
            // Attack hero
            heroChar.attack(RandomNumber.randomInt());

            // Orc damage
            orc.takeDamage(RandomNumber.randomInt());

            // Orc attack
            orc.attack(RandomNumber.randomInt());

            // Damage hero
            heroChar.takeDamage(RandomNumber.randomInt());

            orc.saySomething();
            orc.makeSound();
            heroChar.saySomething();
        }
    }
}
