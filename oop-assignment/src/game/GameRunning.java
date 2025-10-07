package game;

import characters.Boss;
import characters.Hero;
import characters.Orc;
import helper.RandomNumber;

import java.util.Scanner;
import java.util.SortedMap;

public class GameRunning {
    private Hero heroChar;
//    private Boss bossChar;
//    private Orc monster1;

    public GameRunning(Hero heroChar) {
        this.heroChar = heroChar;
//        this.bossChar = bossChar;
//        this.monster1 = monster1;
    }

    public void startGame() {


        while(heroChar.state() && heroChar.getLevel() < 10){
            System.out.println("---- Meny val ----");

            // Välj vart du vill gå
            Scanner scanner = new Scanner(System.in);
            System.out.println("Where do you want to go?\n [1] Forest\n [2] Kurast Docks\n [3] Mountains");
            int choice = scanner.nextInt();

            // Vilken encounter?
            System.out.println("---- Encounter -----");
            if (choice == 1) {
                System.out.println("You went into the forest");

                // Välj encounter genom ett tal mellan 0-10;
                int encounter = (int) Math.round(Math.random() * 10);

                // Vanlig encounter
                if (encounter >= 0 && encounter < 7) {
                    // Skapa en orc
                    System.out.println("You encounter an orc");
                    characters.Orc orc = new Orc("Orc");

                    while(orc.getHealth() > 0 && heroChar.getHealth() > 0 && heroChar.getLevel() < 10) {
                        orc.saySomething();
                        orc.makeSound();
                        heroChar.saySomething();

                        // Attack hero
                        heroChar.attack(RandomNumber.randomInt());

                        // Orc damage
                        orc.takeDamage(RandomNumber.randomInt());
                        if (orc.getHealth() < 0) {
                            break;
                        }

                        // Orc attack
                        orc.attack(RandomNumber.randomInt());

                        // Damage hero
                        heroChar.takeDamage(RandomNumber.randomInt());
                        if(heroChar.getHealth() < 0) {
                            break;
                        }
                    }

                    // Boss encounter
                } else if(encounter >= 7 && encounter < 8){
                    // Skapa en boss
                    System.out.println("You encounter an boss");
                    characters.Boss boss = new Boss("Boss", 30);

                    while(boss.getHealth() > 0 && heroChar.getHealth() > 0 && heroChar.getLevel() < 10) {
                        boss.saySomething();
                        boss.makeSound();
                        heroChar.saySomething();

                        // Attack hero
                        heroChar.attack(RandomNumber.randomInt());

                        // Boss damage
                        boss.takeDamage(RandomNumber.randomInt());
                        if (boss.getHealth() < 0) {
                            break;
                        }

                        //Boss attack
                        if((int) Math.round(Math.random() * 10) < 3) {
                            boss.bossAttack(RandomNumber.randomInt());
                        } else {
                            boss.attack(RandomNumber.randomInt());
                        }

                        // Damage hero
                        heroChar.takeDamage(RandomNumber.randomInt());
                        if(heroChar.getHealth() < 0) {
                            break;
                        }
                    }
                } else if(encounter >= 8 && encounter < 10) {
                    System.out.println("You found a safe place");
                }

            } else if (choice == 2) {
                System.out.println("You went to Kurast Docks");

                // Välj encounter genom ett tal mellan 0-10;
                int encounter = (int) Math.round(Math.random() * 10);

                // Vanlig encounter
                if (encounter >= 0 && encounter < 7) {
                    // Skapa en orc
                    System.out.println("You encounter an orc");
                    characters.Orc orc = new Orc("Orc");

                    while(orc.getHealth() > 0 && heroChar.getHealth() > 0 && heroChar.getLevel() < 10) {
                        orc.saySomething();
                        orc.makeSound();
                        heroChar.saySomething();

                        // Attack hero
                        heroChar.attack(RandomNumber.randomInt());

                        // Orc damage
                        orc.takeDamage(RandomNumber.randomInt());
                        if (orc.getHealth() < 0) {
                            break;
                        }

                        // Orc attack
                        orc.attack(RandomNumber.randomInt());

                        // Damage hero
                        heroChar.takeDamage(RandomNumber.randomInt());
                        if(heroChar.getHealth() < 0) {
                            break;
                        }
                    }

                // Boss encounter
                } else if(encounter >= 7 && encounter < 8){
                    // Skapa en boss
                    System.out.println("You encounter an boss");
                    characters.Boss boss = new Boss("Boss", 30);

                    while(boss.getHealth() > 0 && heroChar.getHealth() > 0 && heroChar.getLevel() < 10) {
                        boss.saySomething();
                        boss.makeSound();
                        heroChar.saySomething();

                        // Attack hero
                        heroChar.attack(RandomNumber.randomInt());

                        // Boss damage
                        boss.takeDamage(RandomNumber.randomInt());
                        if (boss.getHealth() < 0) {
                            break;
                        }

                        //Boss attack
                        if((int) Math.round(Math.random() * 10) < 3) {
                            boss.bossAttack(RandomNumber.randomInt());
                        } else {
                            boss.attack(RandomNumber.randomInt());
                        }

                        // Damage hero
                        heroChar.takeDamage(RandomNumber.randomInt());
                        if(heroChar.getHealth() < 0) {
                            break;
                        }
                    }
                } else if(encounter >= 8 && encounter < 10) {
                    System.out.println("You found a safe place");
                }
            } else if (choice == 3) {
                System.out.println("You went to the Mountains");

                // Välj encounter genom ett tal mellan 0-10;
                int encounter = (int) Math.round(Math.random() * 10);

                // Vanlig encounter
                if (encounter >= 0 && encounter < 7) {
                    // Skapa en orc
                    System.out.println("You encounter an orc");
                    characters.Orc orc = new Orc("Orc");

                    while(orc.getHealth() > 0 && heroChar.getHealth() > 0 && heroChar.getLevel() < 10) {
                        orc.saySomething();
                        orc.makeSound();
                        heroChar.saySomething();

                        // Attack hero
                        heroChar.attack(RandomNumber.randomInt());

                        // Orc damage
                        orc.takeDamage(RandomNumber.randomInt());
                        if (orc.getHealth() < 0) {
                            break;
                        }

                        // Orc attack
                        orc.attack(RandomNumber.randomInt());

                        // Damage hero
                        heroChar.takeDamage(RandomNumber.randomInt());
                        if(heroChar.getHealth() < 0) {
                            break;
                        }
                    }

                    // Boss encounter
                } else if(encounter >= 7 && encounter < 8){
                    // Skapa en boss
                    System.out.println("You encounter an boss");
                    characters.Boss boss = new Boss("Boss", 30);

                    while(boss.getHealth() > 0 && heroChar.getHealth() > 0 && heroChar.getLevel() < 10) {
                        boss.saySomething();
                        boss.makeSound();
                        heroChar.saySomething();

                        // Attack hero
                        heroChar.attack(RandomNumber.randomInt());

                        // Boss damage
                        boss.takeDamage(RandomNumber.randomInt());
                        if (boss.getHealth() < 0) {
                            break;
                        }

                        //Boss attack
                        if((int) Math.round(Math.random() * 10) < 3) {
                            boss.bossAttack(RandomNumber.randomInt());
                        } else {
                            boss.attack(RandomNumber.randomInt());
                        }

                        // Damage hero
                        heroChar.takeDamage(RandomNumber.randomInt());
                        if(heroChar.getHealth() < 0) {
                            break;
                        }
                    }
                } else if(encounter >= 8 && encounter < 10) {
                    System.out.println("You found a safe place");
                }
            } else {
                System.out.println("Not");
            }


            if (heroChar.getHealth() > 0) {
                System.out.println(heroChar.getName() + " won");
                // Öka expn
                heroChar.gainExp(60 + (int) Math.round(Math.random() * 50));
            } else {
                heroChar.status();
                System.out.println(heroChar.getName() + " lost");
            }

            if(heroChar.getLevel() == 10) {
                System.out.println(heroChar.getName() + " won the game");
            }




            // Stoppa om det inte funkar
            if (heroChar.getCurrentExp() > 200) {
                break;
            }
        }

    }
}
