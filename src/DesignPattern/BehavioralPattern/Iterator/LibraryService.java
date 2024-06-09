package DesignPattern.BehavioralPattern.Iterator;

public class LibraryService {

    private final Library library;

    public LibraryService(Library library) {
        this.library = library;
    }

    public void displayBooks() {
        Iterator<Book> iterator = library.createIterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book.getTitle());
        }
    }
}