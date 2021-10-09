package xml.parsing.with_object;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SAXWithObjectMain {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        SandwichHandler sh = new SandwichHandler();
        File file = new File("C:\\Users\\Arsen\\IdeaProjects\\jsonLesson\\src\\main\\java\\xml\\parsing\\with_object\\sandwich.xml");
        if (file.exists()) {
            parser.parse(file, sh);
            Sandwich sandwich = sh.getSandwich();
            System.out.println(sandwich.getTitle());
            List<Ingridient> ingridients = sandwich.getIngridients();
            for (Ingridient ingridient : ingridients) {
                System.out.println(ingridient.getTitle());
            }
        }

    }
}
