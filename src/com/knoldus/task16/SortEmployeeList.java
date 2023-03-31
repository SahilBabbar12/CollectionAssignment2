package com.knoldus.task16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortEmployeeList
{
    public static void main(String[] args) {
        Scanner takeInput = new Scanner(System.in);
        List<Employee> listOfEmployees = new ArrayList<>();
        System.out.println("Enter the number of employees: ");
        Integer numberOfEmplolyees = takeInput.nextInt();
        String name;
        Integer id;
        Double salary;
        for(Integer index = 0; index<numberOfEmplolyees; index++){
            System.out.println("Enter the name: "+index);
            name = takeInput.nextLine();
            name = takeInput.nextLine();
            System.out.println("Enter the id"+index);
            id = takeInput.nextInt();
            System.out.println("Enter the salary"+index);
            salary = takeInput.nextDouble();
            Employee employee = new Employee(name, id, salary);
            listOfEmployees.add(employee);
        }

        // sorting employees.
        Collections.sort(listOfEmployees);
        System.out.println(listOfEmployees);
    }
}