import java.util.Scanner;

public class Drivingcost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total miles driven per day: ");
        double totalMiles = sc.nextDouble();

        System.out.print("Enter cost PG of gasoline: ");
        double costPG = sc.nextDouble();

        System.out.print("Enetr average miles PG: ");
        double avgMilesPG = sc.nextDouble();

        System.out.print("Enetr parking fees per day: ");
        double parkingFees = sc.nextDouble();

        System.out.print("Enetr tolls per day: ");
        double tolls = sc.nextDouble();

        double fuelCost = (totalMiles / avgMilesPG) * costPG;
        double totalDailyCost = fuelCost + parkingFees + tolls;

        System.out.printf("Your daily driving cost is: %.2f\n", totalDailyCost);

        sc.close();
    }
}
