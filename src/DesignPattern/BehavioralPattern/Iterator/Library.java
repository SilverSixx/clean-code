package DesignPattern.BehavioralPattern.Iterator;

import java.util.ArrayList;
import java.util.List;

public class Library implements BookCollection{

    private final List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public Iterator<Book> createIterator() {
        return new BookIterator(books);
    }
}
