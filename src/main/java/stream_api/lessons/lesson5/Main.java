package stream_api.lessons.lesson5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // 1
        Stream<String> arrayStringStream = Arrays.stream(new String[]{"a", "b", "c"});
        arrayStringStream.forEach(System.out::println);

        IntStream arrayIntStream = Arrays.stream(new int[]{1, 3, 4});
        arrayIntStream.forEach(System.out::println);
        System.out.println();

        // 2
        Stream<String> stringStream = Stream.of("a", "b", "c");
        stringStream.forEach(System.out::println);

        IntStream intStream = IntStream.of(1, 3, 4, 5);
        intStream.forEach(System.out::println);
        System.out.println();
        // 3

        ArrayList<String> stringArrayList = new ArrayList<>();
        Collections.addAll(stringArrayList, "Tony", "Fury", "James");
        stringArrayList.stream().filter(name -> name.length() >= 5).forEach(System.out::println);
        System.out.println();




    }
}
