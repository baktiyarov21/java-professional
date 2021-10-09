package json.lesson;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //JacksonDataBind.parseJson("C:\\Users\\Arsen\\IdeaProjects\\jsonLesson\\src\\main\\resources\\person.json");
        JacksonDataBind.parseJson("https://api.privatbank.ua/p24api/pubinfo?json&exchange&coursid=5");
    }
}
