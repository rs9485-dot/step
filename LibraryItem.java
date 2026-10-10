import java.util.Scanner;
import java.time.LocalDate;

interface LibraryItem {
    int days();
}

class Book implements LibraryItem {
    public int days() { return 14; }
}

class DVD implements LibraryItem {
    public int days() { return 7; }
}

class Magazine implements LibraryItem {
    public int days() { return 3; }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        LocalDate date = LocalDate.of(2023, 10, 26);

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String type = line.substring(0, line.indexOf(' '));
            String title = line.substring(line.indexOf('"') + 1,
                    line.lastIndexOf('"'));

            LibraryItem item;
            switch (type) {
                case "BOOK": item = new Book(); break;
                case "DVD": item = new DVD(); break;
                default: item = new Magazine();
            }

            System.out.println(title + ": " +
                    date.plusDays(item.days()));
        }
        sc.close();
    }
}