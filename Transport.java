import java.util.Scanner;

interface Transport {
    double fare(double d, double f);
}

class Bus implements Transport {
    public double fare(double d, double f) {
        return Math.min(10, 2 + 0.1 * d);
    }
}

class Train implements Transport {
    public double fare(double d, double f) {
        return 3 + 0.15 * d;
    }
}

class Metro implements Transport {
    public double fare(double d, double f) {
        return (1.5 + 0.2 * d) * f;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double d = sc.nextDouble();
            double f = type.equals("METRO") ? sc.nextDouble() : 1;

            Transport t;
            switch (type) {
                case "BUS": t = new Bus(); break;
                case "TRAIN": t = new Train(); break;
                default: t = new Metro();
            }

            double fare = t.fare(d, f);
            System.out.printf("%s: %.2f%n", type, fare);
            total += fare;
        }
        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}