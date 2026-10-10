import java.util.Scanner;

interface Delivery {
    double fee(double w, double d, double c);
}

class Standard implements Delivery {
    public double fee(double w, double d, double c) {
        return 5 + 0.5 * w + 0.1 * d;
    }
}

class Express implements Delivery {
    public double fee(double w, double d, double c) {
        return 15 + w + 0.2 * d;
    }
}

class International implements Delivery {
    public double fee(double w, double d, double c) {
        return 25 + 2 * w + 0.5 * d + c;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double w = sc.nextDouble(), d = sc.nextDouble();
            double c = type.equals("INTERNATIONAL") ?
                    sc.nextDouble() : 0;

            Delivery x;
            switch (type) {
                case "STANDARD": x = new Standard(); break;
                case "EXPRESS": x = new Express(); break;
                default: x = new International();
            }

            double fee = x.fee(w, d, c);
            System.out.printf("%s: %.2f%n", type, fee);
            total += fee;
        }
        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}