package com.techelevator;

public class Employee {
    //instance variables
    private long employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private double salary;
    private Department department;
    private  String hireDate;

    //Static constant
    //I'm not sure if it's supposed to be public
    public static final double STARTING_SALARY = 60000;

    // Constructors
    public Employee(long employeeId, String firstName, String lastName, String email, Department department, String hireDate){
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
        this.hireDate = hireDate;
        // I'm not sure if this is what they meant by initializing the salary to the static constant.
        this.salary = STARTING_SALARY;
    }
    //Empty constructor???? ¯\_(ツ)_/¯
    public Employee(){
        employeeId = 1;
        firstName = "Dean";
        lastName = "Johnson";
        email = "djohnson@teams.com";
        salary = STARTING_SALARY;
        department = getDepartment();
        hireDate = "08/21/2020";

    }

    //Methods
    public String getFullName() {
        return (lastName + ", " + firstName);
    }
    // I think this is right.....maybe....

    public double raiseSalary(double percent){
        return salary =  STARTING_SALARY + (percent/100);
    }

    // Set & get
    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }
}
