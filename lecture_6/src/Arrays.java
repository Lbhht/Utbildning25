public class Arrays {
    public static void main(String[] args) {
        //        for (int i = 0; i < 5; i++) {
//            System.out.println("i = " + i);
//        }

        // Array av nummer
        int[] numbers;
        numbers = new int[5];

        int[] numbers2 = new int[5];

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);

        System.out.println("---------");
        for(int i = 0; i < 5; i++) {
            System.out.println("i = " + numbers[i]);
        }

        System.out.println("---------");
        for(int i = 0; i < numbers.length; i++) {
            System.out.println("i = " + numbers[i]);
        }

        System.out.println("---------");
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println(max);

    }
}
