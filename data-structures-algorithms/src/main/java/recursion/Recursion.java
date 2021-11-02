package recursion;

public class Recursion {

    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        int fac = recursion.fuctorial(10);

        int fib = recursion.fibonacci(4);
        System.out.println(fac);
        System.out.println(fib);
    }

    public int fuctorial(int n) {
        if (n < 1) {
            return -1;
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fuctorial(n - 1);
    }

    public int fibonacci(int n) {
        if (n < 0) {
            return -1;
        }

        if (n == 0 || n == 1)
            return n;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}





