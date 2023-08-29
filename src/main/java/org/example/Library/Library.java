package org.example.Library;

import org.example.Book.Book;

import java.util.Arrays;

public class Library {

    Book[] Books;

    public Book[] getBooks() {
        return Books;
    }

    public void setBooks(Book[] books) {
        Books = books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "Books=" + Arrays.toString(Books) +
                '}';
    }
}
