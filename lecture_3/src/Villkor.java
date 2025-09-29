public class Villkor {
    public static void main(String[] args) {
        System.out.println("Villkor");

        int number = 10;

        if(number > 10) {
            System.out.println("Talet är större eller lika med 10");
        } else {
            System.out.println("Talet är mindre än 10");
        }

        System.out.println("----------");
        number = 0;
        if(number > 0){
            System.out.println("Talet: " + number + " är större än noll");
        } else {
            System.out.println("Talet " + number + " är mindre än 1");
        }



    }
}
