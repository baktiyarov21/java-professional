package stream_api.lessons.lesson7;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Integer> mixedNumbers = Stream.of(-2, -1, 0, 1, 2);
        //System.out.println(mixedNumbers.allMatch(number -> number > 0));

        Stream<Integer> positiveNumbers = Stream.of(1, 2);
        System.out.println(positiveNumbers.allMatch(number -> number > 0));

        Stream<Integer> negativeNumbers = Stream.of(-1, -2);
        System.out.println(negativeNumbers.allMatch(number -> number > 0));

//        System.out.println(mixedNumbers.count());

        ArrayList<Ticket> tickets = new ArrayList<>();
        tickets.add(new Ticket("A", 10));
        tickets.add(new Ticket("B", 100));

        Ticket minimum = tickets.stream().min(Ticket::compareTo).get();
        Ticket maximum = tickets.stream().max(Ticket::compareTo).get();
        System.out.println("Maximum" + maximum.getPrice());
        System.out.println("Minimum" + minimum.getPrice());

        Stream<Integer> numbers = Stream.of(100, 200, 100, 100);
        Optional<Integer> result = numbers.reduce((value1, value2) -> value1 + value1);
        System.out.println(result.get());

    }
}
