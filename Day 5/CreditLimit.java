import java.util.Scanner;

class CustomerAccount {
    private String accountNumber;
    private double beginningBalance;
    private double totalCharges;
    private double totalCredits;
    private double creditLimit;

    public CustomerAccount(String accountNumber, double beginningBalance, double totalCharges, double totalCredits, double creditLimit) {
        this.accountNumber = accountNumber;
        this.beginningBalance = beginningBalance;
        this.totalCharges = totalCharges;
        this.totalCredits = totalCredits;
        this.creditLimit = creditLimit;
    }

    public boolean calculateNewBalance() {
        double newBalance = totalCredits - (beginningBalance + totalCharges);

        System.out.println("\nAccount Number: " + accountNumber);
        System.out.printf("New Balance: %.2f\n", newBalance);

        if (newBalance > creditLimit)
            return true;
        else
            return false;
    }
}

public class CreditLimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        String accountNumber = sc.nextLine();

        System.out.print("Enter beginning balance: ");
        double beginningBalance = sc.nextDouble();

        System.out.print("Enter total charges this month: ");
        double totalCharges = sc.nextDouble();

        System.out.print("Enter total credits this month: ");
        double totalCredits = sc.nextDouble();

        System.out.print("Enter allowed credit limit: ");
        double creditLimit = sc.nextDouble();

        CustomerAccount customer = new CustomerAccount(accountNumber, beginningBalance, totalCharges, totalCredits, creditLimit);

        if (customer.calculateNewBalance()) {
            System.out.println("Credit limit exceeded.");
        } else {
            System.out.println("Credit limit not exceeded.");
        }

        sc.close();
    }
}