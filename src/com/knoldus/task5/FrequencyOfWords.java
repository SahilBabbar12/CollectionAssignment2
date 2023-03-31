package com.knoldus.task5;

import java.util.*;


public class FrequencyOfWords {

    public static void countingFrequency(String[] words){
        HashMap<String, Integer> map = new HashMap<>();

        // find the frequency of each word in the given sentence.
        for(int i = 0; i< words.length; i++){
            if(map.containsKey(words[i])){
                map.put(words[i], map.get(words[i]) + 1);
            }
            else{
                map.put(words[i], 1);
            }
        }
        System.out.println("Frequency of each word in the given sentence"  + map);

        //map conversion to list
        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());

        //sort the list using comparator
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> object1, Map.Entry<String, Integer> object2) {
                return object2.getValue().compareTo(object1.getValue());
            }
        });

        System.out.println("Sorted list in descending order : " + list);

        //displaying the top 10 words with highest occurrence
        for(int i=0; i<10; i++){
            Map.Entry<String,Integer> entry = list.get(i);
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

    public static void main(String[] args) {
        //words as keys and frequency as values

        String sentence = "As I was walking walking walking down the street street street, " +
                "I saw saw saw a group of people chanting chanting chanting loudly, and as I got closer closer closer";
        String[] words = sentence.split(" ");
        FrequencyOfWords.countingFrequency(words);

    }
}
