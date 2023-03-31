package com.knoldus.task15;

import java.util.Comparator;

// sorting age using comparator.
public class ComparatorForSortingAge implements Comparator<Person>
{

    @Override
    public int compare(Person person1, Person person2) {
        return person1.age-person2.age;
    }
}