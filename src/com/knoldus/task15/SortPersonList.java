package com.knoldus.task15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortPersonList
{
    public static void main(String[] args) {
        Scanner takeInput = new Scanner(System.in);
        List<Person> personList = new ArrayList<>();
        System.out.println("Enter the number of persons: ");
        Integer numberOfEntries = takeInput.nextInt();
        for(Integer index = 0; index<numberOfEntries; index++){
            System.out.println("Enter the name: "+index);
            String name = takeInput.nextLine();
            System.out.println("Enter the age"+index);
            Integer age = takeInput.nextInt();
            Person person = new Person(name, age);
            personList.add(person);
        }
        // sorting list using comparator.
        Collections.sort(personList, new ComparatorForSortingAge());
        System.out.println(personList);

    }

}