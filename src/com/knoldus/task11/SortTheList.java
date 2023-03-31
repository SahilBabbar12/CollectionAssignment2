package com.knoldus.task11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortTheList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to add in the ArrayList ");
        int size = input.nextInt();
        System.out.println("Enter the names to be sorted : ");
        for(int i=0; i<size;i++){
            String input_names = input.next();
            list.add(input_names);
        }

        Collections.sort(list);
        System.out.println("List of names in ascending order is : " + list);

    }
}
