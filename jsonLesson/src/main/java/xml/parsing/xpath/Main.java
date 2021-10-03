package xml.parsing.xpath;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.xpath.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws XPathExpressionException, FileNotFoundException {
        XPathFactory factory = XPathFactory.newInstance();
        XPath xPath = factory.newXPath();
        XPathExpression expression = xPath.compile("people/person[name='Argen']/*");

        File file = new File("C:\\Users\\Arsen\\IdeaProjects\\jsonLesson\\new_people.xml");

        InputSource source = new InputSource(new FileInputStream(file));
        Object result = expression.evaluate(source, XPathConstants.NODESET);

        NodeList list = (NodeList) result;

        for (int i = 0; i < list.getLength(); i++) {
            Node node = list.item(i);
            System.out.println(node.getNodeName());
            System.out.println(node.getFirstChild().getNodeValue());
            System.out.println();
        }

    }
}
