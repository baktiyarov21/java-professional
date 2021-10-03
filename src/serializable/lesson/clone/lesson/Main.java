package serializable.lesson.clone.lesson;

import serializable.lesson.Student;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        //Переопределение метода clone
        Student originalStudent = new Student(18, "Arsen");
        Student cloneStudent = (Student) (originalStudent.clone());
        System.out.println(originalStudent);
        System.out.println(cloneStudent);
        System.out.println("----------------");
        //Копирование с конструктором
        Student originalStudent2 = new Student(21, "Tony");
        Student cloneStudent2 = new Student(originalStudent2);
        System.out.println(originalStudent2);
        System.out.println(cloneStudent2);
        System.out.println("---------------");
        //Фабричный метод .. Без привязки к обьекту
        Student cloneStudent3 = Student.getCloneStudent(34, "Mike");
        System.out.println(cloneStudent3);
        System.out.println("--------------");
        //Фабричный метод клонирование обьекта из другого обьекта
        Student cloneStudent4 = Student. getCloneStudentFromObject(originalStudent2);
        System.out.println(cloneStudent4);

    }

}
