package anoo.lesson;

public class MainAnno {
    public static void main(String[] args) {

    }

    class A {
        int a;


        public A(int a) {
            this.a = a;
        }

        public int getA() {
            return a;
        }

        @Deprecated
        public void go() {
            System.out.println("Go");
        }
    }

    @Deprecated
    class B extends A {

        public B(int a) {
            super(a);
        }

        @Override
        public void go() {
            System.out.println("Went");
        }
    }
}
