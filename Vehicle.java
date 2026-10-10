
import java.util.Scanner;

interface Vehicle {
    double charge(int hours);
}

class Bike implements Vehicle {
    public double charge(int h) {
        return h * 10;
    }
}

class Car implements Vehicle {
    public double charge(int h) {
        return 30 + (h - 1) * 20;
    }
}

class Truck implements Vehicle {
    public double charge(int h) {
        return Math.max(100, h * 50);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            int hours = sc.nextInt();
            Vehicle v;

            switch (type) {
                case "BIKE": v = new Bike(); break;
                case "CAR": v = new Car(); break;
                default: v = new Truck();
            }

            double result = v.charge(hours);
            System.out.printf("%s: %.2f%n", type, result);
            total += result;
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}
