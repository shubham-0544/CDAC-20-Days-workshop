public class Person {
    private String name;
    private int DOB;

    public Person(String name, int DOB) {
        this.name = name;
        this.DOB = DOB;
    }

    public String getName() { 
        return name; }

    public int getDOB() { 
        return DOB; }

    public void setName ( String name) {
         this.name = name; }

    public void setDOB ( int  DOB ) { 
        this.DOB = DOB; }


    public String toString() {
        return "Name: " + name + ", DOB: " +DOB;
    }
}