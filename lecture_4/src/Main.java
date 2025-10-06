//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        example1();
        example2();
        example3();
        example4();
    }

    static void example1() {
        Car myCar = new Car();
        myCar.brand = "Audi";
        myCar.model = "A4";
        myCar.year = 2000;

        System.out.println(myCar.brand);
        System.out.println(myCar.model);
        System.out.println(myCar.year);


        myCar.startEngine();
        myCar.info();
    }

    static void example2() {
        // Att föredra
        Car myCarTwo = new Car("Toyota", "Carina 2", 1991);
        System.out.println(myCarTwo.brand);
        System.out.println(myCarTwo.model);
        System.out.println(myCarTwo.year);
        myCarTwo.info();
    }

    static void example3() {
        String brand = "Volvo";
        String model = "740";
        int year = 2002;
        Car myCar3 = new Car(brand, model, year);
        myCar3.info();
        System.out.println("---------");
        System.out.println(myCar3.toString());
        myCar3.brand = "BMW";
        System.out.println("myCar3: " + myCar3.toString());
    }

    static void example4() {
        System.out.println("---------");
        Book bookOne = new Book("Lord of the Rings", "JRR Tolkien", 1000, "fantasy");

        bookOne.titleAndAuthor();

        Book bookTwo = new Book("Title 2", "Author 2", 450, "novel");
        Book bookThree = new Book("Title 3", "Author 3", 560, "adventure");

        bookOne.howLong(25);
        bookTwo.howLong(25);
        bookThree.howLong(25);

        System.out.println(bookOne.isGenre("fantasy"));
    }
}