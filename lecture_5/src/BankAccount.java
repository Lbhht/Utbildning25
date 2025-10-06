public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        // Om amount är positivt
        if(amount > 0) {
            // Sätt in amount på kontot
            balance += amount;
        } else {
            System.out.println("Negativa tal är inte tillåtet");
        }
    }

    public void withdraw(double amount) {
        if (hasNotSufficientFunds(amount)) {
            System.out.println("Övertrassering ej möjligt");
        } else if(isAmountNegative(amount)) {
            System.out.println("Ogiltigt belopp");
        } else {
            balance -= amount;
        }
    }
    private boolean hasNotSufficientFunds(double amount) {
        return amount > balance;
    }

    private boolean isAmountNegative(double amount) {
        return amount <= 0;
    }

    public void withdrawNew(double amount) {
        if(amount > balance || amount <= 0) {
            System.out.println("Ogiltigt belopp");
        } else {
            balance -= amount;
        }
    }

    public void withdrawNewAnd(double amount) {
        if(hasSufficientFunds(amount) && isAmountPositive(amount)) {
            balance -= amount;
        } else {
            System.out.println("Ogiltigt belopp");
        }
    }

    private boolean hasSufficientFunds(double amount) {
        return amount <= balance;
    }

    private boolean isAmountPositive(double amount) {
        return amount > 0;
    }




}
