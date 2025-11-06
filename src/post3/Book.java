package post3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Book {
    String name;
    int isbn;

    public Book(String name, int isbn) {
        this.name = name;
        this.isbn = isbn;
    }

    public static void main(String[] args) {
        List<Book> books = List.of(new Book("c", 1), new Book("b", 2), new Book("a", 3));
        var c = books.stream().sorted(Comparator.comparing((book) -> book.name));
        c.forEach(a -> System.out.println(a.name));

    }
}
