import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        StringBuilder sb = new StringBuilder(word);
        String reverse = sb.reverse().toString();

        System.out.println(reverse);

        if (word.equalsIgnoreCase(reverse))
            System.out.println("palindrome");
        else
            System.out.println("not a palindrome");

        sc.close();
    }
}