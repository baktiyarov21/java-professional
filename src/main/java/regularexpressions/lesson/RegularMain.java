package regularexpressions.lesson;

import java.util.Scanner;

public class RegularMain {
    public static void main(String[] args) {
        String str = "1Java2Java3Java";
        Scanner cs = new Scanner(str).useDelimiter("Java");
        while(cs.hasNextInt()) {
            System.out.println(cs.nextInt());
        }
    }
}
