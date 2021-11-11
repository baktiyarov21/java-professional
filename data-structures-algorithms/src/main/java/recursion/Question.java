package recursion;

public class Question {
    public static void main(String[] args) {
        Question question = new Question();
        int sum = question.sumOfDigits(495);
        int power = question.power(4, 2);
        int gcd = question.gcd(8, 4);
        int dtb = question.decimalToBinary(10);
        System.out.println("Q1: " + sum +
                "\nQ2: " + power + "\nQ3: " + gcd +
                "\nQ4: " + dtb);

    }

    // Sum of digits
    public int sumOfDigits(int n) {
        if (n == 0 || n < 0) {
            return 0;
        }
        return n % 10 + sumOfDigits(n / 10);
    }

    // Power
    public int power(int base, int exp) {
        if (exp < 0) {
            return -1;
        }
        if (exp == 0 || exp == 1) {
            return base;
        }
        return base * power(base, exp - 1);
    }

    // GCD
    public int gcd(int a, int b) {
        if (a < 0 || b < 0) {
            return -1;
        }
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // Decimal to Binary
    public int decimalToBinary(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 2 + 10 * decimalToBinary(n / 2);
    }

}
