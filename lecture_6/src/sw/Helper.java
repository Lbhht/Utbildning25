package sw;

public class Helper {
    public static int randomInt() {
        return (int) Math.round(Math.random() * 20);
    }

    public static void sleepForMilliseconds(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace(); // Vi hanterar eventuella avbrott
        }
    }
}
