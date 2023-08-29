package org.example;

import org.example.Book.Book;
import org.example.Library.Library;

import java.util.Arrays;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        Library library = new Library();
        Book hdrT1 = new Book();
        hdrT1.setTitle("Herr der Ringe Teil 1");
        hdrT1.setIsbn("234-234-2234-25-245");
        hdrT1.setAuthor("J.R. Tolkien");

        Book hdrT2 = new Book();
        hdrT2.setTitle("Herr der Ringe Teil 2");
        hdrT2.setIsbn("984-234-2234-26-245");
        hdrT2.setAuthor("J.R. Tolkien");

        Book hdrT3 = new Book();
        hdrT3.setTitle("Herr der Ringe Teil 3");
        hdrT3.setIsbn("111-234-2134-26-245");
        hdrT3.setAuthor("J.R. Tolkien");



        Book dkH = new Book("Der kleine Hobbit", "J.R. Tolkien", "29038402384");

        Book[] arrayBooks = {hdrT1, hdrT2, hdrT3, dkH};



        System.out.println(Arrays.toString(arrayBooks));
    }

}