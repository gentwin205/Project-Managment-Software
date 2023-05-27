package com.techelevator;

import javax.print.attribute.standard.MediaSize;
import java.util.ArrayList;
import java.util.List;

public class Application {

    /**
     * The main entry point in the application
     * @param args
     */
    public static void main(String[] args) {
        Application app = new Application();
        app.run();
    }

    private void run() {
        // create some departments
        class Department {
            int departmentID;
            String name;

            void setDepartmentID(int departmentID) {
                this.departmentID = departmentID;
            }

            void setName(String name) {
                this.name = name;
            }

            void main(String[] args) {
                Department engineering = new Department();
                engineering.setDepartmentID(3);
                engineering.setName("Engineering");

                Department marketing = new Department();
                marketing.setDepartmentID(1);
                marketing.setName("Marketing");

                Department sales = new Department();
                sales.setDepartmentID(2);
                sales.setName("Sales");

                // print each department by name
                printDepartments();

                // create employees
                class Employee {
                    long employeeID;
                    String firstName;
                    String lastName;
                    String email;
                    double salary;
                    Department department;
                    String hireDate;
                    //created a constant to represent the starting salary for all three employees
                    static final double STARTING_SALARY = 60000;
                    //creating a method for getting full name withing the employee class
                    String getFullName(){
                        return String.format(lastName + ", " + firstName);
                    }
                    //creating a method for raising Angie's salary (very very ugly way of doing this, please feel free to adjust)
                    double raiseSalary(double percent){
                       return salary =  (salary*1)+(salary*percent);
                    }


                    //no-argument constructor needs to be used for dean
                    Employee() {
                        employeeID = 1;
                        firstName = "Dean";
                        lastName = "Johnson";
                        email = "djohnson@teams.com";
                        department = engineering;
                        hireDate = "08/21/2020";
                        salary = STARTING_SALARY;
                    }

                    //creating an all argument constructor to use for angie and margaret
                    Employee(long employeeID, String firstName, String lastName, String email, Department department, String hireDate, double salary) {
                        this.employeeID = employeeID;
                        this.firstName = firstName;
                        this.lastName = lastName;
                        this.email = email;
                        this.department = department;
                        this.hireDate = hireDate;
                        this.salary = STARTING_SALARY;

                        //need to initialize starting salary for each employee - i've put the salaries into the constructors, please adjust if this is not the best way to do this
                        Employee dean = new Employee(); // this should call the no argument constructor
                        Employee angie = new Employee(
                                2,
                                "Angie",
                                "Smith",
                                "asmith@teams.com",
                                engineering,
                                "08/21/2020",
                                STARTING_SALARY);
                        Employee margaret = new Employee(
                                3,
                                "Margaret",
                                "Thompson",
                                "mthompson@teams.com",
                                marketing,
                                "08/21/2020",
                                STARTING_SALARY);

                        // give Angie a 10% raise, she is doing a great job!
                        angie.raiseSalary(.10);

                // print all employees
                printEmployees();

                // create the TEams project
                createTeamsProject();
                class Project {
                    String name;
                    String description;
                    String startDate;
                    String dueDate;
                    List<Employee> teamMembers;

                    //creating the project constructor

                }
                // create the Marketing Landing Page Project
                createLandingPageProject();

                // print each project name and the total number of employees on the project
                printProjectsReport();
            }

            /**
             * Create departments and add them to the collection of departments
             */
            private void createDepartments() {
            }

            /**
             * Print out each department in the collection.
             */
            private void printDepartments() {
                System.out.println("------------- DEPARTMENTS ------------------------------");

            }

            /**
             * Create employees and add them to the collection of employees
             */
            private void createEmployees() {

            }

            /**
             * Print out each employee in the collection.
             */
            private void printEmployees() {
                System.out.println("\n------------- EMPLOYEES ------------------------------");

            }

            /**
             * Create the 'TEams' project.
             */
            private void createTeamsProject() {

            }

            /**
             * Create the 'Marketing Landing Page' project.
             */
            private void createLandingPageProject() {

            }

            /**
             * Print out each project in the collection.
             */
            private void printProjectsReport() {
                System.out.println("\n------------- PROJECTS ------------------------------");

            }

        }
