package codewars._2021;

import java.util.Arrays;

public class December {
    public static void main(String[] args) {
        String str = "Pig latin is cool";
        System.out.println(December.pigIt(str));
    }

    public static String pigIt(String str) {

        String[] strArr = null;
        StringBuilder sb = new StringBuilder(str);
        strArr = sb.reverse().toString().split(" ");

        String[] returnStr = new String[strArr.length];
        for(int i = 0; i < strArr.length; i++) {
            returnStr[i] = strArr[i] + "ay";
        }
        return Arrays.toString(returnStr);
    }

}
