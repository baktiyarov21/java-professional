package stream.lesson;

import java.util.Scanner;

public class SimpleScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        float f = scanner.nextFloat();
        String str = scanner.next(); //next считывает до первого пробела
        System.out.println("Number: " + i + " Float: " + f + " String: " + str);

    }
}
