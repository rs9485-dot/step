
import java.util.Scanner;

interface Customer {
    double bill(double amount);
}

class Student implements Customer {
    public double bill(double a) {
        return a * 0.90;
    }
}

class Staff implements Customer {
    public double bill(double a) {
        return a * 0.95;
    }
}

class Guest implements Customer {
    public double bill(double a) {
        return a + 10;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double amount = sc.nextDouble();
            Customer c;

            switch (type) {
                case "STUDENT": c = new Student(); break;
                case "STAFF": c = new Staff(); break;
                default: c = new Guest();
            }

            double result = c.bill(amount);
            System.out.printf("%s: %.2f%n", type, result);
            total += result;
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}
