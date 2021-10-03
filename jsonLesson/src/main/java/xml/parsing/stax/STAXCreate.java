package xml.parsing.stax;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class STAXCreate {
    public static void main(String[] args) throws IOException, XMLStreamException {
        XMLOutputFactory factory = XMLOutputFactory.newFactory();
        XMLStreamWriter writer = factory.createXMLStreamWriter(new FileWriter("new_people.xml"));
        writer.writeStartDocument();

        writer.writeStartElement("people");
        writer.writeStartElement("person");

        writer.writeStartElement("name");

        writer.writeAttribute("born_year","2011");
        writer.writeCharacters("Arsen");
        writer.writeEndElement();

        writer.writeStartElement("last_name");
        writer.writeCharacters("Baktiyarov");
        writer.writeEndElement();

        writer.writeEndElement();
        writer.writeEndElement();

        writer.flush();
        writer.close();
    }
}
