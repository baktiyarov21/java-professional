package xml.parsingjaxb;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Books books = new Books();
        books.add(new Book("You", "KEroline","32",212));

        File file = new File("C:\\Users\\Arsen\\IdeaProjects\\jsonLesson\\new_books.xml");
    }
}
