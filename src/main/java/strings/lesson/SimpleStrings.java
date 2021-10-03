package strings.lesson;

public class SimpleStrings {
    public static void main(String[] args) {
        String str1 = new String("Hello ");
        String str2 = new String("world! ");
        String str3 = new String("How's it going?");
        String result = str1.concat(str2).concat(str3); // concat быстрее/ Работает на основе Arrays.copy
        System.out.println(result);

//        System.out.println(str1.equalsIgnoreCase("HELLO "));
//        System.out.println(str1.equals("Hello "));

//        System.out.println(result.regionMatches(0,str1,0, 5));
        System.out.println(result.substring(6, 13));
        System.out.println((result.substring(15).length()));
        System.out.println(result.replace('o', 'a'));

    }
}
