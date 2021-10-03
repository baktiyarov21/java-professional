package xml.parsingjaxb;

import java.util.ArrayList;
import java.util.List;

public class Books {
    private List<Book> books = new ArrayList<>();

    public void add(Book book) {
        books.add(book);
    }

    @Override
    public String toString() {
        return "Books{" +
                "books=" + books +
                '}';
    }
}
