package stream_api.lessons.lesson1;

public class Main {
    public static void main(String[] args) {



//        long count = IntStream.of(1, 2, 3, 4, 5, 5, 6, 6, 6, 3).filter(i -> i > 3).count();
//        System.out.println(count);
//
//        ArrayList<String> strings = new ArrayList<>();
//        strings.add("a");
//        strings.add("b");
//        strings.add("v");
//        strings.add("v");
//        strings.add("d");
//        strings.stream().filter(s -> s.equals("v")).forEach(System.out::println);

//        Operation operation = new Operation() {
//            @Override
//            public int getResult(int i, int j) {
//                return i + j;
//            }
//        };
//
//        System.out.println(operation.getResult(9, 10));
//
//        Operation lambda = (int a, int b) -> a + b;
//        System.out.println(lambda.getResult(10, 100));

        int value1 = 10, value2 = 20;

        Operation operation = () -> value1 + value2;
        operation.getResult();
        Printer printer = str -> System.out.println(str);
        printer.println("Hey");

    }
}
