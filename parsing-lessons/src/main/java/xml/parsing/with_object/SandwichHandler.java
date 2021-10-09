package xml.parsing.with_object;

import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.io.IOException;

public class SandwichHandler extends DefaultHandler {

    private Sandwich sandwich;
    private String currentQName;
    private int count;

    public SandwichHandler() {
        sandwich = new Sandwich();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println("Start element: " + qName);
        currentQName = qName;
        count = (attributes.getLength() > 0) ? Integer.parseInt(attributes.getValue(0)) : 1;
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        System.out.println("End element: " + qName);
        currentQName = "";
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String value = new String(ch, start, length);
        System.out.println("Characters: " + value);
            switch (currentQName) {
                case "title":
                    sandwich.setTitle(value);
                    break;
                case "ingridient":
                    for (int i = 0; i < count; i++)
                        sandwich.addIngridients(new Ingridient(value));
            }
    }

    public Sandwich getSandwich() {
        return sandwich;
    }
}
