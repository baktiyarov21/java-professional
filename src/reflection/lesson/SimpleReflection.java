package reflection.lesson;

public class SimpleReflection {
    public static void main(String[] args) throws ClassNotFoundException {

        //1. помощью метода getClass()
//        SimpleReflection sr = new SimpleReflection();
//        Class<?> cl1 = sr.getClass();
//
//        double[] arr = new double[10];
//        Class<?> cl2 = arr.getClass();
//
//        Class<?> cl3 = "hth".getClass();
//
//        Class<?> cl4 = Integer.valueOf(10).getClass();
//
//        System.out.println(cl1);
//        System.out.println(cl2);
//        System.out.println(cl3);
//        System.out.println(cl4);

        //2. С помощью литерала
//        Class<?> cl1 = SimpleReflection.class;
//        Class<?> cl2 = float[].class;
//        System.out.println(cl1);
//        System.out.println(cl2);

        //3. С помощью Class.forName
//        Class<?> cl1 = Class.forName("java.util.Date");
//        System.out.println(cl1);
//
//        Class<?> cl2 = Class.forName("[I");
//        System.out.println(cl2);

        //4. С помощью рефлексии
        Class<?> cl1 = Integer.class.getSuperclass();
        System.out.println(cl1);
    }
}
