import java.util.ArrayList;
import java.util.List;

public class Listor {
    public static void main(String[] args) {
        System.out.println("Listor - ArrayList");


        List<Integer> numbers;          // Deklaration
        numbers = new ArrayList<>();    // Instansiering

        List<Integer> numbers2 = new ArrayList<>();  // Deklaration och instansiering på samma rad

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println(numbers.get(0));
        System.out.println(numbers.get(1));
        System.out.println(numbers.get(2));

        System.out.println("-------");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Index i: " + numbers.get(i));
        }

        System.out.println("--------");

        // Remove index 1
        numbers.remove(1);

        System.out.println("--------");

        // Enhanced for-loop
        System.out.println("Enhanced for-loop");
        for(int number :numbers){
            System.out.println("Index i: " + number);
        }

        System.out.println("--------");


        // Remove index 1 again
        System.out.println("--------");

        numbers.remove(1);

        System.out.println("--------");

        // Enhanced for-loop
        System.out.println("Enhanced for-loop");
        for(int number :numbers){
            System.out.println("Index i: " + number);
        }

        System.out.println("--------");



    }
}
