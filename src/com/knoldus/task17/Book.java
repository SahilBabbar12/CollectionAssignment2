package com.knoldus.task17;

public class Book
{
    String title;
    String author;
    Double price;

    Book(String title, String author, Double price)
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }


}