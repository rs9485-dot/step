import java.util.Scanner;

abstract class Ticket {
    int count;
    static final double FEE = 20;

    Ticket(int count) {
        this.count = count;
    }

    abstract double price();

    double total() {
        return count * (price() + FEE);
    }
}

class Regular extends Ticket {
    Regular(int count) {
        super(count);
    }

    double price() {
        return 150;
    }
}

class Premium extends Ticket {
    Premium(int count) {
        super(count);
    }

    double price() {
        return 250;
    }
}

class Recliner extends Ticket {
    Recliner(int count) {
        super(count);
    }

    double price() {
        return 400;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Ticket[] tickets = new Ticket[n];
        String[] seats = new String[n];
        double total = 0;

        for (int i = 0; i < n; i++) {
            seats[i] = sc.next();
            int count = sc.nextInt();

            switch (seats[i]) {
                case "REGULAR":
                    tickets[i] = new Regular(count);
                    break;
                case "PREMIUM":
                    tickets[i] = new Premium(count);
                    break;
                case "RECLINER":
                    tickets[i] = new Recliner(count);
                    break;
            }
        }

        for (int i = 0; i < n; i++) {
            double amount = tickets[i].total();
            System.out.printf("%s: %.2f%n", seats[i], amount);
            total += amount;
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}