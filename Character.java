import java.util.Scanner;

class Character {
    private int health;
    private final int maxHealth;

    Character(int maxHealth) {
        this.maxHealth = maxHealth;
        this.health = maxHealth;
    }

    void takeDamage(int amount) {
        health = health - amount;

        if (health < 0) {
            health = 0;
        }
    }

    void heal(int amount) {
        health = health + amount;

        if (health > maxHealth) {
            health = maxHealth;
        }
    }

    int getHealth() {
        return health;
    }
}

public class HealthBar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter maximum health: ");
        int max = sc.nextInt();

        Character c = new Character(max);

        System.out.print("Enter damage: ");
        int damage = sc.nextInt();
        c.takeDamage(damage);

        System.out.println("Health after damage: " + c.getHealth());

        System.out.print("Enter healing: ");
        int heal = sc.nextInt();
        c.heal(heal);

        System.out.println("Health after healing: " + c.getHealth());

        sc.close();
    }
}