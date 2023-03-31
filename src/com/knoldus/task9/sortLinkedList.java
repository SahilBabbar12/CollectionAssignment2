package com.knoldus.task9;



import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class sortLinkedList
{
    public static void main(String[] args) {
        // Create a LinkedList of custom objects.
        LinkedList<Employee> listOfEmployee = new LinkedList<Employee>();
        listOfEmployee.add(new Employee("Sahil"));
        listOfEmployee.add(new Employee("Abhi"));
        listOfEmployee.add(new Employee("Riya"));

        // Sort the LinkedList by the "name" field.
        Collections.sort(listOfEmployee, new Comparator<Employee>() {
            @Override
            public int compare(Employee employee1, Employee employee2) {
                return employee1.getName().compareTo(employee2.getName());
            }
        });

        // Print the sorted LinkedList.
        for (Employee employee : listOfEmployee) {
            System.out.println(employee.getName());
        }
    }
}