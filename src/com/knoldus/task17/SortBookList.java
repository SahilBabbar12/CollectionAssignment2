package com.knoldus.task17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortBookList
{
    public static void main(String[] args) {
        Scanner takeInput = new Scanner(System.in);
        List<Book> listOfBooks = new ArrayList<>();
        System.out.println("Enter the number of books: ");
        Integer numberOfBooks = takeInput.nextInt();
        String title;
        String author;
        Double price;
        for(Integer index = 0; index<numberOfBooks; index++){
            System.out.println("Enter the title: "+index);
            title = takeInput.nextLine();
            title = takeInput.nextLine();
            System.out.println("Enter the author"+index);
            author = takeInput.nextLine();
            System.out.println("Enter the price"+index);
            price = takeInput.nextDouble();
            Book book = new Book(title, author, price);
            listOfBooks.add(book);
        }

        System.out.println("Sorting the list by title");
        // sorting books by authors name
        Collections.sort(listOfBooks, new ComparatorForSortingAuthors());

        System.out.println(listOfBooks);

        // sorting books by price.
        System.out.println("Sorting the list by price");
        Collections.sort(listOfBooks, new ComparatorForSortingPrice());

        System.out.println(listOfBooks);
    }
}