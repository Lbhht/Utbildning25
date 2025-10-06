class Car {
    String color;   // Egenskaper eller attribut
    int speed;  // Egenskaper eller attribut

    // Konstrsuktor
    Car(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    // Osynlig konstruktor
    Car(){};

    void accelerate() {
        speed += 10;
    }

    void accelerateTwo() {
        speed = speed + 10;
    }
}


public class Objects {
    public static void main(String[] args) {
        System.out.println("Objects");
        System.out.println("------");

        Car myCar = new Car();
        System.out.println(myCar.color);
        System.out.println(myCar.speed);
        myCar.color = "blue";
        myCar.speed = 5;

        System.out.println(myCar.color);
        System.out.println(myCar.speed);

        myCar.speed = 1;
        System.out.println(myCar.speed);

        myCar.accelerate();
        System.out.println(myCar.speed);

        myCar.accelerateTwo();
        System.out.println(myCar.speed);

        myCar.color = "red";
        System.out.println(myCar.color);

        System.out.println("--- Audi ---");
        Car audi = new Car("yellow", 7);
        System.out.println(audi.color);
        System.out.println(audi.speed);
        audi.accelerate();
        System.out.println(audi.speed);
        System.out.println(myCar.speed);
    }
}
