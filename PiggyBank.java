import java.util.Scanner;

class PiggyBank {
    private double savings;
    private final String id;

    PiggyBank(String id) {
        this.id = id;
        savings = 0;
    }

    void deposit(double amount) {
        if (amount > 0) {
            savings += amount;
            System.out.println("Savings after deposit: " + savings);
        } else {
            System.out.println("Invalid deposit");
        }
    }

    void withdraw(double amount) {
        if (amount > savings) {
            System.out.println("Withdrawal rejected");
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal");
        } else {
            savings -= amount;
            System.out.println("Savings after withdrawal: " + savings);
        }
    }

    double getSavings() {
        return savings;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Piggy Bank ID: ");
        String id = sc.nextLine();

        PiggyBank pb = new PiggyBank(id);

        System.out.print("Enter deposit amount: ");
        double deposit = sc.nextDouble();
        pb.deposit(deposit);

        System.out.print("Enter withdrawal amount: ");
        double withdraw = sc.nextDouble();
        pb.withdraw(withdraw);

        System.out.println("Final savings: " + pb.getSavings());
    }
}