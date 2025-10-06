public class Encapsulation {
    public static void main(String[] args) {
        System.out.println("Inkapsling och åtkomstmodifierare");

//        Car myCar = new Car();
//        myCar.brand = "Yellow";
//        System.out.println(myCar.brand);
//        myCar.brand = "Audi";
//        System.out.println(myCar.brand);

        BankAccount ba = new BankAccount(500);
        ba.deposit(1000);
        System.out.println(ba.getBalance());

        System.out.println("---withdraw---");
        // Ta ut 500
//        ba.balance -= -500;
        ba.withdraw(-750);
        System.out.println(ba.getBalance());

        System.out.println("---withdrawNew---");
        ba.withdrawNew(7500);
        System.out.println(ba.getBalance());

        System.out.println("----withdrawNewAnd----");
        ba.withdrawNewAnd(-750);
        System.out.println(ba.getBalance());
    }
}
