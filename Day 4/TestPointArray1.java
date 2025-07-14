import java.util.Scanner;
//import geometry.Point2D;

public class TestPointArray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many points you want to plot: ");
        int n = sc.nextInt();
        Point2D[] points = new Point2D[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter x and y for point " + i + ": ");
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            points[i] = new Point2D(x, y);
        }

        boolean exit = false;
        while (!exit) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Display details of a specific point");
            System.out.println("2. Display all points");
            System.out.println("3. Calculate distance between two points");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter index: ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < n) {
                        System.out.println("Point at index " + index + ": " + points[index].show());
                    } else {
                        System.out.println("Invalid index, pls retry!!!!");
                    }
                    break;

                case 2:
                    System.out.println("All points:");
                    for (Point2D p : points) {
                        System.out.println(p.show());
                    }
                    break;

                case 3:
                    System.out.print("Enter index of start point: ");
                    int start = sc.nextInt();
                    System.out.print("Enter index of end point: ");
                    int end = sc.nextInt();

                    if (start >= 0 && start < n && end >= 0 && end < n) {
                        if (points[start].isEqual(points[end])) {
                            System.out.println("Both points are at the same position.");
                        } else {
                            double dist = points[start].calculateDistance(points[end]);
                            System.out.println("Distance between points: " + dist);
                        }
                    } else {
                        System.out.println("Invalid indices, try");
                    }
                    break;

                case 4:
                    exit = true;
                    System.out.println("Exiting. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice, try again");
            }
        }

        sc.close();
    }
}
