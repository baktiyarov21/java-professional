package reflection.lesson;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectionMethods {
    public static final class MyMethods {
        public String name;
        protected String lastName;
        private int age;
        int grade;

        public MyMethods() {}

        public MyMethods(String lastName) {
            this.lastName = lastName;
        }

        public MyMethods(String name, String lastName, int age, int grade) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getGrade() {
            return grade;
        }

        public void setGrade(int grade) {
            this.grade = grade;
        }
    }

    public static void main(String[] args) {
        Class<?> cl1 = MyMethods.class;
        Constructor<?>[] constructors = cl1.getConstructors();
        for (Constructor constructor : constructors) {
            Class<?>[] paramTypes = constructor.getParameterTypes();
            for (Class<?> paramType : paramTypes) {
                System.out.println(paramType.getName());
                //System.out.println(paramType.);
            }
        }

        Method[] methods = cl1.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
            System.out.println(method.getReturnType().getName());
            Class<?>[] methodTypes = method.getParameterTypes();
            for (Class<?> methodType:
                 methodTypes) {
                System.out.println(methodType.getName());
            }
            System.out.println("----------------");
        }
    }
}
