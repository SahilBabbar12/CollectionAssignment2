package com.knoldus.task13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ShuffleTheList {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the number of elements you want to add into the list");
        Integer numberOfElements=input.nextInt();
        System.out.println("Enter the numbers");
        List<Integer>list=new ArrayList<>();
        for (Integer count=1;count<=numberOfElements;count++){
            list.add(input.nextInt());
        }

        System.out.println("Original list: ");
        for (Integer number:list){
            System.out.print(number+ " ");
        }
        // Shuffle the list using Collections.shuffle() method
        Collections.shuffle(list);

        System.out.println("\nAfter shuffling the order of the list: ");
        for (Integer number:list){
            System.out.print(number+" ");
        }
    }
}
