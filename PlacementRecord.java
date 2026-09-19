import java.util.Scanner;

class PlacementRecord {
    String studentName;
    String company;
    double packageLpa;

    PlacementRecord(String studentName, String company, double packageLpa) {
        this.studentName = studentName;
        this.company = company;
        this.packageLpa = packageLpa;
    }

    void printRecord() {
        System.out.println(studentName + " -> " + company + " @ " + packageLpa + " LPA");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PlacementRecord[] records = new PlacementRecord[3];

        for (int i = 0; i < 3; i++) {
            String name = sc.next();
            String company = sc.next();
            double pack = sc.nextDouble();

            records[i] = new PlacementRecord(name, company, pack);
        }

        for (PlacementRecord r : records) {
            r.printRecord();
        }
    }
}