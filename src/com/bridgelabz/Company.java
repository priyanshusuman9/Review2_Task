package com.bridgelabz;
import java.util.ArrayList;
import java.util.Scanner;
class Company {
    public void companydetails() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Department : ");
        String name = scanner.next();

        ArrayList<String> department = new ArrayList<>();
        ArrayList<String> services = new ArrayList<>();
        ArrayList<String> career = new ArrayList<>();
        department.add("IT");
        services.add("Software Solution");
//            services.add("ERP");
//            services.add("Management Data Apps");
//            services.add("Software Solution");
        career.add("Developer");
//            career.add("Backend Developer");
//            career.add("Analyst");
//            career.add("Data Scientist");
        department.add("Management");
        services.add("Management Solution");
//            services.add("Digital Marketing");
//            services.add("Consultancy");
        career.add("HR");
//            career.add("Researcher");
//            career.add("Business Developer");
//            career.add("Mis");
        for (int i = 0; i < department.size(); i++) {
            if (department.get(i).equalsIgnoreCase(name)) {
                System.out.println("Service : " + services.get(i));
                System.out.println("Career : " + career.get(i));
            }
        }
    }}


        class Employee extends Company {
            public void employeedetails() {



                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter a Employee Name : ");
                    String name = scanner.next();

                    ArrayList<String> empnames = new ArrayList<>();
                    ArrayList<String> empnumbers = new ArrayList<>();
                    ArrayList<String> empaddress = new ArrayList<>();
                    empnames.add("Priyanshu");
                    empnumbers.add("37489403");
                    empaddress.add("abc");
                    empnames.add("Harish");
                    empnumbers.add("7458399303");
                    empaddress.add("abc");
                    empnames.add("Tarun");
                    empnumbers.add("748573903");
                    empaddress.add("abc");


                    for (int i = 0; i < empnames.size(); i++) {
                        if (empnames.get(i).equalsIgnoreCase(name)) {
                            System.out.println("Employee Number: " + empnumbers.get(i));
                            System.out.println("Employee Address: " + empaddress.get(i));
                        }
                    }

                }

            }


class CompanyMain extends Employee{
    public static void main(String[] args) {
        Company S = new Company();
        S.companydetails();
        Employee T = new Employee();
        T.employeedetails();


    }

}


