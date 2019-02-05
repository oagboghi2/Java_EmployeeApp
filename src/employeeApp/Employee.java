package employeeApp;

public class Employee {
    private static int maxId = 0;
    private int id;
    private String fname;
    private String lname;
    private double salary; // double is a real number. It could have a decimal point. Integers do not
    private int companyID;
    private int healthPlanID;

    //this is a constructor. It has to be the same name as the class
    public Employee(String fname, String lname, double salary, int companyID, int healthPlanID){
        // 'this' refers to object
        maxId++;
        id = maxId;
        this.fname = fname;
        this.lname = lname;
        this.salary = salary;
        this.companyID = companyID;


    }
    //getters and setters
    public int getId(){
        return id;
    }

    public String getName(){
        return fname + ' ' + lname;
    }

    public void setFname(String fname){
        this.fname = fname;
    }

    public void setLname(String lname){
        this.lname = lname;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }
}