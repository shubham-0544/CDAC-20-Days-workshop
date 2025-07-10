import java.util.Calendar;
import java.util.Scanner;

//Step1: Understand requirement and Declare the class
class Date{ 
	private int day; 
	private int month; 
	private int year; 
	
	//paramter-less ctor 
	public Date( ) {
	   System.out.println("Todays Date :");
	   Calendar c = Calendar.getInstance(); 
	   day = c.get(Calendar.DATE); 
	   month = c.get(Calendar.MONTH) + 1; 
	   year = c.get(Calendar.YEAR); 
	}
	public void acceptRecord( ) {
		Scanner sc  = new Scanner(System.in); 
		System.out.print("Day :- ");
		day = sc.nextInt(); 
		System.out.print("Month :- ");
		month = sc.nextInt(); 
		System.out.print("Year :- ");
		year = sc.nextInt(); 
	}
	//this = dt1 
	public void printRecord( ) {
		System.out.println("Day : "+this.day);
		System.out.println("Month : "+this.month);
		System.out.println("Year : "+this.year);
	}
}

public class Program {

	public static void main(String[] args) {
		Date dt1 = new Date();// on dt1 paramterless ctor will get called  
		dt1.printRecord(); // 25-6-2025
		dt1.acceptRecord();//  1 - 1 - 2000 
		dt1.printRecord(); // 1 - 1 - 2000 
	}
}