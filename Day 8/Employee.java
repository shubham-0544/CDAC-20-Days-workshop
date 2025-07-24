public class Employee {

    private int id;
    private String department;
    private double salary;
    private MyDate dateofJoining;

    public Employee(int id,String department,double  salary,MyDate dateofJoining) {
        this.id = id;
        this.department = department;
        this.salary = salary;
        this.MyDate = dateofJoining;
    }
    public int getid() { 
        return id; }

    public String getdepartment() { 
        return department; }

    public double getsalary() {
        return salary; }

    public MyDate getdateofJoining(){
        return dateofJoining;
    }

    public void setid(int id) {
         this.id = id;}

    public void setdepartment(String department) { 
        this.department = department; }

    public void setsalary(double salary) {
        this.salary =salary;}

    public void setdateofJoining(MyDate dateofJoining){
        this.dateofJoining =dateofJoining;
    }
    public String toString() {
        return "id : " + id + ", department: " +department + ", salary : " +salary + ",dateofJoining : "+dateofJoining;
    }

}