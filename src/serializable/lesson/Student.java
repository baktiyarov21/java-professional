package serializable.lesson;

import java.io.*;

public class Student implements Externalizable, Cloneable {
    private int age;
    private transient String name;

    public Student() {
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Student(Student other) {
        this(other.age, other.name);
    }


    public static Student getCloneStudent(int age, String name) {
        Student student = new Student();
        student.age = age;
        student.name = name;
        return student;
    }

    public static Student getCloneStudentFromObject(Student studentToCopy) {
        Student cloneStudent = new Student();
        cloneStudent.age = studentToCopy.age;
        cloneStudent.name = studentToCopy.name;
        return cloneStudent;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(age);
        out.writeObject(name);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        age = in.readInt();
        name = (String) in.readObject();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }


}

class Main {
    public static void main(String[] args) {
        File file = new File("exter.txt");
        Student student = new Student(19, "John");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            oos.writeObject(student);
            System.out.println("----------");
            student = (Student) ois.readObject();
            System.out.println(student);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
