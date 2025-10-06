package sw;

public class Race {
    private PodRacer racer1;
    private PodRacer racer2;

    public Race(PodRacer racer1, PodRacer racer2) {
        this.racer1 = racer1;
        this.racer2 = racer2;
    }

    public void start() {
        System.out.println("Start podrace between " + racer1.getName() + " and " + racer2.getName());

        int round = 1;

        while(racer1.isFunctional() && racer2.isFunctional()) {
            System.out.println("---- Round " + round + " ----");

            // Hastighetsökning
            racer1.speedBoost(Helper.randomInt());
            racer2.speedBoost(Helper.randomInt());

            // Skada
            racer1.takeDamage(Helper.randomInt());
            racer2.takeDamage(Helper.randomInt());

            racer1.status();
            racer2.status();

            round++;

            if(round > 100){
                break;
            }
            Helper.sleepForMilliseconds(1000);  // 1000ms = 1sec
        }

        // Kontrollera vem som vann
        if(!racer1.isFunctional() && !racer2.isFunctional()) {
            System.out.println("Both Pod racers have crashed, nobody wins.");
        } else if(!racer1.isFunctional()) {
            System.out.println(racer1.getName() + " have crashed. " + racer2.getName() + " wins.");
        } else if(!racer2.isFunctional()) {
            System.out.println(racer2.getName() + " have crashed. " + racer1.getName() + " wins.");
        } else {
            System.out.println("Something went wrong.");
        }
    }
}
