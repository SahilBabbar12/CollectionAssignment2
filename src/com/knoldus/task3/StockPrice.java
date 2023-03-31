package com.knoldus.task3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StockPrice {

    // highestPrice method that  calculates the maximum price and displays the Stock Symbol of maxPrice.
    public static void highestPrice (HashMap<String,Double> stockPrices){
        Double maxPrice=Collections.max(stockPrices.values());
        for(Map.Entry<String,Double> entry:stockPrices.entrySet()){
            if(entry.getValue()==maxPrice)
                System.out.println("Stock symbol with maxPrice: "+entry.getKey());
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the number of stocks you want to add ");
        Scanner input =new Scanner(System.in);

        Integer number=input.nextInt();
        HashMap<String,Double> stockPrices =new HashMap<>();

        Integer count=1;
        while(count<=number){
            System.out.println("Enter the stock symbol: ");
            String stockSymbol=input.next();
            System.out.println("Enter the stock price: ");
            Double price=input.nextDouble();

            // adding stockSymbol and price into Hashmap.
            stockPrices.put(stockSymbol,price);
            count++;
        }

        highestPrice(stockPrices);

        
    }
}
