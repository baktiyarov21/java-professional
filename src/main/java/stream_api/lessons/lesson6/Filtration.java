package stream_api.lessons.lesson6;

import java.util.stream.Stream;

public class Filtration {
    public static void main(String[] args) {
        Stream<Integer> skipIntegerStream = Stream.of(1, 2, 3, 4, 5, 6);
        skipIntegerStream.skip(2).forEach(System.out::println); // убирает первые N элементов

        Stream<Integer> limitIntegerStream = Stream.of(1, 2, 3, 4, 5, 6);
        limitIntegerStream.limit(2).forEach(System.out::println); // оставляет первые N элементов, убирает оставшиеся

        Stream<Film> filmStream = Stream.of(new Film[] {new Film("Justice League", 100)});
        filmStream.map(film -> System.out.printf("Название фильма: %s", film.getTitle())).forEach(System.out::println);


    }
}
