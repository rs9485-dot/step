import java.util.Scanner;

class MessWallet {
    private double balance;

    public MessWallet(double balance) {
        if (balance < 0) {
            System.out.println("Warning: Negative balance not allowed");
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    public void topUp(double amount) {
        if (amount <= 0) {
            System.out.println("Top-up rejected: invalid amount");
        } else {
            balance += amount;
            System.out.println("Balance after top-up: " + balance);
        }
    }

    public void deduct(double amount) {
        if (amount > balance) {
            System.out.println("Deduct rejected: insufficient balance");
        } else {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double opening = sc.nextDouble();
        double topUpAmount = sc.nextDouble();
        double deductAmount = sc.nextDouble();

        MessWallet wallet = new MessWallet(opening);

        wallet.topUp(topUpAmount);
        wallet.deduct(deductAmount);

        System.out.println("Final balance: " + wallet.getBalance());
    }
}