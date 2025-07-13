import java.util.Scanner;
import com.app.fruits.*;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basket size: ");
        int size = sc.nextInt();
        Fruit[] basket = new Fruit[size];
        int counter = 0;

        while (true) {
            System.out.println("\n0. Exit\n1. Add Mango\n2. Add Orange\n3. Add Apple\n4. Show Fruit Names\n5. Show Fresh Fruits\n6. Mark Stale\n7. Show Stale Tastes");
            System.out.print("Your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 0:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                case 1:
                    if (counter < size) {
                        System.out.print("Enter name, weight, color: ");
                        String name = sc.next();
                        double weight = sc.nextDouble();
                        String color = sc.next();
                        basket[counter++] = new Mango(name, weight, color);
                    } else {
                        System.out.println("Basket is full!");
                    }
                    break;

                case 2:
                    if (counter < size) {
                        System.out.print("Enter name, weight, color: ");
                        String name = sc.next();
                        double weight = sc.nextDouble();
                        String color = sc.next();
                        basket[counter++] = new Orange(name, weight, color);
                    } else {
                        System.out.println("Basket is full!");
                    }
                    break;

                case 3:
                    if (counter < size) {
                        System.out.print("Enter name, weight, color: ");
                        String name = sc.next();
                        double weight = sc.nextDouble();
                        String color = sc.next();
                        basket[counter++] = new Apple(name, weight, color);
                    } else {
                        System.out.println("Basket is full!");
                    }
                    break;

                case 4:
                    for (Fruit f : basket) {
                        if (f != null)
                            System.out.println(f.getName());
                    }
                    break;

                case 5:
                    for (Fruit f : basket) {
                        if (f != null && f.isFresh()) {
                            System.out.println(f.toString());
                            System.out.println("Taste: " + f.taste());
                        }
                    }
                    break;

                case 6:
                    System.out.print("Enter index to mark stale: ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < counter && basket[index] != null) {
                        basket[index].setFresh(false);
                        System.out.println("Marked as stale.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 7:
                    for (Fruit f : basket) {
                        if (f != null && !f.isFresh()) {
                            System.out.println(f.getName() + ": " + f.taste());
                        }
                    }
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
