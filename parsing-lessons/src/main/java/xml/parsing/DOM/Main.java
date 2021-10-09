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

public class Main {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setIgnoringElementContentWhitespace(true);
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document document = db.parse(new File("C:\\Users\\Arsen\\IdeaProjects\\jsonLesson" +
                "\\src\\main\\java\\xml\\parsing\\DOM\\books.xml"));
        Element root = document.getDocumentElement();
        System.out.println(root.getNodeName());
        System.out.println(root.getNodeType());
        NodeList list = document.getElementsByTagName("book");
        for (int i = 0; i < list.getLength(); i++) {
            Node node = list.item(i);
            System.out.println("Book title " + root.getElementsByTagName("title").item(i).getFirstChild().getTextContent());
            System.out.println("Books author " + root.getElementsByTagName("author").item(i).getFirstChild().getTextContent());
            System.out.println("ID " + node.getAttributes().item(0).getNodeValue());
            System.out.println("ISNB " + node.getAttributes().item(1).getNodeValue());
        }
        System.out.println();
        System.out.println();
        xml.parsing.stax.Main.main2();
    }
}
