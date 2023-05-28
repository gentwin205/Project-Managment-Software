package com.techelevator;

import javax.print.attribute.standard.MediaSize;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.DeflaterOutputStream;

public class Application {

    public List<Department> departments = new ArrayList<>();
    public List<Employee> employees = new ArrayList<>();

    /**
     * The main entry point in the application
     *
     * @param args
     */
    public static void main(String[] args) {
        Application app = new Application();
        app.run();
    }


    private void run() {
                // create some departments
                createDepartments();



                // print each department by name
                printDepartments();

                // create employees
                createEmployees();

                //creating a method for raising Angie's salary

                //no-argument constructor needs to be used for dean


                //creating an all argument constructor to use for angie and margaret

                // give Angie a 10% raise, she is doing a great job!


                // print all employees
                printEmployees();

                // create the TEams project
                createTeamsProject();



                // create the Marketing Landing Page Project
                createLandingPageProject();

                // print each project name and the total number of employees on the project
                printProjectsReport();


                    }

                    /**
                     * Create departments and add them to the collection of departments
                     */
                    private void createDepartments() {
                        Department Marketing = new Department(1,"Marketing");
                        Department Sales = new Department(2, "Sales");
                        Department Engineering = new Department(3,"Engineering");
                        departments.add(Marketing);
                        departments.add(Sales);
                        departments.add(Engineering);



                    }



                    /**
                     * Print out each department in the collection.
                     */
                    private void printDepartments() {
                        System.out.println("------------- DEPARTMENTS ------------------------------");
                        for (int i = 0; i < departments.size(); i++) {
                            System.out.println(departments.get(i).getName());

                        }

                    }

                    /**
                     * Create employees and add them to the collection of employees
                     */
                    private void createEmployees() {

                        Employee dean = new Employee();
                        Employee angie = new Employee(2, "Angie", "Smith", "asmith@teams.com", departments.get(2), "08/21/2020");
                        Employee margaret = new Employee(3,"Margaret","Thompson","mthompson@teams.com",departments.get(0),"08/21/2020" );
                        employees.add(dean);
                        employees.add(angie);
                        employees.add(margaret);
                        }



                    /**
                     * Print out each employee in the collection.
                     */
                    private void printEmployees() {
                        System.out.println("\n------------- EMPLOYEES ------------------------------");
                        for (int i = 0; i < employees.size(); i++) {
                            // Couldn't figure out how to add the department. I tried using employees.get(i).getDepartment().getName(), but that gives me a null pointer error.
                            // Also couldn't figure out how to add Angie's raise.
                            System.out.println((employees.get(i).getFullName()) + " " + "(" + (employees.get(i).getSalary()) + ")" + " ");
                        }

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

