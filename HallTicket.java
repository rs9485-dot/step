import java.util.Scanner;

class HallTicket {
    String studentName;
    int seatNumber;

    HallTicket(String studentName, int seatNumber) {
        this.studentName = studentName;
        this.seatNumber = seatNumber;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter initial seat number: ");
        int seat = sc.nextInt();

        HallTicket priya = new HallTicket(name, seat);

        HallTicket copy = priya;

        System.out.print("Enter new seat number: ");
        int newSeat = sc.nextInt();

        copy.seatNumber = newSeat;

        HallTicket separate = new HallTicket(name, newSeat);

        System.out.println("\n" + name + "'s seatNumber (via first variable): "
                + priya.seatNumber);

        System.out.println("copy == priya: " + (copy == priya));

        System.out.println("separate == priya: " + (separate == priya));
    }
}