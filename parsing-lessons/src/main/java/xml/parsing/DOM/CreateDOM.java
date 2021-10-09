package xml.parsing.DOM;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class CreateDOM {
    public static void main(String[] args) throws ParserConfigurationException, FileNotFoundException, TransformerException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setIgnoringElementContentWhitespace(true);
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document document = db.newDocument();
        Element root = document.createElement("new_books");
        Element book = document.createElement("book");
        Element title = document.createElement("title");
        Element author = document.createElement("author");
        book.setAttribute("id", "01");
        author.setTextContent("Karoline Kepnes");
        book.appendChild(title);
        book.appendChild(author);
        root.appendChild(book);
        document.appendChild(root);


        DOMSource domSource = new DOMSource(document);
        String outputUrl = "new_books.xml";

        StreamResult streamResult = new StreamResult(new FileOutputStream(new File(outputUrl)));

        TransformerFactory factory = TransformerFactory.newInstance();
        Transformer transformer = factory.newTransformer();
        transformer.transform(domSource,streamResult);

    }
}
