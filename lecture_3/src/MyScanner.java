import java.util.Scanner;

public class MyScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ange ett heltal: ");
        int number = scanner.nextInt();

        if(number >= 20) {
            System.out.println("Talet är större eller lika med 20");
        } else {
            System.out.println("Talet är mindre än 20");
        }
        System.out.println("Du angav: " + number);
        scanner.close();
    }
}
