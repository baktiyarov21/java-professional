package strings.lesson;

public class SimpleWrappers {
    public static void main(String[] args) {
        Integer i = new Integer(10);
        Integer j = new Integer(10);
        System.out.println(i == j);
        System.out.println();
        int a = 1000;
        int b = 1000;
        System.out.println(a == b);
        System.out.println();
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        System.out.println(str1.equals(str2));
        System.out.println();
        String str3 = "Hello"; // POOL
        String str4 = "Hello"; //POOL
        System.out.println(str3 == str4);

        Integer h = 10;
        Integer k = 10;
        System.out.println(h == k);
    }
}
