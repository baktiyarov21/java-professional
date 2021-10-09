package stream_api.lessons.lesson4;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {-1, 33, -2, 100};
        for (int number : numbers) {
            if (number < 0) {
                System.out.println(number);
            }
        }

        IntStream.of(-1, 33, -2, 100, -200).filter(i -> i < 0).forEach(System.out::println);
    }
}
