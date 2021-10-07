package stream_api.lessons.lesson2;

import java.util.Scanner;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> isZero = value -> value == 0;
        System.out.println(isZero.test(1));
        System.out.println(isZero.test(0));

//        Consumer<T> выполняет некоторое действие над объектом типа T, при этом ничего не возвращая:
        Consumer<Integer> printer = i -> System.out.println(i);
        printer.accept(10);

        Function<Integer, String> converter = value -> String.valueOf(value);
        System.out.println(converter.apply(100000));


//        Supplier<T> не принимает никаких аргументов, но должен возвращать объект типа T:
//        Supplier<String> text = () -> {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Введите текст: ");
//            return scanner.nextLine();
//        };
//        System.out.println(text.get());

        UnaryOperator<Double> sqrt = value -> Math.sqrt(value);
        System.out.println(sqrt.apply(10.2));

        BinaryOperator<Double> pow = (value1, value2) -> Math.pow(value1, value1);

        System.out.println(pow.apply(11.0, 10.0));

    }
}
