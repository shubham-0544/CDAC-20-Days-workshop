//import com.app.geometry.Point2D;
import java.util.Scanner;
public class Test {
	
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

       System.out.print("Enter x and y coordinates for Point 1: ");
       double x1 = sc.nextDouble();
       double y1 = sc.nextDouble();
       
     System.out.print("Enter x and y coordinates for Point 2: ");
       double x2 = sc.nextDouble();
      double y2 = sc.nextDouble();

	      Point2D p1 = new Point2D(x1, y1);
	      Point2D p2 = new Point2D(x2, y2);

	      System.out.println("Details of Point 1: " + p1.getDetails());
	      System.out.println("Details of Point 2: " + p2.getDetails());

	  
	        if (p1.isEqual(p2)) {
	            System.out.println("Both points are at the same location.");
	        } else {
	            System.out.println("Points are at different locations.");
	            double distance = p1.calculateDistance(p2);
	            System.out.printf("Distance between Point 1 and Point 2: %.2f%n", distance);
	        }

	
	    }
	}