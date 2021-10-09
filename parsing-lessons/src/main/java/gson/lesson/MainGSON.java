package gson.lesson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class MainGSON {

    public static void main(String[] args) throws IOException {
        MainGSON.parseJSONWithGSON("https://api.privatbank.ua/p24api/pubinfo?json&exchange&coursid=5");
    }

    public static void parseJSONWithGSON(String url) throws IOException {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();

        JsonReader jsonReader = new JsonReader(new InputStreamReader(new URL(url).openStream()));
        CurrencyRate[] currencyRates = gson.fromJson(jsonReader, CurrencyRate[].class);
        for (CurrencyRate currencyRate : currencyRates) {
            System.out.println(currencyRate);
        }

        String  gsonString = gson.toJson(currencyRates);
        Files.write(Paths.get("C:\\Users\\Arsen\\IdeaProjects\\jsonLesson\\src\\main\\resources\\gsonCurrency.json"),
                    gsonString.getBytes(), StandardOpenOption.CREATE);

    }
}
