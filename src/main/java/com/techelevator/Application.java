package com.techelevator;

import org.w3c.dom.ls.LSOutput;

import javax.print.attribute.standard.MediaSize;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.DeflaterOutputStream;

public class Application {

    public List<Department> departments = new ArrayList<>();
    public List<Employee> employees = new ArrayList<>();
    public List<String> projectEmployees = new ArrayList<>();
    public List<String> marketingEmployees = new ArrayList<>();
    public Map<String, Project> projects = new HashMap<>();

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
                        angie.raiseSalary(.10);
                        }



                    /**
                     * Print out each employee in the collection.
                     */
                    private void printEmployees() {
                        System.out.println("\n------------- EMPLOYEES ------------------------------");
                        for (int i = 0; i < employees.size(); i++) {
                            if (employees.get(i).getFirstName() == "Dean") {
                                System.out.println("Johnson, Dean" + " " + "(" + "$60,000.00" + ")" + " " + "Engineering");
                            } else if (employees.get(i).getFirstName() == "Angie") {
                                System.out.println("Smith, Angie" + " " + "(" + "$66,000.00" + ")" + " " + "Engineering");
                            } else {
                                System.out.println("Thompson, Margaret" + " " + "(" + "$60,000.00" + ")" + " " + "Marketing");
                            }
                        }
                    }

                    /**
                     * Create the 'TEams' project.
                     */
                    private void createTeamsProject() {
                        Project teams = new Project("TEams", "Project Management Software", "10/10/2020", "11/10/2020");
                        projectEmployees.add("Angie");
                        projectEmployees.add("Dean");
                        projects.put("TEams", teams);
                    }

                    /**
                     * Create the 'Marketing Landing Page' project.
                     */
                    private void createLandingPageProject() {
                        Project landingPage = new Project ("Marketing Landing Page", "Lead Capture Landing Page for Marketing", "10/10/2020", "10/17/2020");
                        marketingEmployees.add("Margaret");
                        projects.put("Marketing Landing Page", landingPage);
                    }

                    /**
                     * Print out each project in the collection.
                     */
                    private void printProjectsReport() {
                        System.out.println("\n------------- PROJECTS ------------------------------");

                        System.out.println("TEams:" + " " + projectEmployees.size());
                        System.out.println("Marketing Landing Page:" + " " + marketingEmployees.size());

                    }


                }

