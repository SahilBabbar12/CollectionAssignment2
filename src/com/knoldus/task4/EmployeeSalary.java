package com.knoldus.task4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeSalary {


    public static void main(String[] args) {
        System.out.println("Enter the number of employees you want to add ");
        Scanner input =new Scanner(System.in);

        Integer number=input.nextInt();

        // creating a salaryMap that has  employeeName  as key and Salary as value.
        HashMap<String,Double>salaryMap=new HashMap<>();
        Integer count=1;
        while(count<=number){
            System.out.println("Enter the name of employee: "+count);
            String employeeName=input.next();
            System.out.println("Enter the salary: ");
            Double salary=input.nextDouble();

            // adding employeeName and salary into salaryMap.
            salaryMap.put(employeeName,salary);
            count++;
        }


        // Iterating on the salaryMap and increament the salary by 5% whose salary is less than 50000
        for (Map.Entry<String, Double> entry : salaryMap.entrySet()) {
            if (entry.getValue() < 50000.0) {
                double newSalary = entry.getValue() * 1.05;
                salaryMap.put(entry.getKey(), newSalary);
            }
        }

        for (String name:salaryMap.keySet()){
            System.out.println("name : "+name+" , Incremented Salary: "+salaryMap.get(name));
        }

    }
}
