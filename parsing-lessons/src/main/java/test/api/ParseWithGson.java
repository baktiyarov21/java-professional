package test.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import gson.lesson.CurrencyRate;

import java.io.*;
import java.net.URL;

public class ParseWithGson {
    public static void getJsonWithGson(String path) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.setPrettyPrinting().create();

        JsonReader jsonReader = null;
        try {
            jsonReader = new JsonReader(new InputStreamReader(new FileInputStream(path)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Result result =  gson.fromJson(jsonReader, Result.class);
        System.out.println(result);

    }
}
