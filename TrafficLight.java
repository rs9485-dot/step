import java.util.Scanner;

class TrafficLight {
    private String color;
    private final String id;

    TrafficLight(String id) {
        this.id = id;
        color = "RED";
    }

    void next() {
        if (color.equals("RED")) {
            color = "GREEN";
        } else if (color.equals("GREEN")) {
            color = "YELLOW";
        } else {
            color = "RED";
        }
    }

    String getColor() {
        return color;
    }
}

public class TrafficLightDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter traffic light ID: ");
        String id = sc.nextLine();

        TrafficLight t = new TrafficLight(id);

        System.out.print("Enter number of times to change: ");
        int n = sc.nextInt();

        System.out.println("Current color: " + t.getColor());

        for (int i = 0; i < n; i++) {
            t.next();
            System.out.println("Color: " + t.getColor());
        }

        sc.close();
    }
}