package xml.parsing.DOM;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BookHelper {
    private Document document;
    public BookHelper() throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setIgnoringElementContentWhitespace(true);
        DocumentBuilder builder = dbf.newDocumentBuilder();
        document = builder.parse(new File("C:\\Users\\Arsen\\IdeaProjects\\jsonLesson" +
                "\\src\\main\\java\\xml\\parsing\\DOM\\books.xml"));
    }

    public List<Book> getAll() {
        List<Book> books = new ArrayList<>();

        Element root = document.getDocumentElement();
        NodeList list = document.getElementsByTagName("book");
        for (int i = 0; i < list.getLength(); i++){
            Node node = list.item(i);
            Book book = new Book();
            String title = root.getElementsByTagName("title").item(i).getFirstChild().getTextContent();
            String author = root.getElementsByTagName("author").item(i).getFirstChild().getTextContent();
            String id = node.getAttributes().item(0).getNodeValue();
            long isnb = Long.parseLong(node.getAttributes().item(1).getNodeValue());
            book.setTitle(title);
            book.setAuthor(author);
            book.setId(id);
            book.setIsnb(isnb);
            books.add(book);
        }
        return books;
    }
    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
        BookHelper bookHelper = new BookHelper();
        List<Book> books = bookHelper.getAll();
        for (Book book : books) {
            System.out.println(book.toString());
        }

    }
}


