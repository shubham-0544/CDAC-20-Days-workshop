import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int n=sc.nextInt();
		
		System.out.println("Binary number of given number : "+ Integer.toBinaryString(n));
		System.out.println("Octal number of given number : "+Integer.toOctalString(n));
		System.out.println("Hexadecimal number of given number : "+Integer.toHexString(n));
	}
}