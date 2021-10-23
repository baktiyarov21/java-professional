import org.w3c.dom.ls.LSOutput;
import stream_api.Director;
import stream_api.Predicate;
import stream_api.User;
import stream_api.Worker;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        users.add(new User("Lesley", 45));
        users.add(new User("Daren", 55));
        users.add(new User("Ross", 20));
        users.add(new User("Cody", 17));
        users.add(new User("Arthur", 36));

        Optional<User> oldest = users.stream()
                                .filter(user -> user.getAge() < 5)
                                .max(Comparator.comparingInt(User::getAge));

        oldest.ifPresentOrElse(System.out::println,() -> System.out.println("User not found"));
        users.stream().
                filter(user -> user.getName().contains("l"))
                .findFirst()
                .ifPresentOrElse(System.out::println,() -> System.out.println("User not found"));



       /* users.stream()
                .sorted(Comparator.comparing(User::getName))
                .filter(user -> user.getAge() >= 40)
                .map(user -> user.getName())
                .limit(3)
                .forEach(System.out::println);
*/


       /* users.stream().
                sorted((o1, o2) -> Integer.compare(o2.getAge(), o1.getAge()))
                .limit(3)
                .forEach(System.out::println) ;*/











        /*List<Integer> nonFiltered = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            nonFiltered.add((int) (Math.random()) * 100 + 100);
        }
        List<String> filtered = nonFiltered.stream()
                .filter(n -> n % 2 == 0 & n % 5 == 0)
                .map(n -> Math.sqrt(n))
                .map((sqrt) -> "Sqrt" + sqrt)
                .collect(Collectors.toList());
        for (String s : filtered) {
            System.out.println(s);
        }*/















        /*  *//* Director director = new Director();
        Worker worker = i -> "Success " + i;
        String string = director.doWork(worker,6);
        System.out.println(string);*//*

        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            integers.add((int) (Math.random() * 1000));
        }
        List<String> filtered = integers.stream()
                .filter(n -> n % 2 == 0)
                .map(integer -> "Number: " + integer)
                .filter(string -> string.endsWith("0"))
                .map(string -> string + "!")
                .collect(Collectors.toList());

        for (String numbers : filtered) {
            System.out.println(numbers);
        }*/
    }

    public static List<String> map(List<Integer> numbers) {
        List<String> result = new ArrayList<>();
        for (int i : numbers) {
            result.add("Number: " + i);
        }
        return result;
    }


    public static List<Integer> filter(List<Integer> list, Predicate predicate) {
        List<Integer> result = new ArrayList<>();
        for (int i : list) {
            if (predicate.predicate(i)) {
                result.add(i);
            }
        }
        return result;
    }
}
