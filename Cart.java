import java.util.Scanner;

class Cart {
    private int[] prices;
    private int count;
    private final String cartId;

    Cart(String cartId, int size) {
        this.cartId = cartId;
        prices = new int[size];
        count = 0;
    }

    void addItem(int price) {
        if (count < prices.length) {
            prices[count] = price;
            count++;
        }
    }

    int getTotal() {
        int total = 0;

        for (int i = 0; i < count; i++) {
            total = total + prices[i];
        }

        return total;
    }

    int getItemCount() {
        return count;
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cart ID: ");
        String id = sc.nextLine();

        System.out.print("Enter maximum number of items: ");
        int size = sc.nextInt();

        Cart cart = new Cart(id, size);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter price of item " + (i + 1) + ": ");
            int price = sc.nextInt();
            cart.addItem(price);
        }

        System.out.println("Total: " + cart.getTotal());
        System.out.println("Item count: " + cart.getItemCount());

        sc.close();
    }
}