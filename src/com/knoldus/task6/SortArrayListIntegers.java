package com.knoldus.task6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortArrayListIntegers {
    public static void main(String[] args) {
        ArrayList<Integer>integerList=new ArrayList<>();

        System.out.println("Enter the number of elements u want to add in list: ");
        Scanner input =new Scanner(System.in);
        Integer numberOfElements= input.nextInt();

        System.out.println("Enter the numbers: ");
        for (Integer count=0;count<numberOfElements;count++){
            integerList.add(input.nextInt());
        }

        System.out.println("Original list: ");
        for (Integer number:integerList){
            System.out.print(number+ " ");
        }

        // sort the list using Collections.sort() method
        Collections.sort(integerList);

        System.out.println("\nSorted list: ");
        for (Integer number:integerList){
            System.out.print(number+" ");
        }

    }
}
