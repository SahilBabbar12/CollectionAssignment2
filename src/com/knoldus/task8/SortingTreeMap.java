package com.knoldus.task8;

import java.util.*;

public class SortingTreeMap {
    public static void main(String[] args) {
        Map<String , Integer> map = new TreeMap<String , Integer>();
        map.put("Sahil", 50);
        map.put("Rahul", 100);
        map.put("Jasleen" , 60);
        map.put("Mohit", 20);
        map.put("Riya", 5);

        ArrayList<Map.Entry<String,Integer>> list = new ArrayList<>();

        // Copy the key-value pairs from the TreeMap to the ArrayList
        for(Map.Entry<String , Integer> entry : map.entrySet()){
            list.add(entry);
        }

        // Sort the ArrayList in descending order based on the values of the key-value pairs
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> stringIntegerEntry, Map.Entry<String, Integer> nextStringIntegerEntry) {

                return nextStringIntegerEntry.getValue().compareTo(stringIntegerEntry.getValue());
            }
        });

        // Create a LinkedHashMap to store the sorted key-value pairs
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();

        for(Map.Entry<String, Integer> entry : list){
            sortedMap.put(entry.getKey(), entry.getValue());

        }

        // Print the sorted key-value pairs
        System.out.println(sortedMap);

    }
}
