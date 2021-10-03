package strings.lesson;

public class SimpleStringFormat {
    public static void main(String[] args) {
        int quantity = 23;
        String a = String.format("Количество человек: %s", quantity);
        System.out.println(a);
        double d = 3.1493249328903;
        String pi = String.format("Число пи равно %.2f",d);
        System.out.println(pi);
    }
}
