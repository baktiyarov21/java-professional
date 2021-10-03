package xml.parsing.stax;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, XMLStreamException {
        XMLInputFactory factory = XMLInputFactory.newFactory();

        Reader reader = new FileReader("C:\\Users\\Arsen\\IdeaProjects\\jsonLesson" +
                "\\src\\main\\java\\xml\\parsing\\stax\\people.xml");

        XMLStreamReader xmlStreamReader = factory.createXMLStreamReader(reader);

        while (xmlStreamReader.hasNext()) {

            switch (xmlStreamReader.next()) {
                case XMLStreamReader.START_ELEMENT:
                    String elem = xmlStreamReader.getName().toString();
                    switch (elem) {
                        case "person":
                            for (int i = 0; i < xmlStreamReader.getAttributeCount(); i++) {
                                String attributeName = xmlStreamReader.getAttributeLocalName(i);
                                String attributeValue = xmlStreamReader.getAttributeValue(i);
                                System.out.println(attributeName + " " + attributeValue);
                            }
                        break;
                        case "name":
                            String name = xmlStreamReader.getElementText();
                            System.out.println("Name: " + name);
                            break;
                        case "last_name":
                            System.out.println("Last Name: " + xmlStreamReader.getElementText());
                            break;
                        case "age":
                            System.out.println("Age" + xmlStreamReader.getElementText());
                            break;
                    }
                    System.out.println("Start element: " + elem);
                case XMLStreamReader.END_ELEMENT:
                    System.out.println("End element " + xmlStreamReader.getName());
                    break;

            }
        }
    }

    public static void main2() throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setIgnoringElementContentWhitespace(true);
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse("C:\\Users\\Arsen\\IdeaProjects\\jsonLesson\\new_people.xml");

        Element root = document.getDocumentElement();
        System.out.println(root.getNodeName());
        System.out.println(root.getNodeType());
        NodeList list = document.getElementsByTagName("person");
        for (int i = 0; i < list.getLength(); i++) {
            Node node = list.item(i);
            System.out.println("Name: " + root.getElementsByTagName("name").item(i).getFirstChild().getTextContent());
            NodeList nodeList = document.getElementsByTagName("name");
            for (int j = 0; j < list.getLength(); j++) {
                Node node1 = nodeList.item(i);
                System.out.println("Born year: " + node1.getAttributes().item(0).getNodeValue());
            }
            System.out.println("Last name: " + root.getElementsByTagName("last_name").item(i).getFirstChild().getTextContent());

        }

    }
}
