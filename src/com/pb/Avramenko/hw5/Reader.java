package com.pb.Avramenko.hw5;

public class Reader {
    String name;
    String readerNumber;
    String faculty;
    String date;
    String number;
    public void takeBook(String... titles) {
        System.out.println(name + "взял: ");
        for (String title: titles){
            System.out.println(title);
        }
    }
    public void takeBook(int count) {
        System.out.println(name + "взял: " +count +"книги" );
    }
    public void takeBook(Book... books) {
        System.out.println(name + "взял книги: ");
        for (Book book: books){
            System.out.println(book.title+"("+book.autor+book.year+"), ");
        }
    }
    public void returnBook(String... titles) {
        System.out.println(name + "вернул: ");
        for (String title: titles){
            System.out.println(title);
        }
    }
    public void returnBook(int count) {
        System.out.println(name + "вернул: " +count +"книги" );
    }
    public void returnBook(Book... books) {
        System.out.println(name + "вернул книги: ");
        for (Book book: books){
            System.out.println(book.title+"("+book.autor+book.year+"), ");
        }
    }
}
