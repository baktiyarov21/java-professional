public class Test {
    public static void main(String[] args) {
        String str = "11 34 3 45 23 5 67";
        String strArr[] = str.split(" ");
        int numArr[] = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            numArr[i] = Integer.parseInt(strArr[i]);
            // System.out.println(numArr[i]);
        }

        int a = 6759;
        int a1 = a / 1000;
        int a2 = (a % 1000) / 100;
        int a3 = (a % 100) / 10;
        int a4 = a % 10;



    }
}
