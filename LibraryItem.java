import java.util.*;

abstract class LibraryItem {
    String title;
    int daysLate;

    LibraryItem(String title, int daysLate) {
        this.title = title;
        this.daysLate = daysLate;
    }

    abstract double fine();
}

class Book extends LibraryItem {
    Book(String title, int daysLate) {
        super(title, daysLate);
    }

    double fine() {
        return daysLate * 2.0;
    }
}

class DVD extends LibraryItem {
    DVD(String title, int daysLate) {
        super(title, daysLate);
    }

    double fine() {
        return Math.min(daysLate * 5.0, 50.0);
    }
}

class Magazine extends LibraryItem {
    Magazine(String title, int daysLate) {
        super(title, daysLate);
    }

    double fine() {
        return daysLate * 1.0;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LibraryItem[] items = new LibraryItem[n];
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String title = sc.next();
            int days = sc.nextInt();

            switch (type) {
                case "BOOK":
                    items[i] = new Book(title, days);
                    break;
                case "DVD":
                    items[i] = new DVD(title, days);
                    break;
                case "MAGAZINE":
                    items[i] = new Magazine(title, days);
                    break;
            }
        }

        for (LibraryItem item : items) {
            System.out.printf("%s: %.2f%n", item.title, item.fine());
            total += item.fine();
        }

        System.out.printf("Total Fines: %.2f%n", total);
        sc.close();
    }
}