
import java.util.Scanner;

interface Room {
    double bill(int units);
}

class SingleRoom implements Room {
    public double bill(int u) {
        return u * 8;
    }
}

class SharedRoom implements Room {
    int occupants;

    SharedRoom(int o) {
        occupants = o;
    }

    public double bill(int u) {
        return (u * 6.0) / occupants;
    }
}

class ACRoom implements Room {
    public double bill(int u) {
        return u * 10 + 200;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            int units = sc.nextInt();
            Room r;

            if (type.equals("SHARED")) {
                int occupants = sc.nextInt();
                r = new SharedRoom(occupants);
            } else if (type.equals("SINGLE")) {
                r = new SingleRoom();
            } else {
                r = new ACRoom();
            }

            double result = r.bill(units);
            System.out.printf("%s: %.2f%n", type, result);
            total += result;
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}
