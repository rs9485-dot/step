import java.util.Scanner;

interface Question {
    double grade(String correct, String answer, double points);
}

class MCQ implements Question {
    public double grade(String c, String a, double p) {
        return c.equalsIgnoreCase(a) ? p : 0;
    }
}

class TF extends MCQ {}

class Essay implements Question {
    public double grade(String c, String a, double p) {
        int count = 0;
        for (String k : c.split(",")) {
            if (a.toLowerCase().contains(k.trim().toLowerCase()))
                count++;
        }
        if (count >= 2) return p * 0.75;
        if (count == 1) return p * 0.50;
        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            sc.next(); // question text
            String correct = sc.next().replace("\"", "");
            String answer = sc.next().replace("\"", "");
            double points = sc.nextDouble();

            Question q = type.equals("ESSAY") ?
                    new Essay() : new MCQ();

            double score = q.grade(correct, answer, points);
            System.out.printf("%s: %.2f%n", type, score);
            total += score;
        }
        System.out.printf("Total Score: %.2f%n", total);
        sc.close();
    }
}