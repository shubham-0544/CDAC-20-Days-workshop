import java.util.Scanner;
public class Invoicetest {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
       System.out.print(" Enter a the number  part ");
       String number=sc.nextLine();
       System.out.print(" Enter a Description ");
       String description=sc.nextLine();
       System.out.print(" Enter a purchesed Qunatity ");
       int purchesed=sc.nextInt();
       System.out.print(" Enter a Price ");
       double price=sc.nextDouble();

       Invoice invoice = new Invoice(number, description, purchesed, price);

        // Display the invoice
        System.out.println("\nInvoice Summary");
        System.out.println(" Number: " + invoice.getNumber());
        System.out.println("Description: " + invoice.getDescrption());
        System.out.println("Purchesed Quantity: " + invoice.getPurchesed());
        System.out.println("Price per item: " + invoice.getPrice());
        System.out.println("Total Invoice Amount: " + invoice.getAmount());


    } 
}