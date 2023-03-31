package com.knoldus.task2;

import java.util.HashMap;
import java.util.Scanner;


public class StudentGrade {
    public static void main(String[] args) {

        System.out.println("Enter the number of students you want to add ");
        Scanner input =new Scanner(System.in);

        Integer number=input.nextInt();

        HashMap<String,Grade> gradesMap=new HashMap<>();

        for(Integer count=1;count<=number;count++){

            System.out.println("Enter the name of person "+count);
            String name= input.next();
            System.out.println("Enter the grade of subject1 ");
            Double subject1_marks= input.nextDouble();
            System.out.println("Enter the grade of subject2 ");
            Double subject2_marks= input.nextDouble();
            System.out.println("Enter the grade of subject3 ");
            Double subject3_marks= input.nextDouble();

           // adding name and grade to the gradesMap
            gradesMap.put(name,new Grade(subject1_marks,subject2_marks,subject3_marks));

        }

        // Calculate the average grade for all students.

        double sumOfAllgrades = 0.0;
        for (String name : gradesMap.keySet()) {

            Grade grade=gradesMap.get(name);
            sumOfAllgrades=grade.subjectOneGrade+grade.subjectTwoGrade+grade.subjectThreeGrade;
            double averageGrade = sumOfAllgrades / gradesMap.size();
            System.out.println("Student name :"+ name+ " AverageGrade: " + averageGrade);
        }





    }
}
