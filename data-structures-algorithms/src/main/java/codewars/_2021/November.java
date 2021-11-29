package codewars._2021;

import java.util.*;

// November 2021
public class November {
    public static void main(String[] args) {
        int converted = November.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0, 0, 0, 0)));
        System.out.println(converted);
        int r = November.countBits(1234);
        System.out.println(r);


    }

    public static int findShort(String s) {
        String[] words = s.split(" ");
        int min = words[0].length();
        for (int i = 0; i < words.length; i++) {
            if (min > words[i].length()) {
                min = words[i].length();
            }
        }
        return min;
    }

    // 2   Given an array of ones and zeroes, convert the equivalent binary value to an integer.
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        StringBuilder sb = new StringBuilder();
        ;
        for (Integer integer : binary) {
            sb.append(integer);
        }
        return Integer.parseInt(sb.toString(), 2);
    }


//    If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

    public int solution(int number) {
        //TODO: Code stuff here
        int sum = 0;
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0)
                sum += i;
        }
        return sum;
    }

    //    Write a function that takes an integer as input, and returns the number of bits that are equal to one in
    //    the binary representation of that number. You can guarantee that input is non-negative.

    public static int countBits(int n) {
        // Show me the code!
        return Integer.bitCount(n);
    }

    public static int sortDesc(final int num) {
        //Your code
        String[] array = String.valueOf(num).split("");
        Arrays.sort(array, Collections.reverseOrder());
        return Integer.parseInt(String.join("", array));
    }

}
