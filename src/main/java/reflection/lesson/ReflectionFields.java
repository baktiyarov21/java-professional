package reflection.lesson;

import java.lang.reflect.Field;

public class ReflectionFields {

    public static final class MyFields {
        public String name;
        protected String lastName;
        private int age;
        int grade;

        public MyFields(String name, String lastName, int age, int grade) {
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
        Class<?> cl1 = MyFields.class;
        System.out.println("Public fields");
        Field[] fields = cl1.getFields();
        for (Field field : fields) {
            Class<?> fieldType = field.getType();
            System.out.println(field.getName());
            System.out.println(fieldType.getName());
        }
        Field[] allFields = cl1.getDeclaredFields();
        for(Field allField : allFields) {
            Class<?> allFieldType = allField.getType();
            System.out.println(allField.getName());
            System.out.println(allFieldType.getName());
        }
    }
}
