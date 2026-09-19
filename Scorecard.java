import java.util.Scanner;

class Scorecard {
    private boolean[] results;
    private int count;

    Scorecard(int questions) {
        results = new boolean[questions];
        count = 0;
    }

    void recordAnswer(boolean correct) {
        if (count < results.length) {
            results[count] = correct;
            count++;
        } else {
            System.out.println("No more answers can be recorded");
        }
    }

    int getScore() {
        int score = 0;

        for (int i = 0; i < count; i++) {
            if (results[i]) {
                score++;
            }
        }

        return score;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of questions: ");
        int n = sc.nextInt();

        Scorecard scorecard = new Scorecard(n);

        for (int i = 0; i < n; i++) {
            System.out.print("Enter answer " + (i + 1) + " (true/false): ");
            boolean answer = sc.nextBoolean();

            scorecard.recordAnswer(answer);
        }

        System.out.println("Final score: " + scorecard.getScore());
    }
}