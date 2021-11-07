package com.pb.Avramenko.hw5;

public class Library {
    public static void main(String[] args){
        Book [] books = new Book [3];
        books[0] = new Book("Энциклопедия1", "ПетровИван", 1985);
        books[1] = new Book("Приключения","ПетровПетр",1986);
        books [2] = new Book("Фантастика","ПетровМаксим",1987);
        Reader [] readers = new Reader [3];
        readers [0] = new Reader("Васичкин","П12","Филологический","12.01.1991","09511111111");
        readers [1] = new Reader("Конарейкина","З13","Юридический","12.02.1992","09533333333");
        readers [2] = new Reader("Фиалкова","Щ12","Экономический","12.03.1993","09544444444");

        for (int i=0;i<books.length;i++)
        {
            System.out.println(books[i].getInfo());
        }
        for (int i=0;i<readers.length;i++)
        {
            System.out.println(readers[i].getInfo());
        }
        readers [0].takeBook (books[0].title,books[2].title);
        readers [2].takeBook(3);
        readers [1].takeBook(books[0],books[2]);
        readers [0].returnBook (books[0].title,books[2].title);
        readers [2].returnBook(3);
        readers [1].returnBook(books[0],books[2]);

    }
}


