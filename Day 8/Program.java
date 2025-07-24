//package OOP_Batch03_23UAM070;

import java.util.Scanner;

public class Program {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[10];
        int empCount = 0;

        while(true)
        {
            System.out.println("\nMenu: ");
            System.out.println("1) Add Employee ");
            System.out.println("2) Display All Employees ");
            System.out.println("3) Search Employee by ID ");
            System.out.println("4) Display Employee joined in given year ");
            System.out.println("5) Find Employee with maximum Salary ");
            System.out.println("6) Find Employee with minimum Salray ");
            System.out.println("7) Exit the Application ");
            System.out.println("\nEnter Choice: ");
            int choice = sc.nextInt();

        
        switch(choice)
            {
                case 1:
                  if(empCount >= employees.length ){System.out.println("Employee list is full!!");
                  break;}
                  else{
                    sc.nextLine();
                    System.out.println("Enter Employee Name: ");
                    String name = sc.nextLine();

                    System.out.println("Enter Date of Birth of Employee: ");
                    int bd = sc.nextInt();
                    int bm = sc.nextInt();
                    int by = sc.nextInt();
                    MyDate DOB = new MyDate(bd, bm, by);

                    System.out.println("Enter Id of an Employee: ");
                    int id = sc.nextInt();

                    System.out.println("Enter Department od an Employee: ");
                    String department = sc.nextLine();

                    System.out.println("Enter Salary of an Employee: ");
                    double salary = sc.nextDouble();

                    System.out.println("Enter Date Of Joining of an Employee: ");
                    int jd = sc.nextInt(), jm = sc.nextInt(), jy = sc.nextInt();
                    MyDate dateofJoining = new MyDate(jd, jm, jy);

                    employees[empCount++] = new Employee(name, DOB, id, department, salary, dateofJoining);
                    System.out.println("New Employee Added");
                    break;
                  }
                case 2:
                    if(empCount == 0)
                    {
                        System.out.println("No Employee to display");
                        break;
                    }else{
                        for(int i=0; i<empCount; i++)
                        {
                            System.out.println("\nEmployee "+i+1);
                            System.out.println(employees[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter Employee ID: ");
                    int searchId = sc.nextInt();
                    boolean found = false;
                    for(int i = 0; i<empCount; i++)
                    {
                        if(employees[i].getid() == searchId)
                        {
                            System.out.println(employees[i]);
                            found = true;
                            break;
                        }
                    }
                    if(!found){System.out.println("Employee not Found.");}
                    break;
                case 4:
                    System.out.println("Enter Year: ");
                    int searchYear = sc.nextInt();
                    for(int i=0; i<empCount; i++)
                    {
                        if(employees[i].getDOB().getYear() == searchYear)
                        {
                            System.out.println(employees[i]);
                            found = true;
                            break;
                        }
                    }
                    //if(!found){System.out.println("No Employee joined in year "+searchYear);}
                    break;
                //case 5:
                  //  if(empCount == 0){System.out.println("No Employee Entered!!");}
                case 7:
                    System.out.println("Exiting the Application");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice. Try Again!!");    

            }

        }
    }
}