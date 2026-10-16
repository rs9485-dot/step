public class RosterRotation {
    static void rotateRoster(String[] names, int k) {
        int n = names.length;
        k = k % n;

        String[] rotated = new String[n];

        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = names[i];
        }

        System.out.print("[");
        for (int i = 0; i < n; i++) {
            System.out.print(rotated[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        String[] names = {"A", "B", "C", "D", "E"};
        int k = 2;

        rotateRoster(names, k);
    }
}