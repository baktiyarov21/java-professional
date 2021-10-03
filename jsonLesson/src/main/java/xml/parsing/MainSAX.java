package xml.parsing;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class MainSAX {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        SAXParser saxParser = saxParserFactory.newSAXParser();
        File file = new File("C:\\Users\\Arsen\\IdeaProjects\\jsonLesson\\src\\main\\java\\dtd_test.xml");

        if (file.exists())
            saxParser.parse(file, new MyHandler());
    }
}
