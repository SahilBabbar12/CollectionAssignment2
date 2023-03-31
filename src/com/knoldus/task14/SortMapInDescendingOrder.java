package com.knoldus.task14;

import java.util.*;


public class SortMapInDescendingOrder {
    public static void main(String[] args) {

        // creating and adding values to hashmap.
        HashMap<String, Integer> productMap = new HashMap<>();
        productMap.put("Product1", 500);
        productMap.put("Product2", 600);
        productMap.put("Product3", 700);
        productMap.put("Product4", 800);

        ArrayList<Integer> priceList = new ArrayList<>();

        // Loop to put the values of map in list.
        for (Map.Entry<String, Integer> entry : productMap.entrySet()) {
            priceList.add(entry.getValue());
        }
        // sorting the list using comparator.
        Collections.sort(priceList, new Comparator<Integer>() {
            @Override
            public int compare(Integer price1, Integer price2) {
                return price2.compareTo(price1);
            }
        });
        System.out.println(priceList);
        LinkedHashMap<String, Integer> sorted_Map = new LinkedHashMap<>();
        for (Integer price : priceList) {
            for (Map.Entry<String, Integer> entry : productMap.entrySet()) {
                if (entry.getValue().equals(price))
                    sorted_Map.put(entry.getKey(), price);
            }
        }
        System.out.println(sorted_Map);

    }
}
