import java.util.Scanner;

class AttendanceSheet {
    private String[] students;
    private int count;

    AttendanceSheet(int size) {
        students = new String[size];
        count = 0;
    }

    void markPresent(String name) {
        if (isPresent(name)) {
            System.out.println(name + " is already marked present");
            return;
        }

        if (count < students.length) {
            students[count] = name;
            count++;
        } else {
            System.out.println("Attendance sheet is full");
        }
    }

    int getPresentCount() {
        return count;
    }

    boolean isPresent(String name) {
        for (int i = 0; i < count; i++) {
            if (students[i].equals(name)) {
                return true;
            }
        }

        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter maximum class size: ");
        int size = sc.nextInt();
        sc.nextLine();

        AttendanceSheet sheet = new AttendanceSheet(size);

        System.out.print("Enter number of students to mark present: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            sheet.markPresent(name);
        }

        System.out.println("Present count: " + sheet.getPresentCount());

        System.out.print("Enter name to check: ");
        String search = sc.nextLine();

        System.out.println("Is present: " + sheet.isPresent(search));
    }
}