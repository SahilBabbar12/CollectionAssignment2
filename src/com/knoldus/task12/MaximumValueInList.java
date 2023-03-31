package com.knoldus.task12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaximumValueInList {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the number of elements you want to add into the list");
        Integer numberOfElements=input.nextInt();
        System.out.println("Enter the numbers");
        List<Integer>list=new ArrayList<>();
        for (Integer count=1;count<=numberOfElements;count++){
            list.add(input.nextInt());
        }

        // displaying the maximum number in the list using Collections.max() method
        System.out.println("Maximum element in the list:"+ Collections.max(list));


    }
}
