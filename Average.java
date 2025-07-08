import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number: ");
        if(!sc.hasNextDouble()){
            System.out.println("error");
        }
        else{
            double a=sc.nextDouble();
            System.out.print("enter second number: ");
            double b=sc.nextDouble();
            double average = (a+b)/2;
            System.out.print("the average of double number is : "+average);
        }
    }
}