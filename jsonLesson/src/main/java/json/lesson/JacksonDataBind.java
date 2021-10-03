package json.lesson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class JacksonDataBind {
    public static void parseJson(String path) throws IOException {
//        ObjectMapper objectMapper = new ObjectMapper();
//
//        Person person = null;
//        person = objectMapper.readValue(new File(path),Person.class);
//        System.out.println(person);
//        System.out.println(person.getPersonalContacts());

        ObjectMapper objectMapper = new ObjectMapper();


        json.lesson.CurrencyRate[] currencyRates = objectMapper.readValue(new URL(path).openStream(), json.lesson.CurrencyRate[].class);
        for (CurrencyRate currencyRate : currencyRates) {
            System.out.println(currencyRate);
        }

        String  jsonString =    objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(currencyRates);
        Files.write(Paths.get("C:\\Users\\Arsen\\IdeaProjects\\jsonLesson\\src\\main\\resources\\jacksonCurrency.json"),
                jsonString.getBytes(), StandardOpenOption.CREATE);

    }
}
