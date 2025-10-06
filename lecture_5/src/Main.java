//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        example1();


        Car myCar = new Car("Audi", "A4", 2000);

//        helloUser("java");
//        String helloMessage = helloText("Anders");
//        System.out.println(helloMessage);
//
//        System.out.println(helloText("Namn"));

        int sum = add(5, 6);
        System.out.println("Sum from add function: " + sum);

        System.out.println(fun1("ett"));
        System.out.println(fun2("två"));
        System.out.println(fun3("tre"));

        int sum2 = multiply(5, 5);
        System.out.println(sum2);
    }

    static void example1() {
        System.out.println("Example 1 output");
    }

    static void helloUser(String name) {
        System.out.println("Hello " + name);
    }

    static String helloText(String name) {
        return name;
    }

    static int add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);

        return sum;
    }

    static String fun1(String text) {
        return "fun 1: " + fun2(text);
    }

    static String fun2(String text) {
        return "fun 2: " + fun3(text);
    }

    static String fun3(String text) {
        return "fun 3: " + text;
    }

    static int multiply(int a, int b) {
        return a * b;
    }
}