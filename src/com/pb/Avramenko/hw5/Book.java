package com.pb.Avramenko.hw5;

public class Book {
     String title;
    String author;
     int year;
    public Book (String title, String author,int year) {
        this.title = title;
        this.author = author;
        this.year=year;

    }
    String getInfo() {
        return "[название: " + title + ", автор книги: " + author + ", год издания: "
                + year + "]";
    }

}
