
import java.util.Scanner;
import java.time.LocalDate;

interface Plan {
    int days();
}

class Basic implements Plan {
    public int days() {
        return 30;
    }
}

class Standard implements Plan {
    public int days() {
        return 90;
    }
}

class Premium implements Plan {
    public int days() {
        return 365;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();
            LocalDate date = LocalDate.parse(sc.next());
            Plan p;

            switch (type) {
                case "BASIC": p = new Basic(); break;
                case "STANDARD": p = new Standard(); break;
                default: p = new Premium();
            }

            System.out.println(name + ": " + date.plusDays(p.days()));
        }

        sc.close();
    }
}
