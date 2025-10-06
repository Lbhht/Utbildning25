package sw;

public class PodRacer {
    private String name;
    private int speed;
    private int integrity;

    public PodRacer(String name, int speed) {
        this.name = name;
        this.speed = speed;
        this.integrity = 100;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getIntegrity() {
        return integrity;
    }

    public boolean isFunctional() {
        return integrity > 0;
    }

    public void status() {
        System.out.println(name + ", speed: " + speed + ", Integrity: " + integrity);
    }

    public void takeDamage(int damage) {
        // TODO: ingen kontrll för negativa värden
        System.out.println(name + " took: " + damage + " damage.");
        integrity -= damage;
        if(isFunctional()) {
            System.out.println(name + " took damage. The integrity is now: " + integrity + "/100");
        } else {
            integrity = 0;
        }
        Helper.sleepForMilliseconds(500); // 500 = 0.5sec
    }

    public void speedBoost(int amount) {
        if(isFunctional()) {
            speed += amount;
            System.out.println(name + " uses speed boost and increases their speed to " + speed + "km/h");
        } else {
            System.out.println(name + " is broken and cant get any speed boost.");
        }
        Helper.sleepForMilliseconds(500); // 500 = 0.5sec
    }
}
