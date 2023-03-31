package com.knoldus.task7;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class SorttheStrings {
    public static void main(String[] args) {
        HashSet<String>stringHashSet=new HashSet<>();

        Scanner input =new Scanner(System.in);

        int number=input.nextInt();
        for(Integer count =1;count<=number;count++){

            stringHashSet.add(input.next());
        }
        Set<String> sortedSet = stringHashSet.stream().sorted().collect(Collectors.toCollection(HashSet::new));

    }
}
