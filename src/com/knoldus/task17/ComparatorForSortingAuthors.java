package com.knoldus.task17;

import java.util.Comparator;

// comparator for sorting by author name.
public class ComparatorForSortingAuthors implements Comparator<Book>
{

    @Override
    public int compare(Book book1, Book book2) {
        return book1.author.compareTo(book2.author);
    }
}