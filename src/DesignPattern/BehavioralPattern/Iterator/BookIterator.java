package DesignPattern.BehavioralPattern.Iterator;

import java.util.List;

public class BookIterator implements Iterator<Book> {
    private final List<Book> books;
    private int position;

    public BookIterator(List<Book> books) {
        this.books = books;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < books.size();
    }

    @Override
    public Book next() {
        if (hasNext()) {
            return books.get(position++);
        }
        throw new RuntimeException("No more elements");
    }
}

